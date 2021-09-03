package ywl.mapper;

import org.apache.ibatis.annotations.Param;
import ywl.dto.GspwUserteam;
import ywl.dto.GspwUserteamExample;

import java.util.List;

public interface GspwUserteamMapper {
    long countByExample(GspwUserteamExample example);

    int deleteByExample(GspwUserteamExample example);

    int deleteByPrimaryKey(Integer tid);

    int insert(GspwUserteam record);

    int insertSelective(GspwUserteam record);

    List<GspwUserteam> selectByExample(GspwUserteamExample example);

    GspwUserteam selectByPrimaryKey(Integer tid);

    int updateByExampleSelective(@Param("record") GspwUserteam record, @Param("example") GspwUserteamExample example);

    int updateByExample(@Param("record") GspwUserteam record, @Param("example") GspwUserteamExample example);

    int updateByPrimaryKeySelective(GspwUserteam record);

    int updateByPrimaryKey(GspwUserteam record);
}