package Bus;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;	
public class Booking{
	String passengerName;
	int busNo;
    Date date;

    Booking(){
		Scanner scanner  =new Scanner(System.in);
		System.out.println("Enter the name of passenger:");
		passengerName=scanner.next();
		System.out.println("Enter the busNo:");
		busNo=scanner.nextInt();
		System.out.println("Enter the date: dd-mm-yyyy");
		String dateInput=scanner.next();
		SimpleDateFormat dateFormat =new SimpleDateFormat("dd-MM-yyyy");
	
		try{
			date=dateFormat.parse(dateInput);
		}catch(ParseException e){
			e.printStackTrace();
		}
		}
		
		public boolean isAvailabe(ArrayList<Booking>book,ArrayList<Bus>bus){
			int capacity=0;
			for(Bus busex:bus){
				if(busex. getBusNo()== busNo)
					capacity=busex.getCapcity();
			}
			int booked=0;
			for(Booking boo:book){
				if(boo.busNo== busNo && boo.date.equals(date)){
					booked++;
				}
			}
			return booked<capacity?true:false;
		}
}