package com.km.remember.domain;


public class ClassInfo {
    private String classId;                //班级ID
    private String className;              //班级名
    private String desc;                   //班级简介
    private String logo;                   //班级logo
    private String honor;                  //班级荣誉

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getHonor() {
        return honor;
    }

    public void setHonor(String honor) {
        this.honor = honor;
    }

    @Override
    public String toString() {
        return "ClassInfo{" +
                "classId='" + classId + '\'' +
                ", className='" + className + '\'' +
                ", desc='" + desc + '\'' +
                ", logo='" + logo + '\'' +
                ", honor='" + honor + '\'' +
                '}';
    }
}