package com.weds.antd.appserver.entity;

public class Mq {

    private int id;

    private String name;

    private String users;

    private int readyMsgs;

    private int unackedMsgs;

    private int totalMsgs;

    private String desc;

    public Mq() {
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsers() {
        return users;
    }

    public void setUsers(String users) {
        this.users = users;
    }

    public int getReadyMsgs() {
        return readyMsgs;
    }

    public void setReadyMsgs(int redayMsgs) {
        this.readyMsgs = redayMsgs;
    }

    public int getUnackedMsgs() {
        return unackedMsgs;
    }

    public void setUnackedMsgs(int unackedMsgs) {
        this.unackedMsgs = unackedMsgs;
    }

    public int getTotalMsgs() {
        return totalMsgs;
    }

    public void setTotalMsgs(int totalMsgs) {
        this.totalMsgs = totalMsgs;
    }
}
