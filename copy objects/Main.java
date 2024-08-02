public class Main{
	
	public static void main(String[]args){
		// create an object of Car
		
		Car car1 = new Car("chevrolet","camaro",2024);
		// create another object
		Car car2 = new Car(car1);
		
		// create a copy method
		
		//car2.copy(car1);
		
		
		System.out.println(car1);
		
		System.out.println(car1);
		
		System.out.println();
		
		System.out.println(car1.getMake());
		System.out.println(car1.getMake());
		System.out.println(car1.getYear());
	}
}