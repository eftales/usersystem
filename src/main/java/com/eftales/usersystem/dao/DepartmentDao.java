package com.eftales.usersystem.dao;


import com.eftales.usersystem.pojo.Department;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class DepartmentDao {
    private static Map<Integer, Department> map = new HashMap<>();
    static {
        map.put(1,new Department(1,"1"));
        map.put(2,new Department(2,"2"));
        map.put(3,new Department(3,"3"));
        map.put(4,new Department(4,"4"));
    }

    public Collection<Department> getDepartments(){
        return map.values();
    }

    public Department getDepartmentByID(int id){
        return map.get(id);
    }
}
