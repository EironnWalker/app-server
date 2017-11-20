package com.weds.antd.appserver.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author invlong
 * @createTime 2017-11-21 05:48
 */
@RestController
public class RuleAction {

    /**
     * 获取rule列表
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "rule", method = RequestMethod.GET)
    public Map<String, Object> queryRule(HttpServletRequest request, HttpServletResponse response) {
        Map<String, Object> returnMap = new HashMap<>();
        try {
            String body = request.getReader().lines().collect(Collectors.joining(System.lineSeparator()));
            JSONObject json = JSON.parseObject(body);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;

    }
}
