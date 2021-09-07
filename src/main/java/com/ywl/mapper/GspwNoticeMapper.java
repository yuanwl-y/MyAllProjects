package com.ywl.mapper;

import com.ywl.dto.GspwNotice;
import com.ywl.dto.GspwNoticeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GspwNoticeMapper {
    long countByExample(GspwNoticeExample example);

    int deleteByExample(GspwNoticeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GspwNotice record);

    int insertSelective(GspwNotice record);

    List<GspwNotice> selectByExample(GspwNoticeExample example);

    GspwNotice selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GspwNotice record, @Param("example") GspwNoticeExample example);

    int updateByExample(@Param("record") GspwNotice record, @Param("example") GspwNoticeExample example);

    int updateByPrimaryKeySelective(GspwNotice record);

    int updateByPrimaryKey(GspwNotice record);
}