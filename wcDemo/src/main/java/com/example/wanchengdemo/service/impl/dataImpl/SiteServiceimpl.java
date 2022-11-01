package com.example.wanchengdemo.service.impl.dataImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.wanchengdemo.entity.Site;
import com.example.wanchengdemo.mapper.dataMapper.SiteMapper;
import com.example.wanchengdemo.service.dataService.SiteService;
import org.springframework.stereotype.Service;

@Service
public class SiteServiceimpl extends ServiceImpl<SiteMapper, Site> implements SiteService {
}
