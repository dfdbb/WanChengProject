package com.example.wanchengdemo.controller;

import Z.project.test.domain.Role;
import Z.project.test.service.IRoleService;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import xin.altitude.cms.common.entity.AjaxResult;
import xin.altitude.cms.common.entity.PageEntity;

import java.util.Arrays;

@RestController
@RequestMapping("/test/role")
public class RoleController {
    @Autowired
    private IRoleService roleService;
    @GetMapping("/page")
    public AjaxResult page(PageEntity pageEntity,Role role){
        return AjaxResult.success(roleService.page(pageEntity.toPage(), Wrappers.lambdaQuery(role)));
    }
    @GetMapping("/list")
    public AjaxResult list(Role role){
        return AjaxResult.success(roleService.list(Wrappers.lambdaQuery(role)));
    }
    @PostMapping("/add")
    public AjaxResult add(@RequestBody Role role) {
        return AjaxResult.success(roleService.save(role));
    }
    @PutMapping("/edit")
    public AjaxResult edit(@RequestBody Role role) {
        return AjaxResult.success(roleService.updateById(role));
    }
    @DeleteMapping("/delete/{roleids}")
    public AjaxResult delete(@PathVariable Integer[] roleids) {
        return AjaxResult.success(roleService.removeByIds(Arrays.asList(roleids)));
    }
    @GetMapping(value = "/detail/{roleid}")
    public AjaxResult detail(@PathVariable("roleid") Integer roleid) {
        return AjaxResult.success(roleService.getById(roleid));
    }
}
