package com.weds.antd.appserver.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.weds.antd.appserver.entity.InterfaceEntity;
import com.weds.antd.appserver.entity.Server;
import com.weds.antd.appserver.service.ServerService;
import com.weds.antd.appserver.vo.ResponseVo;
import com.weds.antd.appserver.vo.ServerParam;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Service
public class ServerServiceImpl implements ServerService {

    /**
     * 分页查询rule列表
     *
     * @param serverParam
     * @return
     */
    @Override
    public ResponseVo queryServerList(ServerParam serverParam) {
        List<Server> dataSource = new ArrayList<>();
        ResponseVo response = new ResponseVo();
        for (int i = 0; i < 10; i++) {
            Server entity = new Server();
            entity.setId(i);
            entity.setAppName("管理后台服务");
            entity.setInstantName("Manager-" + i);
            entity.setStatus(1);
            entity.setRegistryTime(Timestamp.valueOf(LocalDateTime.now()));
            entity.setDataCenter("测试中心");
            entity.setIp("127.0.0.1");
            entity.setPort("443");
            entity.setUpdateTime(Timestamp.valueOf(LocalDateTime.now()));
            dataSource.add(entity);
        }
        // response中的data
        JSONObject jsonData = new JSONObject();
        JSONObject pagination = new JSONObject();
        pagination.put("total", dataSource.size());
        pagination.put("pageSize", 10);
        pagination.put("current", 1);
        jsonData.put("list", dataSource);
        jsonData.put("pagination", pagination);
        response.setResult("1");
        response.setMsg("查询成功！");
        response.setData(jsonData);
        return response;
    }

    /**
     * 查询服务详情
     *
     * @param serverParam
     * @return
     */
    @Override
    public ResponseVo queryServerDetail(ServerParam serverParam) {
        ResponseVo response = new ResponseVo();
        List<InterfaceEntity> dataSource = new ArrayList<>();
        JSONObject data = new JSONObject();
        // 存入概览信息
        data.put("version", "v1.002");
        data.put("cpu", "50%");
        data.put("mer", "60%");
        data.put("QPS", "252");
        data.put("counts", "25666");
        for (int i = 0; i < 8; i++) {
            InterfaceEntity entity = new InterfaceEntity();
            entity.setId(i);
            entity.setName("接口" + i);
            entity.setDesc("测试接口");
            entity.setType("RESTFul");
            entity.setVersion("v0.0." + i);
            dataSource.add(entity);
        }
        data.put("list", dataSource);
        response.setResult("1");
        response.setMsg("success");
        response.setData(data);
        return response;
    }
}
