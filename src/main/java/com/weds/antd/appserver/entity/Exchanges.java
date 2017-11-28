package com.weds.antd.appserver.entity;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonView;

public class Exchanges {

    private int id;

    @JsonView(Views.NormalExchanges.class)
    private String name;

    @JsonView(Views.NormalExchanges.class)
    private String vhost;

    @JsonView(Views.NormalExchanges.class)
    private String type;

    @JsonView(Views.ManagerExchanges.class)
    private boolean durable;

    @JsonView(Views.ManagerExchanges.class)
    private boolean auto_delete;

    @JsonView(Views.ManagerExchanges.class)
    private boolean internal;

    @JsonView(Views.ManagerExchanges.class)
    private JSONObject arguments;

    @JsonView(Views.NormalExchanges.class)
    private MessageStats message_stats;


    public class MessageStats {
        private Long publish_out;

        private JSONObject publish_out_details;

        private Long publish_in;

        private JSONObject publish_in_details;

        public MessageStats() {

        }

        public Long getPublish_out() {
            return publish_out;
        }

        public void setPublish_out(Long publish_out) {
            this.publish_out = publish_out;
        }

        public JSONObject getPublish_out_details() {
            return publish_out_details;
        }

        public void setPublish_out_details(JSONObject publish_out_details) {
            this.publish_out_details = publish_out_details;
        }

        public Long getPublish_in() {
            return publish_in;
        }

        public void setPublish_in(Long publish_in) {
            this.publish_in = publish_in;
        }

        public JSONObject getPublish_in_details() {
            return publish_in_details;
        }

        public void setPublish_in_details(JSONObject publish_in_details) {
            this.publish_in_details = publish_in_details;
        }
    }

    public Exchanges() {

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

    public String getVhost() {
        return vhost;
    }

    public void setVhost(String vhost) {
        this.vhost = vhost;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isDurable() {
        return durable;
    }

    public void setDurable(boolean durable) {
        this.durable = durable;
    }

    public boolean isAuto_delete() {
        return auto_delete;
    }

    public void setAuto_delete(boolean auto_delete) {
        this.auto_delete = auto_delete;
    }

    public boolean isInternal() {
        return internal;
    }

    public void setInternal(boolean internal) {
        this.internal = internal;
    }

    public JSONObject getArguments() {
        return arguments;
    }

    public void setArguments(JSONObject arguments) {
        this.arguments = arguments;
    }

    public MessageStats getMessage_stats() {
        return message_stats;
    }

    public void setMessage_stats(MessageStats message_stats) {
        this.message_stats = message_stats;
    }
}
