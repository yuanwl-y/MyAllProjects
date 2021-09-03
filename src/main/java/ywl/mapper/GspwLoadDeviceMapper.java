package ywl.mapper;

import org.apache.ibatis.annotations.Param;
import ywl.dto.GspwLoadDevice;
import ywl.dto.GspwLoadDeviceExample;

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