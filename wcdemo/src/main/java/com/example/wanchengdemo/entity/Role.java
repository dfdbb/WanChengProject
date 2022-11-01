package com.example.wanchengdemo.entity;


public class Role {

  private String roleid;
  private String roleName;
  private String modifiedby;
  private java.sql.Timestamp createtime;
  private java.sql.Timestamp updatetime;


  public String getRoleid() {
    return roleid;
  }

  public void setRoleid(String roleid) {
    this.roleid = roleid;
  }


  public String getRoleName() {
    return roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }


  public String getModifiedby() {
    return modifiedby;
  }

  public void setModifiedby(String modifiedby) {
    this.modifiedby = modifiedby;
  }


  public java.sql.Timestamp getCreatetime() {
    return createtime;
  }

  public void setCreatetime(java.sql.Timestamp createtime) {
    this.createtime = createtime;
  }


  public java.sql.Timestamp getUpdatetime() {
    return updatetime;
  }

  public void setUpdatetime(java.sql.Timestamp updatetime) {
    this.updatetime = updatetime;
  }

}
