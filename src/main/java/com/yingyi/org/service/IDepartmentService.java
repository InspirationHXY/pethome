package com.yingyi.org.service;

import com.yingyi.base.PageList;
import com.yingyi.org.domain.Department;
import com.yingyi.org.query.DepartmentQuery;

import java.util.List;

public interface IDepartmentService {
    Department queryById(Long id);

    List<Department> queryAll();

    void insert(Department dept);

    void update(Department dept);

    void delete(Long id);


    /**
     * 分页：查询当前页数据
     */
    PageList<Department> queryData(DepartmentQuery query);
}
