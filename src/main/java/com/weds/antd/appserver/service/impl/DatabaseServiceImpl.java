package com.weds.antd.appserver.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.weds.antd.appserver.entity.Database;
import com.weds.antd.appserver.service.DatabaseService;
import com.weds.antd.appserver.vo.DatabaseParam;
import com.weds.antd.appserver.vo.ResponseVo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DatabaseServiceImpl implements DatabaseService {
    /**
     * 查询数据库列表
     *
     * @return
     */
    @Override
    public ResponseVo queryDatabaseList() {
        List<Database> dataSource = new ArrayList<>();
        ResponseVo response = new ResponseVo();
        for (int i = 0; i < 10; i++) {
            Database entity = new Database();
            entity.setId(i);
            entity.setInstantName("系统主库");
            entity.setDbType("PostgreSQL 9.6");
            entity.setStatus(1);
            entity.setDbDesc("系统主数据库");
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
     * 修改数据库实例状态
     *
     * @return
     */
    @Override
    public ResponseVo changeDbStatus(DatabaseParam databaseParam) {
        ResponseVo response = new ResponseVo("1", "success", "changeStatus");
        return response;
    }
}
