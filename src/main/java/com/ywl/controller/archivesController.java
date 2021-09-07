package com.ywl.controller;

import com.ywl.dto.GspwArchives;
import com.ywl.mapper.GspwArchivesMapper;
import com.ywl.util.MybatisUtil;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by ywl--- 2021-09-02-09:51
 **/

@RestController
@RequestMapping("/all")
public class archivesController {
    @RequestMapping("/getArchives/{archivesId}")
    public GspwArchives getArchives(@PathVariable Integer archivesId) {
        GspwArchives gspwArchives = MybatisUtil.getSqlSession().getMapper(GspwArchivesMapper.class).selectByPrimaryKey(archivesId);
        System.out.println(gspwArchives);
        return gspwArchives;

    }
}
