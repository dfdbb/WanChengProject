package com.example.wanchengdemo.controller;


import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.example.wanchengdemo.commom.R;
import com.example.wanchengdemo.domain.Rolepermission;
import com.example.wanchengdemo.service.IRolepermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import xin.altitude.cms.common.entity.AjaxResult;
import xin.altitude.cms.common.entity.PageEntity;

import java.util.Arrays;

@RestController
@RequestMapping("/test/rolepermission")
public class RolepermissionController {
    @Autowired
    private IRolepermissionService rolepermissionService;
    @GetMapping("/page")
    public AjaxResult page(PageEntity pageEntity, Rolepermission rolepermission){
        return AjaxResult.success(rolepermissionService.page(pageEntity.toPage(), Wrappers.lambdaQuery(rolepermission)));
    }
    @GetMapping("/list")
    public AjaxResult list(Rolepermission rolepermission){
        return AjaxResult.success(rolepermissionService.list(Wrappers.lambdaQuery(rolepermission)));
    }
    @PostMapping("/add")
    public AjaxResult add(@RequestBody Rolepermission rolepermission) {
        return AjaxResult.success(rolepermissionService.save(rolepermission));
    }
    @PutMapping("/edit")
    public AjaxResult edit(@RequestBody Rolepermission rolepermission) {
        return AjaxResult.success(rolepermissionService.updateById(rolepermission));
    }
    @DeleteMapping("/delete/{permissionids}")
    public AjaxResult delete(@PathVariable Integer[] roleparmissionids) {
        return AjaxResult.success(rolepermissionService.removeByIds(Arrays.asList(roleparmissionids)));
    }
    @GetMapping(value = "/detail/{permissionid}")
    public AjaxResult detail(@PathVariable("permissionid") Integer roleparmissionid) {
        return AjaxResult.success(rolepermissionService.getById(roleparmissionid));
    }
}
