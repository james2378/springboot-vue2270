package com.entity.model;

import com.entity.JiaocaizhuanzhuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 教材信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class JiaocaizhuanzhuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 标题
     */
    private String jiaocaizhuanzhuName;


    /**
     * 教材类型
     */
    private Integer jiaocaizhuanzhuTypes;


    /**
     * 教师
     */
    private Integer yonghuId;


    /**
     * 教材文件
     */
    private String renyuanFile;


    /**
     * 详情
     */
    private String jiaocaizhuanzhuContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：标题
	 */
    public String getJiaocaizhuanzhuName() {
        return jiaocaizhuanzhuName;
    }


    /**
	 * 设置：标题
	 */
    public void setJiaocaizhuanzhuName(String jiaocaizhuanzhuName) {
        this.jiaocaizhuanzhuName = jiaocaizhuanzhuName;
    }
    /**
	 * 获取：教材类型
	 */
    public Integer getJiaocaizhuanzhuTypes() {
        return jiaocaizhuanzhuTypes;
    }


    /**
	 * 设置：教材类型
	 */
    public void setJiaocaizhuanzhuTypes(Integer jiaocaizhuanzhuTypes) {
        this.jiaocaizhuanzhuTypes = jiaocaizhuanzhuTypes;
    }
    /**
	 * 获取：教师
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：教师
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：教材文件
	 */
    public String getRenyuanFile() {
        return renyuanFile;
    }


    /**
	 * 设置：教材文件
	 */
    public void setRenyuanFile(String renyuanFile) {
        this.renyuanFile = renyuanFile;
    }
    /**
	 * 获取：详情
	 */
    public String getJiaocaizhuanzhuContent() {
        return jiaocaizhuanzhuContent;
    }


    /**
	 * 设置：详情
	 */
    public void setJiaocaizhuanzhuContent(String jiaocaizhuanzhuContent) {
        this.jiaocaizhuanzhuContent = jiaocaizhuanzhuContent;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
