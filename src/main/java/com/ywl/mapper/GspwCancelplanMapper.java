package com.ywl.mapper;

import com.ywl.dto.GspwCancelplan;
import com.ywl.dto.GspwCancelplanExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GspwCancelplanMapper {
    long countByExample(GspwCancelplanExample example);

    int deleteByExample(GspwCancelplanExample example);

    int deleteByPrimaryKey(Integer cancelplanid);

    int insert(GspwCancelplan record);

    int insertSelective(GspwCancelplan record);

    List<GspwCancelplan> selectByExample(GspwCancelplanExample example);

    GspwCancelplan selectByPrimaryKey(Integer cancelplanid);

    int updateByExampleSelective(@Param("record") GspwCancelplan record, @Param("example") GspwCancelplanExample example);

    int updateByExample(@Param("record") GspwCancelplan record, @Param("example") GspwCancelplanExample example);

    int updateByPrimaryKeySelective(GspwCancelplan record);

    int updateByPrimaryKey(GspwCancelplan record);
}