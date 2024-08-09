import java.util.HashMap;

public class Main{
public static void main(String[]args){
	
HashMap<String,String>countries =new HashMap<String,String>();	
//add A key and Valu

countries.put("India","New Delhi");
countries.put("Russia","Moscow");
countries.put("USA","washington Dc");
countries.put("china","beijing");

// remove method

//countries.remove("USA");

countries.remove("china");

// get() method

countries.get("Russia");

// add clear() method
countries.clear();


// add size() method

countries.size();

// replace method



countries.replace("USA","Detroyit");

// containskey() method


//add containsKey() method to check the key in HashMap
countries.containsKey("USA");
System.out.println(countries.containsValue("USA"));

// to add Foreach loop

for(String x:countries.keySet()){
	System.out.println(x);
}



}
}