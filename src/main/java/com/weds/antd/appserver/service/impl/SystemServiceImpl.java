package com.weds.antd.appserver.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.weds.antd.appserver.service.SystemService;
import com.weds.antd.appserver.vo.ResponseVo;
import org.springframework.stereotype.Service;

@Service
public class SystemServiceImpl implements SystemService {

    /**
     * dashboard 中的系统概览数据获取
     *
     * @return
     */
    @Override
    public ResponseVo getSystemInfo() {
        JSONObject data = new JSONObject();
        data.put("centerCounts", 2);
        data.put("appCounts", 5);
        data.put("instantCounts", 5);
        data.put("equipmentCounts", 16);
        data.put("cpu", 28);
        data.put("mer", 28);
        data.put("storage", 60);
        ResponseVo responseVo = new ResponseVo("1", "success", data);
        return responseVo;
    }
}
