package com.cn.test.yjrc.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.cn.test.yjrc.domain.ResponseResult;
import com.cn.test.yjrc.domain.Result;
import com.cn.test.yjrc.model.dto.GetOrganIds;
import com.cn.test.yjrc.utils.Base64Utils;
import com.cn.test.yjrc.utils.FileToJson;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.models.auth.In;
import org.springframework.web.bind.annotation.*;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author wangdakai
 */
@RestController
@RequestMapping("/unit")
@Api(value = "UnitController", tags = "获取个人信息，无参数返回正常，有参数传什么返回什么")
public class UnitController {


    @PostMapping("/unitBaiscState")
    @ApiOperation(value = "检验单位基础信息是否有效")
    public String unitBasicState(@RequestParam String unitCode){
        return "1";
    }

    @PostMapping("/unitCompleted")
    @ApiOperation(value = "获取单位登录信息参数可以自己传")
    public String unitCompleted(@RequestParam String status){
       /* int num=(int)(Math.random()*101);
        int random= num>50?0:1;    .replace("\"isComplete\": 1","\"isComplete\": "+random)*/
        return Result.unit_completed;
    }


    @PostMapping("/unitFile")
    @ApiOperation(value = "获取单位附件信息")
    public String unitFile(@RequestParam String status) throws IOException {
        JSONObject getEditUnitInfo = FileToJson.getDictionary("getEditUnitFileInfo");
        return  getEditUnitInfo.toString().replace("XX",status);
       /* String json ="";
        InputStream config = getClass().getResourceAsStream("/overview/getEditUnitFileInfo.json");
        if (config == null) {
            throw new RuntimeException("读取文件失败");
        } else {
            json = JSON.parseObject(config, JSONObject.class).toString();
        }
        json.replace("xx", Base64Utils.ImageToBase64("/pic/yhd.jpg"));
        json.replace("yy", Base64Utils.ImageToBase64("/pic/tg.jpg"));*/

    }

    @PostMapping("/unitBasic")
    @ApiOperation(value = "获取单位全部基础信息")
    public String unitBasic(@RequestParam String status){
       /* if (status!=null&&status!=""){
            return  ResponseResult.getError(status);
        }*/
        return Result.unit_basic;
    }

    @PostMapping("/getNotifications")
    @ApiOperation(value = "单位获取政策通知")
    public String getNotifications(@RequestParam String status){
        /*if (status!=null&&status!=""){
            return  ResponseResult.getError(status);
        }*/
        return Result.getNotifications;
    }

    // 模拟接收到保存
    // 模拟获取 一般信息，经办人信息，资质信息

    @PostMapping("/getEditUnitInfo")
    @ApiOperation(value = "单位获取政策通知")
    public String getEditUnitInfo(@RequestParam String status) throws IOException {
        JSONObject getEditUnitInfo = FileToJson.getDictionary("getEditUnitInfo");
        String xx = getEditUnitInfo.toString().replace("XX", status);
        return xx;
    }

    @PostMapping("/getEditUnitQualifiedInfo")
    @ApiOperation(value = "单位获取政策通知")
    public String getEditUnitQualifiedInfo(@RequestParam String status) throws IOException {
        JSONObject getEditUnitInfo = FileToJson.getDictionary("getEditUnitQualifiedInfo");
       return  getEditUnitInfo.toString().replace("XX",status);
    }

    @PostMapping("/getEditUnitHandlerInfo")
    @ApiOperation(value = "单位获取政策通知")
    public String getEditUnitHandlerInfo(@RequestParam String status) throws IOException {
        JSONObject getEditUnitInfo = FileToJson.getDictionary("getEditUnitHandlerInfo");
        return getEditUnitInfo.toString().replace("XX",status);
    }

@PostMapping("/getUnitInfoByRegistrationCode")
    public String getUnitInfoByRegistrationCode(@RequestParam String registrationCode) throws IOException {
        JSONObject getEditUnitInfo = null;
        if("-1".equals(registrationCode)){
            getEditUnitInfo = FileToJson.getDictionary("nullArray");

        }else{
            getEditUnitInfo = FileToJson.getDictionary("getUnitInfoByRegistrationCode");
        }
        return getEditUnitInfo.toString();
    }


    @PostMapping("/getOrganIds")
    public List<Integer> getOrganId(@RequestBody GetOrganIds getOrganIds){
        List<Integer> organs = new ArrayList<>();
        List<Integer> handleList = getOrganIds.getHandleList();
        for(int i =0;i<handleList.size();i++){
            if((i & 1)==0){
                organs.add(101);
            }else{
                organs.add(102);
            }
        }
        return organs;
    }


}
