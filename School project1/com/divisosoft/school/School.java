package com.divisosoft.school;
public class School{

private String name;
String paint;
Manager manager;
Principal principal;
Playground playground;
Classroom[]classroom = new Classroom[5];

public void setName(String name){
	this.name= name;
}

public String getName(){
	return name;
}

public String toString(){
	
	String kl="";
	
	for(int i=0;i<classroom[0].teacher.length;i++){
		
		kl += classroom[0].teacher[i];
	}
	
	return "\t:"+kl;
}



}