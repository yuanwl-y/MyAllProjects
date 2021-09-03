package ywl.mapper;

import org.apache.ibatis.annotations.Param;
import ywl.dto.GspwLoadDeviceType;
import ywl.dto.GspwLoadDeviceTypeExample;

import java.util.List;

public interface GspwLoadDeviceTypeMapper {
    long countByExample(GspwLoadDeviceTypeExample example);

    int deleteByExample(GspwLoadDeviceTypeExample example);

    int deleteByPrimaryKey(Integer devicetypeId);

    int insert(GspwLoadDeviceType record);

    int insertSelective(GspwLoadDeviceType record);

    List<GspwLoadDeviceType> selectByExample(GspwLoadDeviceTypeExample example);

    GspwLoadDeviceType selectByPrimaryKey(Integer devicetypeId);

    int updateByExampleSelective(@Param("record") GspwLoadDeviceType record, @Param("example") GspwLoadDeviceTypeExample example);

    int updateByExample(@Param("record") GspwLoadDeviceType record, @Param("example") GspwLoadDeviceTypeExample example);

    int updateByPrimaryKeySelective(GspwLoadDeviceType record);

    int updateByPrimaryKey(GspwLoadDeviceType record);
}