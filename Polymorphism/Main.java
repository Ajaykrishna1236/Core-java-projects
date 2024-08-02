public class Main{
public static void main(String[]args){

// polymorphism:The ability of an object to identify the as more than one pbject
  Car car = new Car();
  Bike bike=new Bike();
  Bycycle bycycle = new Bycycle();
  
  // to store all of these object with in array
  
  
   Vehicle[]racers={car,bike,bycycle};
   
   //car.go();
   //bike.go();
   //bycycle.go();// this is proper way 
   // create enhance loop 
   for(Vehicle x:racers){
	   x.go();
   }

} 

}