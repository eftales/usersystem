package com.eftales.usersystem.controller;

import com.eftales.usersystem.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private Student stu1;


    @Autowired
    private Student stu2;

    @RequestMapping("/hello")
    public String hello(){
        // 这两个 hashcode 是否一致取决于 Student 是否被 Scope 修饰
        System.out.println(stu1.hashCode());
        System.out.println(stu2.hashCode());
        return stu1.toString();
    }
}
