public class Car{
	
private	String model;
private	String make;
private	int year;

// create a constructor
public Car(String model,String make,int year){
	this.setmodel(model);
    this.setMake(make);
	this.setYear(year);
}


public Car(Car x){
	this.copy(x);
}

// implement setters & getters

public void setMake(String make){
	this.make=make;
}

public String getMake(){
	return  this.make;
}

public void setmodel(String model){
	this.model=model;
}

public String getModel(){
	return this.model;
}

public void setYear(int year){
	this.year=year;
	
}

public int getYear(){
	return this.year;
}

public String toString(){
	
	return make+model+year;
}

// define copy method
public void copy(Car x){
	
	this.setMake(x.getMake());
	this.setmodel(x.getModel());
	this.setYear(x.getYear());
}

}