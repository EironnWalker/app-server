package com.weds.antd.appserver.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.kevinsawicki.http.HttpRequest;
import com.weds.antd.appserver.config.InterfaceProperties;
import com.weds.antd.appserver.entity.*;
import com.weds.antd.appserver.service.MqService;
import com.weds.antd.appserver.utils.JsonUtils;
import com.weds.antd.appserver.vo.ResponseVo;
import org.assertj.core.util.Strings;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class MqserviceImpl implements MqService {

    @Resource
    private InterfaceProperties.Mq mq;

    /**
     * 查询mq实例列表
     *
     * @return
     */
    @Override
    public ResponseVo queryMqList() throws IOException {
        ResponseVo response = new ResponseVo();
        // 请求接口，获取数据
        String body = HttpRequest.get(mq.getVhostsUrl()).basic(mq.getUserName(), mq.getPwd()).accept("application/json") //Sets request header
                .body();
        // 将json字符串转为list对象
        List<Mq> list = JsonUtils.jsonToListObjectView(body, Mq.class, Views.NormalMq.class);
        // 存入 dataSource中
        List<JSONObject> dataSource = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Mq mqEntity = list.get(i);
            JSONObject dataEntity = new JSONObject();
            dataEntity.put("id", i);
            dataEntity.put("name", mqEntity.getName());
            dataEntity.put("readyMsgs", mqEntity.getMessages_ready());
            dataEntity.put("unackedMsgs", mqEntity.getMessages_unacknowledged());
            dataEntity.put("totalMsgs", mqEntity.getMessages());
            dataSource.add(dataEntity);
        }
        JSONObject data = new JSONObject();
        data.put("list", dataSource);
        response.setResult("1");
        response.setMsg("success");
        response.setData(data);
        return response;
    }

    @Override
    public ResponseVo delMq(int id) {
        ResponseVo response = new ResponseVo("1", "success", null);
        return response;
    }

    /**
     * 查询queues集合
     * @return
     */
    @Override
    public ResponseVo queryQueueList() throws IOException {
        ResponseVo response = new ResponseVo();
        // 请求接口，获取数据
        String body = HttpRequest.get(mq.getQueuesUrl()).basic(mq.getUserName(), mq.getPwd()).accept("application/json") //Sets request header
                .body();
        // 将json字符串转为对象
        List<Queues> list = JsonUtils.jsonToListObjectView(body, Queues.class, Views.NormalQueues.class);
        // 存入 dataSource中
        List<JSONObject> dataSource = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Queues queues = list.get(i);
            JSONObject dataEntity = new JSONObject();
            dataEntity.put("id", i);
            dataEntity.put("vhost", queues.getVhost());
            dataEntity.put("name", queues.getName());
            dataEntity.put("node", queues.getNode());
            if (!Strings.isNullOrEmpty(queues.getIdle_since())) {
                dataEntity.put("state", "idle");
            } else {
                dataEntity.put("state", queues.getState());
            }
            dataEntity.put("ready", queues.getMessages_ready());
            dataEntity.put("unacked", queues.getMessages_unacknowledged());
            dataEntity.put("total", queues.getMessages());
            if (null != queues.getMessage_stats() && null != queues.getMessage_stats().getRedeliver_details()) {
                dataEntity.put("incoming", queues.getMessage_stats().getRedeliver_details().get("rate") + "/s");
            } else {
                dataEntity.put("incoming", "");
            }
            if (null != queues.getMessage_stats() && null != queues.getMessage_stats().getDeliver_get_details()) {
                dataEntity.put("deliverGet", queues.getMessage_stats().getDeliver_get_details().get("rate") + "/s");
            } else {
                dataEntity.put("deliverGet", "");
            }
            if (null != queues.getMessage_stats() && null != queues.getMessage_stats().getAck_details()) {
                dataEntity.put("ack", queues.getMessage_stats().getAck_details().get("rate") + "/s");
            } else {
                dataEntity.put("ack", "");
            }
            dataSource.add(dataEntity);
        }
        JSONObject data = new JSONObject();
        data.put("list", dataSource);
        response.setResult("1");
        response.setMsg("success");
        response.setData(data);
        return response;
    }

    @Override
    public ResponseVo queryExchangesList() throws IOException {
        ResponseVo response = new ResponseVo();
        // 请求接口，获取数据
        String body = HttpRequest.get(mq.getExchangesUrl()).basic(mq.getUserName(), mq.getPwd()).accept("application/json") //Sets request header
                .body();
        // 将json字符串转为对象
        List<Exchanges> list = JsonUtils.jsonToListObjectView(body, Exchanges.class, Views.NormalExchanges.class);
        // 存入 dataSource中
        List<JSONObject> dataSource = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Exchanges exchanges = list.get(i);
            JSONObject dataEntity = new JSONObject();
            dataEntity.put("id", i);
            dataEntity.put("vhost", exchanges.getVhost());
            dataEntity.put("name", exchanges.getName());
            dataEntity.put("type", exchanges.getType());
            if (null != exchanges.getMessage_stats() && null != exchanges.getMessage_stats().getPublish_in_details()) {
                dataEntity.put("messageRateIn", exchanges.getMessage_stats().getPublish_in_details().get("rate") + "/s");
            } else {
                dataEntity.put("messageRateIn", "");
            }
            if (null != exchanges.getMessage_stats() && null != exchanges.getMessage_stats().getPublish_out_details()) {
                dataEntity.put("messageRateOut", exchanges.getMessage_stats().getPublish_out_details().get("rate") +"/s");
            } else {
                dataEntity.put("messageRateOut", "");
            }
            dataSource.add(dataEntity);
        }
        JSONObject data = new JSONObject();
        data.put("list", dataSource);
        response.setResult("1");
        response.setMsg("success");
        response.setData(data);
        return response;
    }

    @Override
    public ResponseVo queryChannelsList() throws IOException {
        ResponseVo response = new ResponseVo();
        // 请求接口，获取数据
        String body = HttpRequest.get(mq.getChannelsUrl()).basic(mq.getUserName(), mq.getPwd()).accept("application/json") //Sets request header
                .body();
        // 将json字符串转为对象
        List<Channels> list = JsonUtils.jsonToListObjectView(body, Channels.class, Views.NormalChannels.class);
        // 存入 dataSource中
        List<JSONObject> dataSource = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Channels channels = list.get(i);
            JSONObject dataEntity = new JSONObject();
            dataEntity.put("id", i);
            dataEntity.put("channel", channels.getName());
            dataEntity.put("node", channels.getNode());
            dataEntity.put("vhost", channels.getVhost());
            dataEntity.put("userName", channels.getUser());
            if (!Strings.isNullOrEmpty(channels.getIdle_since())) {
                dataEntity.put("state", "idle");
            } else {
                dataEntity.put("state", channels.getState());
            }
            dataEntity.put("unconfirmed", channels.getMessages_unconfirmed());
            dataEntity.put("prefetch", channels.getPrefetch_count());
            dataEntity.put("unacked", channels.getMessages_unacknowledged());
            if (null != channels.getMessage_stats() && null != channels.getMessage_stats().getGet_details()) {
                dataEntity.put("publish", channels.getMessage_stats().getGet_details().get("rate") + "/s");
            } else {
                dataEntity.put("publish", "");
            }
            if (null != channels.getMessage_stats() && null != channels.getMessage_stats().getDeliver_details()) {
                dataEntity.put("confirm", channels.getMessage_stats().getDeliver_details().get("rate") + "/s");
            } else {
                dataEntity.put("confirm", "");
            }
            if (null != channels.getMessage_stats() && null != channels.getMessage_stats().getDeliver_details()) {
                dataEntity.put("deliverGet", channels.getMessage_stats().getDeliver_details().get("rate") + "/s");
            } else {
                dataEntity.put("deliverGet", "");
            }
            if (null != channels.getMessage_stats() && null != channels.getMessage_stats().getAck_details()) {
                dataEntity.put("ack", channels.getMessage_stats().getAck_details().get("rate") + "/s");
            } else {
                dataEntity.put("ack", "");
            }
            dataSource.add(dataEntity);
        }
        JSONObject data = new JSONObject();
        data.put("list", dataSource);
        response.setResult("1");
        response.setMsg("success");
        response.setData(data);
        return response;
    }
}
