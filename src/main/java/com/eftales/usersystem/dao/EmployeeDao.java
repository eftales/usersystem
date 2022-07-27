package com.eftales.usersystem.dao;

import com.eftales.usersystem.mapper.EmployeeMapper;
import com.eftales.usersystem.pojo.Department;
import com.eftales.usersystem.pojo.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class EmployeeDao {

    @Autowired
    private EmployeeMapper employeeMapper;

    public Collection<Employee> getEmployees(){
        Map<Integer, Employee> map = new HashMap<>();
        List<Employee> employees = employeeMapper.queryEmployeeList();
        for (Employee emp:employees
        ) {
            map.put(emp.getId(),emp);
        }

        return map.values();
    }

    public Employee getEmployeeByID(int id){

        return employeeMapper.queryEmployeeById(id);
    }

    public void addEmployee(int eID,String name,int DID){
        employeeMapper.addEmployee(new Employee(eID,name,DID));
    }

}

