public class Hotel{
// create an attribute of the class

private String hotelName;
private String ownerName;
private String location;

// Declare an food array
Food[]food = new Food[3];

// create a constructor
public Hotel(String hotelName,String ownerName,String location){
	this.sethotelName(hotelName);
	this.setownerName(ownerName);
	this.setlocation(location);
}

// setters & getters

public void sethotelName(String hotelName){
	this.hotelName=hotelName;
}
public String gethotelName(){
	return this.hotelName;
}

public void setownerName(String ownerName){
	this.ownerName=ownerName;
}

public String getownerName(){
	
	return this.ownerName;
}

public void setlocation(String location){
	
	this.location=location;
}
public String getlocation(){
	return this.location;
}

}