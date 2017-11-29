package com.weds.antd.appserver.controller;

import com.weds.antd.appserver.service.EquipmentService;
import com.weds.antd.appserver.vo.EquipmentParam;
import com.weds.antd.appserver.vo.ResponseVo;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class EquipmentAction {

    private static final Log log = LogFactory.getLog(EquipmentAction.class);

    @Resource
    private EquipmentService equipmentService;


    @RequestMapping(value = "/equipmentList", method = RequestMethod.GET)
    public ResponseVo queryEquipmentList(EquipmentParam equipmentParam) {
        ResponseVo response;
        try {
            log.info("enter EquipmentAction: ## /equipmentList...");
            log.info("param:##" + equipmentParam);
            response = equipmentService.queryEquipmentList(equipmentParam);
            log.info("returnMap:##" + response);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("error EquipmentAction: ## /equipmentList" + e.getMessage());
            response = new ResponseVo("-1","error",null);
        }
        return response;
    }
}
