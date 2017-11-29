package com.weds.antd.appserver.service;

import com.weds.antd.appserver.vo.EquipmentParam;
import com.weds.antd.appserver.vo.ResponseVo;

public interface EquipmentService {


    /**
     * 查询设备列表
     * @param equipmentParam
     * @return
     */
    ResponseVo queryEquipmentList(EquipmentParam equipmentParam);
}
