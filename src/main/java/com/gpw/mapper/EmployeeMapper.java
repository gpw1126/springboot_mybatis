package com.gpw.mapper;

import com.gpw.bean.Employee;

/**
 * @Author: Gpw
 * @Date: 2019/5/22
 * @Description: com.gpw.mapper
 * @Version: 1.0
 */
public interface EmployeeMapper {

    public Employee findEmpById(Integer id);

    public void insertEmp(Employee employee);
}
