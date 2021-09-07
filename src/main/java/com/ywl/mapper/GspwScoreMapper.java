package com.ywl.mapper;

import com.ywl.dto.GspwScore;
import com.ywl.dto.GspwScoreExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GspwScoreMapper {
    long countByExample(GspwScoreExample example);

    int deleteByExample(GspwScoreExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GspwScore record);

    int insertSelective(GspwScore record);

    List<GspwScore> selectByExample(GspwScoreExample example);

    GspwScore selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GspwScore record, @Param("example") GspwScoreExample example);

    int updateByExample(@Param("record") GspwScore record, @Param("example") GspwScoreExample example);

    int updateByPrimaryKeySelective(GspwScore record);

    int updateByPrimaryKey(GspwScore record);
}