package com.example.wanchengdemo.controller;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.example.wanchengdemo.commom.R;
import com.example.wanchengdemo.domain.Role;
import com.example.wanchengdemo.service.IRoleService;
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
    public R page(PageEntity pageEntity, Role role){
        return R.success(roleService.page(pageEntity.toPage(), Wrappers.lambdaQuery(role)));
    }
    @GetMapping("/list")
    public R list(Role role){
        return R.success(roleService.list(Wrappers.lambdaQuery(role)));
    }
    @PostMapping("/add")
    public R add(@RequestBody Role role) {
        return R.success(roleService.save(role));
    }
    @PutMapping("/edit")
    public R edit(@RequestBody Role role) {
        return R.success(roleService.updateById(role));
    }
    @DeleteMapping("/delete/{roleids}")
    public R delete(@PathVariable Integer[] roleids) {
        return R.success(roleService.removeByIds(Arrays.asList(roleids)));
    }
    @GetMapping(value = "/detail/{roleid}")
    public R detail(@PathVariable("roleid") Integer roleid) {
        return R.success(roleService.getById(roleid));
    }
}

