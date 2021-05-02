package com.jarvan.springbootdemodocker.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {

    @ResponseBody
    @RequestMapping("/")
    public String testDocker() {
        return "hello world~";
    }
}
