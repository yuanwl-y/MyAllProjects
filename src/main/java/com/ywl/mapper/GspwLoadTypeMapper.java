package com.ywl.mapper;

import com.ywl.dto.GspwLoadType;
import com.ywl.dto.GspwLoadTypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GspwLoadTypeMapper {
    long countByExample(GspwLoadTypeExample example);

    int deleteByExample(GspwLoadTypeExample example);

    int deleteByPrimaryKey(Integer typeId);

    int insert(GspwLoadType record);

    int insertSelective(GspwLoadType record);

    List<GspwLoadType> selectByExample(GspwLoadTypeExample example);

    GspwLoadType selectByPrimaryKey(Integer typeId);

    int updateByExampleSelective(@Param("record") GspwLoadType record, @Param("example") GspwLoadTypeExample example);

    int updateByExample(@Param("record") GspwLoadType record, @Param("example") GspwLoadTypeExample example);

    int updateByPrimaryKeySelective(GspwLoadType record);

    int updateByPrimaryKey(GspwLoadType record);
}