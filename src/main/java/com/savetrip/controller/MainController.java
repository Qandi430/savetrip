package com.savetrip.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MainController {
    @RequestMapping("/")
    public static String main(){
        return "layout/main";
    }

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String loginByGet(){
        return "layout/login";
    }

}
