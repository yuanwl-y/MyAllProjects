package com.ywl.controller;

import com.ywl.domain.GspwArchives;
import com.ywl.mapper.GspwArchivesMapper;
import com.ywl.util.Result;
import io.swagger.annotations.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * 档案管理控制器
 */
@RestController
@RequestMapping("/gspwArchives")
@RequiredArgsConstructor
@Api(tags = "档案管理", description = "提供档案的查询和更新功能")
public class ArchivesController {

    private final GspwArchivesMapper gspwArchivesMapper;

    /**
     * 根据档案ID获取档案信息
     */
    @GetMapping("/getArchives/{archivesId}")
    @ApiOperation(value = "根据ID获取档案信息", notes = "通过档案ID查询档案详细信息")
    @ApiResponses({
            @ApiResponse(code = 200, message = "查询成功"),
            @ApiResponse(code = 404, message = "档案不存在")
    })
    public Result<GspwArchives> getArchives(
            @ApiParam(name = "archivesId", value = "档案ID", required = true, example = "1")
            @PathVariable @NotNull Integer archivesId) {
        return Result.success(gspwArchivesMapper.selectById(archivesId));
    }

    /**
     * 修改档案信息
     */
    @PostMapping("/updateArchives")
    @ApiOperation(value = "更新档案信息", notes = "更新指定档案的信息")
    @ApiResponses({
            @ApiResponse(code = 200, message = "更新成功"),
            @ApiResponse(code = 404, message = "档案不存在")
    })
    public Result<Void> updateArchives(
            @ApiParam(name = "gspwArchives", value = "档案信息对象", required = true)
            @RequestBody @Valid GspwArchives gspwArchives) {
        return gspwArchivesMapper.updateById(gspwArchives) > 0 ?
               Result.success() : Result.error("更新失败");
    }
}
