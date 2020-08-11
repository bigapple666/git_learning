package it.com.cn.springboot_mybatis.service;

import it.com.cn.springboot_mybatis.model.Employee;

public interface IEmployeeService {
    public Employee queryEmpById(int id);
}
