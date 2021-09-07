package com.ywl.mapper;

import com.ywl.dto.GspwArchivesRecord;
import com.ywl.dto.GspwArchivesRecordExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GspwArchivesRecordMapper {
    long countByExample(GspwArchivesRecordExample example);

    int deleteByExample(GspwArchivesRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GspwArchivesRecord record);

    int insertSelective(GspwArchivesRecord record);

    List<GspwArchivesRecord> selectByExample(GspwArchivesRecordExample example);

    GspwArchivesRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GspwArchivesRecord record, @Param("example") GspwArchivesRecordExample example);

    int updateByExample(@Param("record") GspwArchivesRecord record, @Param("example") GspwArchivesRecordExample example);

    int updateByPrimaryKeySelective(GspwArchivesRecord record);

    int updateByPrimaryKey(GspwArchivesRecord record);
}