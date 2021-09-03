package ywl.mapper;

import org.apache.ibatis.annotations.Param;
import ywl.dto.GspwLog;
import ywl.dto.GspwLogExample;

import java.util.List;

public interface GspwLogMapper {
    long countByExample(GspwLogExample example);

    int deleteByExample(GspwLogExample example);

    int deleteByPrimaryKey(Integer logId);

    int insert(GspwLog record);

    int insertSelective(GspwLog record);

    List<GspwLog> selectByExample(GspwLogExample example);

    GspwLog selectByPrimaryKey(Integer logId);

    int updateByExampleSelective(@Param("record") GspwLog record, @Param("example") GspwLogExample example);

    int updateByExample(@Param("record") GspwLog record, @Param("example") GspwLogExample example);

    int updateByPrimaryKeySelective(GspwLog record);

    int updateByPrimaryKey(GspwLog record);
}