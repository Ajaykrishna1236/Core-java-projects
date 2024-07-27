public class Main{
public static void main(String []args){

// create an object of Car
// >>>type>> <<Reference variabe>>  << equal to operator>> <<new key word>> <<class name>> <<open&close ()>>
 
  Mobile myMob = new Mobile();
  
  // if we have a class that put to create multiple objects example 
  
 // create another object of Mobile
   Mobile myMob1 = new Mobile();
  
  
  
  // we can access data from heap to help reference variable like mymob to call
  // to print all attributes of Mobile
   System.out.println(myMob.colour);
   System.out.println(myMob.brand);
   System.out.println(myMob.model);
   System.out.println(myMob.price);
   
   // to call method from Mobile class
   myMob.call();
   myMob.takePhoto();
   
   System.out.println();
   
   System.out.println(myMob1.colour);
   System.out.println(myMob1.brand);
   System.out.println(myMob1.model);
   System.out.println(myMob1.price);
   
   myMob.call();
   myMob.takePhoto();
   
 
}

}