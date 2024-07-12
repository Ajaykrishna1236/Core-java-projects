package com.divisosoft.school;
public class Tdd{

public static void main(String[] args){

  School school = new School();
 // school.name="Perambra higher Secondary school";
  school.setName("Perambra higher Secondary school");
  school.paint="Red & white";
  System.out.println(school.getName());
  System.out.println("School colour is\t:"+school.paint);
 // school.printname();
  
  school.manager = new Manager();
  school.manager.name="Viswanathan";
  System.out.println("Manager Name is\t:"+school.manager.name);
  
  school.principal = new Principal();
  school.principal.name="Praveena";
  System.out.println("Principal name is\t:"+school.principal.name);
  
  school.playground = new Playground();
  school.playground.bus[0] = new Bus();
  school.playground.bus[0].number=1;
  //System.out.println(school.playground.bus[0].number);
  
  school.playground.bus[1]= new Bus();
  school.playground.bus[1].number=2;
  //System.out.println(school.playground.bus[1].number);

  school.playground.bus[2]= new Bus();
  school.playground.bus[2].number=3;
  //System.out.println(school.playground.bus[2].number);
 
  school.playground.bus[3] = new Bus();
  school.playground.bus[3].number=4;
  //System.out.println(school.playground.bus[3].number);
  
  school.playground.bus[4] = new Bus();
  school.playground.bus[4].number=5;
  //System.out.println(school.playground.bus[4].number);
  
  school.classroom[0] = new Classroom();
  school.classroom[0].number=1;
  System.out.println("classroom number is\t:"+school.classroom[0].number);

  school.classroom[1]= new Classroom();
  school.classroom[1].number =2;
  System.out.println("classroom number is\t:"+school.classroom[1].number);

  school.classroom[2] = new Classroom();
  school.classroom[2].number =3;
  System.out.println("classroom number is\t:"+school.classroom[2].number);
  
  school.classroom[3] = new Classroom();
  school.classroom[3].number=4;
  System.out.println("classroom number is\t:"+school.classroom[3].number);
  
  school.classroom[4] = new Classroom();
  school.classroom[4].number = 5;
  System.out.println("classroom number is\t:"+school.classroom[4].number);

   for(int i=0;i<school.classroom.length;i++){
   System.out.println(school.classroom[i]);
}

   
  school.classroom[0].student[0] = new Student();
  
  school.classroom[0].student[0].name="Anilkumar";
  System.out.println(school.classroom[0].student[0].name); 

  school.classroom[0].student[1]= new Student();
  school.classroom[0].student[1].name ="Binoy";
  System.out.println(school.classroom[0].student[1].name);

  school.classroom[0].student[2] = new Student();
  school.classroom[0].student[2].name ="Jayaram";
  System.out.println(school.classroom[0].student[2].name);
 
  school.classroom[0].student[3] = new Student();
  school.classroom[0].student[3].name="Sanal";
  System.out.println(school.classroom[0].student[3].name);
 
  school.classroom[0].student[4] = new Student();
  school.classroom[0].student[4].name="Vipin";
  System.out.println(school.classroom[0].student[4].name);

  school.classroom[0].blackboard= new Blackboard();
  school.classroom[0].blackboard.colour="Black";
  System.out.println("Black board colour is\t:"+school.classroom[0].blackboard.colour);
  
  school.classroom[0].teacher[0] = new Teacher();
  school.classroom[0].teacher[0].name="Madhavan sir";
 // System.out.println("Teacher name is\t:"+school.classroom[0].teacher[0].name);
  
  school.classroom[0].teacher[1]= new Teacher();
  school.classroom[0].teacher[1].name="Janaki mis";
  //System.out.println("Teacher name is\t:"+school.classroom[0].teacher[1].name);
  
  school.classroom[0].teacher[2] = new Teacher();
  school.classroom[0].teacher[2].name="Sathian sir";
  //System.out.println("Teacher name is\t:"+school.classroom[0].teacher[0].name);
  
  school.classroom[0].teacher[3] = new Teacher();
  school.classroom[0].teacher[3].name="Ravi sir";
 // System.out.println("Teacher name is\t:"+school.classroom[0].teacher[3].name);
  
  school.classroom[0].teacher[4] = new Teacher();
  school.classroom[0].teacher[4].name = "Haritha mis";
  //System.out.println("Teacher name is\t:"+school.classroom[0].teacher[4].name);
  
  /*for(int i=0;i<school.classroom[0].teacher.length;i++){
	  
	  System.out.println(school.classroom[0].teacher[i]);
  }
 */

  
  school.classroom[0].desk[0]= new Desk();
  school.classroom[0].desk[0].number=1;
  System.out.println("Desk number is\t:"+school.classroom[0].desk[0].number);
  
  school.classroom[0].desk[1] = new Desk();
  school.classroom[0].desk[1].number=2;
  System.out.println("Desk number is\t:"+school.classroom[0].desk[1].number);
  
  school.classroom[0].desk[2] = new Desk();
  school.classroom[0].desk[2].number=3;
  System.out.println("Desk number is\t:"+school.classroom[0].desk[2].number);
  
  school.classroom[0].desk[3] = new Desk();
  school.classroom[0].desk[3].number=4;
  System.out.println("Desk number is\t:"+school.classroom[0].desk[3].number);
  
  school.classroom[0].desk[4] = new Desk();
  school.classroom[0].desk[4].number=5;
  System.out.println("Desk number is\t:"+school.classroom[0].desk[4].number);
  
  school.classroom[0].banch[0] = new Banch();
  school.classroom[0].banch[0].number=1;
  System.out.println("Banch number is\t:"+school.classroom[0].banch[0].number);
  
  school.classroom[0].banch[1] = new Banch();
  school.classroom[0].banch[1].number=2;
  System.out.println("Banch number is\t:"+school.classroom[0].banch[1].number);
  
  school.classroom[0].banch[2] = new Banch();
  school.classroom[0].banch[2].number=3;
  System.out.println("Banch number is\t:"+school.classroom[0].banch[2].number);
  
  school.classroom[0].banch[3] = new Banch();
  school.classroom[0].banch[3].number=4;
  System.out.println(school.classroom[0].banch[3].number);
  
  school.classroom[0].banch[4] = new Banch();
  school.classroom[0].banch[4].number=5;
  System.out.println(school.classroom[0]);
  
  
  school.classroom[0].student[0].exam = new Exam();
  school.classroom[0].student[0].exam.name= "SSLC Model exam 2023";
  System.out.println(school.classroom[0].student[0].exam.name);
  
  
   
  

  school.classroom[0].student[0].exam.subject[0] = new Subject();
  school.classroom[0].student[0].exam.subject[0].name="Maths";
  school.classroom[0].student[0].exam.subject[0].mark=2;
  System.out.println(school.classroom[0].student[0].exam.subject[0].name);
  System.out.println("Student0 subject mark1\t:"+school.classroom[0].student[0].exam.subject[0].mark);
  
  school.classroom[0].student[0].exam.subject[1]= new Subject();
  school.classroom[0].student[0].exam.subject[1].name="Biology";
  school.classroom[0].student[0].exam.subject[1].mark=10;
  System.out.println(school.classroom[0].student[0].exam.subject[1].name);
  System.out.println(school.classroom[0].student[0].exam.subject[1].mark);
  
  school.classroom[0].student[0].exam.subject[2] = new Subject();
  school.classroom[0].student[0].exam.subject[2].name="Chemistry";
  school.classroom[0].student[0].exam.subject[2].mark=10;
  System.out.println(school.classroom[0].student[0].exam.subject[2].name);
  System.out.println(school.classroom[0].student[0].exam.subject[2].mark);
  
  school.classroom[0].student[0].exam.subject[3] = new Subject();
  school.classroom[0].student[0].exam.subject[3].name="Physics";
  school.classroom[0].student[0].exam.subject[3].mark =6;
  System.out.println(school.classroom[0].student[0].exam.subject[3].name);
  System.out.println(school.classroom[0].student[0].exam.subject[3].mark);
  
  school.classroom[0].student[0].exam.subject[4] = new Subject();
  school.classroom[0].student[0].exam.subject[4].name="Malayalam";
  school.classroom[0].student[0].exam.subject[4].mark=12;
  System.out.println(school.classroom[0].student[0].exam.subject[4].name);
  System.out.println(school.classroom[0].student[0].exam.subject[4].mark);
  

  
  
  
   
  school.classroom[0].student[1].exam = new Exam();
   school.classroom[0].student[1].exam.subject[0]= new Subject();
   school.classroom[0].student[1].exam.subject[0].name="Maths";
   school.classroom[0].student[1].exam.subject[0].mark=100;
   System.out.println("Student1 subject mark2\t:"+school.classroom[0].student[1].exam.subject[0].name);
   System.out.println(school.classroom[0].student[1].exam.subject[0].mark);
   
   school.classroom[0].student[1].exam.subject[1] = new Subject();
   school.classroom[0].student[1].exam.subject[1].name="Biology";
   school.classroom[0].student[1].exam.subject[1].mark=160;
   System.out.println(school.classroom[0].student[1].exam.subject[1].name);
   System.out.println(school.classroom[0].student[1].exam.subject[1].mark);
   
   
   school.classroom[0].student[1].exam.subject[2] = new Subject();
   school.classroom[0].student[1].exam.subject[2].name="Chemistry";
   school.classroom[0].student[1].exam.subject[2].mark=140;
   System.out.println(school.classroom[0].student[1].exam.subject[2].name);
   System.out.println(school.classroom[0].student[1].exam.subject[2].mark);
   
   
   
   
   
   school.classroom[0].student[1].exam.subject[3] = new Subject();
   school.classroom[0].student[1].exam.subject[3].name="Physics";
   school.classroom[0].student[1].exam.subject[3].mark=180;
   System.out.println(school.classroom[0].student[1].exam.subject[3].name);
   System.out.println(school.classroom[0].student[1].exam.subject[3].mark);
   
   
   school.classroom[0].student[1].exam.subject[4] = new Subject();
   school.classroom[0].student[1].exam.subject[4].name ="Malayalam";
   school.classroom[0].student[1].exam.subject[4].mark= 155;
   System.out.println(school.classroom[0].student[1].exam.subject[4].name);
   System.out.println(school.classroom[0].student[1].exam.subject[4].mark);
   
   
   school.classroom[0].student[2].exam = new Exam();
   school.classroom[0].student[2].exam.subject[0]= new Subject();
   school.classroom[0].student[2].exam.subject[0].name="Maths";
   school.classroom[0].student[2].exam.subject[0].mark=178;
   System.out.println("Student2 Subject mark3\t:"+school.classroom[0].student[2].exam.subject[0].name);
   System.out.println(school.classroom[0].student[2].exam.subject[0].mark);
   
   
 
   school.classroom[0].student[2].exam.subject[1] = new Subject();
   school.classroom[0].student[2].exam.subject[1].name="Biology";
   school.classroom[0].student[2].exam.subject[1].mark=163;
   System.out.println(school.classroom[0].student[2].exam.subject[1].name);
   System.out.println(school.classroom[0].student[2].exam.subject[1].mark);
   
   
  
   school.classroom[0].student[2].exam.subject[2]= new Subject();
   school.classroom[0].student[2].exam.subject[2].name="Chemistry";
   school.classroom[0].student[2].exam.subject[2].mark =125;
   System.out.println(school.classroom[0].student[2].exam.subject[2].name);
   System.out.println(school.classroom[0].student[2].exam.subject[2].mark);
   
  
   school.classroom[0].student[2].exam.subject[3]= new Subject();
   school.classroom[0].student[2].exam.subject[3].name="Physics";
   school.classroom[0].student[2].exam.subject[3].mark =144;
   System.out.println(school.classroom[0].student[2].exam.subject[3].name);
   System.out.println(school.classroom[0].student[2].exam.subject[3].mark);
   
  
   school.classroom[0].student[2].exam.subject[4]= new Subject();
   school.classroom[0].student[2].exam.subject[4].name="Malayalam";
   school.classroom[0].student[2].exam.subject[4].mark=122;
   System.out.println(school.classroom[0].student[2].exam.subject[4].name);
   System.out.println(school.classroom[0].student[2].exam.subject[4].mark);
   

   
   
  school.classroom[0].student[3].exam = new Exam();
   school.classroom[0].student[3].exam.subject[0]= new Subject();
   school.classroom[0].student[3].exam.subject[0].name= "Maths";
   school.classroom[0].student[3].exam.subject[0].mark=123;
   System.out.println("Student3 subject mark4\t:"+school.classroom[0].student[3].exam.subject[0].name);
   System.out.println(school.classroom[0].student[3].exam.subject[0].mark);
   
   

   school.classroom[0].student[3].exam.subject[1]= new Subject();
   school.classroom[0].student[3].exam.subject[1].name="Biology";
   school.classroom[0].student[3].exam.subject[1].mark=150;
   System.out.println(school.classroom[0].student[3].exam.subject[1].name);
   System.out.println(school.classroom[0].student[3].exam.subject[1].mark);
   
   
   school.classroom[0].student[3].exam.subject[2]= new Subject();
   school.classroom[0].student[3].exam.subject[2].name="Chemistry";
   school.classroom[0].student[3].exam.subject[2].mark=185;
   System.out.println(school.classroom[0].student[3].exam.subject[2].name);
   System.out.println(school.classroom[0].student[3].exam.subject[2].mark);


   school.classroom[0].student[3].exam.subject[3] = new Subject();
   school.classroom[0].student[3].exam.subject[3].name="Physics";
   school.classroom[0].student[3].exam.subject[3].mark =165;
   System.out.println(school.classroom[0].student[3].exam.subject[3].name);
   System.out.println(school.classroom[0].student[3].exam.subject[3].mark);
   

   school.classroom[0].student[3].exam.subject[4]= new Subject();
   school.classroom[0].student[3].exam.subject[4].name="Malayalam";
   school.classroom[0].student[3].exam.subject[4].mark = 132;
   System.out.println(school.classroom[0].student[3].exam.subject[4].name);
   System.out.println(school.classroom[0].student[3].exam.subject[4].mark);

   school.classroom[0].student[4].exam = new Exam();
   school.classroom[0].student[4].exam.subject[0]= new Subject();
   school.classroom[0].student[4].exam.subject[0].name="Maths";
   school.classroom[0].student[4].exam.subject[0].mark= 123;
   

   System.out.println("Student 4 subject mark is\t:"+school.classroom[0].student[4].exam.subject[0].name);
   System.out.println("Student 4 subject mark is\t:"+school.classroom[0].student[4].exam.subject[0].mark);
 
   school.classroom[0].student[4].exam.subject[1]= new Subject();
   school.classroom[0].student[4].exam.subject[1].name="Biology";
   school.classroom[0].student[4].exam.subject[1].mark=185;
      System.out.println(school.classroom[0].student[4].exam.subject[1].name);
   System.out.println(school.classroom[0].student[4].exam.subject[1].mark);
   
  
   school.classroom[0].student[4].exam.subject[2] = new Subject();
   school.classroom[0].student[4].exam.subject[2].name="Chemistry";
   school.classroom[0].student[4].exam.subject[2].mark=150;
   System.out.println(school.classroom[0].student[4].exam.subject[2].name);
   System.out.println(school.classroom[0].student[4].exam.subject[2].mark);
   
   
   school.classroom[0].student[4].exam.subject[3] = new Subject();
   school.classroom[0].student[4].exam.subject[3].name="Physics";
   school.classroom[0].student[4].exam.subject[3].mark=190;
   System.out.println(school.classroom[0].student[4].exam.subject[3].name);
   System.out.println(school.classroom[0].student[4].exam.subject[3].mark);
   
  
   school.classroom[0].student[4].exam.subject[4] = new Subject();
   school.classroom[0].student[4].exam.subject[4].name="Malayalam";
   school.classroom[0].student[4].exam.subject[4].mark=145;
   System.out.println(school.classroom[0].student[4].exam.subject[4].name);
   System.out.println(school.classroom[0].student[4].exam.subject[4].mark);


 System.out.println("Student one total is\t:"+school.classroom[0].student[0].exam.markSum());
 

 System.out.println("Student two total is\t:"+school.classroom[0].student[1].exam.markSum());
 System.out.println("Student three total is\t:"+school.classroom[0].student[2].exam.markSum());
 System.out.println("Student four total is\t:"+school.classroom[0].student[3].exam.markSum());
 System.out.println("Student five total is\t:"+school.classroom[0].student[4].exam.markSum());
 System.out.println(school);

   
   

   if(school.classroom[0].student[1].exam.markSum()<1000 &&  school.classroom[0].student[1].exam.markSum()>800){
	   System.out.println("Student two get A+");
   }
   
   else if(school.classroom[0].student[1].exam.markSum()<800 && school.classroom[0].student[1].exam.markSum()>700){
	   
	   System.out.println("student two get A");
   }
   
   else if(school.classroom[0].student[1].exam.markSum()<700 && school.classroom[0].student[1].exam.markSum()>400){
	   System.out.println("Student two get B+ grade");
   }
   
   else if(school.classroom[0].student[1].exam.markSum()<400 && school.classroom[0].student[1].exam.markSum()>200){
	   System.out.println("student two get c grade");
   }
   else{
	   System.out.println(" Student two Fail the exam");
   }
   
   
  
  
  
   school.classroom[0].student[2].exam.markSum();
   if(school.classroom[0].student[2].exam.markSum()<1000 &&  school.classroom[0].student[2].exam.markSum()>800){
	   System.out.println("Student three get A+");
   }
   
   else if(school.classroom[0].student[2].exam.markSum()<800 && school.classroom[0].student[2].exam.markSum()>700){
	   
	   System.out.println("student three get A");
   }
   
   else if(school.classroom[0].student[2].exam.markSum()<700 && school.classroom[0].student[2].exam.markSum()>400){
	   System.out.println("Student three get B+ grade");
   }
   
   else if(school.classroom[0].student[2].exam.markSum()<400 && school.classroom[0].student[2].exam.markSum()>200){
	   System.out.println("student three get c grade");
   }
   else{
	   System.out.println(" Student three Fail the exam");
   }
   
   
 if(school.classroom[0].student[3].exam.markSum()<1000 && school.classroom[0].student[3].exam.markSum()>800){
	 
	 System.out.println("Student four get A+");
 }
 else if(school.classroom[0].student[3].exam.markSum()<800 && school.classroom[0].student[3].exam.markSum()>700){
	 System.out.println("Student four get A");
 }

   
   
   
   
   
   school.classroom[0].student[0].examResult();
  
  
 
 



}

}