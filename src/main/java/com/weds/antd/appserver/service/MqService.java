package com.weds.antd.appserver.service;

import com.weds.antd.appserver.vo.ResponseVo;

public interface MqService {

    /**
     * 查询mq实例列表
     * @return
     */
    ResponseVo queryMqList();

    ResponseVo delMq(int id);

}
