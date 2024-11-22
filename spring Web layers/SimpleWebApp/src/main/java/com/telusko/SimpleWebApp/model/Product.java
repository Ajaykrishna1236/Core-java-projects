package com.telusko.SimpleWebApp.model;

import org.springframework.stereotype.Component;


@Component
public class Product {

    private int prodId;
    private String prosName;
    private int prodPrice;

    public Product() {

    }

    public Product(int prodId, String prosName, int prodPrice) {
        this.prodId = prodId;
        this.prosName = prosName;
        this.prodPrice = prodPrice;
    }


    public int getProdId() {
        return prodId;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public String getProsName() {
        return prosName;
    }

    public void setProsName(String prosName) {
        this.prosName = prosName;
    }

    public int getProdPrice() {
        return prodPrice;
    }

    public void setProdPrice(int prodPrice) {
        this.prodPrice = prodPrice;
    }




}
