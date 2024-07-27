public class Main{
	
	String name;
	int age;
	
   public Main(String name,int age){
	   	this.name=name;
		this.age=age;
	}
	
	// create a drink method
	
public 	void drink(){
		System.out.println(this.name+"\t:"+"you are drinking water!");
	}
	
	
	// create an eat methode to give second object
	
	public void eat(){
		System.out.println(this.name+"\t:"+"you are eating food!");
	}
	
	public static void main(String []args){
		
		Main main1 = new Main("Ajay",27);
	    Main main2 = new Main("vinayakan",35);
		System.out.println(main1.name+"\n"+main1.age);
		System.out.println(main2.name+"\n"+main2.age);
		
		main1.drink();
		main2.eat();
		
	
		
		
	}
}