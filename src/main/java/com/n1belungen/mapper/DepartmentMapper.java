package com.n1belungen.mapper;

import com.n1belungen.entity.Department;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

// 部门信息
@Mapper
@Repository
public interface DepartmentMapper {

    /**
     * 获取部门的所有信息
     * @return
     */
    public List<Department>getDepartment();

    /**
     * 通过 Id 查询部门
     * @param id
     * @return
     */
    public Department queryDepartmentById(int id);
}
