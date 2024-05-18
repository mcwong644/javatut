package com.mcwong.FirstSpring;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "<H2>Hello World!</H2>";
    }

    @PostMapping("/hello")
    public String helloPost(@RequestBody String name) {
        return "<H2>Hello World! "+ name + "</H2>";
    }

}
