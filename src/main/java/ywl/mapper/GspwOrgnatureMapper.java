package ywl.mapper;

import org.apache.ibatis.annotations.Param;
import ywl.dto.GspwOrgnature;
import ywl.dto.GspwOrgnatureExample;

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