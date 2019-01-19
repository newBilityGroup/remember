package com.km.remember.domain;

import java.util.Date;

public class User {
    private String userId;         //用户ID
    private String classId;        //班级ID
    private String username;       //用户名
    private String password;       //密码
    private String realname;       //用户真实姓名
    private String headURI;        //头像URI
    private String introduction;   //用户个人简介
    private String email;          //邮箱
    private String phoneNumber;    //手机号码
    private Date birthday;       //生日
    private String address;        //生活地址
    private String workAddress;    //工作地址
    private String label;          //个人标签
    private int role;              //角色(0—管理员  1—学生用户  2—教师用户)

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getHeadURI() {
        return headURI;
    }

    public void setHeadURI(String headURI) {
        this.headURI = headURI;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(String workAddress) {
        this.workAddress = workAddress;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", realname='" + realname + '\'' +
                ", headURI='" + headURI + '\'' +
                ", introduction='" + introduction + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", classId='" + classId + '\'' +
                ", birthday='" + birthday + '\'' +
                ", address='" + address + '\'' +
                ", workAddress='" + workAddress + '\'' +
                ", label='" + label + '\'' +
                ", role=" + role +
                '}';
    }
}
