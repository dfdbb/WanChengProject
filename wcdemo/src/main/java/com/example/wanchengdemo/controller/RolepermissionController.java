package com.example.wanchengdemo.controller;

import Z.project.test.domain.Rolepermission;
import Z.project.test.service.IRolepermissionService;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xin.altitude.cms.common.entity.AjaxResult;
import xin.altitude.cms.common.entity.PageEntity;

@RestController
@RequestMapping("/test/rolepermission")
public class RolepermissionController {
    @Autowired
    private IRolepermissionService rolepermissionService;
    @GetMapping("/page")
    public AjaxResult page(PageEntity pageEntity,Rolepermission rolepermission){
        return AjaxResult.success(rolepermissionService.page(pageEntity.toPage(), Wrappers.lambdaQuery(rolepermission)));
    }
    @GetMapping("/list")
    public AjaxResult list(Rolepermission rolepermission){
        return AjaxResult.success(rolepermissionService.list(Wrappers.lambdaQuery(rolepermission)));
    }
}