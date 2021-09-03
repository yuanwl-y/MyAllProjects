package ywl.mapper;

import org.apache.ibatis.annotations.Param;
import ywl.dto.GspwLoadTime;
import ywl.dto.GspwLoadTimeExample;

import java.util.List;

public interface GspwLoadTimeMapper {
    long countByExample(GspwLoadTimeExample example);

    int deleteByExample(GspwLoadTimeExample example);

    int deleteByPrimaryKey(Integer timeId);

    int insert(GspwLoadTime record);

    int insertSelective(GspwLoadTime record);

    List<GspwLoadTime> selectByExample(GspwLoadTimeExample example);

    GspwLoadTime selectByPrimaryKey(Integer timeId);

    int updateByExampleSelective(@Param("record") GspwLoadTime record, @Param("example") GspwLoadTimeExample example);

    int updateByExample(@Param("record") GspwLoadTime record, @Param("example") GspwLoadTimeExample example);

    int updateByPrimaryKeySelective(GspwLoadTime record);

    int updateByPrimaryKey(GspwLoadTime record);
}