package ywl.mapper;

import org.apache.ibatis.annotations.Param;
import ywl.dto.GspwMonproject;
import ywl.dto.GspwMonprojectExample;

import java.util.List;

public interface GspwMonprojectMapper {
    long countByExample(GspwMonprojectExample example);

    int deleteByExample(GspwMonprojectExample example);

    int deleteByPrimaryKey(String monprojectId);

    int insert(GspwMonproject record);

    int insertSelective(GspwMonproject record);

    List<GspwMonproject> selectByExample(GspwMonprojectExample example);

    GspwMonproject selectByPrimaryKey(String monprojectId);

    int updateByExampleSelective(@Param("record") GspwMonproject record, @Param("example") GspwMonprojectExample example);

    int updateByExample(@Param("record") GspwMonproject record, @Param("example") GspwMonprojectExample example);

    int updateByPrimaryKeySelective(GspwMonproject record);

    int updateByPrimaryKey(GspwMonproject record);
}