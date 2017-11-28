package com.weds.antd.appserver.utils;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    public static <T> List<T> jsonToListObject(String jsonInString, Class<T> valueType) throws IOException {
        try {
            return mapper.readValue(
                    jsonInString,
                    mapper.getTypeFactory().constructCollectionType(List.class, valueType)
            );

        } catch (IOException e) {
            e.printStackTrace();
            throw new IOException("error when convert json to list object");
        }
    }

    public static <T,R> List<T> jsonToListObjectView(String jsonInString, Class<T> valueType, Class<R> viewType) throws IOException {
        return mapper.readerWithView(viewType).forType(mapper.getTypeFactory().constructCollectionType(List.class, valueType)).readValue(jsonInString);
    }


    public static void test() {
        Pattern p = Pattern.compile("^/login.*$");
        Matcher matcher = p.matcher("/l1ogin/account111");
        if (matcher.matches()) {
            System.out.println("ok");
        } else {
            System.out.println("failed");
        }
    }

    public static void main(String[] args) {
        test();
    }
}
