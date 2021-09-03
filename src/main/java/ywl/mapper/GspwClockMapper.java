package ywl.mapper;

import org.apache.ibatis.annotations.Param;
import ywl.dto.GspwClock;
import ywl.dto.GspwClockExample;

import java.util.List;

public interface GspwClockMapper {
    long countByExample(GspwClockExample example);

    int deleteByExample(GspwClockExample example);

    int deleteByPrimaryKey(Integer clockId);

    int insert(GspwClock record);

    int insertSelective(GspwClock record);

    List<GspwClock> selectByExample(GspwClockExample example);

    GspwClock selectByPrimaryKey(Integer clockId);

    int updateByExampleSelective(@Param("record") GspwClock record, @Param("example") GspwClockExample example);

    int updateByExample(@Param("record") GspwClock record, @Param("example") GspwClockExample example);

    int updateByPrimaryKeySelective(GspwClock record);

    int updateByPrimaryKey(GspwClock record);
}