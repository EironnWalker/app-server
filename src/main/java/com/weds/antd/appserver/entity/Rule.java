package com.weds.antd.appserver.entity;

/**
 * 规则
 *
 * @author invlong
 * @createTime 2017-11-21 05:53
 */
public class Rule {

    private int key;

    private boolean disabled;

    private String href;

    private String avatar;

    private String no;

    private String title;

    private String owner;

    private String description;

    private double callNo;

    private double status;

    private String updatedAt;

    private String createdAt;

    private double progress;

    public Rule() {
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public boolean isDisabled() {
        return disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getCallNo() {
        return callNo;
    }

    public void setCallNo(double callNo) {
        this.callNo = callNo;
    }

    public double getStatus() {
        return status;
    }

    public void setStatus(double status) {
        this.status = status;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public double getProgress() {
        return progress;
    }

    public void setProgress(double progress) {
        this.progress = progress;
    }
}
