import java.util.ArrayList;
public class Animal{
public static void main(String[]args){
// create an Animal Arrya

String[] animal={"tiget","Cat","Dog","Elephant"};
//to print using enhance Loop

for(String x:animal){
	System.out.println(x);
}



// delcare an Collection of bird

ArrayList<String>bird=new ArrayList<String>();
bird.add("parrot");
bird.add("crow");
bird.add("hen");

System.out.println();
// to print list element using enhance Loop

for(String j:bird){
	System.out.println(j);
}

}
}