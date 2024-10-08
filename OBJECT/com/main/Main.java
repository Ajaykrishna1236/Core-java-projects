package com.main;
import com.javabasic.*;
public class Main{
	public static void main(String[]args){
		
		A obj1 =new A();
		obj1.name="Amal";
		obj1.price=20;
		System.out.println(obj1);
		
		B b =new B();
		b.name="Amal";
		b.price=2;
		System.out.println(b);
		
	 	boolean result=obj1.equals(b);
		System.out.println(result);
		
	}
}