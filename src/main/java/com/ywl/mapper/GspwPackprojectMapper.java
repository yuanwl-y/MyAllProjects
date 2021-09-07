package com.ywl.mapper;

import com.ywl.dto.GspwPackproject;
import com.ywl.dto.GspwPackprojectExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GspwPackprojectMapper {
    long countByExample(GspwPackprojectExample example);

    int deleteByExample(GspwPackprojectExample example);

    int deleteByPrimaryKey(Integer packprojectId);

    int insert(GspwPackproject record);

    int insertSelective(GspwPackproject record);

    List<GspwPackproject> selectByExample(GspwPackprojectExample example);

    GspwPackproject selectByPrimaryKey(Integer packprojectId);

    int updateByExampleSelective(@Param("record") GspwPackproject record, @Param("example") GspwPackprojectExample example);

    int updateByExample(@Param("record") GspwPackproject record, @Param("example") GspwPackprojectExample example);

    int updateByPrimaryKeySelective(GspwPackproject record);

    int updateByPrimaryKey(GspwPackproject record);
}