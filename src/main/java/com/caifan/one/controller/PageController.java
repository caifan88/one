package com.caifan.one.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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

    @RequestMapping("one")
    public String loginOne(){

        return "index";
    }



}
