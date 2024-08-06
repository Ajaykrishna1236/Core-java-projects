import java.util.Scanner;
public class Exception{
public static void main(String[]args){
	
	// create an object of Sacnner
	
	try{
			 
	Scanner scanner =new Scanner(System.in);
	System.out.println("Enter the whole number to divide");
	int x=scanner.nextInt();
	
	System.out.println("Enter the whole number to divide:");
	int y=scanner.nextInt();
	int z=x/y;
	System.out.println("result::"+z);
		
	}
	catch(ArithmeticException e){
		System.out.println("You can't divided by zero");
	}
 
	
	
}
}