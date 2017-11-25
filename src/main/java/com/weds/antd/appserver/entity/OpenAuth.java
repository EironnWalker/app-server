package com.weds.antd.appserver.entity;

import java.sql.Time;
import java.sql.Timestamp;

public class OpenAuth {

    private int id;

    private String name;

    private String version;

    private Timestamp activeTime;

    private Timestamp validTime;

    private String desc;

    public OpenAuth() {
    }

    public OpenAuth(int id, String name, String version, Timestamp activeTime, Timestamp validTime, String desc) {
        this.id = id;
        this.name = name;
        this.version = version;
        this.activeTime = activeTime;
        this.validTime = validTime;
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

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Timestamp getActiveTime() {
        return activeTime;
    }

    public void setActiveTime(Timestamp activeTime) {
        this.activeTime = activeTime;
    }

    public Timestamp getValidTime() {
        return validTime;
    }

    public void setValidTime(Timestamp validTime) {
        this.validTime = validTime;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
