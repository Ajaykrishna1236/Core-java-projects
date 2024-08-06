import java.io.File;
public class Main{
public static void main(String[]args){
	
	// create an object File
	File file =new File("secret-message.txt");
	// ot add exist method,getPath(),getAbsolutePath(),isFile(),delete();
	
	if(file.exists()){
		System.out.println("The file exist");
		System.out.println(file.getPath());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.isFile());
		System.out.println(file.delete());
	}
	else{
		System.out.println("The file doe'nt exist");
	}
	
}
}