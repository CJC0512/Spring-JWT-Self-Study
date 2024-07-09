package com.bcd.springjwt.controller;

import com.bcd.springjwt.dto.JoinDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JoinController {

    @PostMapping("/join")
    public String joinProcess(JoinDTO joinDTO) {


        return "ok";
    }
}
