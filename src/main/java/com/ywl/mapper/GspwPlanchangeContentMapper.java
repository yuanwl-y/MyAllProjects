package com.ywl.mapper;

import com.ywl.dto.GspwPlanchangeContent;
import com.ywl.dto.GspwPlanchangeContentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GspwPlanchangeContentMapper {
    long countByExample(GspwPlanchangeContentExample example);

    int deleteByExample(GspwPlanchangeContentExample example);

    int deleteByPrimaryKey(String uuid);

    int insert(GspwPlanchangeContent record);

    int insertSelective(GspwPlanchangeContent record);

    List<GspwPlanchangeContent> selectByExample(GspwPlanchangeContentExample example);

    GspwPlanchangeContent selectByPrimaryKey(String uuid);

    int updateByExampleSelective(@Param("record") GspwPlanchangeContent record, @Param("example") GspwPlanchangeContentExample example);

    int updateByExample(@Param("record") GspwPlanchangeContent record, @Param("example") GspwPlanchangeContentExample example);

    int updateByPrimaryKeySelective(GspwPlanchangeContent record);

    int updateByPrimaryKey(GspwPlanchangeContent record);
}