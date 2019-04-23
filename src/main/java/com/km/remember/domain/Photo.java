package com.km.remember.domain;

import java.util.Date;

public class Photo {
    private String photoId;         //图片ID
    private String activityId;      //图片所属活动ID
    private String classId;         //班级ID
    private int category;           //100 班级头像  101 班级logo  200 活动
    private String userId;          //上传者ID
    private String photoURI;        //图片路径
    private String introduction;    //图片简介
    private int status;             //图片状态(0—审核不通过  1—待审核  2—所有人可见  3—仅本班可见)
    private Date uploadTime;        //图片上传时间

    public String getPhotoId() {
        return photoId;
    }

    public void setPhotoId(String photoId) {
        this.photoId = photoId;
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPhotoURI() {
        return photoURI;
    }

    public void setPhotoURI(String photoURI) {
        this.photoURI = photoURI;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "photoId='" + photoId + '\'' +
                ", activityId='" + activityId + '\'' +
                ", classId='" + classId + '\'' +
                ", category=" + category +
                ", userId='" + userId + '\'' +
                ", photoURI='" + photoURI + '\'' +
                ", introduction='" + introduction + '\'' +
                ", status=" + status +
                ", uploadTime=" + uploadTime +
                '}';
    }
}
