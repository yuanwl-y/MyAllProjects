package com.ywl.mapper;

import com.ywl.dto.GspwMonprojectFlowaudit;
import com.ywl.dto.GspwMonprojectFlowauditExample;
import org.apache.ibatis.annotations.Param;

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