package com.telusko.Myapp;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
@Component
public class Dev {
    @Autowired
  private   Laptop laptop =new Laptop();
@Autowired
public void setLaptop(Laptop laptop){
    this.laptop=laptop;
}
    public void build(){

        laptop.compile();
        System.out.println("Working on awesome project");
    }
}

