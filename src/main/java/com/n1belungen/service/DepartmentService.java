package com.n1belungen.service;

import com.n1belungen.entity.Department;

import java.util.List;

public interface DepartmentService {
    /**
     * 获取部门的所有信息
     * @return
     */
    public List<Department> getDepartment();

    /**
     * 通过 Id 查询部门
     * @param id
     * @return
     */
    public Department queryDepartmentById(int id);
}
