package com.weds.antd.appserver.entity;

public class Equipment {

    private int id;

    private String gatewayNo;

    private String gatewayName;

    private String gatewayIP;

    private int equipmentNo;

    private int onlineNo;

    private int offlineNo;

    private int faultyNo;

    private String upSpeed;

    private String downSpeed;

    private boolean enable;

    private boolean auto;

    public Equipment() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGatewayNo() {
        return gatewayNo;
    }

    public void setGatewayNo(String gatewayNo) {
        this.gatewayNo = gatewayNo;
    }

    public String getGatewayName() {
        return gatewayName;
    }

    public void setGatewayName(String gatewayName) {
        this.gatewayName = gatewayName;
    }

    public String getGatewayIP() {
        return gatewayIP;
    }

    public void setGatewayIP(String gatewayIP) {
        this.gatewayIP = gatewayIP;
    }

    public int getEquipmentNo() {
        return equipmentNo;
    }

    public void setEquipmentNo(int equipmentNo) {
        this.equipmentNo = equipmentNo;
    }

    public int getOnlineNo() {
        return onlineNo;
    }

    public void setOnlineNo(int onlineNo) {
        this.onlineNo = onlineNo;
    }

    public int getOfflineNo() {
        return offlineNo;
    }

    public void setOfflineNo(int offlineNo) {
        this.offlineNo = offlineNo;
    }

    public int getFaultyNo() {
        return faultyNo;
    }

    public void setFaultyNo(int faultyNo) {
        this.faultyNo = faultyNo;
    }

    public String getUpSpeed() {
        return upSpeed;
    }

    public void setUpSpeed(String upSpeed) {
        this.upSpeed = upSpeed;
    }

    public String getDownSpeed() {
        return downSpeed;
    }

    public void setDownSpeed(String downSpeed) {
        this.downSpeed = downSpeed;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public boolean isAuto() {
        return auto;
    }

    public void setAuto(boolean auto) {
        this.auto = auto;
    }
}
