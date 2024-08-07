package Bus;
import java.util.Scanner;
import java.util.ArrayList;

public class Main{
public static void main(String[]args){

 ArrayList<Bus>bus=new ArrayList<Bus>();//create a Bus list
 ArrayList<Booking>book=new ArrayList<Booking>();
 
 bus.add(new Bus(1,true,2));
 bus.add(new Bus(2,false,46));
 bus.add(new Bus(3,true,50));
 
int userOption=1;
// create an objetc of scanner class
Scanner scanner =new Scanner(System.in);

// dalare a enhance loop
for(Bus b:bus){
	b.displayBusInfo();
}

while(userOption==1){
	
	System.out.println("Enter 1 to book and 2 exit"); 
    userOption=scanner.nextInt();
	if(userOption==1){
		//create a booking object
		Booking booking =new Booking();
	    if(booking.isAvailabe(book,bus)){
		book.add(booking);
		System.out.println("Your booking is confirmed");
		}
		else{
			System.out.println("sry bus is full:try another bus");
		}
	}
}

}
}