package com.futuretech.springbootdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/welcome")
    public String getWelcome(){
        return "Welcome to the world";
    }

    @PostMapping("/registration")
    public String regoister(){
        return "Registration Successfull";
    }
    
    @PostMapping("/forgotpassword")
    public String forgotPassword(){
        return "Forgot Password ";
    }


}
