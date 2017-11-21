package com.weds.antd.appserver.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.weds.antd.appserver.service.RuleService;
import com.weds.antd.appserver.utils.JWTUtils;
import com.weds.antd.appserver.utils.JsonUtils;
import com.weds.antd.appserver.vo.ResponseVo;
import com.weds.antd.appserver.vo.RuleParam;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.assertj.core.util.Strings;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
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

    private static final Log log = LogFactory.getLog(RuleAction.class);

    @Resource
    private RuleService ruleService;

    /**
     * 获取rule列表
     * @param request
     * @return
     */
    @RequestMapping(value = "rule", method = RequestMethod.GET)
    public ResponseVo queryRule(HttpServletRequest request) {
        ResponseVo response;
        try {
            log.info("enter controller: rule...");
            String body = request.getReader().lines().collect(Collectors.joining(System.lineSeparator()));
            log.info("param:##" + body);
            if (!Strings.isNullOrEmpty(body)) {
                RuleParam param = JsonUtils.jsonToObject(body, RuleParam.class);
                response = ruleService.queryRule(param);
            } else {
                response = ruleService.queryRule(null);
            }
            log.info("returnMap:##" + response);
        } catch (IOException e) {
            e.printStackTrace();
            response = new ResponseVo("-1","error",null);
        }
        return response;

    }
}
