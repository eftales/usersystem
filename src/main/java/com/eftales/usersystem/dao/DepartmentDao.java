package com.eftales.usersystem.dao;


import com.eftales.usersystem.mapper.DepartmentMapper;
import com.eftales.usersystem.pojo.Department;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class DepartmentDao {
    @Autowired
    DepartmentMapper departmentMapper;

    public Collection<Department> getDepartments(){

        Map<Integer, Department> map = new HashMap<>();
        List<Department> departments = departmentMapper.queryDepartmentList();
        departments.forEach((e)->{
            map.put(e.getId(),e);
        });
        return map.values();
    }

    public Department getDepartmentByID(int id){
        Department department = departmentMapper.queryDepartmentById();
        return department;
    }
}

