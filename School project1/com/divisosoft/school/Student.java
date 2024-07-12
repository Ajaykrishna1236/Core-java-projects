package com.divisosoft.school;
public class Student{

String name;

Exam exam;

 public  void examResult(){
	  
	  if(exam.markSum()<1000 && exam.markSum()>800 ){
		  
		System.out.println("Student 1 A+");
		
	  }
	  else if(exam.markSum()<800 && exam.markSum()>600){
		  System.out.println("Student 1 get A grade");
	  }
	  
	   else if(exam.markSum()<600 && exam.markSum()>300){
		  System.out.println("Student 1 get c grade");
	  }
	  else{
		  System.out.println("students 1 fail the exam");
	  }
  }
  
 
  

  

}


