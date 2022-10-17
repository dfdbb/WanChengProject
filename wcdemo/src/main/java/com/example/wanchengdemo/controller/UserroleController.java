package com.example.wanchengdemo.controller;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.example.wanchengdemo.commom.R;
import com.example.wanchengdemo.domain.Userrole;
import com.example.wanchengdemo.service.IUserroleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import xin.altitude.cms.common.entity.AjaxResult;
import xin.altitude.cms.common.entity.PageEntity;

import java.util.Arrays;

@RestController
@RequestMapping("/test/userrole")
public class UserroleController {
    @Autowired
    private IUserroleService userroleService;
    @GetMapping("/page")
    public AjaxResult page(PageEntity pageEntity, Userrole userrole){
        return AjaxResult.success(userroleService.page(pageEntity.toPage(), Wrappers.lambdaQuery(userrole)));
    }
    @GetMapping("/list")
    public AjaxResult list(Userrole userrole){
        return AjaxResult.success(userroleService.list(Wrappers.lambdaQuery(userrole)));
    }
    @PostMapping("/add")
    public AjaxResult add(@RequestBody Userrole userrole) {
        return AjaxResult.success(userroleService.save(userrole));
    }
    @PutMapping("/edit")
    public AjaxResult edit(@RequestBody Userrole userrole) {
        return AjaxResult.success(userroleService.updateById(userrole));
    }
    @DeleteMapping("/delete/{roleids}")
    public AjaxResult delete(@PathVariable Integer[] roleids) {
        return AjaxResult.success(userroleService.removeByIds(Arrays.asList(roleids)));
    }
    @GetMapping(value = "/detail/{roleid}")
    public R detail(@PathVariable("roleid") Integer roleid) {
        return R.success(userroleService.getById(roleid));
    }
}
