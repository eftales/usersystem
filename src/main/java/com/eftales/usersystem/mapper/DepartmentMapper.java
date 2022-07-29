package com.eftales.usersystem.mapper;

import com.eftales.usersystem.pojo.Department;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DepartmentMapper {
    List<Department> queryDepartmentList();
    Department queryDepartmentById();
    int addDepartment(Department department);
    int updateDepartment(Department department);
    int deleteDepartment(int id);
}
