package com.ywl.mapper;

import com.ywl.dto.GspwIntegratedproject;
import com.ywl.dto.GspwIntegratedprojectExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GspwIntegratedprojectMapper {
    long countByExample(GspwIntegratedprojectExample example);

    int deleteByExample(GspwIntegratedprojectExample example);

    int deleteByPrimaryKey(Integer integratedprojectId);

    int insert(GspwIntegratedproject record);

    int insertSelective(GspwIntegratedproject record);

    List<GspwIntegratedproject> selectByExample(GspwIntegratedprojectExample example);

    GspwIntegratedproject selectByPrimaryKey(Integer integratedprojectId);

    int updateByExampleSelective(@Param("record") GspwIntegratedproject record, @Param("example") GspwIntegratedprojectExample example);

    int updateByExample(@Param("record") GspwIntegratedproject record, @Param("example") GspwIntegratedprojectExample example);

    int updateByPrimaryKeySelective(GspwIntegratedproject record);

    int updateByPrimaryKey(GspwIntegratedproject record);
}