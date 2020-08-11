package it.com.cn.springboot_mybatis.service.impl;

import it.com.cn.springboot_mybatis.dao.EmployeeMapper;
import it.com.cn.springboot_mybatis.model.Employee;
import it.com.cn.springboot_mybatis.service.IEmployeeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
    @Resource
    private EmployeeMapper employeeMapper;
    @Override
    public Employee queryEmpById(int id) {
        return employeeMapper.findEmpById(id);
    }
}
