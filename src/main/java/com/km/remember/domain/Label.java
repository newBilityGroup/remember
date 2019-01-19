package com.km.remember.domain;

public class Label {
    private String labelId;           //标签ID
    private String name;              //标签名
    private String introduction;      //标签介绍
    private int status;               //标签状态(0—审核不通过  1—可使用  2—待审核)

    public String getLabelId() {
        return labelId;
    }

    public void setLabelId(String labelId) {
        this.labelId = labelId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "Label{" +
                "labelId='" + labelId + '\'' +
                ", name='" + name + '\'' +
                ", introduction='" + introduction + '\'' +
                ", status=" + status +
                '}';
    }
}
