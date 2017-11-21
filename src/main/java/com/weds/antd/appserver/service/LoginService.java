package com.weds.antd.appserver.service;

import com.weds.antd.appserver.vo.LoginInfo;
import com.weds.antd.appserver.vo.ResponseVo;

public interface LoginService {

    /**
     * 使用账号密码登录
     * @param loginInfo
     * @return
     */
    ResponseVo accountLogin(LoginInfo loginInfo);

    /**
     * 获取当前登录用户的信息
     * @return
     */
    ResponseVo getLoginUser();

}
