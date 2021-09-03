package ywl.mapper;

import org.apache.ibatis.annotations.Param;
import ywl.dto.GspwConstructionplanFlowaudit;
import ywl.dto.GspwConstructionplanFlowauditExample;

import java.util.List;

public interface GspwConstructionplanFlowauditMapper {
    long countByExample(GspwConstructionplanFlowauditExample example);

    int deleteByExample(GspwConstructionplanFlowauditExample example);

    int deleteByPrimaryKey(Integer constructionplanFlowauditId);

    int insert(GspwConstructionplanFlowaudit record);

    int insertSelective(GspwConstructionplanFlowaudit record);

    List<GspwConstructionplanFlowaudit> selectByExample(GspwConstructionplanFlowauditExample example);

    GspwConstructionplanFlowaudit selectByPrimaryKey(Integer constructionplanFlowauditId);

    int updateByExampleSelective(@Param("record") GspwConstructionplanFlowaudit record, @Param("example") GspwConstructionplanFlowauditExample example);

    int updateByExample(@Param("record") GspwConstructionplanFlowaudit record, @Param("example") GspwConstructionplanFlowauditExample example);

    int updateByPrimaryKeySelective(GspwConstructionplanFlowaudit record);

    int updateByPrimaryKey(GspwConstructionplanFlowaudit record);
}