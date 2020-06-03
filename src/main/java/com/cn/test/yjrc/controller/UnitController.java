package com.cn.test.yjrc.controller;

import com.cn.test.yjrc.domain.ResponseResult;
import com.cn.test.yjrc.domain.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * @author wangdakai
 */
@RestController
@RequestMapping("/unit")
@Api(value = "UnitController", tags = "获取个人信息，无参数返回正常，有参数传什么返回什么")
public class UnitController {


    @PostMapping("/unitCompleted")
    @ApiOperation(value = "获取单位登录信息参数可以自己传")
    public String unitCompleted(@RequestParam String status){
        int num=(int)(Math.random()*101);
        int random= num>50?0:1;
        return Result.unit_completed.replace("\"isComplete\": 1","\"isComplete\": "+random);
    }


    @PostMapping("/unitFile")
    @ApiOperation(value = "获取单位附件信息")
    public String unitFile(@RequestParam String status){
       /* if (status!=null&&status!=""){
            return  ResponseResult.getError(status);
        }*/
        return Result.unit_file;
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

}
