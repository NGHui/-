package com.atguigu.scw.manager.dao;

import com.atguigu.scw.manager.bean.TMemberAddress;
import com.atguigu.scw.manager.bean.TMemberAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TMemberAddressMapper {
    int countByExample(TMemberAddressExample example);

    int deleteByExample(TMemberAddressExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TMemberAddress record);

    int insertSelective(TMemberAddress record);

    List<TMemberAddress> selectByExample(TMemberAddressExample example);

    TMemberAddress selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TMemberAddress record, @Param("example") TMemberAddressExample example);

    int updateByExample(@Param("record") TMemberAddress record, @Param("example") TMemberAddressExample example);

    int updateByPrimaryKeySelective(TMemberAddress record);

    int updateByPrimaryKey(TMemberAddress record);
}