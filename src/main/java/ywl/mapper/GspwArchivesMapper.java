package ywl.mapper;

import org.apache.ibatis.annotations.Param;
import ywl.dto.GspwArchives;
import ywl.dto.GspwArchivesExample;

import java.util.List;

public interface GspwArchivesMapper {
    long countByExample(GspwArchivesExample example);

    int deleteByExample(GspwArchivesExample example);

    int deleteByPrimaryKey(Integer archivesId);

    int insert(GspwArchives record);

    int insertSelective(GspwArchives record);

    List<GspwArchives> selectByExample(GspwArchivesExample example);

    GspwArchives selectByPrimaryKey(Integer archivesId);

    int updateByExampleSelective(@Param("record") GspwArchives record, @Param("example") GspwArchivesExample example);

    int updateByExample(@Param("record") GspwArchives record, @Param("example") GspwArchivesExample example);

    int updateByPrimaryKeySelective(GspwArchives record);

    int updateByPrimaryKey(GspwArchives record);
}