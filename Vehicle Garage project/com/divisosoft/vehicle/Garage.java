package com.divisosoft.vehicle;
public class Garage{

private String garagename;
private int phonenumber;



 public  void  setname(String garagename){
	   
	   this.garagename=garagename;
   }
   
 public   String getname(){
	 
	   return this.garagename;
   }
   
Vehicle[]vehicle = new Vehicle[10];


public void showBike(){
	
	for(int i=0;i<vehicle.length;i++){
		
		if(vehicle[i] instanceof Bike){
			
			Bike bike =(Bike)vehicle[i];
			System.out.println(bike.colour+" "+bike.numberofmirror);
		}
	
	}
}









public String toString(){
	String ak="";
	
	for(int i=0;i<vehicle.length;i++){
		
		ak+=vehicle[i];
	}
	
	return   "\t:"+ak+"\t:"+garagename+"\t:"+phonenumber;
}





public void setphone(int phonenumber){
	
	this.phonenumber=phonenumber;
}

public int getphone(){
	
  return this.phonenumber;
}






 

}