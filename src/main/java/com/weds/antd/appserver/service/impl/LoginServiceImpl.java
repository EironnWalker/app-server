package com.weds.antd.appserver.service.impl;

import com.weds.antd.appserver.service.LoginService;
import com.weds.antd.appserver.vo.LoginInfo;
import com.weds.antd.appserver.vo.ResponseVo;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.assertj.core.util.Strings;
import org.springframework.stereotype.Service;


@Service
public class LoginServiceImpl implements LoginService {

    private static final Log log = LogFactory.getLog(LoginServiceImpl.class);

    /**
     * 使用账号密码登录
     *
     * @param loginInfo
     * @return
     */
    @Override
    public ResponseVo accountLogin(LoginInfo loginInfo) {
        ResponseVo response = this.validateLoginParam(loginInfo);
        // 校验必填
        if ("-1".equals(response.getResult())) {
            return response;
        }
        // mock login
        if ("admin".equals(loginInfo.getUserName()) && "888888".equals(loginInfo.getPassword())) {
            response.setResult("1");
            response.setMsg("success");
            response.setData("account");
        } else {
            response.setResult("-1");
            response.setMsg("用户名或密码错误！");
            response.setData("account");
        }
        return response;
    }

    /**
     * 校验登录
     * @param loginInfo
     * @return
     */
    private ResponseVo validateLoginParam(LoginInfo loginInfo) {
        ResponseVo response = new ResponseVo();
        String msg;
        if (null == loginInfo) {
            msg = "请输入用户名和密码";
            log.error("empty loginInfo error！");
            response.setResult("-1");
            response.setMsg(msg);
            return response;
        }
        if (Strings.isNullOrEmpty(loginInfo.getUserName())) {
            msg = "请输入用户名！";
            log.error("empty userNmae!");
            response.setResult("-1");
            response.setMsg(msg);
            return response;
        }
        if (Strings.isNullOrEmpty(loginInfo.getPassword())) {
            msg = "请输入密码！";
            log.error("empty password!");
            response.setResult("-1");
            response.setMsg(msg);
            return response;
        }
        response.setResult("1");
        return response;

    }
}
