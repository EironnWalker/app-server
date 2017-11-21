package com.weds.antd.appserver.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.weds.antd.appserver.service.LoginService;
import com.weds.antd.appserver.utils.JsonUtils;
import com.weds.antd.appserver.vo.LoginInfo;
import com.weds.antd.appserver.vo.ResponseVo;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
public class LoginAction {

    private static final Log log = LogFactory.getLog(LoginAction.class);

    @Resource
    private LoginService loginService;

    @RequestMapping(value = "/login/account", method = RequestMethod.POST)
    public ResponseVo login(HttpServletRequest request) {
        ResponseVo response;
        try {
            log.info("enter controller: login/account...");
            String body = request.getReader().lines().collect(Collectors.joining(System.lineSeparator()));
            log.info("param:##" + body);
            LoginInfo loginInfo = JsonUtils.jsonToObject(body, LoginInfo.class);
            log.info("success to parse json to LoginInfo.");
            response = loginService.accountLogin(loginInfo);
            log.info("returnMap:##" + response);
        } catch (IOException e) {
            e.printStackTrace();
            response = new ResponseVo("-1","error",null);
        }
        return response;
    }

    @RequestMapping(value = "/currentUser", method = RequestMethod.GET)
    public ResponseVo getLoginUser(HttpServletRequest request) {
        ResponseVo response;
        try {
            log.info("enter controller: /currentUser...");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
