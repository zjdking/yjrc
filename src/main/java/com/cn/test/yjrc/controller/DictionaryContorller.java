package com.cn.test.yjrc.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.InputStream;

/**
 *  通过获取本地的json 文件然后返回给调用者；
 *
 * @author zjdking
 * 2020/5/22 0022.
 * @version 1.0
 */
@RestController
public class DictionaryContorller {
    @RequestMapping("/getDic")
    public JSONObject getDictionary(@RequestParam String name) throws IOException {
        JSONObject json = null;
        InputStream config = getClass().getResourceAsStream("/dictionary/"+name+".json");
        if (config == null) {
            System.out.println("读取文件失败");
        } else {
            json = JSON.parseObject(config, JSONObject.class);
        }
        return json;
    }
}
