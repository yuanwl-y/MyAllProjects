package com.ywl.mapper;

import com.ywl.dto.GspwSpecialintegrated;
import com.ywl.dto.GspwSpecialintegratedExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GspwSpecialintegratedMapper {
    long countByExample(GspwSpecialintegratedExample example);

    int deleteByExample(GspwSpecialintegratedExample example);

    int deleteByPrimaryKey(String specialId);

    int insert(GspwSpecialintegrated record);

    int insertSelective(GspwSpecialintegrated record);

    List<GspwSpecialintegrated> selectByExample(GspwSpecialintegratedExample example);

    GspwSpecialintegrated selectByPrimaryKey(String specialId);

    int updateByExampleSelective(@Param("record") GspwSpecialintegrated record, @Param("example") GspwSpecialintegratedExample example);

    int updateByExample(@Param("record") GspwSpecialintegrated record, @Param("example") GspwSpecialintegratedExample example);

    int updateByPrimaryKeySelective(GspwSpecialintegrated record);

    int updateByPrimaryKey(GspwSpecialintegrated record);
}