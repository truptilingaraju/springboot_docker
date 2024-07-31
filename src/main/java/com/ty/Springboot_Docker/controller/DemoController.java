package com.ty.Springboot_Docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/")
    public String home(){
        return "Welcome Home";
    }

    @GetMapping("/message/{name}")
    public String message(@PathVariable String name){
        return "welcome to springboot project" + name;
    }

}
