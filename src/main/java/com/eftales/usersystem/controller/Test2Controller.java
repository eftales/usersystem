package com.eftales.usersystem.controller;

import com.eftales.usersystem.pojo.User;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test2Controller implements ITest2 {

    @GetMapping("/test/paramtest2")
    public String test2(@Validated(ITest2.class) User user){
        // 测试url http://localhost:8080/test/paramtest2/?id=12&name=user&password=123
        System.out.println(user);
        return user.toString();
    }
}
