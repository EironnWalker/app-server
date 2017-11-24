package com.weds.antd.appserver.vo;

public class DatabaseParam {

    private int id;

    private String type;

    public DatabaseParam() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "DatabaseParam{" +
                "id='" + id + '\'' +
                "type='" + type + '\'' +
                '}';
    }
}
