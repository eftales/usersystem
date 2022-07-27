package com.eftales.usersystem.mapper;

import com.eftales.usersystem.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface EmployeeMapper {
    List<Employee> queryEmployeeList();
    Employee queryEmployeeById(int id);
    int addEmployee(Employee employee);
    int updateEmployee(Employee employee);
    int deleteEmployee(int id);
}
