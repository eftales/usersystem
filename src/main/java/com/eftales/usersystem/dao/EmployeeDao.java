package com.eftales.usersystem.dao;

import com.eftales.usersystem.pojo.Department;
import com.eftales.usersystem.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class EmployeeDao {
    private Map<Integer, Employee> map = new HashMap<>();

    @Autowired
    private DepartmentDao departmentDao;

    public EmployeeDao(){
        map.put(1,new Employee(1,"1",new Department(1,"1")));
        map.put(2,new Employee(2,"2",new Department(2,"2")));
        map.put(3,new Employee(3,"3",new Department(3,"3")));
        map.put(4,new Employee(4,"4",new Department(4,"4")));
    }





    public Collection<Employee> getEmployees(){
        return map.values();
    }

    public Employee getEmployeeByID(int id){
        return map.get(id);
    }

    public void addEmployee(int eID,String name,int DID){
        map.put(eID,new Employee(eID,name,departmentDao.getDepartmentByID(DID)));
    }

}
