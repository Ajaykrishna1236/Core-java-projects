package com.divisosoft.school;
public class Classroom{
int number;
Blackboard blackboard;
Teacher [] teacher = new Teacher[5];
Student[]student = new Student[5];
Desk[]desk = new Desk[5];
Banch[] banch = new Banch[5];



public String toString(){
return ""+"classroom number is\t:"+number;
}


}