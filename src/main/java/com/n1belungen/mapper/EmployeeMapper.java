package com.n1belungen.mapper;

import com.n1belungen.entity.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

//员工操作
@Mapper
@Repository
public interface EmployeeMapper {

    /**
     * 获取全部员工信息
     * @return
     */
    List<Employee> getAllEmployee();

    /**
     * 通过id模糊查询员工
     * @param id
     * @return
     */
    Employee queryEmployeeByID(int id);

    /**
     * 通过name模糊查询员工
     * @param name
     * @return
     */
    List<Employee> queryEmployeeByName(String name);

    /**
     * 增加一个员工
     * @param employee
     * @return
     */
    int addEmployee(Employee employee);

    /**
     * 通过id删除员工
     * @param id
     * @return
     */
    int deleteEmployeeByID(int id);

    /**
     * 更新员工信息
     * @param employee
     * @return
     */
    int updateEmployee(Employee employee);

}

