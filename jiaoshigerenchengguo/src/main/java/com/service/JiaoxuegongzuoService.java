package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaoxuegongzuoEntity;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

/**
 * 教学工作 服务类
 */
public interface JiaoxuegongzuoService extends IService<JiaoxuegongzuoEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}