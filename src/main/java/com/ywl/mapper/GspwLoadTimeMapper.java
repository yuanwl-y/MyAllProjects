package com.ywl.mapper;

import com.ywl.dto.GspwLoadTime;
import com.ywl.dto.GspwLoadTimeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GspwLoadTimeMapper {
    long countByExample(GspwLoadTimeExample example);

    int deleteByExample(GspwLoadTimeExample example);

    int deleteByPrimaryKey(Integer timeId);

    int insert(GspwLoadTime record);

    int insertSelective(GspwLoadTime record);

    List<GspwLoadTime> selectByExample(GspwLoadTimeExample example);

    GspwLoadTime selectByPrimaryKey(Integer timeId);

    int updateByExampleSelective(@Param("record") GspwLoadTime record, @Param("example") GspwLoadTimeExample example);

    int updateByExample(@Param("record") GspwLoadTime record, @Param("example") GspwLoadTimeExample example);

    int updateByPrimaryKeySelective(GspwLoadTime record);

    int updateByPrimaryKey(GspwLoadTime record);
}