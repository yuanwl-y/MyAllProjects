package com.ywl.mapper;

import com.ywl.dto.GspwPlanchangeAuit;
import com.ywl.dto.GspwPlanchangeAuitExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GspwPlanchangeAuitMapper {
    long countByExample(GspwPlanchangeAuitExample example);

    int deleteByExample(GspwPlanchangeAuitExample example);

    int deleteByPrimaryKey(Integer planchangeauidId);

    int insert(GspwPlanchangeAuit record);

    int insertSelective(GspwPlanchangeAuit record);

    List<GspwPlanchangeAuit> selectByExample(GspwPlanchangeAuitExample example);

    GspwPlanchangeAuit selectByPrimaryKey(Integer planchangeauidId);

    int updateByExampleSelective(@Param("record") GspwPlanchangeAuit record, @Param("example") GspwPlanchangeAuitExample example);

    int updateByExample(@Param("record") GspwPlanchangeAuit record, @Param("example") GspwPlanchangeAuitExample example);

    int updateByPrimaryKeySelective(GspwPlanchangeAuit record);

    int updateByPrimaryKey(GspwPlanchangeAuit record);
}