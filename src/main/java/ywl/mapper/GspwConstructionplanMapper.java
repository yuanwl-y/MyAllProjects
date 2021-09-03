package ywl.mapper;

import org.apache.ibatis.annotations.Param;
import ywl.dto.GspwConstructionplan;
import ywl.dto.GspwConstructionplanExample;

import java.util.List;

public interface GspwConstructionplanMapper {
    long countByExample(GspwConstructionplanExample example);

    int deleteByExample(GspwConstructionplanExample example);

    int deleteByPrimaryKey(Integer constructionplanId);

    int insert(GspwConstructionplan record);

    int insertSelective(GspwConstructionplan record);

    List<GspwConstructionplan> selectByExample(GspwConstructionplanExample example);

    GspwConstructionplan selectByPrimaryKey(Integer constructionplanId);

    int updateByExampleSelective(@Param("record") GspwConstructionplan record, @Param("example") GspwConstructionplanExample example);

    int updateByExample(@Param("record") GspwConstructionplan record, @Param("example") GspwConstructionplanExample example);

    int updateByPrimaryKeySelective(GspwConstructionplan record);

    int updateByPrimaryKey(GspwConstructionplan record);
}