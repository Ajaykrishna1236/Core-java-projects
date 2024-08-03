public class Main{
public static void main(String[]args){
	// java String methods
	// equals methods
	
	//declare an String variable name
	String name ="Bro";
	 boolean result=name.equals("Bro");
	 System.out.println(result);
	 
	 // .length method 
	int sum=name.length();
	System.out.println(sum);
	
	// charAt(index) method
	
	          char text=name.charAt(1);
			  System.out.println(text);
			  
	// .indextOf method
	int n=name.indexOf("B");
	System.out.println(n);
	
	// isEmpty() method//to check if variable null or fill;this will return boolean value

	boolean b=name.isEmpty();
	System.out.println(b);
	
	
	// toUpperCase() method to convert the string value int capital letter,this will return String value
	String a=name.toUpperCase();
	System.out.println(a);
	
	// toLowerCase(),convert capital letter int small letter
	String l=name.toLowerCase();
	System.out.println(l);
	// to add .trim() method to avoid the space 
	String place ="             Valayam          ";
	
	String trim=place.trim();
	System.out.println(trim);
	
	
	// last method is replace(old char,new char) old character replace and add new character int old space
	
	String y=name.replace('B','g');
	System.out.println(y);
	
}
}