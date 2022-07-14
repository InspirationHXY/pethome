package com.yingyi.org.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    private Long id;

    //编号
    private String sn;
    private String name;

    //部门层级路径
    private String dirPath;

    //启用状态
    private Integer state;

    //部门管理员的id
    private Long manager_id;
    //manager_id对应的Employee对象
    private Employee magager;

    //上级部门
    private Long parent_id;
    //parent_id对应的部门
    private Department parent;

    //当前部门的子部门
    private List<Department> children = new ArrayList<>();
}
