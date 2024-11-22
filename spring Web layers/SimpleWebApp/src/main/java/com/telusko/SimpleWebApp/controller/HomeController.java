package com.telusko.SimpleWebApp.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {

    @RequestMapping("/")

    public String greet(){
        return "Welcome to telusko!!!";

    }
@RequestMapping("/About")
public  String about(){

return  "We don't teach,we are educate";

}

}
