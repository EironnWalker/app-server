package com.weds.antd.appserver.service;

import com.weds.antd.appserver.vo.ResponseVo;
import com.weds.antd.appserver.vo.ServerParam;

public interface ServerService {

    /**
     * 分页查询rule列表
     * @param serverParam
     * @return
     */
    ResponseVo queryServerList(ServerParam serverParam);

    /**
     * 查询服务详情
     * @param serverParam
     * @return
     */
    ResponseVo queryServerDetail(ServerParam serverParam);
}
