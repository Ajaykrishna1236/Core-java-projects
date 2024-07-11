package com.divisosoft.fridge;
public class Tdd{
	
	
	public static void main(String []args){
		
		Fridge fridge = new Fridge();
		
		fridge.name ="Gotharage";
		
		fridge.colour ="Red";
		
	   
		
		System.out.println(fridge.colour);
		
		System.out.println(fridge.name);
	     
		fridge.tray = new Tray();
		
		fridge.tray.name="Section Tray";
		
	    System.out.println("Tray name is"+"\t:"+fridge.tray.name);
		
	    fridge.tray.fruit[0] = new Orange();
		
		fridge.tray.fruit[0].name ="Orange1";
		
		//System.out.println(fridge.tray.fruit[0].name);
	
	    fridge.tray.fruit[1] = new Apple();
	   
	    fridge.tray.fruit[1].name ="Apple1";
	    //System.out.println(fridge.tray.fruit[1].name);
		
		fridge.tray.fruit[2] = new Mango();
		fridge.tray.fruit[2].name ="Mango1";
		//System.out.println(fridge.tray.fruit[2].name);
		
		
		fridge.tray.fruit[3] = new Orange();
		fridge.tray.fruit[3].name ="Orange2";
		//System.out.println(fridge.tray.fruit[3].name);
		
		fridge.tray.fruit[4]= new Apple();
		fridge.tray.fruit[4].name="Apple2";
		//System.out.println(fridge.tray.fruit[4].name);
		
		fridge.tray.fruit[5] = new Mango();
		fridge.tray.fruit[5].name="Mango2";
		//System.out.println(fridge.tray.fruit[5].name);
		
		 fridge.tray.fruit[6]= new Apple();
		 fridge.tray.fruit[6].name="Apple3";
		// System.out.println(fridge.tray.fruit[6].name);
		 
	    fridge.tray.fruit[7]= new Mango();
		fridge.tray.fruit[7].name ="Mango3";
		//System.out.println(fridge.tray.fruit[7].name);

		fridge.tray.fruit[8] = new Orange();
		fridge.tray.fruit[8].name = "Orange3";
		//System.out.println(fridge.tray.fruit[8].name);
			
		System.out.println("Fridge store");
		
		
		
		
		for(int i=0;i<fridge.tray.fruit.length;i++){
			
			System.out.println(fridge.tray.fruit[i]);
	}
		
		 System.out.println("Apple Fridge");
		int num=0;
		
		 
	   for(int i=0;i<fridge.tray.fruit.length;i++){ 
		   
		   if(fridge.tray.fruit[i] instanceof Apple){
			fridge.aplefridge[num]=(Apple)fridge.tray.fruit[i];
			System.out.println(fridge.aplefridge[num]);
			num++;	
		   }

		   
		  }
		  
		  System.out.println("Mango Fridge");
			for(int i=0;i<fridge.tray.fruit.length;i++){
			int sum =0;
			if(fridge.tray.fruit[i] instanceof Mango){
			   
			  fridge.mangofridge[sum] =(Mango)fridge.tray.fruit[i];
			  System.out.println(fridge.mangofridge[sum]);
			   sum++;
			   
		   } 
	   }
		 
		 System.out.println("Orange fridge"); 
		 
		 int value=0;
		 
		 for(int i=0;i<fridge.tray.fruit.length;i++){
			 
			 if(fridge.tray.fruit[i] instanceof Orange){
				 
				 fridge.orangefridge[value] =(Orange)fridge.tray.fruit[i];
				 System.out.println(fridge.orangefridge[value]);
				 value++;
			 } 
		 }	  
	}
}

       
	
		
	
