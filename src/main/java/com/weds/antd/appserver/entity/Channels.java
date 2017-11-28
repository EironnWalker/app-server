package com.weds.antd.appserver.entity;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonView;

public class Channels {

    private int id;

    @JsonView(Views.ManagerChannels.class)
    private JSONObject reductions_details;

    @JsonView(Views.ManagerChannels.class)
    private Long reductions;

    @JsonView(Views.NormalChannels.class)
    private String vhost;

    @JsonView(Views.NormalChannels.class)
    private String user;

    @JsonView(Views.ManagerChannels.class)
    private int number;

    @JsonView(Views.NormalChannels.class)
    private String name;

    @JsonView(Views.NormalChannels.class)
    private String node;

    @JsonView(Views.ManagerChannels.class)
    private JSONObject connection_details;

    @JsonView(Views.ManagerChannels.class)
    private JSONObject garbage_collection;

    @JsonView(Views.NormalChannels.class)
    private String state;

    @JsonView(Views.ManagerChannels.class)
    private int global_prefetch_count;

    @JsonView(Views.NormalChannels.class)
    private int prefetch_count;

    @JsonView(Views.ManagerChannels.class)
    private int acks_uncommitted;

    @JsonView(Views.ManagerChannels.class)
    private int messages_uncommitted;

    @JsonView(Views.NormalChannels.class)
    private int messages_unconfirmed;

    @JsonView(Views.NormalChannels.class)
    private int messages_unacknowledged;

    @JsonView(Views.ManagerChannels.class)
    private int consumer_count;

    @JsonView(Views.ManagerChannels.class)
    private boolean confirm;

    @JsonView(Views.ManagerChannels.class)
    private boolean transactional;

    @JsonView(Views.NormalChannels.class)
    private String idle_since;

    @JsonView(Views.NormalChannels.class)
    private MessageStats message_stats;

    public Channels() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public JSONObject getReductions_details() {
        return reductions_details;
    }

    public void setReductions_details(JSONObject reductions_details) {
        this.reductions_details = reductions_details;
    }

    public Long getReductions() {
        return reductions;
    }

    public void setReductions(Long reductions) {
        this.reductions = reductions;
    }

    public String getVhost() {
        return vhost;
    }

