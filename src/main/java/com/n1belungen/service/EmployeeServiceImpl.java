package com.n1belungen.service;

import com.n1belungen.entity.Employee;
import com.n1belungen.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    //Service层 调用 Mapper层
    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<Employee> getAllEmployee() {
        return employeeMapper.getAllEmployee();
    }

    @Override
    public Employee queryEmployeeByID(int id) {
        return employeeMapper.queryEmployeeByID(id);
    }

    @Override
    public List<Employee> queryEmployeeByName(String name) {
        return employeeMapper.queryEmployeeByName(name);
    }

    @Override
    public int addEmployee(Employee employee) {
        return employeeMapper.addEmployee(employee);
    }

    @Override
    public int deleteEmployeeByID(int id) {
        return employeeMapper.deleteEmployeeByID(id);
    }

    @Override
    public int updateEmployee(Employee employee) {
        return employeeMapper.updateEmployee(employee);
    }
}
