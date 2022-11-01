package com.example.wanchengdemo.entity;


import java.sql.Timestamp;

public class Permission {

  private long permissionid;
  private String permissionname;

  private String modifiedby;


  private Timestamp UpdateTime;

  private Timestamp CreateTime;


  public long getPermissionid() {
    return permissionid;
  }

  public void setPermissionid(long permissionid) {
    this.permissionid = permissionid;
  }


  public String getPermissionname() {
    return permissionname;
  }

  public void setPermissionname(String permissionname) {
    this.permissionname = permissionname;
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
