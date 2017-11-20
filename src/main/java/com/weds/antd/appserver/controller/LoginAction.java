package com.weds.antd.appserver.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/login")
public class LoginAction {

    @RequestMapping(value = "account", method = RequestMethod.POST)
    public JSONObject login(HttpServletRequest request, HttpServletResponse response) {
        JSONObject renJson = new JSONObject();
        try {
            String body = request.getReader().lines().collect(Collectors.joining(System.lineSeparator()));
            JSONObject json = JSON.parseObject(body);
            if (json.get("userName").equals("admin") && json.get("password").equals("888888")) {
                renJson.put("status", "ok");
                renJson.put("type", "account");
                Cookie cookie = new Cookie("token", "123");
                cookie.setMaxAge(900000);
                cookie.setHttpOnly(true);
                response.addCookie(cookie);
            } else {
                renJson.put("status", "error");
                renJson.put("type", "account");
            }

            System.out.println(renJson);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return renJson;
    }
}
