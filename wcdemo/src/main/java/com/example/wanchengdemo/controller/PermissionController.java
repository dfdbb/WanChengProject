package com.example.wanchengdemo.controller;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.example.wanchengdemo.commom.R;
import com.example.wanchengdemo.domain.Permission;
import com.example.wanchengdemo.service.IPermissionService;
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
    public R page(PageEntity pageEntity, Permission permission){
        return R.success(permissionService.page(pageEntity.toPage(), Wrappers.lambdaQuery(permission)));
    }
    @GetMapping("/list")
    public R list(Permission permission){
        return R.success(permissionService.list(Wrappers.lambdaQuery(permission)));
    }
    @PostMapping("/add")
    public R add(@RequestBody Permission permission) {
        return R.success(permissionService.save(permission));
    }
    @PutMapping("/edit")
    public R edit(@RequestBody Permission permission) {
        return R.success(permissionService.updateById(permission));
    }
    @DeleteMapping("/delete/{permissionids}")
    public R delete(@PathVariable Integer[] permissionids) {
        return R.success(permissionService.removeByIds(Arrays.asList(permissionids)));
    }
    @GetMapping(value = "/detail/{permissionid}")
    public R detail(@PathVariable("permissionid") Integer permissionid) {
        return R.success(permissionService.getById(permissionid));
    }
}
