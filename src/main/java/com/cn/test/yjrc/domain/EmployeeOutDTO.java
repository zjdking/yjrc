package com.cn.test.yjrc.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeOutDTO implements Serializable {

    private static final long serialVersionUID = 6195122906739720207L;
    private String perName;
    private String gender;
    private String perCode;
    private String perPhone;
}
