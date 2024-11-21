package com.example.global;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component


public class Laptop implements Computer {

    public  void compile(){

        System.out.println("compile with 4145 bug");
    }
}
