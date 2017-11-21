package com.weds.antd.appserver.service;

import com.weds.antd.appserver.vo.LoginInfo;
import com.weds.antd.appserver.vo.ResponseVo;

import java.util.Map;

public interface LoginService {

    /**
     * 使用账号密码登录
     * @param loginInfo
     * @return
     */
    ResponseVo accountLogin(LoginInfo loginInfo);

}
