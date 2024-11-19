package com.example.tesla;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {
@Autowired
Laptop top;
public  Alien(Laptop laptop){
    this.top=laptop;
}

    public  void build(){
        System.out.println("working on awesome project!");
        top.compile();
    }
}
