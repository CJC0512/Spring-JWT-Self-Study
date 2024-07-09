package com.bcd.springjwt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class MainController {


    @GetMapping("/main")
    public String mainP(){

        return "Main Controller";
    }
}
