package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/employees")
public class EmployeesController {

    @GetMapping("/test-employees")
    public String testEmployees(){
        return "this returned!";
    }

    
}
