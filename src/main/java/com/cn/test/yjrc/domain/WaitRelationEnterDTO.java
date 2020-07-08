package com.cn.test.yjrc.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WaitRelationEnterDTO implements Serializable {

    private static final long serialVersionUID = 7536808941898414067L;
    private String name;
    private List<Map<Long,String>> codes;
}
