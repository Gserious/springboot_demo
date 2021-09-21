package com.guoshen.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @GetMapping("/hello")
    public String  hello(){
        return "你好y";
    }

    @PostMapping("/getUser")
    public User getOne(User user){
        return user;
    }
}
