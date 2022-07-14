package com.yingyi.org.mapper;

import com.yingyi.org.domain.Department;
import com.yingyi.org.query.DepartmentQuery;

import java.util.List;

public interface DepartmentMapper {
    Department queryById(Long id);

    List<Department> queryAll();

    void insert(Department dept);

    void update(Department dept);

    void delete(Long id);

    /**
     * 分页：查询当前页数据
     * @param query
     * @return
     */
    List<Department> queryData(DepartmentQuery query);

    /**
     * 分页：条件查询结果总数量
     * @param query
     * @return
     */
    Long queryCount(DepartmentQuery query);
}
