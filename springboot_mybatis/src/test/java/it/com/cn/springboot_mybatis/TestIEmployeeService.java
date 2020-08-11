package it.com.cn.springboot_mybatis;

import it.com.cn.springboot_mybatis.model.Employee;
import it.com.cn.springboot_mybatis.service.IEmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes={SpringbootMybatisApplication.class})//加载启动器
public class TestIEmployeeService {
    @Autowired
    private IEmployeeService employeeService;
    @Test
    public void testIEmployeeService(){
        Employee employee = employeeService.queryEmpById(1);
        System.out.println(employee);
    }
}
