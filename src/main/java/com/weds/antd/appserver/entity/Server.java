package com.weds.antd.appserver.entity;

import java.sql.Timestamp;

/**
 * 规则
 *
 * @author invlong
 * @createTime 2017-11-21 05:53
 */
public class Server {

    private int id;

    private String appName;

    private String instantName;

    private int status;

    private Timestamp registryTime;

    private String dataCenter;

    private String ip;

    private String port;

    private Timestamp updateTime;

    public Server() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getInstantName() {
        return instantName;
    }

    public void setInstantName(String instantName) {
        this.instantName = instantName;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Timestamp getRegistryTime() {
        return registryTime;
    }

    public void setRegistryTime(Timestamp registryTime) {
        this.registryTime = registryTime;
    }

    public String getDataCenter() {
        return dataCenter;
    }

    public void setDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }
}