    public void setVhost(String vhost) {
        this.vhost = vhost;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNode() {
        return node;
    }

    public void setNode(String node) {
        this.node = node;
    }

    public JSONObject getConnection_details() {
        return connection_details;
    }

    public void setConnection_details(JSONObject connection_details) {
        this.connection_details = connection_details;
    }

    public JSONObject getGarbage_collection() {
        return garbage_collection;
    }

    public void setGarbage_collection(JSONObject garbage_collection) {
        this.garbage_collection = garbage_collection;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getGlobal_prefetch_count() {
        return global_prefetch_count;
    }

    public void setGlobal_prefetch_count(int global_prefetch_count) {
        this.global_prefetch_count = global_prefetch_count;
    }

    public int getPrefetch_count() {
        return prefetch_count;
    }

    public void setPrefetch_count(int prefetch_count) {
        this.prefetch_count = prefetch_count;
    }

    public int getAcks_uncommitted() {
        return acks_uncommitted;
    }

    public void setAcks_uncommitted(int acks_uncommitted) {
        this.acks_uncommitted = acks_uncommitted;
    }

    public int getMessages_uncommitted() {
        return messages_uncommitted;
    }

    public void setMessages_uncommitted(int messages_uncommitted) {
        this.messages_uncommitted = messages_uncommitted;
    }

    public int getMessages_unconfirmed() {
        return messages_unconfirmed;
    }

    public void setMessages_unconfirmed(int messages_unconfirmed) {
        this.messages_unconfirmed = messages_unconfirmed;
    }

    public int getMessages_unacknowledged() {
        return messages_unacknowledged;
    }

    public void setMessages_unacknowledged(int messages_unacknowledged) {
        this.messages_unacknowledged = messages_unacknowledged;
    }

    public int getConsumer_count() {
        return consumer_count;
    }

    public void setConsumer_count(int consumer_count) {
        this.consumer_count = consumer_count;
    }

    public boolean isConfirm() {
        return confirm;
    }

    public void setConfirm(boolean confirm) {
        this.confirm = confirm;
    }

    public boolean isTransactional() {
        return transactional;
    }

    public void setTransactional(boolean transactional) {
        this.transactional = transactional;
    }

    public String getIdle_since() {
        return idle_since;
    }

    public void setIdle_since(String idle_since) {
        this.idle_since = idle_since;
    }

    public MessageStats getMessage_stats() {
        return message_stats;
    }

    public void setMessage_stats(MessageStats message_stats) {
        this.message_stats = message_stats;
    }

    public class MessageStats {
        private JSONObject deliver_get_details;

        private JSONObject return_unroutable_details;

        private Long return_unroutable;

        private JSONObject confirm_details;

        private Long confirm;

        private JSONObject publish_details;

        private Long publish;

        private Long deliver_get;

        private JSONObject ack_details;

        private Long ack;

        private JSONObject redeliver_details;

        private Long redeliver;

        private JSONObject deliver_no_ack_details;

        private Long deliver_no_ack;

        private JSONObject deliver_details;

        private Long deliver;

        private JSONObject get_no_ack_details;

        private Long get_no_ack;

        private JSONObject get_details;

        private Long get;

        public MessageStats() {

        }

        public JSONObject getReturn_unroutable_details() {
            return return_unroutable_details;
        }

        public void setReturn_unroutable_details(JSONObject return_unroutable_details) {
            this.return_unroutable_details = return_unroutable_details;
        }

        public Long getReturn_unroutable() {
            return return_unroutable;
        }

        public void setReturn_unroutable(Long return_unroutable) {
            this.return_unroutable = return_unroutable;
        }

        public JSONObject getConfirm_details() {
            return confirm_details;
        }

        public void setConfirm_details(JSONObject confirm_details) {
            this.confirm_details = confirm_details;
        }

        public Long getConfirm() {
            return confirm;
        }

        public void setConfirm(Long confirm) {
            this.confirm = confirm;
        }

        public JSONObject getPublish_details() {
            return publish_details;
        }

        public void setPublish_details(JSONObject publish_details) {
            this.publish_details = publish_details;
        }

        public Long getPublish() {
            return publish;
        }

        public void setPublish(Long publish) {
            this.publish = publish;
        }

        public JSONObject getDeliver_get_details() {
            return deliver_get_details;
        }

        public void setDeliver_get_details(JSONObject deliver_get_details) {
            this.deliver_get_details = deliver_get_details;
        }

        public Long getDeliver_get() {
            return deliver_get;
        }

        public void setDeliver_get(Long deliver_get) {
            this.deliver_get = deliver_get;
        }

        public JSONObject getAck_details() {
            return ack_details;
        }

        public void setAck_details(JSONObject ack_details) {
            this.ack_details = ack_details;
        }

        public Long getAck() {
            return ack;
        }

        public void setAck(Long ack) {
            this.ack = ack;
        }

        public JSONObject getRedeliver_details() {
            return redeliver_details;
        }

        public void setRedeliver_details(JSONObject redeliver_details) {
            this.redeliver_details = redeliver_details;
        }

        public Long getRedeliver() {
            return redeliver;
        }

        public void setRedeliver(Long redeliver) {
            this.redeliver = redeliver;
        }

        public JSONObject getDeliver_no_ack_details() {
            return deliver_no_ack_details;
        }

        public void setDeliver_no_ack_details(JSONObject deliver_no_ack_details) {
            this.deliver_no_ack_details = deliver_no_ack_details;
        }

        public Long getDeliver_no_ack() {
            return deliver_no_ack;
        }

        public void setDeliver_no_ack(Long deliver_no_ack) {
            this.deliver_no_ack = deliver_no_ack;
        }

        public JSONObject getDeliver_details() {
            return deliver_details;
        }

        public void setDeliver_details(JSONObject deliver_details) {
            this.deliver_details = deliver_details;
        }

        public Long getDeliver() {
            return deliver;
        }

        public void setDeliver(Long deliver) {
            this.deliver = deliver;
        }

        public JSONObject getGet_no_ack_details() {
            return get_no_ack_details;
        }

        public void setGet_no_ack_details(JSONObject get_no_ack_details) {
            this.get_no_ack_details = get_no_ack_details;
        }

        public Long getGet_no_ack() {
            return get_no_ack;
        }

        public void setGet_no_ack(Long get_no_ack) {
            this.get_no_ack = get_no_ack;
        }

        public JSONObject getGet_details() {
            return get_details;
        }

        public void setGet_details(JSONObject get_details) {
            this.get_details = get_details;
        }

        public Long getGet() {
            return get;
        }

        public void setGet(Long get) {
            this.get = get;
        }
    }

}
