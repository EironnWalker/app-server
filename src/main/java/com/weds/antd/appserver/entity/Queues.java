package com.weds.antd.appserver.entity;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonView;

public class Queues {

    private int id;

    @JsonView(Views.NormalQueues.class)
    private JSONObject messages_details;

    @JsonView(Views.NormalQueues.class)
    private int messages;

    @JsonView(Views.ManagerQueues.class)
    private JSONObject messages_unacknowledged_details;

    @JsonView(Views.NormalQueues.class)
    private int messages_unacknowledged;

    @JsonView(Views.ManagerQueues.class)
    private JSONObject messages_ready_details;

    @JsonView(Views.NormalQueues.class)
    private int messages_ready;

    @JsonView(Views.ManagerQueues.class)
    private JSONObject reductions_details;

    @JsonView(Views.ManagerQueues.class)
    private int reductions;

    @JsonView(Views.NormalQueues.class)
    private MessageStats message_stats;

    @JsonView(Views.NormalQueues.class)
    private String node;

    @JsonView(Views.ManagerQueues.class)
    private JSONObject arguments;

    @JsonView(Views.ManagerQueues.class)
    private boolean exclusive;

    @JsonView(Views.ManagerQueues.class)
    private boolean auto_delete;

    @JsonView(Views.ManagerQueues.class)
    private boolean durable;

    @JsonView(Views.NormalQueues.class)
    private String vhost;

    @JsonView(Views.NormalQueues.class)
    private String name;

    @JsonView(Views.ManagerQueues.class)
    private int message_bytes_paged_out;

    @JsonView(Views.ManagerQueues.class)
    private int messages_paged_out;

    @JsonView(Views.ManagerQueues.class)
    private JSONObject backing_queue_status;

    @JsonView(Views.ManagerQueues.class)
    private String head_message_timestamp;

    @JsonView(Views.ManagerQueues.class)
    private int message_bytes_persistent;

    @JsonView(Views.ManagerQueues.class)
    private int message_bytes_ram;

    @JsonView(Views.ManagerQueues.class)
    private int message_bytes_unacknowledged;

    @JsonView(Views.ManagerQueues.class)
    private int message_bytes_ready;

    @JsonView(Views.ManagerQueues.class)
    private int message_bytes;

    @JsonView(Views.ManagerQueues.class)
    private int messages_persistent;

    @JsonView(Views.ManagerQueues.class)
    private int messages_unacknowledged_ram;

    @JsonView(Views.ManagerQueues.class)
    private int messages_ready_ram;

    @JsonView(Views.ManagerQueues.class)
    private int messages_ram;

    @JsonView(Views.ManagerQueues.class)
    private JSONObject garbage_collection;

    @JsonView(Views.NormalQueues.class)
    private String state;

    @JsonView(Views.ManagerQueues.class)
    private String recoverable_slaves;

    @JsonView(Views.ManagerQueues.class)
    private int consumers;

    @JsonView(Views.ManagerQueues.class)
    private String exclusive_consumer_tag;

    @JsonView(Views.ManagerQueues.class)
    private String policy;

    @JsonView(Views.ManagerQueues.class)
    private String consumer_utilisation;

    @JsonView(Views.NormalQueues.class)
    private String idle_since;

    @JsonView(Views.ManagerQueues.class)
    private int memory;

    public Queues() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public MessageStats getMessage_stats() {
        return message_stats;
    }

    public void setMessage_stats(MessageStats message_stats) {
        this.message_stats = message_stats;
    }

    public JSONObject getMessages_details() {
        return messages_details;
    }

    public void setMessages_details(JSONObject messages_details) {
        this.messages_details = messages_details;
    }

    public int getMessages() {
        return messages;
    }

    public void setMessages(int messages) {
        this.messages = messages;
    }

    public JSONObject getMessages_unacknowledged_details() {
        return messages_unacknowledged_details;
    }

    public void setMessages_unacknowledged_details(JSONObject messages_unacknowledged_details) {
        this.messages_unacknowledged_details = messages_unacknowledged_details;
    }

    public int getMessages_unacknowledged() {
        return messages_unacknowledged;
    }

    public void setMessages_unacknowledged(int messages_unacknowledged) {
        this.messages_unacknowledged = messages_unacknowledged;
    }

    public JSONObject getMessages_ready_details() {
        return messages_ready_details;
    }

    public void setMessages_ready_details(JSONObject messages_ready_details) {
        this.messages_ready_details = messages_ready_details;
    }

    public int getMessages_ready() {
        return messages_ready;
    }

    public void setMessages_ready(int messages_ready) {
        this.messages_ready = messages_ready;
    }

    public JSONObject getReductions_details() {
        return reductions_details;
    }

    public void setReductions_details(JSONObject reductions_details) {
        this.reductions_details = reductions_details;
    }

    public int getReductions() {
        return reductions;
    }

    public void setReductions(int reductions) {
        this.reductions = reductions;
    }

    public String getNode() {
        return node;
    }

    public void setNode(String node) {
        this.node = node;
    }

