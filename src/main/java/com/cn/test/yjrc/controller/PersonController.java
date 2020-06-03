package com.cn.test.yjrc.controller;

import com.cn.test.yjrc.domain.ResponseResult;
import com.cn.test.yjrc.domain.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

/**
 * @author wangdakai
 */
@RestController
@RequestMapping("/person")
@Api(value = "PersonController", tags = "获取个人信息，无参数返回正常，有参数传什么返回什么")
public class PersonController {


    @PostMapping("/personCompleted")
    @ApiOperation(value = "获取个人登录信息（已完善个人信息）")
    public String personCompleted(@RequestParam String status){
        int num=(int)(Math.random()*101);
        int random= num>50?0:1;
        return Result.person_completed.replace("\"isComplete\": 1","\"isComplete\": "+random);
    }


    @PostMapping("/personFile")
    @ApiOperation(value = "获取个人附件信息")
    public String personFile(@RequestParam String status){
        /*if (status!=null&&status!=""){
            return  ResponseResult.getError(status);
        }*/
        return Result.person_file;
    }

    @PostMapping("/personBasic")
    @ApiOperation(value = "获取全部个人基础信息")
    public String personBasic(@RequestParam String status){
       /* if (status!=null&&status!=""){
            return  ResponseResult.getError(status);
        }*/
        return Result.person_baisc;
    }

    @PostMapping("/getNotifications")
    @ApiOperation(value = "个人获取政策通知")
    public String getNotifications(@RequestParam String status){
       /* if (status!=null&&status!=""){
            return  ResponseResult.getError(status);
        }*/
        return Result.person_Notifications;
    }





}
