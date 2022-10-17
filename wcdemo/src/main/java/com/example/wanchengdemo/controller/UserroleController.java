package com.example.wanchengdemo.controller;

import Z.project.test.domain.Userrole;
import Z.project.test.service.IUserroleService;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xin.altitude.cms.common.entity.AjaxResult;
import xin.altitude.cms.common.entity.PageEntity;

@RestController
@RequestMapping("/test/userrole")
public class UserroleController {
    @Autowired
    private IUserroleService userroleService;
    @GetMapping("/page")
    public AjaxResult page(PageEntity pageEntity,Userrole userrole){
        return AjaxResult.success(userroleService.page(pageEntity.toPage(), Wrappers.lambdaQuery(userrole)));
    }
    @GetMapping("/list")
    public AjaxResult list(Userrole userrole){
        return AjaxResult.success(userroleService.list(Wrappers.lambdaQuery(userrole)));
    }
}
