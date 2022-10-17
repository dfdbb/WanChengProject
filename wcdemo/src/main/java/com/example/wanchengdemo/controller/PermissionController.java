package com.example.wanchengdemo.controller;

import Z.project.test.domain.Permission;
import Z.project.test.service.IPermissionService;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import xin.altitude.cms.common.entity.AjaxResult;
import xin.altitude.cms.common.entity.PageEntity;

import java.util.Arrays;

@RestController
@RequestMapping("/test/permission")
public class PermissionController {
    @Autowired
    private IPermissionService permissionService;
    @GetMapping("/page")
    public AjaxResult page(PageEntity pageEntity,Permission permission){
        return AjaxResult.success(permissionService.page(pageEntity.toPage(), Wrappers.lambdaQuery(permission)));
    }
    @GetMapping("/list")
    public AjaxResult list(Permission permission){
        return AjaxResult.success(permissionService.list(Wrappers.lambdaQuery(permission)));
    }
    @PostMapping("/add")
    public AjaxResult add(@RequestBody Permission permission) {
        return AjaxResult.success(permissionService.save(permission));
    }
    @PutMapping("/edit")
    public AjaxResult edit(@RequestBody Permission permission) {
        return AjaxResult.success(permissionService.updateById(permission));
    }
    @DeleteMapping("/delete/{permissionids}")
    public AjaxResult delete(@PathVariable Integer[] permissionids) {
        return AjaxResult.success(permissionService.removeByIds(Arrays.asList(permissionids)));
    }
    @GetMapping(value = "/detail/{permissionid}")
    public AjaxResult detail(@PathVariable("permissionid") Integer permissionid) {
        return AjaxResult.success(permissionService.getById(permissionid));
    }
}
