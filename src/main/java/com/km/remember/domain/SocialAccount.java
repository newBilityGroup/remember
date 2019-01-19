package com.km.remember.domain;

public class SocialAccount {
    private String userId;              //用户ID
    private String weChatAccount;       //微信账号
    private String qqAccount;           //qq账号
    private String githubAccount;       //github账号
    private String jianshuAccount;      //简书账号
    private String csdnAccount;         //csdn账号
    private String microblogAccount;    //微博账号
    private String qqOpenId;            //QQopenID
    private String weChatOpenId;        //微信OpenID

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getWeChatAccount() {
        return weChatAccount;
    }

    public void setWeChatAccount(String weChatAccount) {
        this.weChatAccount = weChatAccount;
    }

    public String getQqAccount() {
        return qqAccount;
    }

    public void setQqAccount(String qqAccount) {
        this.qqAccount = qqAccount;
    }

    public String getGithubAccount() {
        return githubAccount;
    }

    public void setGithubAccount(String githubAccount) {
        this.githubAccount = githubAccount;
    }

    public String getJianshuAccount() {
        return jianshuAccount;
    }

    public void setJianshuAccount(String jianshuAccount) {
        this.jianshuAccount = jianshuAccount;
    }

    public String getCsdnAccount() {
        return csdnAccount;
    }

    public void setCsdnAccount(String csdnAccount) {
        this.csdnAccount = csdnAccount;
    }

    public String getMicroblogAccount() {
        return microblogAccount;
    }

    public void setMicroblogAccount(String microblogAccount) {
        this.microblogAccount = microblogAccount;
    }

    public String getQqOpenId() {
        return qqOpenId;
    }

    public void setQqOpenId(String qqOpenId) {
        this.qqOpenId = qqOpenId;
    }

    public String getWeChatOpenId() {
        return weChatOpenId;
    }

    public void setWeChatOpenId(String weChatOpenId) {
        this.weChatOpenId = weChatOpenId;
    }

    @Override
    public String toString() {
        return "SocialAccount{" +
                "userId='" + userId + '\'' +
                ", weChatAccount='" + weChatAccount + '\'' +
                ", qqAccount='" + qqAccount + '\'' +
                ", githubAccount='" + githubAccount + '\'' +
                ", jianshuAccount='" + jianshuAccount + '\'' +
                ", csdnAccount='" + csdnAccount + '\'' +
                ", microblogAccount='" + microblogAccount + '\'' +
                ", qqOpenId='" + qqOpenId + '\'' +
                ", weChatOpenId='" + weChatOpenId + '\'' +
                '}';
    }
}
