package com.weds.antd.appserver.controller;

import com.weds.antd.appserver.service.DatabaseService;
import com.weds.antd.appserver.service.MqService;
import com.weds.antd.appserver.service.RedisService;
import com.weds.antd.appserver.vo.DatabaseParam;
import com.weds.antd.appserver.vo.RedisParam;
import com.weds.antd.appserver.vo.ResponseVo;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
public class BasicAction {

    private static final Log log = LogFactory.getLog(BasicAction.class);

    @Resource
    private DatabaseService databaseService;

    @Resource
    private RedisService redisService;

    @Resource
    private MqService mqService;


    @RequestMapping(value = "/databaseList", method = RequestMethod.GET)
    public ResponseVo queryDatabaseList(HttpServletRequest request) {
        ResponseVo response;
        try {
            log.info("enter controller:BasicAction## /databaseList...");
            response = databaseService.queryDatabaseList();
            log.info("returnMap:##" + response);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("BasicAction ##: /databaseList:##failed" + e.getMessage());
            response = new ResponseVo("-1","error",null);
        }
        return response;
    }


    @RequestMapping(value = "/changeDatabaseStatus", method = RequestMethod.GET)
    public ResponseVo changeDatabaseStatus(HttpServletRequest request, DatabaseParam databaseParam) {
        ResponseVo response;
        try {
            log.info("enter controller:BasicAction## /changeDatabaseStatus...");
            log.info("param: ##" + databaseParam.toString());
            response = databaseService.changeDbStatus(databaseParam);
            log.info("returnMap:##" + response);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("BasicAction ##: /changeDatabaseStatus:##failed" + e.getMessage());
            response = new ResponseVo("-1","error","changeStatus");
        }
        return response;
    }


    @RequestMapping(value = "/redisList", method = RequestMethod.GET)
    public ResponseVo queryRedisList(HttpServletRequest request) {
        ResponseVo response;
        try {
            log.info("enter controller:BasicAction## /redisList...");
            response = redisService.queryRedisList();
            log.info("returnMap:##" + response);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("BasicAction ##: /redisList:##failed" + e.getMessage());
            response = new ResponseVo("-1","error",null);
        }
        return response;
    }

    @RequestMapping(value = "/changeRedisStatus", method = RequestMethod.GET)
    public ResponseVo changeRedisStatus(HttpServletRequest request, RedisParam redisParam) {
        ResponseVo response;
        try {
            log.info("enter controller:BasicAction## /changeRedisStatus...");
            log.info("param: ##" + redisParam.toString());
            response = redisService.changeRedisStatus(redisParam);
            log.info("returnMap:##" + response);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("BasicAction ##: /changeRedisStatus:##failed" + e.getMessage());
            response = new ResponseVo("-1","error","changeStatus");
        }
        return response;
    }

    @RequestMapping(value = "/mqList", method = RequestMethod.GET)
    public ResponseVo queryMqList(HttpServletRequest request) {
        ResponseVo response;
        try {
            log.info("enter controller:BasicAction## /mqList...");
            response = mqService.queryMqList();
            log.info("returnMap:##" + response);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("BasicAction ##: /mqList:##failed" + e.getMessage());
            response = new ResponseVo("-1","error",null);
        }
        return response;
    }

    @RequestMapping(value = "/delMq", method = RequestMethod.GET)
    public ResponseVo delMq(HttpServletRequest request, int id) {
        ResponseVo response;
        try {
            log.info("enter controller:BasicAction## /delMq...");
            log.info("param: ## id =" + id);
            response = mqService.delMq(id);
            log.info("returnMap:##" + response);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("BasicAction ##: /delMq:##failed" + e.getMessage());
            response = new ResponseVo("-1","error","changeStatus");
        }
        return response;
    }
}
