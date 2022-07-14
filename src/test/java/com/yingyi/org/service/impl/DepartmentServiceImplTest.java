package com.yingyi.org.service.impl;

import com.yingyi.base.PageList;
import com.yingyi.org.domain.Department;
import com.yingyi.org.query.DepartmentQuery;
import com.yingyi.org.service.IDepartmentService;
import com.yingyi.util.TestUtil;
import org.junit.After;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class DepartmentServiceImplTest extends TestUtil {
    @Autowired
    private IDepartmentService departmentService;

    @Test
    public void queryById() {
        System.out.println(departmentService.queryById(1L));
    }

    @Test
    public void queryAll() {
        departmentService.queryAll().forEach(System.out::println);
    }

    @Test
    public void insert() {
        Department dept = new Department();
        dept.setName("testDept");
        dept.setSn("testSn");
        dept.setParent_id(2L);

        departmentService.insert(dept);
        System.out.println(departmentService.queryById(dept.getId()));
    }

    @Test
    public void update() {
        Department department = new Department();
        department.setId(24L);
        department.setName("testUpdate");
        department.setParent_id(4L);
        departmentService.update(department);
        System.out.println(departmentService.queryById(department.getId()));
    }

    @Test
    public void delete() {
        departmentService.delete(24L);
        departmentService.queryAll().forEach(System.out::println);
    }

    @Test
    public void queryData() {
        PageList<Department> result = departmentService.queryData(new DepartmentQuery());
        System.out.println(result.getTotals());
        result.getData().forEach(System.out::println);
    }
}