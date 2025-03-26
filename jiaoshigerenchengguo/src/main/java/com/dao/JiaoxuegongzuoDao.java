package com.dao;

import com.entity.JiaoxuegongzuoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaoxuegongzuoView;

/**
 * 教学工作 Dao 接口
 *
 * @author 
 */
public interface JiaoxuegongzuoDao extends BaseMapper<JiaoxuegongzuoEntity> {

   List<JiaoxuegongzuoView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
