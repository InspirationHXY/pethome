package com.yingyi.org.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private Long id;
    private String username;
    private String password;
    private String salt;
    private Integer age;
    private String phone;
    private String email;
    private Integer state;
    private Long department_id;
    private Long logininfo_id;
    private Long shop_id;
}
