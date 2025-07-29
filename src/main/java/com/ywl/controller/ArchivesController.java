package com.ywl.controller;

import com.ywl.dto.GspwArchives;
import com.ywl.mapper.GspwArchivesMapper;
import com.ywl.util.MybatisUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/all")
// 修复类名命名规范（首字母大写）
public class ArchivesController {
    // 将@RequestMapping明确为GET请求，并添加produces指定中文编码
    @GetMapping(value = "/getArchives/{archivesId}", produces = "application/json;charset=UTF-8")
    public GspwArchives getArchives(@PathVariable Integer archivesId) {
        try {
            GspwArchives gspwArchives = MybatisUtil.getSqlSession().getMapper(GspwArchivesMapper.class).selectByPrimaryKey(archivesId);
            // 添加中文空值判断提示
            if (gspwArchives == null) {
                throw new RuntimeException("未找到ID为" + archivesId + "的档案记录");
            }
            System.out.println(gspwArchives);
            return gspwArchives;
        } catch (Exception e) {
            // 统一异常处理，返回中文错误信息
            throw new RuntimeException("查询档案失败：" + e.getMessage());
        }
    }
}
