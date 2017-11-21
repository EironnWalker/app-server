package com.weds.antd.appserver.vo;

public class ResponseVo {

    private String result;

    private String msg;

    private Object data;

    public ResponseVo(String result, String msg, Object data) {
        this.result = result;
        this.msg = msg;
        this.data = data;
    }

    public ResponseVo() {
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResponseVo{" +
                "result='" + result + '\'' +
                "msg='" + msg + '\'' +
                "data='" + data + '\'' +
                '}';
    }
}
