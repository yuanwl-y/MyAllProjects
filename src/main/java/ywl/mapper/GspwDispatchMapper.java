package ywl.mapper;

import org.apache.ibatis.annotations.Param;
import ywl.dto.GspwDispatch;
import ywl.dto.GspwDispatchExample;

import java.util.List;

public interface GspwDispatchMapper {
    long countByExample(GspwDispatchExample example);

    int deleteByExample(GspwDispatchExample example);

    int deleteByPrimaryKey(Integer dispatchId);

    int insert(GspwDispatch record);

    int insertSelective(GspwDispatch record);

    List<GspwDispatch> selectByExample(GspwDispatchExample example);

    GspwDispatch selectByPrimaryKey(Integer dispatchId);

    int updateByExampleSelective(@Param("record") GspwDispatch record, @Param("example") GspwDispatchExample example);

    int updateByExample(@Param("record") GspwDispatch record, @Param("example") GspwDispatchExample example);

    int updateByPrimaryKeySelective(GspwDispatch record);

    int updateByPrimaryKey(GspwDispatch record);
}