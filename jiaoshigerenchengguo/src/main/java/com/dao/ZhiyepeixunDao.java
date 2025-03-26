package com.dao;

import com.entity.ZhiyepeixunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhiyepeixunView;

/**
 * 荣誉信息 Dao 接口
 *
 * @author 
 */
public interface ZhiyepeixunDao extends BaseMapper<ZhiyepeixunEntity> {

   List<ZhiyepeixunView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
