package ywl.mapper;

import org.apache.ibatis.annotations.Param;
import ywl.dto.GspwPost;
import ywl.dto.GspwPostExample;

import java.util.List;

public interface GspwPostMapper {
    long countByExample(GspwPostExample example);

    int deleteByExample(GspwPostExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GspwPost record);

    int insertSelective(GspwPost record);

    List<GspwPost> selectByExample(GspwPostExample example);

    GspwPost selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GspwPost record, @Param("example") GspwPostExample example);

    int updateByExample(@Param("record") GspwPost record, @Param("example") GspwPostExample example);

    int updateByPrimaryKeySelective(GspwPost record);

    int updateByPrimaryKey(GspwPost record);
}