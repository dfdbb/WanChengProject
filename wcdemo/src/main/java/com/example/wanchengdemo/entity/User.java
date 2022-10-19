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
@TableName(value = "user")
public class User{
    private static final long serialVersionUID = 1L;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createtime;
    private String department;
    private String mail;
    private String modifiedby;
    private String phone;
    private String pwd;
    @TableId(type = IdType.AUTO)
    private String uid;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updatetime;
    private String username;
    
    public User(User user) {
        if (Objects.nonNull(user)) {
            this.createtime=user.createtime;
            this.department=user.department;
            this.mail=user.mail;
            this.modifiedby=user.modifiedby;
            this.phone=user.phone;
            this.pwd=user.pwd;
            this.uid=user.uid;
            this.updatetime=user.updatetime;
            this.username=user.username;
        }
    }
}
