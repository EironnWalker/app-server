package com.weds.antd.appserver.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.kevinsawicki.http.HttpRequest;
import com.weds.antd.appserver.config.InterfaceProperties;
import com.weds.antd.appserver.entity.SystemChart;
import com.weds.antd.appserver.service.SystemService;
import com.weds.antd.appserver.utils.JsonUtils;
import com.weds.antd.appserver.vo.ResponseVo;
import com.weds.antd.appserver.xml.Application;
import com.weds.antd.appserver.xml.Applications;
import com.weds.antd.appserver.xml.DataCenterInfo;
import com.weds.antd.appserver.xml.Instance;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class SystemServiceImpl implements SystemService {

    @Resource
    private InterfaceProperties.Eureka eureka;

    /**
     * dashboard 中的系统概览数据获取
     *
     * @return
     */
    @Override
    public ResponseVo getSystemInfo() throws JAXBException, IOException {
        // 请求apps接口，获取应用详情。
        String body = HttpRequest.get(eureka.getAppsUrl()).body();
        JAXBContext jaxbContext = JAXBContext.newInstance(Applications.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

        StringReader reader = new StringReader(body);
        Applications applications = (Applications) unmarshaller.unmarshal(reader);
        // 判断有几个数据中心的set
        Set<String> centerCountsSet = new HashSet<>();
        // 实例数
        int instanceCount = 0;
        List<Application> application = applications.getApplications();
        for (int i = 0; i < application.size(); i++) {
            List<Instance> instance = application.get(i).getInstances();
            instanceCount += instance.size();
            for (int j = 0; j < instance.size(); j++) {
                DataCenterInfo center = instance.get(j).getDataCenterInfo();
                centerCountsSet.add(center.getName());
            }
        }

        JSONObject data = new JSONObject();
        // 获取图表数据
        String chartBody = HttpRequest.get(eureka.getChartUrl()).accept("application/json") //Sets request header
                .body();
        JSONObject chartData = JSON.parseObject(chartBody);
        if (600 == Integer.valueOf(chartData.get("code").toString())) {
            System.out.println(JSON.toJSONString(chartData.get("data")));
            SystemChart chart = JsonUtils.jsonToObject(JSON.toJSONString(chartData.get("data")), SystemChart.class);
            data.put("cpu", chart.getcPUTotalUsage());
            data.put("mer", chart.getMemoryTotalUsage());
            data.put("storage", chart.getDiskTotalUsage());
        } else {
            data.put("cpu", 0);
            data.put("mer", 0);
            data.put("storage", 0);
        }
        data.put("centerCounts", centerCountsSet.size());
        data.put("appCounts", application.size());
        data.put("instantCounts", instanceCount);
        data.put("equipmentCounts", 16);

        ResponseVo responseVo = new ResponseVo("1", "success", data);
        return responseVo;
    }
}
