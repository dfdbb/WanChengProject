package com.example.wanchengdemo.entity;


import java.io.Serializable;
import java.sql.Timestamp;

public class User implements Serializable {

  private String uid;
  private String username;
  private String pwd;
  private String department;
  private String phone;
  private String mail;
  private String modifiedby;
  private java.sql.Timestamp UpdateTime;

  private java.sql.Timestamp CreateTime;
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public String getPwd() {
    return pwd;
  }

  public void setPwd(String pwd) {
    this.pwd = pwd;
  }


  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public String getMail() {
    return mail;
  }

  public void setMail(String mail) {
    this.mail = mail;
  }





  public String getModifiedby() {
    return modifiedby;
  }

  public void setModifiedby(String modifiedby) {
    this.modifiedby = modifiedby;
  }


  public Timestamp getCreateTime() {
    return CreateTime;
  }

  public void setCreateTime(Timestamp createTime) {
    CreateTime = createTime;
  }

  public Timestamp getUpdateTime() {
    return UpdateTime;
  }

  public void setUpdateTime(Timestamp updateTime) {
    UpdateTime = updateTime;
  }
}
