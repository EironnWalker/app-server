package com.weds.antd.appserver.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.weds.antd.appserver.entity.Equipment;
import com.weds.antd.appserver.service.EquipmentService;
import com.weds.antd.appserver.vo.EquipmentParam;
import com.weds.antd.appserver.vo.ResponseVo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EquipmentServiceImpl implements EquipmentService {
    /**
     * 查询设备列表
     *
     * @param equipmentParam
     * @return
     */
    @Override
    public ResponseVo queryEquipmentList(EquipmentParam equipmentParam) {
        ResponseVo response = new ResponseVo();
        List<Equipment> dataSource = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Equipment equipment = new Equipment();
            equipment.setId(i);
            equipment.setGatewayNo("100" + i);
            equipment.setGatewayName("默认网关" + i);
            equipment.setGatewayIP("127.0.0.1");
            equipment.setEquipmentNo(10);
            equipment.setOnlineNo(2);
            equipment.setOfflineNo(3);
            equipment.setFaultyNo(3);
            equipment.setUpSpeed("100KB/s");
            equipment.setDownSpeed("50KB/s");
            equipment.setEnable(true);
            equipment.setAuto(true);
            dataSource.add(equipment);
        }
        JSONObject data = new JSONObject();
        data.put("list", dataSource);
        response.setResult("1");
        response.setMsg("success");
        response.setData(data);
        return response;
    }
}
