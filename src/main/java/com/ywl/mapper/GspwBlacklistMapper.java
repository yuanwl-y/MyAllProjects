package com.ywl.mapper;

import com.ywl.dto.GspwBlacklist;
import com.ywl.dto.GspwBlacklistExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GspwBlacklistMapper {
    long countByExample(GspwBlacklistExample example);

    int deleteByExample(GspwBlacklistExample example);

    int insert(GspwBlacklist record);

    int insertSelective(GspwBlacklist record);

    List<GspwBlacklist> selectByExample(GspwBlacklistExample example);

    int updateByExampleSelective(@Param("record") GspwBlacklist record, @Param("example") GspwBlacklistExample example);

    int updateByExample(@Param("record") GspwBlacklist record, @Param("example") GspwBlacklistExample example);
}