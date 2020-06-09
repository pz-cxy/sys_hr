package com.pz.controller;


import com.pz.model.RespBean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class LoginController {

    @GetMapping("/login")
    public RespBean login(){
        return RespBean.error("尚未登陆，请登陆!");
    }
}
