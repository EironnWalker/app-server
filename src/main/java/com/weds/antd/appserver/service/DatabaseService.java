package com.weds.antd.appserver.service;

import com.weds.antd.appserver.vo.DatabaseParam;
import com.weds.antd.appserver.vo.ResponseVo;

public interface DatabaseService {

    /**
     * 查询数据库列表
     * @return
     */
    ResponseVo queryDatabaseList();

    /**
     * 修改数据库实例状态
     * @return
     */
    ResponseVo changeDbStatus(DatabaseParam databaseParam);
}
