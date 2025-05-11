package com.example.testly_be;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class HelloController {
    
    @GetMapping("/hello")
    public String hello() {
        return "Hello From Testly!";
    }
    
}
