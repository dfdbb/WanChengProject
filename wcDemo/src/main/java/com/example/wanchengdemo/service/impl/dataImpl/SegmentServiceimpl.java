package com.example.wanchengdemo.service.impl.dataImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.wanchengdemo.entity.Segment;
import com.example.wanchengdemo.mapper.dataMapper.SegmentMapper;
import com.example.wanchengdemo.service.dataService.SegmentService;
import org.springframework.stereotype.Service;

@Service
public class SegmentServiceimpl extends ServiceImpl<SegmentMapper, Segment> implements SegmentService {
}
