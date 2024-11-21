package com.example.global;

import org.springframework.stereotype.Component;

@Component

public class Desktop implements Computer {

    public  void compile(){

        System.out.println("compile with 414 bug");
    }
}
