package com.dao;

import com.entity.KetixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.KetixinxiView;

/**
 * 课题信息 Dao 接口
 *
 * @author 
 */
public interface KetixinxiDao extends BaseMapper<KetixinxiEntity> {

   List<KetixinxiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
