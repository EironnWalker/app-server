package com.weds.antd.appserver.service;

import com.weds.antd.appserver.vo.AuthAppParam;
import com.weds.antd.appserver.vo.OpenAuthParam;
import com.weds.antd.appserver.vo.RequiredAuthParam;
import com.weds.antd.appserver.vo.ResponseVo;

public interface AuthAppService {

    /**
     * 分页查询应用权限管理列表
     * @param authAppParam
     * @return
     */
    ResponseVo queryAuthAppList(AuthAppParam authAppParam);


    /**
     * 分页查询开通权限列表
     * @param openAuthParam
     * @return
     */
    ResponseVo queryOpenAuthList(OpenAuthParam openAuthParam);

    /**
     * 分页查询需求权限列表
     * @param requiredAuthParam
     * @return
     */
    ResponseVo queryRequiredAuthList(RequiredAuthParam requiredAuthParam);
}
