package com.ywl.controller;

import com.ywl.dto.GspwArchives;
import com.ywl.mapper.GspwArchivesMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 档案管理控制器
 */
@Slf4j
@RestController
@RequestMapping("/gspwArchives")
public class ArchivesController {

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

    /**
     * 修改档案信息
     *
     * @param gspwArchives 档案信息
     * @return 修改结果，true表示成功，false表示失败
     */
    @PostMapping("/updateArchives")
    public boolean updateArchives(@RequestBody GspwArchives gspwArchives) {
        // 参数校验
        if (gspwArchives == null || gspwArchives.getArchivesId() == null || gspwArchives.getArchivesId() <= 0) {
            log.warn("更新档案时参数不合法: {}", gspwArchives);
            return false;
        }
        try {
            // 检查档案是否存在
            GspwArchives existingArchives = gspwArchivesMapper.selectByPrimaryKey(gspwArchives.getArchivesId());
            if (ObjectUtils.isEmpty(existingArchives)) {
                log.warn("尝试更新不存在的档案，ID: {}", gspwArchives.getArchivesId());
                return false;
            }
            // 执行更新操作
            int result = gspwArchivesMapper.updateByPrimaryKey(gspwArchives);
            if (result > 0) {
                log.info("档案更新成功，ID: {}", gspwArchives.getArchivesId());
                return true;
            } else {
                log.warn("档案更新失败，ID: {}", gspwArchives.getArchivesId());
                return false;
            }
        } catch (Exception e) {
            log.error("更新档案时发生异常，档案ID: {}", gspwArchives.getArchivesId(), e);
            return false;
        }
    }
}
