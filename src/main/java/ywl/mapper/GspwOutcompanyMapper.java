package ywl.mapper;

import org.apache.ibatis.annotations.Param;
import ywl.dto.GspwOutcompany;
import ywl.dto.GspwOutcompanyExample;

import java.util.List;

public interface GspwOutcompanyMapper {
    long countByExample(GspwOutcompanyExample example);

    int deleteByExample(GspwOutcompanyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GspwOutcompany record);

    int insertSelective(GspwOutcompany record);

    List<GspwOutcompany> selectByExample(GspwOutcompanyExample example);

    GspwOutcompany selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GspwOutcompany record, @Param("example") GspwOutcompanyExample example);

    int updateByExample(@Param("record") GspwOutcompany record, @Param("example") GspwOutcompanyExample example);

    int updateByPrimaryKeySelective(GspwOutcompany record);

    int updateByPrimaryKey(GspwOutcompany record);
}