    public JSONObject getArguments() {
        return arguments;
    }

    public void setArguments(JSONObject arguments) {
        this.arguments = arguments;
    }

    public boolean isExclusive() {
        return exclusive;
    }

    public void setExclusive(boolean exclusive) {
        this.exclusive = exclusive;
    }

    public boolean isAuto_delete() {
        return auto_delete;
    }

    public void setAuto_delete(boolean auto_delete) {
        this.auto_delete = auto_delete;
    }

    public boolean isDurable() {
        return durable;
    }

    public void setDurable(boolean durable) {
        this.durable = durable;
    }

    public String getVhost() {
        return vhost;
    }

    public void setVhost(String vhost) {
        this.vhost = vhost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMessage_bytes_paged_out() {
        return message_bytes_paged_out;
    }

    public void setMessage_bytes_paged_out(int message_bytes_paged_out) {
        this.message_bytes_paged_out = message_bytes_paged_out;
    }

    public int getMessages_paged_out() {
        return messages_paged_out;
    }

    public void setMessages_paged_out(int messages_paged_out) {
        this.messages_paged_out = messages_paged_out;
    }

    public JSONObject getBacking_queue_status() {
        return backing_queue_status;
    }

    public void setBacking_queue_status(JSONObject backing_queue_status) {
        this.backing_queue_status = backing_queue_status;
    }

    public String getHead_message_timestamp() {
        return head_message_timestamp;
    }

    public void setHead_message_timestamp(String head_message_timestamp) {
        this.head_message_timestamp = head_message_timestamp;
    }

    public int getMessage_bytes_persistent() {
        return message_bytes_persistent;
    }

    public void setMessage_bytes_persistent(int message_bytes_persistent) {
        this.message_bytes_persistent = message_bytes_persistent;
    }

    public int getMessage_bytes_ram() {
        return message_bytes_ram;
    }

    public void setMessage_bytes_ram(int message_bytes_ram) {
        this.message_bytes_ram = message_bytes_ram;
    }

    public int getMessage_bytes_unacknowledged() {
        return message_bytes_unacknowledged;
    }

    public void setMessage_bytes_unacknowledged(int message_bytes_unacknowledged) {
        this.message_bytes_unacknowledged = message_bytes_unacknowledged;
    }

    public int getMessage_bytes_ready() {
        return message_bytes_ready;
    }

    public void setMessage_bytes_ready(int message_bytes_ready) {
        this.message_bytes_ready = message_bytes_ready;
    }

    public int getMessage_bytes() {
        return message_bytes;
    }

    public void setMessage_bytes(int message_bytes) {
        this.message_bytes = message_bytes;
    }

    public int getMessages_persistent() {
        return messages_persistent;
    }

    public void setMessages_persistent(int messages_persistent) {
        this.messages_persistent = messages_persistent;
    }

    public int getMessages_unacknowledged_ram() {
        return messages_unacknowledged_ram;
    }

    public void setMessages_unacknowledged_ram(int messages_unacknowledged_ram) {
        this.messages_unacknowledged_ram = messages_unacknowledged_ram;
    }

    public int getMessages_ready_ram() {
        return messages_ready_ram;
    }

    public void setMessages_ready_ram(int messages_ready_ram) {
        this.messages_ready_ram = messages_ready_ram;
    }

    public int getMessages_ram() {
        return messages_ram;
    }

    public void setMessages_ram(int messages_ram) {
        this.messages_ram = messages_ram;
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

    public String getRecoverable_slaves() {
        return recoverable_slaves;
    }

    public void setRecoverable_slaves(String recoverable_slaves) {
        this.recoverable_slaves = recoverable_slaves;
    }

    public int getConsumers() {
        return consumers;
    }

    public void setConsumers(int consumers) {
        this.consumers = consumers;
    }

    public String getExclusive_consumer_tag() {
        return exclusive_consumer_tag;
    }

    public void setExclusive_consumer_tag(String exclusive_consumer_tag) {
        this.exclusive_consumer_tag = exclusive_consumer_tag;
    }

    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    public String getConsumer_utilisation() {
        return consumer_utilisation;
    }

    public void setConsumer_utilisation(String consumer_utilisation) {
        this.consumer_utilisation = consumer_utilisation;
    }

    public String getIdle_since() {
        return idle_since;
    }

    public void setIdle_since(String idle_since) {
        this.idle_since = idle_since;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public class MessageStats {
        private JSONObject deliver_get_details;

        private Long deliver_get;

        private JSONObject ack_details;

        private Long ack;

        private JSONObject redeliver_details;

        private Long redeliver;

        private JSONObject deliver_no_ack_details;

        private int deliver_no_ack;

        private JSONObject deliver_details;

        private Long deliver;

        private JSONObject get_no_ack_details;

        private Long get_no_ack;

        private JSONObject get_details;

        private Long get;

        private JSONObject publish_details;

        private Long publish;

        public MessageStats() {

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

        public int getDeliver_no_ack() {
            return deliver_no_ack;
        }

        public void setDeliver_no_ack(int deliver_no_ack) {
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
    }
}
