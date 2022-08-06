package com.eftales.usersystem.controller;

import com.eftales.usersystem.pojo.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

@Controller
public class AnyController {
    @RequestMapping("{path}")
    public String any(@PathVariable("path") String path){
        System.out.println("Using any controller");
        return path;
    }
}
