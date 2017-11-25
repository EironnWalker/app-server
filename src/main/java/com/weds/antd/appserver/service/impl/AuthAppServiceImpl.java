package com.weds.antd.appserver.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.weds.antd.appserver.entity.AuthApp;
import com.weds.antd.appserver.entity.OpenAuth;
import com.weds.antd.appserver.entity.RequiredAuth;
import com.weds.antd.appserver.service.AuthAppService;
import com.weds.antd.appserver.vo.AuthAppParam;
import com.weds.antd.appserver.vo.OpenAuthParam;
import com.weds.antd.appserver.vo.RequiredAuthParam;
import com.weds.antd.appserver.vo.ResponseVo;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class AuthAppServiceImpl implements AuthAppService {
    /**
     * 分页查询应用权限管理列表
     *
     * @param authAppParam
     * @return
     */
    @Override
    public ResponseVo queryAuthAppList(AuthAppParam authAppParam) {
        ResponseVo response = new ResponseVo();
        List<AuthApp> dataSource = new ArrayList<>();
        JSONObject data = new JSONObject();
        AuthApp authApp1 = new AuthApp();
        authApp1.setId(1);
        authApp1.setName("管理后台服务");
        authApp1.setType("官方应用");
        authApp1.setStatus(1);
        authApp1.setActiveTime(Timestamp.valueOf(LocalDateTime.now()));
        authApp1.setValidTime(Timestamp.valueOf(LocalDateTime.now()));
        AuthApp authApp2 = new AuthApp();
        authApp2.setId(2);
        authApp2.setName("管理后台服务");
        authApp2.setType("官方应用");
        authApp2.setStatus(1);
        authApp2.setActiveTime(Timestamp.valueOf(LocalDateTime.now()));
        authApp2.setValidTime(Timestamp.valueOf(LocalDateTime.now()));
        dataSource.add(authApp1);
        dataSource.add(authApp2);
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
     * 分页查询开通权限列表
     *
     * @param openAuthParam
     * @return
     */
    @Override
    public ResponseVo queryOpenAuthList(OpenAuthParam openAuthParam) {
        ResponseVo response = new ResponseVo();
        List<OpenAuth> dataSource = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            OpenAuth openAuth = new OpenAuth();
            openAuth.setId(i);
            openAuth.setName("测试服务" + i);
            openAuth.setVersion("v0.1." + i);
            openAuth.setActiveTime(Timestamp.valueOf(LocalDateTime.now()));
            openAuth.setValidTime(Timestamp.valueOf(LocalDateTime.now()));
            openAuth.setDesc("测试");
            dataSource.add(openAuth);
        }
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

    /**
     * 分页查询需求权限列表
     *
     * @param requiredAuthParam
     * @return
     */
    @Override
    public ResponseVo queryRequiredAuthList(RequiredAuthParam requiredAuthParam) {
        ResponseVo response = new ResponseVo();
        List<RequiredAuth> dataSource = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            RequiredAuth requiredAuth = new RequiredAuth();
            requiredAuth.setId(i);
            requiredAuth.setName("测试服务" +i);
            requiredAuth.setVersion("v0.0." + i);
            requiredAuth.setDesc("测试");
            dataSource.add(requiredAuth);
        }
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
}
