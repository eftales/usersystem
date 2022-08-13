package com.eftales.usersystem.pojo;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PositiveOrZero;

import com.eftales.usersystem.controller.ITest1;
import com.eftales.usersystem.controller.ITest2;
import com.eftales.usersystem.controller.Test1Controller;
import com.eftales.usersystem.controller.Test2Controller;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Min(value = 1L, groups = {ITest1.class})
    @Min(value = 10L, groups = {ITest2.class})
    private int id;
    @NotBlank
    @Length(min = 2, max = 5)
    private String name;
    @NotBlank
    private String password;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }


}
