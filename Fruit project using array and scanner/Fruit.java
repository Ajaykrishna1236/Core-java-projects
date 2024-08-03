import java.util.ArrayList;
import java.util.Scanner;
public class Fruit{
public static void main(String[]args){
	
	// create an object of Scanner

	
 // to add element by scanner int ArrayList to use for while loop

 System.out.println("Adding the element int list");
 ArrayList<String>fruit =new ArrayList<String>();
 
 boolean x=true;
while(x){
	boolean n=false;
 	Scanner scanner =new Scanner(System.in);
	String element=scanner.nextLine();
	fruit.add(element);
	if(element==""){
       x=false;
	}



}
	

	
	// to set element of the ArrayList
		
	fruit.set(2,"Pinaple");
	
	// To remove element from this List
	
	fruit.remove(0);
	

	
// to print all Arraylist elements
		for(int i=0;i<fruit.size();i++){
		System.out.println(fruit.get(i));
	}
// to find howmany elements into the Arraylist size();
	
	System.out.println(fruit.size());
	
	
	

	
}


	
	
}
