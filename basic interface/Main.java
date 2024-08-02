public class Main{
public static void main(String[]args){

// create an object of Rabbit

Rabbit rabit =new Rabbit();
//call that method flee

rabit.flee();	

// create an hawk object
Hawak hawk = new Hawak();
//call hunt method
hawk.hunt();

hawk.flee();

// lets create Fish object
Fish fish = new Fish();
fish.hunt();
fish.flee();
}
}