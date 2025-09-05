package com.ywl.controller;

import com.ywl.dto.GspwArchives;
import com.ywl.mapper.GspwArchivesMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 档案管理控制器
 */
@RestController
@RequestMapping("/gspwArchives")
public class ArchivesController {

    private static final Logger log = LoggerFactory.getLogger(ArchivesController.class);

    @Resource
    private GspwArchivesMapper gspwArchivesMapper;

    /**
     * 根据档案ID获取档案信息
     *
     * @param archivesId 档案ID
     * @return 档案信息，如果未找到则返回空对象
     */
    @GetMapping("/getArchives/{archivesId}")
    public GspwArchives getArchives(@PathVariable(required = false) Integer archivesId) {
        // 参数校验
        if (ObjectUtils.isEmpty(archivesId) || archivesId <= 0) {
            log.debug("无效的档案ID: {}", archivesId);
            return new GspwArchives();
        }

        try {
            GspwArchives gspwArchives = gspwArchivesMapper.selectByPrimaryKey(archivesId);
            if (!ObjectUtils.isEmpty(gspwArchives)) {
                return gspwArchives;
            }
            log.debug("未找到ID为{}的档案记录", archivesId);
        } catch (Exception e) {
            log.error("查询档案失败，档案ID: {}", archivesId, e);
        }
        return new GspwArchives();
    }
}
