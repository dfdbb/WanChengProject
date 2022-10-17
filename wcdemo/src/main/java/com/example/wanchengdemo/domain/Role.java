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
@TableName(value = "role")
public class Role {
    private static final long serialVersionUID = 1L;
    @TableId(type = IdType.AUTO)
    private Integer roleid;
    private String rolename;
    
    public Role(Role role) {
        if (Objects.nonNull(role)) {
            this.roleid=role.roleid;
            this.rolename=role.rolename;
        }
    }
}
