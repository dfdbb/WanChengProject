package com.example.wanchengdemo.domain;

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
@TableName(value = "permission")
public class Permission{
    private static final long serialVersionUID = 1L;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createtime;
    private String modifiedby;
    @TableId(type = IdType.AUTO)
    private Integer permissionid;
    private String permissionname;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updatetime;
    
    public Permission(Permission permission) {
        if (Objects.nonNull(permission)) {
            this.createtime=permission.createtime;
            this.modifiedby=permission.modifiedby;
            this.permissionid=permission.permissionid;
            this.permissionname=permission.permissionname;
            this.updatetime=permission.updatetime;
        }
    }
}
