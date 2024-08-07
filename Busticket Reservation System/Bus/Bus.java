package Bus;

public class Bus{
private   int busNo;
private  boolean ac;
private  int capacity;//get and set
  
  	
 Bus(int no,boolean ac,int cap){
	 this.busNo=no;
	 this.ac=ac;
	 this.capacity=cap;
 }
	
public int getCapcity(){//accessor method
	return capacity;
}	

public void setCapacity(int cap){
	this.capacity=cap;
}

public boolean isAc(){
	return ac;
}

public int getBusNo(){
	return busNo;
}

// create a method of busdetails will display

public void  displayBusInfo(){
	System.out.println("Bus no\t:"+busNo+"\t:"+"ac or nonac\t:"+ac+"\t:"+"buscapacity\t:"+capacity);
}
}