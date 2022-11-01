package com.example.wanchengdemo.service.impl.dataImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.wanchengdemo.entity.Project;
import com.example.wanchengdemo.mapper.dataMapper.ProjectMapper;
import com.example.wanchengdemo.service.dataService.ProjectService;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceimpl extends ServiceImpl<ProjectMapper, Project> implements ProjectService {
}
