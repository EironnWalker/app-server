package com.weds.antd.appserver.controller;

import com.weds.antd.appserver.service.ServerService;
import com.weds.antd.appserver.utils.JsonUtils;
import com.weds.antd.appserver.vo.ResponseVo;
import com.weds.antd.appserver.vo.ServerParam;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.assertj.core.util.Strings;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.stream.Collectors;

/**
 * 服务提供 action
 * @author invlong
 * @createTime 2017-11-21 05:48
 */
@RestController
public class ServerAction {

    private static final Log log = LogFactory.getLog(ServerAction.class);

    @Resource
    private ServerService serverService;

    /**
     * 获取rule列表
     * @param serverParam
     * @return
     */
    @RequestMapping(value = "serverList", method = RequestMethod.GET)
    public ResponseVo queryServerList(ServerParam serverParam) {
        ResponseVo response;
        try {
            log.info("enter ServerAction: ## /rule...");
            log.info("param:##" + serverParam);
            response = serverService.queryServerList(serverParam);
            log.info("returnMap:##" + response);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("error ServerAction: ## /rule" + e.getMessage());
            response = new ResponseVo("-1","error",null);
        }
        return response;
    }

    @RequestMapping(value = "serverDetail", method = RequestMethod.GET)
    public ResponseVo queryServerDetail(ServerParam serverParam) {
        ResponseVo response;
        try {
            log.info("enter ServerAction: ## /serverDetail...");
            log.info("param:##" + serverParam);
            response = serverService.queryServerDetail(serverParam);
            log.info("returnMap:##" + response);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("error ServerAction: ## /rule" + e.getMessage());
            response = new ResponseVo("-1","error",null);
        }
        return response;
    }

}
