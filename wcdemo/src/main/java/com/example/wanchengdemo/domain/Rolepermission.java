package com.example.wanchengdemo.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "rolepermission")
public class Rolepermission {
    private static final long serialVersionUID = 1L;
    private String permissioname;
    private Integer permissionid;
    private Integer roleid;
    private String rolename;
    
    public Rolepermission(Rolepermission rolepermission) {
        if (Objects.nonNull(rolepermission)) {
            this.permissioname=rolepermission.permissioname;
            this.permissionid=rolepermission.permissionid;
            this.roleid=rolepermission.roleid;
            this.rolename=rolepermission.rolename;
        }
    }
}
