package com.cn.test.yjrc.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author zjdking
 * 2020/6/3 0003.
 * @version 1.0
 */
public class FileToJson {
    public static JSONObject getDictionary(String name) throws IOException {
        JSONObject json = null;
        InputStream config = FileToJson.class.getResourceAsStream("/overview/"+name+".json");
        if (config == null) {
            throw new RuntimeException("读取文件失败");
        } else {
            json = JSON.parseObject(config, JSONObject.class);
        }
        return json;
    }
}
