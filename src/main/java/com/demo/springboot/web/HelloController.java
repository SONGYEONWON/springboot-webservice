package com.demo.springboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// @RestController <- @Controller + @ResponseBody
// @RestController 를 사용하면 응답을 Json으로 보내준다.
@RestController
public class HelloController {
    // Get Method 를 받을수 있는 API
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
