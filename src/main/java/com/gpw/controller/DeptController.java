package com.gpw.controller;

import com.gpw.bean.Department;
import com.gpw.bean.Employee;
import com.gpw.mapper.DepartmentMapper;
import com.gpw.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Gpw
 * @Date: 2019/5/22
 * @Description: com.gpw.controller
 * @Version: 1.0
 */
@RestController
public class DeptController {

    @Autowired
    DepartmentMapper departmentMapper;  //注解方式

    @Autowired
    EmployeeMapper employeeMapper;  //配置文件方式

    @GetMapping("/dept/{id}")
    public Department getDepartment(@PathVariable("id") Integer id){
        return this.departmentMapper.findDeptById(id);
    }

    @GetMapping("/dept")
    public Department insertDept(Department department){
        this.departmentMapper.insertDept(department);
        return department;
    }

    @GetMapping("/emp/{id}")
    public Employee getEmployee(@PathVariable("id") Integer id) {
        return this.employeeMapper.findEmpById(id);
    }
}
