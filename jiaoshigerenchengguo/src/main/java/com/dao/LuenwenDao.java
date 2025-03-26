package com.dao;

import com.entity.LuenwenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.LuenwenView;

/**
 * 论文信息 Dao 接口
 *
 * @author 
 */
public interface LuenwenDao extends BaseMapper<LuenwenEntity> {

   List<LuenwenView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
