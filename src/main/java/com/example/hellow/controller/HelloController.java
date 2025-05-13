package com.example.hellow.controller;

import com.example.hellow.DTO.Employee;
import com.example.hellow.DTO.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @PostMapping(value = "/payment" ,consumes = "application/json",produces = "application/json")
    public Employee sayHello(@RequestBody User u){
        System.out.println(u.getUname());
        System.out.println(u.getPass());
        return new Employee(6,u.getUname(),99.9);
    }

}
