package com.weds.antd.appserver.service;

import com.weds.antd.appserver.vo.RedisParam;
import com.weds.antd.appserver.vo.ResponseVo;

public interface RedisService {


    /**
     * 查询redis实例列表
     * @return
     */
    ResponseVo queryRedisList();

    /**
     * 开启/关闭redis实例
     * @param redisParam
     * @return
     */
    ResponseVo changeRedisStatus(RedisParam redisParam);
}
