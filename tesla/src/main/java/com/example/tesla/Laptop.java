package com.example.tesla;
import org.springframework.beans.factory.annotation.Autowired;
import  org.springframework.stereotype.Component;
@Component
public class Laptop {

    @Autowired
    Mouse mouse;


    public  void compile(){

        System.out.println("compile with  404 Errors");
        mouse.click();
    }
}
