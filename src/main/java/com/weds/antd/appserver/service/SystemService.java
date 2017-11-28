package com.weds.antd.appserver.service;

import com.weds.antd.appserver.vo.ResponseVo;

import javax.xml.bind.JAXBException;

public interface SystemService {

    /**
     * dashboard 中的系统概览数据获取
     * @return
     */
    ResponseVo getSystemInfo() throws JAXBException;
}
