package com.ywl.mapper;

import com.ywl.dto.GspwPreparation;
import com.ywl.dto.GspwPreparationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GspwPreparationMapper {
    long countByExample(GspwPreparationExample example);

    int deleteByExample(GspwPreparationExample example);

    int deleteByPrimaryKey(Integer preparationId);

    int insert(GspwPreparation record);

    int insertSelective(GspwPreparation record);

    List<GspwPreparation> selectByExample(GspwPreparationExample example);

    GspwPreparation selectByPrimaryKey(Integer preparationId);

    int updateByExampleSelective(@Param("record") GspwPreparation record, @Param("example") GspwPreparationExample example);

    int updateByExample(@Param("record") GspwPreparation record, @Param("example") GspwPreparationExample example);

    int updateByPrimaryKeySelective(GspwPreparation record);

    int updateByPrimaryKey(GspwPreparation record);
}