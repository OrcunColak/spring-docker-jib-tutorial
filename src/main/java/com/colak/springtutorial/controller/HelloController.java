package com.colak.springtutorial.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    // http://localhost:8080/api/hello
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }

    // POST method example
    @PostMapping("/hello")
    public String sayHelloPost(@RequestBody String name) {
        return "Hello, " + name + "!";
    }
}
