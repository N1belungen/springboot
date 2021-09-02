package com.n1belungen.controller;

import com.n1belungen.entity.Department;
import com.n1belungen.entity.Employee;
import com.n1belungen.service.DepartmentService;
import com.n1belungen.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    @Qualifier("employeeServiceImpl")
    private EmployeeService employeeService;

    @Autowired
    @Qualifier("departmentServiceImpl")
    private DepartmentService departmentService;


    /**
     * 跳转到 list页面
     * 显示所有员工信息
     * @param model
     * @return
     */
    @RequestMapping("/employeeList")
    public String employeeList(Model model){
        List<Employee> employees = employeeService.getAllEmployee();
        model.addAttribute("employee" , employees);
        return "employee/list";//返回到list页面
        }

    /**
     * 跳转到addEmployee页面
     * @param model
     * @return
     */
    @RequestMapping("/toAddEmployee")
    public String toAddemployee(Model model){
        List<Department> department = departmentService.getDepartment();
        model.addAttribute("department" , department);
        return "employee/addEmployee";
    }

    /**
     * 添加员工信息
     * @param employee
     * @return
     */
    @RequestMapping("/addEmployee")
    public String addemployee(Employee employee){

        //获取 department对应的部门名称
        String department = employee.getDepartment();
        int id = Integer.parseInt(department);
        String departmentname = departmentService.queryDepartmentById(id).getDepartmentname();
        employee.setDepartment(departmentname);

        employeeService.addEmployee(employee);
        return "redirect:/employeeList";
    }

    /**
     * 跳转到editEmployee页面
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("/editEmployee/{id}")
    public String editEmployee(@PathVariable("id")int id , Model model){

        //查询指定id的员工,添加到empByID中,用于前端接收
        Employee employeeByID = employeeService.queryEmployeeByID(id);
        model.addAttribute("employeeByID", employeeByID);

        //查出所有的部门信息,添加到departments中,用于前端接收
        List<Department> departments = departmentService.getDepartment();
        model.addAttribute("departments", departments);

        return "/employee/editEmployee";
    }

    /**
     * 编辑员工信息
     * @param employee
     * @return
     */
    @RequestMapping("/updateEmployee")
    public String updateEmployee(Employee employee){
        employeeService.updateEmployee(employee);
        return "redirect:/employeeList";
    }

    /**
     * 删除员工信息
     * @param id
     * @return
     */
    @RequestMapping("/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable("id")int id ){
        employeeService.deleteEmployeeByID(id);
        return "redirect:/employeeList";
    }

    @RequestMapping("/queryEmployeeByName")
    public String queryEmployeeByName(String name , Model model){
        List<Employee> employees = employeeService.queryEmployeeByName(name);
        model.addAttribute("employee" , employees);
        return "employee/list";
    }

}
