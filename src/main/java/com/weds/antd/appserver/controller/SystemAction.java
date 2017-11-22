package com.weds.antd.appserver.controller;

import com.weds.antd.appserver.service.SystemService;
import com.weds.antd.appserver.vo.ResponseVo;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.stream.Collectors;

@RestController
public class SystemAction {

    private static final Log log = LogFactory.getLog(SystemAction.class);

    @Resource
    private SystemService systemService;

    /**
     * 获取系统信息的action
     * @param request
     * @return
     */
    @RequestMapping(value = "/sysInfo", method = RequestMethod.GET)
    public ResponseVo getSysInfo(HttpServletRequest request) {
        ResponseVo response;
        try {
            log.info("enter controller:SystemAction## /sysInfo...");
            String body = request.getReader().lines().collect(Collectors.joining(System.lineSeparator()));
            log.info("param:##" + body);
            response = systemService.getSystemInfo();
            log.info("returnMap:##" + response);
        } catch (IOException e) {
            e.printStackTrace();
            log.error("SystemAction ##: /sysInfo:##failed" + e.getMessage());
            response = new ResponseVo("-1","error",null);
        }
        return response;
    }


}
