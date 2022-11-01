package com.example.wanchengdemo.entity;


import java.sql.Timestamp;

public class Rolepermission {

  private String roleid;
  private String rolename;
  private String permissionid;
  private String permissioname;
  private String modifiedby;

  private Timestamp UpdateTime;

  private Timestamp CreateTime;



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


  public String getPermissionid() {
    return permissionid;
  }

  public void setPermissionid(String permissionid) {
    this.permissionid = permissionid;
  }


  public String getPermissioname() {
    return permissioname;
  }

  public void setPermissioname(String permissioname) {
    this.permissioname = permissioname;
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
