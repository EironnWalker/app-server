package com.weds.antd.appserver.entity;

public class Database {

    private int id;

    private String instantName;

    private String dbType;

    private int status;

    private String dbDesc;

    public Database() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInstantName() {
        return instantName;
    }

    public void setInstantName(String instantName) {
        this.instantName = instantName;
    }

    public String getDbType() {
        return dbType;
    }

    public void setDbType(String dbType) {
        this.dbType = dbType;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getDbDesc() {
        return dbDesc;
    }

    public void setDbDesc(String dbDesc) {
        this.dbDesc = dbDesc;
    }
}
