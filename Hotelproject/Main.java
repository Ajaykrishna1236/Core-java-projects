import java.util.Scanner;
public class Main{

public static void main(String[]args){

// create an object of Hotel
Hotel hotel =new Hotel("Paragon","T Vinod","Kozhikode");
//call get method
hotel.gethotelName();
hotel.getownerName();
hotel.getlocation();
//print hotel details
System.out.println(hotel.gethotelName());
System.out.println(hotel.getownerName());
System.out.println(hotel.getlocation());

// create an object of Scanner
Scanner scanner =new Scanner(System.in);
System.out.println("Enter (1=Meals)  or (2=Biriyani) (3=porotta)");
int choice =scanner.nextInt();
if(choice==1){
	hotel.food[0]=new Meals();
	hotel.food[0].ready();
}
else if(choice==2){
	hotel.food[1]=new Biriyani();
	hotel.food[1].ready();
	
}
else if(choice==3){
	hotel.food[2]=new Porotta();
	hotel.food[2].ready();
}
else{
	System.out.println("your choice is invalid");
	hotel.food[0]=new Food();
	hotel.food[0].ready();
}





}
}