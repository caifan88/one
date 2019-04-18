package com.caifan.one.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {
    @RequestMapping("hello")
    @ResponseBody
    public String hello(){
        return "Hello World";
    }

    @RequestMapping("login")
    public String login(){
        return "login";
    }
    @RequestMapping("successful")
    public String successful(){
        return "successful";
    }

    @RequestMapping("index")
    public String index(){
        return "index";
    }

    @RequestMapping(value = "one",method = RequestMethod.POST)
    public String loginOne(@RequestParam(value = "name")String name,
                            @RequestParam(value = "password")String password){
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(name, password);
        token.setRememberMe(true);// 默认不记住密码
        try {
            subject.login(token);
        } catch (Exception e) {
            e.printStackTrace();
            return "{\"Msg\":\"您的账号或密码输入错误\",\"state\":\"failed\"}";
        }
        return "index";
    }



}
