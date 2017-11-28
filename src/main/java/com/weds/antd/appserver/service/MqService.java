package com.weds.antd.appserver.service;

import com.weds.antd.appserver.vo.ResponseVo;

import java.io.IOException;

public interface MqService {

    /**
     * 查询mq实例列表
     * @return
     */
    ResponseVo queryMqList() throws IOException;

    ResponseVo delMq(int id);

    ResponseVo queryQueueList() throws IOException;

    ResponseVo queryExchangesList() throws IOException;

    ResponseVo queryChannelsList() throws IOException;
}
