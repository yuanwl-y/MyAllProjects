package ywl.mapper;

import org.apache.ibatis.annotations.Param;
import ywl.dto.GspwLoadTypeGrade;
import ywl.dto.GspwLoadTypeGradeExample;

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