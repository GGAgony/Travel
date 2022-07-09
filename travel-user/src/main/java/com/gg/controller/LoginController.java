package com.gg.controller;

import com.gg.domain.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: {LZG}
 * @ClassName: LoginController
 * @Description: TODO
 * @Date: 2022/7/9 10:09
 **/
@RestController
@RequestMapping("/user")
public class LoginController {

    @PostMapping("/login")
    public void login(HttpServletRequest request, @RequestBody User user){
        System.out.println(user);
    }
}
