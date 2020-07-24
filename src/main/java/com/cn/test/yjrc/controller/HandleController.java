package com.cn.test.yjrc.controller;

import com.alibaba.fastjson.JSONObject;
import com.cn.test.yjrc.utils.FileToJson;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
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


    @PostMapping("/getPersonalSnapshotSocialSecurityInfo")
    @ApiOperation(value = "社保")
    public String getPersonalSnapshotSocialSecurityInfo(@RequestParam String status) throws IOException {
        JSONObject getEditUnitInfo = FileToJson.getDictionary("getPersonalSnapshotSocialSecurityInfo");
        return getEditUnitInfo.toString();
    }

}
