package com.cn.test.yjrc.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class GetOrganIds implements Serializable {
    // 装有handleId 的list
    List<Integer> handleList ;
}
