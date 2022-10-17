package com.example.wanchengdemo.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "userrole")
public class Userrole {
    private static final long serialVersionUID = 1L;
    private Integer roleid;
    private String rolename;
    private Integer uid;
    private String username;
    
    public Userrole(Userrole userrole) {
        if (Objects.nonNull(userrole)) {
            this.roleid=userrole.roleid;
            this.rolename=userrole.rolename;
            this.uid=userrole.uid;
            this.username=userrole.username;
        }
    }
}
