package com.atguigu.scw.manager.dao;

import com.atguigu.scw.manager.bean.TProjectType;
import com.atguigu.scw.manager.bean.TProjectTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TProjectTypeMapper {
    int countByExample(TProjectTypeExample example);

    int deleteByExample(TProjectTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TProjectType record);

    int insertSelective(TProjectType record);

    List<TProjectType> selectByExample(TProjectTypeExample example);

    TProjectType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TProjectType record, @Param("example") TProjectTypeExample example);

    int updateByExample(@Param("record") TProjectType record, @Param("example") TProjectTypeExample example);

    int updateByPrimaryKeySelective(TProjectType record);

    int updateByPrimaryKey(TProjectType record);
}