package com.eftales.usersystem.controller;

import com.eftales.usersystem.pojo.UserState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class LoginHandlerInterceptor implements HandlerInterceptor {
    @Autowired
    private UserState userState;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object loginUser =  request.getSession().getAttribute("loginUser");
        if(loginUser instanceof String){
            String loginUserStr = (String)loginUser;


            if(userState.loggedUser.contains(loginUserStr)){
                return true;
            }

        }
        request.setAttribute("msg","没有权限，请先登陆");
        request.getRequestDispatcher("/index.html").forward(request,response);

        return false;

    }

}
