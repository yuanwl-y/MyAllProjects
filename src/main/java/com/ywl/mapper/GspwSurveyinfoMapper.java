package com.ywl.mapper;

import com.ywl.dto.GspwSurveyinfo;
import com.ywl.dto.GspwSurveyinfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GspwSurveyinfoMapper {
    long countByExample(GspwSurveyinfoExample example);

    int deleteByExample(GspwSurveyinfoExample example);

    int deleteByPrimaryKey(Integer surveyinfoId);

    int insert(GspwSurveyinfo record);

    int insertSelective(GspwSurveyinfo record);

    List<GspwSurveyinfo> selectByExample(GspwSurveyinfoExample example);

    GspwSurveyinfo selectByPrimaryKey(Integer surveyinfoId);

    int updateByExampleSelective(@Param("record") GspwSurveyinfo record, @Param("example") GspwSurveyinfoExample example);

    int updateByExample(@Param("record") GspwSurveyinfo record, @Param("example") GspwSurveyinfoExample example);

    int updateByPrimaryKeySelective(GspwSurveyinfo record);

    int updateByPrimaryKey(GspwSurveyinfo record);
}