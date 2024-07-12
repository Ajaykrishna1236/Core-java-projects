package com.divisosoft.school;
public class Exam{

String name;

Subject[]subject = new Subject[5];

public int markSum(){
	
	int total=0;
	double average=0;
	
	for(int i=0;i<subject.length;i++){
		
		total += subject[i].mark;
		

		
		
	
	}
	
	return total;
}




}