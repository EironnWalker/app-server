package com.weds.antd.appserver.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.weds.antd.appserver.entity.Rule;
import com.weds.antd.appserver.service.RuleService;
import com.weds.antd.appserver.vo.ResponseVo;
import com.weds.antd.appserver.vo.RuleParam;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class RuleServiceImpl implements RuleService {

    /**
     * 分页查询rule列表
     *
     * @param ruleParam
     * @return
     */
    @Override
    public ResponseVo queryRule(RuleParam ruleParam) {
        List<Rule> dataSource = new ArrayList<>();
        ResponseVo response = new ResponseVo();
        String[] advatars = {"https://gw.alipayobjects.com/zos/rmsportal/eeHMaZBwmTvLdIwMfBpg.png", "https://gw.alipayobjects.com/zos/rmsportal/udxAbMEhpwthVVcjLXik.png"};
        for (int i = 0; i < 50; i++) {
            Rule rule = new Rule();
            rule.setKey(i);
            rule.setDisabled((i % 6) == 0);
            rule.setHref("https://ant.design");
            rule.setAvatar(advatars[(i % 2)]);
            rule.setNo("TradeCode " + i);
            rule.setTitle("一个任务名称 " + i);
            rule.setOwner("wuxl");
            rule.setDescription("这是一段描述");
            rule.setCallNo(Math.floor(Math.random() * 1000));
            rule.setStatus(Math.floor(Math.random() * 10) % 4);
            rule.setUpdatedAt(LocalDate.now().toString());
            rule.setCreatedAt(LocalDate.now().toString());
            rule.setProgress(Math.ceil(Math.random() * 100));
            dataSource.add(rule);
        }
        // response中的data
        JSONObject jsonData = new JSONObject();
        JSONObject pagination = new JSONObject();
        pagination.put("total", dataSource.size());
        pagination.put("pageSize", 10);
        pagination.put("current", 1);
        jsonData.put("list", dataSource);
        jsonData.put("pagination", pagination);
        response.setResult("1");
        response.setMsg("查询成功！");
        response.setData(jsonData);
        return response;
    }
}
