package com.weds.antd.appserver.utils;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class JsonUtils {

    // 工具mapper，进行转换用。
    private static final ObjectMapper mapper = new ObjectMapper();

    /**
     * 把json转换成实体对象
     * @param jsonInString
     * @param valueType
     * @param <T>
     * @return
     * @throws IOException
     */
    public static  <T> T jsonToObject(String jsonInString, Class<T> valueType) throws IOException {
        //JSON from String to Object
        return mapper.readValue(jsonInString, valueType);
    }
}
