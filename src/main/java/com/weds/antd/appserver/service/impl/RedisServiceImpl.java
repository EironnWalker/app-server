package com.weds.antd.appserver.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.weds.antd.appserver.entity.Redis;
import com.weds.antd.appserver.service.RedisService;
import com.weds.antd.appserver.vo.RedisParam;
import com.weds.antd.appserver.vo.ResponseVo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RedisServiceImpl implements RedisService {
    /**
     * 查询redis实例列表
     *
     * @return
     */
    @Override
    public ResponseVo queryRedisList() {
        ResponseVo response = new ResponseVo();
        JSONObject data = new JSONObject();
        List<Redis> dataSource = new ArrayList<>();
        Redis redis = new Redis();
        redis.setId(0);
        redis.setInstantName("系统主缓存");
        redis.setVersion("Redis 3.2");
        redis.setStatus(1);
        redis.setDesc("系统主缓存");
        Redis redis1 = new Redis();
        redis1.setId(1);
        redis1.setInstantName("权限系统缓存");
        redis1.setVersion("Redis 3.2");
        redis1.setStatus(1);
        redis1.setDesc("用于权限系统的规则缓存");
        dataSource.add(redis);
        dataSource.add(redis1);
        JSONObject pagination = new JSONObject();
        pagination.put("total", dataSource.size());
        pagination.put("pageSize", 10);
        pagination.put("current", 1);
        data.put("list", dataSource);
        data.put("pagination", pagination);
        response.setResult("1");
        response.setMsg("success");
        response.setData(data);
        return response;
    }

    /**
     * 开启/关闭redis实例
     *
     * @param redisParam
     * @return
     */
    @Override
    public ResponseVo changeRedisStatus(RedisParam redisParam) {
        ResponseVo response = new ResponseVo("1", "success", "changeStatus");
        return response;
    }
}
