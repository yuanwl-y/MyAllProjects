package com.ywl.mapper;

import com.ywl.dto.GspwFile;
import com.ywl.dto.GspwFileExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GspwFileMapper {
    long countByExample(GspwFileExample example);

    int deleteByExample(GspwFileExample example);

    int deleteByPrimaryKey(Integer fileId);

    int insert(GspwFile record);

    int insertSelective(GspwFile record);

    List<GspwFile> selectByExample(GspwFileExample example);

    GspwFile selectByPrimaryKey(Integer fileId);

    int updateByExampleSelective(@Param("record") GspwFile record, @Param("example") GspwFileExample example);

    int updateByExample(@Param("record") GspwFile record, @Param("example") GspwFileExample example);

    int updateByPrimaryKeySelective(GspwFile record);

    int updateByPrimaryKey(GspwFile record);
}