package com.weds.antd.appserver.entity;

public class EquipmentDetail {

    private int id;

    private String serverId;

    private String equipmentId;

    private String equipmentNo;

    private String equipmentName;

    private boolean online;

    private String equipmentType;

    private String equipmentPurpose;

    private String equipmentIp;

    private String equipmentPort;

    private String mac;

    private String mask;

    private String gateway;

    public EquipmentDetail() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public String getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(String equipmentId) {
        this.equipmentId = equipmentId;
    }

    public String getEquipmentNo() {
        return equipmentNo;
    }

    public void setEquipmentNo(String equipmentNo) {
        this.equipmentNo = equipmentNo;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    public String getEquipmentType() {
        return equipmentType;
    }

    public void setEquipmentType(String equipmentType) {
        this.equipmentType = equipmentType;
    }

    public String getEquipmentPurpose() {
        return equipmentPurpose;
    }

    public void setEquipmentPurpose(String equipmentPurpose) {
        this.equipmentPurpose = equipmentPurpose;
    }

    public String getEquipmentIp() {
        return equipmentIp;
    }

    public void setEquipmentIp(String equipmentIp) {
        this.equipmentIp = equipmentIp;
    }

    public String getEquipmentPort() {
        return equipmentPort;
    }

    public void setEquipmentPort(String equipmentPort) {
        this.equipmentPort = equipmentPort;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getMask() {
        return mask;
    }

    public void setMask(String mask) {
        this.mask = mask;
    }

    public String getGateway() {
        return gateway;
    }

    public void setGateway(String gateway) {
        this.gateway = gateway;
    }
}
