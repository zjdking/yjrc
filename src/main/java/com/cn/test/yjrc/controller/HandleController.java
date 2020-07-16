package com.cn.test.yjrc.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zjdking
 * 2020/6/29 0029.
 * @version 1.0
 */
@RestController
@RequestMapping("/handle")
public class HandleController {
    @PostMapping("/getHandle")
    public Map<String,String> getHandle(String handlerID){
        Map<String, String> map = new HashMap<>();
        map.put("organId",handlerID);
        map.put("handlerName","东城审批");
        return map;
    }
}
