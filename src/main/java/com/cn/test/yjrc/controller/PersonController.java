package com.cn.test.yjrc.controller;

import com.alibaba.fastjson.JSONObject;
import com.cn.test.yjrc.domain.EmployeeOutDTO;
import com.cn.test.yjrc.domain.Result;
import com.cn.test.yjrc.domain.WaitRelationEnterDTO;
import com.cn.test.yjrc.utils.FileToJson;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

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
        /*int num=(int)(Math.random()*101);
        int random= num>50?0:1;*/
        return Result.person_completed;
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


    @PostMapping("/previewPersonInfo")
    @ApiOperation(value = "获取个人")
    public JSONObject previewPersonInfo(@RequestParam String status) throws IOException {
        JSONObject getEditUnitInfo = FileToJson.getDictionary("getEditUnitHandlerInfo");
        return getEditUnitInfo;
    }



    @PostMapping("/getWaitRelation")
    @ApiOperation(value = "包装")
    public List<EmployeeOutDTO> getWaitRelation(@RequestBody WaitRelationEnterDTO waitRelationEnterDTO) throws IOException {
        // 需要通过名字进行过滤
        //  将codes包装

        List<EmployeeOutDTO> collect = waitRelationEnterDTO.getCodes().stream()
                .map(e -> {
                    EmployeeOutDTO waitRelation = new EmployeeOutDTO();
                    Random random = new Random();
                    waitRelation.setGender(random.nextInt(10) > 5 ? "男" : "女");
                    waitRelation.setPerName("夏侯" + random.nextInt(10));
                    waitRelation.setPerCode(e);

                    waitRelation.setPerPhone("138" + random());
                    return waitRelation;
                })
                .collect(Collectors.toList());

        return collect;
    }



    private String random(){
        // 产生8位的随机数
        StringBuilder str = new StringBuilder();
        Random random = new Random();
        for(int i = 0;i<8;i++){
            str.append(random.nextInt(10));
        }
        return str.toString();
    }

}
