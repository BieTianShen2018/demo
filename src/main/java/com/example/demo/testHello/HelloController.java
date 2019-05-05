package com.example.demo.testHello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
public class HelloController {
    @RequestMapping("/")
    public String test1(String name){
        return "hello222 "+ name;
    }
}
