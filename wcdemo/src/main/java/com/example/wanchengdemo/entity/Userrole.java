package com.example.wanchengdemo.entity;


import java.sql.Timestamp;

public class Userrole {

  private String uid;
  private String username;
  private String roleid;
  private String rolename;
  private String modifiedby;


  private Timestamp UpdateTime;

  private Timestamp CreateTime;


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


  public String getRoleid() {
    return roleid;
  }

  public void setRoleid(String roleid) {
    this.roleid = roleid;
  }


  public String getRolename() {
    return rolename;
  }

  public void setRolename(String rolename) {
    this.rolename = rolename;
  }





  public String getModifiedby() {
    return modifiedby;
  }

  public void setModifiedby(String modifiedby) {
    this.modifiedby = modifiedby;
  }


  public Timestamp getUpdateTime() {
    return UpdateTime;
  }

  public void setUpdateTime(Timestamp updateTime) {
    UpdateTime = updateTime;
  }

  public Timestamp getCreateTime() {
    return CreateTime;
  }

  public void setCreateTime(Timestamp createTime) {
    CreateTime = createTime;
  }
}
