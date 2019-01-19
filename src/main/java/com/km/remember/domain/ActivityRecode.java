package com.km.remember.domain;

import java.util.Date;

public class ActivityRecode {
    private String activityId;      //活动记录的标识
    private String classId;         //活动举办班级
    private String userId;          //活动记录上传者
    private Date activityTime;      //活动时间
    private String title;           //活动标题
    private String content;         //活动内容

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "ActivityRecode{" +
                "activityId='" + activityId + '\'' +
                ", classId='" + classId + '\'' +
                ", userId='" + userId + '\'' +
                ", activityTime=" + activityTime +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
