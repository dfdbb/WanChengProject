package com.example.wanchengdemo.mapper.dataMapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.wanchengdemo.entity.Segment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface SegmentMapper extends BaseMapper<Segment> {

    @Select("SELECT segment.segid,segment.segdate,section.scons,segment.segrange,segment.roadway,segment.roadhandle,segment.segdesign FROM section,segment WHERE segment.segsid=section.sid;")
    List<Segment> info(Segment segment);
}
