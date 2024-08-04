import java.util.*;
public class Backery{
public static void main(String []args){
	
	// 2D ArrayList =a dynamic list of lists
	// we can change the size of these list during runtime
	
	// create an 2d ArrayList 
ArrayList<ArrayList<String>> grocery = new ArrayList<ArrayList<String>>();
	
	
	//create an ArrayList 
	ArrayList<String>backery=new ArrayList<String>();
	//add elements into the list
	backery.add("pasta");
	backery.add("bread");
	backery.add("cake");
	System.out.println(backery);
	
	// create an another list
	
	ArrayList<String>coolbar=new ArrayList <String>();
	coolbar.add("mango juice");
	coolbar.add("grape juice");
	coolbar.add("Apple juice");
	
	// print the list elements
	
	System.out.println(coolbar);
	
	// create an another list 
	
	ArrayList<String>icecream=new ArrayList<String>();
	//add elements int to the icecream list
	
	icecream.add("vanila");
	icecream.add("straberry");
	icecream.add("chocalate");
	System.out.println(icecream);
	System.out.println("jsdak");
	grocery.add(backery);
	grocery.add(coolbar);
	grocery.add(icecream);
	
	System.out.println(grocery);
	
	
}
}