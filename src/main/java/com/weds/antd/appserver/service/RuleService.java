package com.weds.antd.appserver.service;

import com.weds.antd.appserver.vo.ResponseVo;
import com.weds.antd.appserver.vo.RuleParam;

public interface RuleService {

    /**
     * 分页查询rule列表
     * @param ruleParam
     * @return
     */
    ResponseVo queryRule(RuleParam ruleParam);
}
