package com.example.wanchengdemo.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "permission")
public class Permission {
    private static final long serialVersionUID = 1L;
    @TableId(type = IdType.AUTO)
    private Integer permissionid;
    private String permissionname;
    
    public Permission(Permission permission) {
        if (Objects.nonNull(permission)) {
            this.permissionid=permission.permissionid;
            this.permissionname=permission.permissionname;
        }
    }
}
