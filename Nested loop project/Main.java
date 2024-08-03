import java.util.Scanner;
public class Main{
public static void main(String[]args){

//create an object of Scanner
Scanner scan =new Scanner(System.in);
int rows;
int coloumn;
String symbal;
System.out.println("Enter the number of Rows");
rows=scan.nextInt();
System.out.println("Enter the number of coloumn");
coloumn=scan.nextInt();
System.out.println("Enter number of symbal");
symbal=scan.next();
for(int i=1;i<rows;i++){
	
	System.out.println();
	for(int j=1;j<coloumn;j++){
		System.out.print(symbal);
	}
}

}
}