package com.example.wanchengdemo.service.impl.dataImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.wanchengdemo.entity.Section;
import com.example.wanchengdemo.mapper.dataMapper.SectionMapper;
import com.example.wanchengdemo.service.dataService.SectionService;
import org.springframework.stereotype.Service;

@Service
public class SectionServiceimpl extends ServiceImpl<SectionMapper, Section> implements SectionService {
}
