package com.yingyi.org.service.impl;

import com.yingyi.base.PageList;
import com.yingyi.org.domain.Department;
import com.yingyi.org.mapper.DepartmentMapper;
import com.yingyi.org.query.DepartmentQuery;
import com.yingyi.org.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
public class DepartmentServiceImpl implements IDepartmentService {
    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public Department queryById(Long id) {
        return departmentMapper.queryById(id);
    }

    @Override
    public List<Department> queryAll() {
        return departmentMapper.queryAll();
    }

    @Override
    @Transactional
    public void insert(Department dept) {
        departmentMapper.insert(dept);
    }

    @Override
    @Transactional
    public void update(Department dept) {
        departmentMapper.update(dept);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        departmentMapper.delete(id);
    }

    @Override
    public PageList<Department> queryData(DepartmentQuery query) {
        //条件查询
        List<Department> list = departmentMapper.queryData(query);

        //条件查询的结果总数
        Long count = departmentMapper.queryCount(query);

        return new PageList<Department>(count, list);
    }


}
