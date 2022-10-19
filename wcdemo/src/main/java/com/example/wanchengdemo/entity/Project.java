package com.example.wanchengdemo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "project")
public class Project{
    private static final long serialVersionUID = 1L;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createtime;
    private String modifiedby;
    @TableId(type = IdType.AUTO)
    private String pid;
    private String pname;
    private String powner;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updatetime;
    
    public Project(Project project) {
        if (Objects.nonNull(project)) {
            this.createtime=project.createtime;
            this.modifiedby=project.modifiedby;
            this.pid=project.pid;
            this.pname=project.pname;
            this.powner=project.powner;
            this.updatetime=project.updatetime;
        }
    }
}
