package it.com.cn.springboot_mybatis.controller;

import it.com.cn.springboot_mybatis.model.Employee;
import it.com.cn.springboot_mybatis.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    private IEmployeeService employeeService;
    @GetMapping("/findEmp/{id}")
    public Employee findEmp(@PathVariable("id") int id){
        return employeeService.queryEmpById(id);
    }
}
