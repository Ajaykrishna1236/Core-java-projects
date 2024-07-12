package com.divisosoft.cricket.cricket;
import  com.divisosoft.cricket.cricket.India;
import  com.divisosoft.cricket.cricket.Australia;
import  com.divisosoft.cricket.cricket.Srilanka;

public class Cricket{

public String name;

public India  ind;
 
public Australia aus;
 
 public Srilanka sri;


public String toString(){
	
		String tem="";
		
 
        String grp="";
		
		String sr="";
		
		
		for(int i=0;i<sri.hb.length;i++){
			
			
			sr += sri.hb[i];
		}
		

       for(int i=0;i<aus.tea.length;i++){
		   
		   grp +=aus.tea[i];
	   }		
	   
	
	
	
	for(int i=0;i<ind.mem.length;i++){
		
		tem += ind.mem[i];
	}
	
	
	return name+"\n"+tem+"\n"+grp+"\n"+sr;
}
	


}