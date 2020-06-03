package com.cn.test.yjrc.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;


/**
 * @author wangdakai
 */
@Data
@AllArgsConstructor
public class ResponseResult {


	@ApiModelProperty(value = "状态码")
	private Integer status;

	public static String getError(String status){
		return "{\n" +
				"    \"status\":"+status
				+"\n }";
	}

}
