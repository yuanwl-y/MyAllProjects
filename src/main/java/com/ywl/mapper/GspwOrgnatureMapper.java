package com.ywl.mapper;

import com.ywl.dto.GspwOrgnature;
import com.ywl.dto.GspwOrgnatureExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GspwOrgnatureMapper {
    long countByExample(GspwOrgnatureExample example);

    int deleteByExample(GspwOrgnatureExample example);

    int deleteByPrimaryKey(Integer natureId);

    int insert(GspwOrgnature record);

    int insertSelective(GspwOrgnature record);

    List<GspwOrgnature> selectByExample(GspwOrgnatureExample example);

    GspwOrgnature selectByPrimaryKey(Integer natureId);

    int updateByExampleSelective(@Param("record") GspwOrgnature record, @Param("example") GspwOrgnatureExample example);

    int updateByExample(@Param("record") GspwOrgnature record, @Param("example") GspwOrgnatureExample example);

    int updateByPrimaryKeySelective(GspwOrgnature record);

    int updateByPrimaryKey(GspwOrgnature record);
}