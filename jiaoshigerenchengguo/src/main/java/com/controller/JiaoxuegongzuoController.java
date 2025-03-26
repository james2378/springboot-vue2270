
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 教学工作
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/jiaoxuegongzuo")
public class JiaoxuegongzuoController {
    private static final Logger logger = LoggerFactory.getLogger(JiaoxuegongzuoController.class);

    @Autowired
    private JiaoxuegongzuoService jiaoxuegongzuoService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;

    //级联表service
    @Autowired
    private YonghuService yonghuService;



    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("教师".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        if(params.get("orderBy")==null || params.get("orderBy")==""){
            params.put("orderBy","id");
        }
        PageUtils page = jiaoxuegongzuoService.queryPage(params);

        //字典表数据转换
        List<JiaoxuegongzuoView> list =(List<JiaoxuegongzuoView>)page.getList();
        for(JiaoxuegongzuoView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        JiaoxuegongzuoEntity jiaoxuegongzuo = jiaoxuegongzuoService.selectById(id);
        if(jiaoxuegongzuo !=null){
            //entity转view
            JiaoxuegongzuoView view = new JiaoxuegongzuoView();
            BeanUtils.copyProperties( jiaoxuegongzuo , view );//把实体数据重构到view中

                //级联表
                YonghuEntity yonghu = yonghuService.selectById(jiaoxuegongzuo.getYonghuId());
                if(yonghu != null){
                    BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createTime", "insertTime", "updateTime"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setYonghuId(yonghu.getId());
                }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody JiaoxuegongzuoEntity jiaoxuegongzuo, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,jiaoxuegongzuo:{}",this.getClass().getName(),jiaoxuegongzuo.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");
        else if("教师".equals(role))
            jiaoxuegongzuo.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));

        Wrapper<JiaoxuegongzuoEntity> queryWrapper = new EntityWrapper<JiaoxuegongzuoEntity>()
            .eq("jiaoxuegongzuo_name", jiaoxuegongzuo.getJiaoxuegongzuoName())
            .eq("yonghu_id", jiaoxuegongzuo.getYonghuId())
            .eq("jiaoxuegongzuo_types", jiaoxuegongzuo.getJiaoxuegongzuoTypes())
            .eq("jiaoxuegongzuo_xueqi", jiaoxuegongzuo.getJiaoxuegongzuoXueqi())
            .eq("jiaoxuegongzuo_kecheng", jiaoxuegongzuo.getJiaoxuegongzuoKecheng())
            .eq("jiaoxuegongzuo_banji", jiaoxuegongzuo.getJiaoxuegongzuoBanji())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        JiaoxuegongzuoEntity jiaoxuegongzuoEntity = jiaoxuegongzuoService.selectOne(queryWrapper);
        if(jiaoxuegongzuoEntity==null){
            jiaoxuegongzuo.setInsertTime(new Date());
            jiaoxuegongzuo.setCreateTime(new Date());
            jiaoxuegongzuoService.insert(jiaoxuegongzuo);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody JiaoxuegongzuoEntity jiaoxuegongzuo, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,jiaoxuegongzuo:{}",this.getClass().getName(),jiaoxuegongzuo.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
//        else if("教师".equals(role))
//            jiaoxuegongzuo.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        //根据字段查询是否有相同数据
        Wrapper<JiaoxuegongzuoEntity> queryWrapper = new EntityWrapper<JiaoxuegongzuoEntity>()
            .notIn("id",jiaoxuegongzuo.getId())
            .andNew()
            .eq("jiaoxuegongzuo_name", jiaoxuegongzuo.getJiaoxuegongzuoName())
            .eq("yonghu_id", jiaoxuegongzuo.getYonghuId())
            .eq("jiaoxuegongzuo_types", jiaoxuegongzuo.getJiaoxuegongzuoTypes())
            .eq("jiaoxuegongzuo_xueqi", jiaoxuegongzuo.getJiaoxuegongzuoXueqi())
            .eq("jiaoxuegongzuo_kecheng", jiaoxuegongzuo.getJiaoxuegongzuoKecheng())
            .eq("jiaoxuegongzuo_banji", jiaoxuegongzuo.getJiaoxuegongzuoBanji())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        JiaoxuegongzuoEntity jiaoxuegongzuoEntity = jiaoxuegongzuoService.selectOne(queryWrapper);
        if(jiaoxuegongzuoEntity==null){
            jiaoxuegongzuoService.updateById(jiaoxuegongzuo);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        jiaoxuegongzuoService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName, HttpServletRequest request){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        Integer yonghuId = Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId")));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            List<JiaoxuegongzuoEntity> jiaoxuegongzuoList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("static/upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            JiaoxuegongzuoEntity jiaoxuegongzuoEntity = new JiaoxuegongzuoEntity();
//                            jiaoxuegongzuoEntity.setJiaoxuegongzuoName(data.get(0));                    //标题 要改的
//                            jiaoxuegongzuoEntity.setYonghuId(Integer.valueOf(data.get(0)));   //教师 要改的
//                            jiaoxuegongzuoEntity.setJiaoxuegongzuoTypes(Integer.valueOf(data.get(0)));   //工作类型 要改的
//                            jiaoxuegongzuoEntity.setJiaoxuegongzuoXueqi(data.get(0));                    //学期 要改的
//                            jiaoxuegongzuoEntity.setJiaoxuegongzuoKecheng(data.get(0));                    //课程 要改的
//                            jiaoxuegongzuoEntity.setJiaoxuegongzuoBanji(data.get(0));                    //班级 要改的
//                            jiaoxuegongzuoEntity.setJiaoxuegongzuoContent("");//详情和图片
//                            jiaoxuegongzuoEntity.setInsertTime(date);//时间
//                            jiaoxuegongzuoEntity.setCreateTime(date);//时间
                            jiaoxuegongzuoList.add(jiaoxuegongzuoEntity);


                            //把要查询是否重复的字段放入map中
                        }

                        //查询是否重复
                        jiaoxuegongzuoService.insertBatch(jiaoxuegongzuoList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }






}
