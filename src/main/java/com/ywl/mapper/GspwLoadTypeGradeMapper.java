package com.ywl.mapper;

import com.ywl.dto.GspwLoadTypeGrade;
import com.ywl.dto.GspwLoadTypeGradeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GspwLoadTypeGradeMapper {
    long countByExample(GspwLoadTypeGradeExample example);

    int deleteByExample(GspwLoadTypeGradeExample example);

    int deleteByPrimaryKey(Integer gradeId);

    int insert(GspwLoadTypeGrade record);

    int insertSelective(GspwLoadTypeGrade record);

    List<GspwLoadTypeGrade> selectByExample(GspwLoadTypeGradeExample example);

    GspwLoadTypeGrade selectByPrimaryKey(Integer gradeId);

    int updateByExampleSelective(@Param("record") GspwLoadTypeGrade record, @Param("example") GspwLoadTypeGradeExample example);

    int updateByExample(@Param("record") GspwLoadTypeGrade record, @Param("example") GspwLoadTypeGradeExample example);

    int updateByPrimaryKeySelective(GspwLoadTypeGrade record);

    int updateByPrimaryKey(GspwLoadTypeGrade record);
}