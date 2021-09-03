package ywl.mapper;

import org.apache.ibatis.annotations.Param;
import ywl.dto.GspwMonprojectFlowaudit;
import ywl.dto.GspwMonprojectFlowauditExample;

import java.util.List;

public interface GspwMonprojectFlowauditMapper {
    long countByExample(GspwMonprojectFlowauditExample example);

    int deleteByExample(GspwMonprojectFlowauditExample example);

    int deleteByPrimaryKey(String monprojectFlowauditId);

    int insert(GspwMonprojectFlowaudit record);

    int insertSelective(GspwMonprojectFlowaudit record);

    List<GspwMonprojectFlowaudit> selectByExample(GspwMonprojectFlowauditExample example);

    GspwMonprojectFlowaudit selectByPrimaryKey(String monprojectFlowauditId);

    int updateByExampleSelective(@Param("record") GspwMonprojectFlowaudit record, @Param("example") GspwMonprojectFlowauditExample example);

    int updateByExample(@Param("record") GspwMonprojectFlowaudit record, @Param("example") GspwMonprojectFlowauditExample example);

    int updateByPrimaryKeySelective(GspwMonprojectFlowaudit record);

    int updateByPrimaryKey(GspwMonprojectFlowaudit record);
}