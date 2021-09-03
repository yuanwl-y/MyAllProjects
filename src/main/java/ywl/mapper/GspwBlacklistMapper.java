package ywl.mapper;

import org.apache.ibatis.annotations.Param;
import ywl.dto.GspwBlacklist;
import ywl.dto.GspwBlacklistExample;

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