package com.example.wanchengdemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.wanchengdemo.domain.Project;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProjectMapper extends BaseMapper<Project> {
}
