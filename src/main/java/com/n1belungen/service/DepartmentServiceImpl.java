package com.n1belungen.service;

import com.n1belungen.entity.Department;
import com.n1belungen.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService{

    //Service层 调用 Mapper层
    @Autowired
    DepartmentMapper departmentMapper;



    @Override
    public List<Department> getDepartment() {
        return departmentMapper.getDepartment();
    }

    @Override
    public Department queryDepartmentById(int id) {
        return departmentMapper.queryDepartmentById(id);
    }
}
