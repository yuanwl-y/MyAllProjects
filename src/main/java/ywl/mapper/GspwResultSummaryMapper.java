package ywl.mapper;

import org.apache.ibatis.annotations.Param;
import ywl.dto.GspwResultSummary;
import ywl.dto.GspwResultSummaryExample;

import java.util.List;

public interface GspwResultSummaryMapper {
    long countByExample(GspwResultSummaryExample example);

    int deleteByExample(GspwResultSummaryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GspwResultSummary record);

    int insertSelective(GspwResultSummary record);

    List<GspwResultSummary> selectByExample(GspwResultSummaryExample example);

    GspwResultSummary selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GspwResultSummary record, @Param("example") GspwResultSummaryExample example);

    int updateByExample(@Param("record") GspwResultSummary record, @Param("example") GspwResultSummaryExample example);

    int updateByPrimaryKeySelective(GspwResultSummary record);

    int updateByPrimaryKey(GspwResultSummary record);
}