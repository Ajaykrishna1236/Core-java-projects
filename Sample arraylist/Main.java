import java.util.ArrayList;
public class Main{
	public static void main(String[]args){
		
		// create vehicle Arraylist
		
		ArrayList<String>vehicle=new ArrayList<String>();
		// Add elements of arrayList
		vehicle.add("Bus");
		vehicle.add("Car");
		vehicle.add("Bike");
		vehicle.add("Train");
		vehicle.add("flight");
		// to use set() method
		vehicle.set(2,"jeep");
		
		// to remove some element to use remove() methods
		vehicle.remove(4);
		
		
		
		
		// to print all element to use for loop
		for(int i=0;i<vehicle.size();i++){
			System.out.println(vehicle.get(i));
		}
		
	}
}
