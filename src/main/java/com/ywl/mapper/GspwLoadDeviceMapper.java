package com.ywl.mapper;

import com.ywl.dto.GspwLoadDevice;
import com.ywl.dto.GspwLoadDeviceExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GspwLoadDeviceMapper {
    long countByExample(GspwLoadDeviceExample example);

    int deleteByExample(GspwLoadDeviceExample example);

    int deleteByPrimaryKey(Integer deviceId);

    int insert(GspwLoadDevice record);

    int insertSelective(GspwLoadDevice record);

    List<GspwLoadDevice> selectByExample(GspwLoadDeviceExample example);

    GspwLoadDevice selectByPrimaryKey(Integer deviceId);

    int updateByExampleSelective(@Param("record") GspwLoadDevice record, @Param("example") GspwLoadDeviceExample example);

    int updateByExample(@Param("record") GspwLoadDevice record, @Param("example") GspwLoadDeviceExample example);

    int updateByPrimaryKeySelective(GspwLoadDevice record);

    int updateByPrimaryKey(GspwLoadDevice record);
}