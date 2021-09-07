package com.ywl.mapper;

import com.ywl.dto.GspwVersion;
import com.ywl.dto.GspwVersionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GspwVersionMapper {
    long countByExample(GspwVersionExample example);

    int deleteByExample(GspwVersionExample example);

    int deleteByPrimaryKey(Integer versionId);

    int insert(GspwVersion record);

    int insertSelective(GspwVersion record);

    List<GspwVersion> selectByExample(GspwVersionExample example);

    GspwVersion selectByPrimaryKey(Integer versionId);

    int updateByExampleSelective(@Param("record") GspwVersion record, @Param("example") GspwVersionExample example);

    int updateByExample(@Param("record") GspwVersion record, @Param("example") GspwVersionExample example);

    int updateByPrimaryKeySelective(GspwVersion record);

    int updateByPrimaryKey(GspwVersion record);
}