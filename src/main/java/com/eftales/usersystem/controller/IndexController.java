package com.eftales.usersystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"/","/index.html","/index"})
    public String index(Model model){
//        model.addAttribute("msg","hello,index");
        return "index";
    }
}
