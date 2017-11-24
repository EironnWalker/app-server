package com.weds.antd.appserver.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.weds.antd.appserver.entity.Mq;
import com.weds.antd.appserver.service.MqService;
import com.weds.antd.appserver.vo.ResponseVo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MqserviceImpl implements MqService {
    /**
     * 查询mq实例列表
     *
     * @return
     */
    @Override
    public ResponseVo queryMqList() {
        ResponseVo response = new ResponseVo();
        List<Mq> dataSource = new ArrayList<>();
        Mq mq1 = new Mq();
        mq1.setId(0);
        mq1.setName("wxapp");
        mq1.setUsers("wxpub");
        mq1.setReadyMsgs(4);
        mq1.setUnackedMsgs(0);
        mq1.setTotalMsgs(4);
        mq1.setDesc("测试用");
        Mq mq2 = new Mq();
        mq2.setId(1);
        mq2.setName("wxapp");
        mq2.setUsers("wxpub");
        mq2.setReadyMsgs(4);
        mq2.setUnackedMsgs(0);
        mq2.setTotalMsgs(4);
        mq2.setDesc("测试用");
        dataSource.add(mq1);
        dataSource.add(mq2);
        JSONObject data = new JSONObject();
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

    @Override
    public ResponseVo delMq(int id) {
        ResponseVo response = new ResponseVo("1", "success", null);
        return response;
    }
}
