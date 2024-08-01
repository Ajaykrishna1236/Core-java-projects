public class Car{
	
	//attributes of a class will be hidden or priivate can be accessed only through methods getters & setters
 private  String make;
 private int year;
 private String model;
 //create an constructor
 public Car(String make,int year,String model){
	 this.setMake(make);
	 this.setmodel(model);
	 this.setYear(year);
 }
 
 public void setMake(String make){
	 this.make=make;
 }
 
  public void setmodel(String model){
	 this.model=model;
 }
 
   public void setYear(int year){
	 this.year=year;
 }
 
 public String getMake(){
	 return this.make;
 }
 	
	 public String getmodel(){
	 return this.model;
 }
  public int getYear(){
	 return this.year;
 }
 
 
}