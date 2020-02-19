package com.august.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitController {

    @RequestMapping("/git")
    public String git() {
        return "123";
    }
}
