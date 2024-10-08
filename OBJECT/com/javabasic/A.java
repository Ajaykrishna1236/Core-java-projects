package com.javabasic;
public class A{
public  String name;
public int price;


public String  toString(){
	return ":"+name+":"+price;
}


public boolean equals(B b){
	return this.name.equals(b.name)&& this.price==b.price;
}

}