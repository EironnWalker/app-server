package com.weds.antd.appserver.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.github.kevinsawicki.http.HttpRequest;
import com.weds.antd.appserver.config.InterfaceProperties;
import com.weds.antd.appserver.service.SystemService;
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
    public ResponseVo getSystemInfo() throws JAXBException {
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
                DataCenterInfo center = instance.get(i).getDataCenterInfo();
                centerCountsSet.add(center.getName());
            }
        }

        JSONObject data = new JSONObject();
        data.put("centerCounts", centerCountsSet.size());
        data.put("appCounts", application.size());
        data.put("instantCounts", instanceCount);
        data.put("equipmentCounts", 16);
        data.put("cpu", 28);
        data.put("mer", 28);
        data.put("storage", 60);
        ResponseVo responseVo = new ResponseVo("1", "success", data);
        return responseVo;
    }
}
