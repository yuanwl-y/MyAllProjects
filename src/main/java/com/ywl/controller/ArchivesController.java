package com.ywl.controller;

import com.ywl.domain.GspwArchives;
import com.ywl.mapper.GspwArchivesMapper;
import com.ywl.util.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
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
@Tag(name = "档案管理", description = "提供档案的查询和更新功能")
public class ArchivesController {

    private final GspwArchivesMapper gspwArchivesMapper;

    /**
     * 根据档案ID获取档案信息
     */
    @GetMapping("/getArchives/{archivesId}")
    @Operation(summary = "根据ID获取档案信息")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "查询成功",
                    content = @Content(mediaType = "application/json",
                            schema = @Schema(implementation = GspwArchives.class))),
            @ApiResponse(responseCode = "404", description = "档案不存在")
    })
    public Result<GspwArchives> getArchives(
            @Parameter(description = "档案ID", example = "1")
            @PathVariable @NotNull Integer archivesId) {
        return Result.success(gspwArchivesMapper.selectById(archivesId));
    }

    /**
     * 修改档案信息
     */
    @PostMapping("/updateArchives")
    @Operation(summary = "更新档案信息")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "更新成功"),
            @ApiResponse(responseCode = "404", description = "档案不存在")
    })
    public Result<Void> updateArchives(
            @Parameter(description = "档案信息对象")
            @RequestBody @Valid GspwArchives gspwArchives) {
        return gspwArchivesMapper.updateById(gspwArchives) > 0 ?
               Result.success() : Result.error("更新失败");
    }
}
