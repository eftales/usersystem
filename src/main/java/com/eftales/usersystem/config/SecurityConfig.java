package com.eftales.usersystem.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.sql.DataSource;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    // 授权
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // 首页所有人可以访问，功能页只有有权限的人才能访问
        http.authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/dashboard").hasRole("admin");

        // 没有权限会跳转到登录页
        http.formLogin().loginPage("/index").usernameParameter("username").passwordParameter("password").loginProcessingUrl("/login"); //

        http.rememberMe().rememberMeParameter("remember");

        http.csrf().disable();

        // 开启注销功能
        http.logout().logoutSuccessUrl("/");

    }

    @Autowired
    DataSource dataSource;

    // 认证
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        // 因为java代码很容易变反编译，所以需要用 PasswordEncoder 将明文的密码加密
        PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();

        // 从内存中读取
        auth.inMemoryAuthentication().passwordEncoder(encoder)
                .withUser("admin").password(encoder.encode("123456")).roles("admin")
                .and()
                .withUser("guest").password(encoder.encode("123456")).roles("guest");


        // 从数据库中读取
//        auth.jdbcAuthentication()
//                .dataSource(dataSource)
//                .withDefaultSchema()
//                .withUser(User.withUsername("admin").password(encoder.encode("password")).roles("admin"));

    }
}
