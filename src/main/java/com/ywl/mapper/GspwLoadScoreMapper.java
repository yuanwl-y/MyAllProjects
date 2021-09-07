package com.ywl.mapper;

import com.ywl.dto.GspwLoadScore;
import com.ywl.dto.GspwLoadScoreExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GspwLoadScoreMapper {
    long countByExample(GspwLoadScoreExample example);

    int deleteByExample(GspwLoadScoreExample example);

    int deleteByPrimaryKey(Integer scoreId);

    int insert(GspwLoadScore record);

    int insertSelective(GspwLoadScore record);

    List<GspwLoadScore> selectByExample(GspwLoadScoreExample example);

    GspwLoadScore selectByPrimaryKey(Integer scoreId);

    int updateByExampleSelective(@Param("record") GspwLoadScore record, @Param("example") GspwLoadScoreExample example);

    int updateByExample(@Param("record") GspwLoadScore record, @Param("example") GspwLoadScoreExample example);

    int updateByPrimaryKeySelective(GspwLoadScore record);

    int updateByPrimaryKey(GspwLoadScore record);
}