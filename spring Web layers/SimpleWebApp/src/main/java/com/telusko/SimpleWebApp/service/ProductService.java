package com.telusko.SimpleWebApp.service;

import com.telusko.SimpleWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import  java.util.List;


@Service
public class ProductService {

    List<Product>products = Arrays.asList(new Product(101,"samsung",10000),
            new Product(102,"Iphone",55000),new Product(103,"Canon",50000));

    public  List<Product> getProducts(){

        return products;
    }
}
