package com.weds.antd.appserver.entity;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonView;

public class Mq {

    private int id;

    @JsonView(Views.NormalMq.class)
    private String name;

    @JsonView(Views.ManagerMq.class)
    private boolean tracing;

    @JsonView(Views.ManagerMq.class)
    private Long send_oct;

    @JsonView(Views.ManagerMq.class)
    private JSONObject send_oct_details;

    @JsonView(Views.ManagerMq.class)
    private Long recv_oct;

    @JsonView(Views.ManagerMq.class)
    private JSONObject recv_oct_details;

    @JsonView(Views.NormalMq.class)
    private int messages_ready;

    @JsonView(Views.ManagerMq.class)
    private JSONObject messages_ready_details;

    @JsonView(Views.NormalMq.class)
    private int messages_unacknowledged;

    @JsonView(Views.ManagerMq.class)
    private JSONObject messages_unacknowledged_details;

    @JsonView(Views.NormalMq.class)
    private int messages;

    @JsonView(Views.ManagerMq.class)
    private JSONObject messages_details;

    @JsonView(Views.ManagerMq.class)
    private MessageStats message_stats;

    public Mq() {
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

    public boolean isTracing() {
        return tracing;
    }

    public void setTracing(boolean tracing) {
        this.tracing = tracing;
    }

    public Long getSend_oct() {
        return send_oct;
    }

    public void setSend_oct(Long send_oct) {
        this.send_oct = send_oct;
    }

    public JSONObject getSend_oct_details() {
        return send_oct_details;
    }

    public void setSend_oct_details(JSONObject send_oct_details) {
        this.send_oct_details = send_oct_details;
    }

    public Long getRecv_oct() {
        return recv_oct;
    }

    public void setRecv_oct(Long recv_oct) {
        this.recv_oct = recv_oct;
    }

    public JSONObject getRecv_oct_details() {
        return recv_oct_details;
    }

    public void setRecv_oct_details(JSONObject recv_oct_details) {
        this.recv_oct_details = recv_oct_details;
    }

    public int getMessages_ready() {
        return messages_ready;
    }

    public void setMessages_ready(int messages_ready) {
        this.messages_ready = messages_ready;
    }

    public JSONObject getMessages_ready_details() {
        return messages_ready_details;
    }

    public void setMessages_ready_details(JSONObject messages_ready_details) {
        this.messages_ready_details = messages_ready_details;
    }

    public int getMessages_unacknowledged() {
        return messages_unacknowledged;
    }

    public void setMessages_unacknowledged(int messages_unacknowledged) {
        this.messages_unacknowledged = messages_unacknowledged;
    }

    public JSONObject getMessages_unacknowledged_details() {
        return messages_unacknowledged_details;
    }

    public void setMessages_unacknowledged_details(JSONObject messages_unacknowledged_details) {
        this.messages_unacknowledged_details = messages_unacknowledged_details;
    }

    public int getMessages() {
        return messages;
    }

    public void setMessages(int messages) {
        this.messages = messages;
    }

    public JSONObject getMessages_details() {
        return messages_details;
    }

    public void setMessages_details(JSONObject messages_details) {
        this.messages_details = messages_details;
    }

    public MessageStats getMessage_stats() {
        return message_stats;
    }

    public void setMessage_stats(MessageStats message_stats) {
        this.message_stats = message_stats;
    }


    public class MessageStats {
        private Long publish;
        private JSONObject publish_details;
        private Long confirm;
        private JSONObject confirm_details;
        private int return_unroutable;
        private JSONObject return_unroutable_details;
        private int get;
        private JSONObject get_details;
        private int get_no_ack;
        private JSONObject get_no_ack_details;
        private int deliver;
        private JSONObject deliver_details;
        private int deliver_no_ack;
        private JSONObject deliver_no_ack_details;
        private Long redeliver;
        private JSONObject redeliver_details;
        private Long ack;
        private JSONObject ack_details;
        private Long deliver_get;
        private JSONObject deliver_get_details;

        public MessageStats() {
        }

        public Long getPublish() {
            return publish;
        }

        public void setPublish(Long publish) {
            this.publish = publish;
        }

        public JSONObject getPublish_details() {
            return publish_details;
        }

        public void setPublish_details(JSONObject publish_details) {
            this.publish_details = publish_details;
        }

        public Long getConfirm() {
            return confirm;
        }

        public void setConfirm(Long confirm) {
            this.confirm = confirm;
        }

        public JSONObject getConfirm_details() {
            return confirm_details;
        }

        public void setConfirm_details(JSONObject confirm_details) {
            this.confirm_details = confirm_details;
        }

        public int getReturn_unroutable() {
            return return_unroutable;
        }

        public void setReturn_unroutable(int return_unroutable) {
            this.return_unroutable = return_unroutable;
        }

        public JSONObject getReturn_unroutable_details() {
            return return_unroutable_details;
        }

        public void setReturn_unroutable_details(JSONObject return_unroutable_details) {
            this.return_unroutable_details = return_unroutable_details;
        }

        public int getGet() {
            return get;
        }

        public void setGet(int get) {
            this.get = get;
        }

        public JSONObject getGet_details() {
            return get_details;
        }

        public void setGet_details(JSONObject get_details) {
            this.get_details = get_details;
        }

        public int getGet_no_ack() {
            return get_no_ack;
        }

        public void setGet_no_ack(int get_no_ack) {
            this.get_no_ack = get_no_ack;
        }

        public JSONObject getGet_no_ack_details() {
            return get_no_ack_details;
        }

        public void setGet_no_ack_details(JSONObject get_no_ack_details) {
            this.get_no_ack_details = get_no_ack_details;
        }

        public int getDeliver() {
            return deliver;
        }

        public void setDeliver(int deliver) {
            this.deliver = deliver;
        }

        public JSONObject getDeliver_details() {
            return deliver_details;
        }

        public void setDeliver_details(JSONObject deliver_details) {
            this.deliver_details = deliver_details;
        }

        public int getDeliver_no_ack() {
            return deliver_no_ack;
        }

        public void setDeliver_no_ack(int deliver_no_ack) {
            this.deliver_no_ack = deliver_no_ack;
        }

        public JSONObject getDeliver_no_ack_details() {
            return deliver_no_ack_details;
        }

        public void setDeliver_no_ack_details(JSONObject deliver_no_ack_details) {
            this.deliver_no_ack_details = deliver_no_ack_details;
        }

        public Long getRedeliver() {
            return redeliver;
        }

        public void setRedeliver(Long redeliver) {
            this.redeliver = redeliver;
        }

        public JSONObject getRedeliver_details() {
            return redeliver_details;
        }

        public void setRedeliver_details(JSONObject redeliver_details) {
            this.redeliver_details = redeliver_details;
        }

        public Long getAck() {
            return ack;
        }

        public void setAck(Long ack) {
            this.ack = ack;
        }

        public JSONObject getAck_details() {
            return ack_details;
        }

        public void setAck_details(JSONObject ack_details) {
            this.ack_details = ack_details;
        }

        public Long getDeliver_get() {
            return deliver_get;
        }

        public void setDeliver_get(Long deliver_get) {
            this.deliver_get = deliver_get;
        }

        public JSONObject getDeliver_get_details() {
            return deliver_get_details;
        }

        public void setDeliver_get_details(JSONObject deliver_get_details) {
            this.deliver_get_details = deliver_get_details;
        }
    }
}
