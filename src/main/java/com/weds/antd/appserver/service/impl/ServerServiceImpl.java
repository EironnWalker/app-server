package com.weds.antd.appserver.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.github.kevinsawicki.http.HttpRequest;
import com.weds.antd.appserver.config.InterfaceProperties;
import com.weds.antd.appserver.entity.InterfaceEntity;
import com.weds.antd.appserver.entity.Server;
import com.weds.antd.appserver.service.ServerService;
import com.weds.antd.appserver.utils.DateUtils;
import com.weds.antd.appserver.vo.ResponseVo;
import com.weds.antd.appserver.vo.ServerParam;
import com.weds.antd.appserver.xml.Application;
import com.weds.antd.appserver.xml.Applications;
import com.weds.antd.appserver.xml.Instance;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

@Service
public class ServerServiceImpl implements ServerService {

    @Resource
    private InterfaceProperties.Eureka eureka;

    /**
     * 分页查询rule列表
     *
     * @param serverParam
     * @return
     */
    @Override
    public ResponseVo queryServerList(ServerParam serverParam) throws JAXBException {
        List<Server> dataSource = new ArrayList<>();
        ResponseVo response = new ResponseVo();
        // 请求apps接口，获取应用详情。
        String body = HttpRequest.get(eureka.getAppsUrl()).body();
        JAXBContext jaxbContext = JAXBContext.newInstance(Applications.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

        StringReader reader = new StringReader(body);
        Applications applications = (Applications) unmarshaller.unmarshal(reader);
        // 遍历获取实例对象
        for (Application application : applications.getApplications()) {
            for (Instance instance : application.getInstances()) {
                Server entity = new Server();
                entity.setId(instance.getInstanceId());
                entity.setAppName(instance.getApp());
                entity.setInstantName(instance.getInstanceId());
                entity.setStatus(instance.getStatus());
                entity.setRegistryTime(DateUtils.unixTimeToJavaTimestamp(instance.getLeaseInfo().getRegistrationTimestamp()));
                entity.setDataCenter(instance.getDataCenterInfo().getName());
                entity.setIp(instance.getIpAddr());
                entity.setPort(instance.getPort());
                entity.setUpdateTime(DateUtils.unixTimeToJavaTimestamp(instance.getLastUpdatedTimestamp()));
                dataSource.add(entity);
            }
        }
        // response中的data
        JSONObject jsonData = new JSONObject();
        jsonData.put("list", dataSource);
        response.setResult("1");
        response.setMsg("success");
        response.setData(jsonData);
        return response;
    }

    /**
     * 查询服务详情
     *
     * @param serverParam
     * @return
     */
    @Override
    public ResponseVo queryServerDetail(ServerParam serverParam) {
        ResponseVo response = new ResponseVo();
        List<InterfaceEntity> dataSource = new ArrayList<>();
        JSONObject data = new JSONObject();
        // 存入概览信息
        data.put("version", "v1.002");
        data.put("cpu", "50%");
        data.put("mer", "60%");
        data.put("QPS", "252");
        data.put("counts", "25666");
        for (int i = 0; i < 8; i++) {
            InterfaceEntity entity = new InterfaceEntity();
            entity.setId(i);
            entity.setName("接口" + i);
            entity.setDesc("测试接口");
            entity.setType("RESTFul");
            entity.setVersion("v0.0." + i);
            dataSource.add(entity);
        }
        data.put("list", dataSource);
        response.setResult("1");
        response.setMsg("success");
        response.setData(data);
        return response;
    }
}
