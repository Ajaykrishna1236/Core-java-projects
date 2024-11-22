package com.telusko.SimpleWebApp.controller;


import com.telusko.SimpleWebApp.model.Product;
import com.telusko.SimpleWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class ProductController {

    @Autowired
    ProductService service;
@RequestMapping("/product")
    public List<Product> getProducts(){

        return service.getProducts();
    }
}
