package com.weds.antd.appserver.controller;

import com.weds.antd.appserver.service.AuthAppService;
import com.weds.antd.appserver.vo.AuthAppParam;
import com.weds.antd.appserver.vo.OpenAuthParam;
import com.weds.antd.appserver.vo.RequiredAuthParam;
import com.weds.antd.appserver.vo.ResponseVo;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class AuthAction {

    private static final Log log = LogFactory.getLog(AuthAction.class);

    @Resource
    private AuthAppService authAppService;

    /**
     * 获取rule列表
     * @param authAppParam
     * @return
     */
    @RequestMapping(value = "/authAppList", method = RequestMethod.GET)
    public ResponseVo queryAuthAppList(AuthAppParam authAppParam) {
        ResponseVo response;
        try {
            log.info("enter AuthAction: ## /authAppList...");
            log.info("param:##" + authAppParam);
            response = authAppService.queryAuthAppList(authAppParam);
            log.info("returnMap:##" + response);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("error AuthAction: ## /authAppList" + e.getMessage());
            response = new ResponseVo("-1","error",null);
        }
        return response;
    }

    @RequestMapping(value = "/openAuthList", method = RequestMethod.GET)
    public ResponseVo queryOpenAuthList(OpenAuthParam openAuthParam) {
        ResponseVo response;
        try {
            log.info("enter AuthAction: ## /openAuthList...");
            log.info("param:##" + openAuthParam);
            response = authAppService.queryOpenAuthList(openAuthParam);
            log.info("returnMap:##" + response);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("error AuthAction: ## /openAuthList" + e.getMessage());
            response = new ResponseVo("-1","error",null);
        }
        return response;
    }

    @RequestMapping(value = "/requiredAuthList", method = RequestMethod.GET)
    public ResponseVo queryRequiredAuthList(RequiredAuthParam requiredAuthParam) {
        ResponseVo response;
        try {
            log.info("enter AuthAction: ## /requiredAuthList...");
            log.info("param:##" + requiredAuthParam);
            response = authAppService.queryRequiredAuthList(requiredAuthParam);
            log.info("returnMap:##" + response);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("error AuthAction: ## /requiredAuthList" + e.getMessage());
            response = new ResponseVo("-1","error",null);
        }
        return response;
    }
}
