public class Fish implements Prey,Predator{

// overriide the flee method and hunt method

public void flee(){
	System.out.println("This fish is hunting smaller fish");
}

public void hunt(){
	System.out.println("This fish is fleeing from a larger fish");
}

}