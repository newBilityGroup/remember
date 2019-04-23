package com.km.remember.domain;

import java.util.Date;

public class ActivityRecode {
    private String activityId;
    private String classId;         //活动举办班级
    private String userId;          //活动记录上传者
    private Date activityTime;      //活动时间
    private String title;           //活动标题
    private String description;     //活动简介
    private String content;         //活动内容
    private int start;
    private int like;

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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getActivityTime() {
        return activityTime;
    }

    public void setActivityTime(Date activityTime) {
        this.activityTime = activityTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    @Override
    public String toString() {
        return "ActivityRecode{" +
                "activityId='" + activityId + '\'' +
                ", classId='" + classId + '\'' +
                ", userId='" + userId + '\'' +
                ", activityTime=" + activityTime +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", content='" + content + '\'' +
                ", start=" + start +
                ", like=" + like +
                '}';
    }
}
