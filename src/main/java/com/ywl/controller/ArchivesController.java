package com.ywl.controller;

import com.ywl.dto.GspwArchives;
import com.ywl.mapper.GspwArchivesMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/all")
public class ArchivesController {

    @Resource
    private GspwArchivesMapper gspwArchivesMapper;

    @GetMapping(value = "/getArchives/{archivesId}", produces = "application/json;charset=UTF-8")
    public GspwArchives getArchives(@PathVariable Integer archivesId) {
        try {
            GspwArchives gspwArchives = gspwArchivesMapper.selectByPrimaryKey(archivesId);
            if (gspwArchives == null) {
                throw new RuntimeException("未找到ID为" + archivesId + "的档案记录");
            }
            return gspwArchives;
        } catch (Exception e) {
            throw new RuntimeException("查询档案失败：" + e.getMessage());
        }
    }
}
