package com.atguigu.scw.manager.dao;

import com.atguigu.scw.manager.bean.TMemeberProjectFollow;
import com.atguigu.scw.manager.bean.TMemeberProjectFollowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TMemeberProjectFollowMapper {
    int countByExample(TMemeberProjectFollowExample example);

    int deleteByExample(TMemeberProjectFollowExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TMemeberProjectFollow record);

    int insertSelective(TMemeberProjectFollow record);

    List<TMemeberProjectFollow> selectByExample(TMemeberProjectFollowExample example);

    TMemeberProjectFollow selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TMemeberProjectFollow record, @Param("example") TMemeberProjectFollowExample example);

    int updateByExample(@Param("record") TMemeberProjectFollow record, @Param("example") TMemeberProjectFollowExample example);

    int updateByPrimaryKeySelective(TMemeberProjectFollow record);

    int updateByPrimaryKey(TMemeberProjectFollow record);
}