package com.Ajus.simpleWebApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.plaf.PanelUI;


@RestController
public class LoginController {

    @RequestMapping("/Login")
    public  String login(){
        return "Login Page ";
    }


}



