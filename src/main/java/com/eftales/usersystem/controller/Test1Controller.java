package com.eftales.usersystem.controller;

import com.eftales.usersystem.pojo.User;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test1Controller implements ITest1{
    @GetMapping("/test/paramtest1")
    public String test1(@Validated(ITest1.class) User user){
        // 测试url http://localhost:8080/test/paramtest1/?id=12&name=user&password=123
        System.out.println(user);
        return user.toString();
    }

}
