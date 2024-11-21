package com.example.global;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev  {
@Autowired
@Qualifier("laptop")
    Computer    com;

    public  void build(){

        com.compile();
        System.out.println("working on awesome project");
    }
}
