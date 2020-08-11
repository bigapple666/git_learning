package it.com.cn.springboot_mybatis.dao;

import it.com.cn.springboot_mybatis.model.Employee;

public interface EmployeeMapper {
    public Employee findEmpById(int id);
}
