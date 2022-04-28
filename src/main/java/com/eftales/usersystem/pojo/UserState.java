package com.eftales.usersystem.pojo;

import org.springframework.stereotype.Component;


import java.util.HashSet;
import java.util.Set;

@Component
public class UserState {
    public Set<String> loggedUser = new HashSet<>();
}
