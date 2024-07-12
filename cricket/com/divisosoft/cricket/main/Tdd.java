package com.divisosoft.cricket.main;
import com.divisosoft.cricket.cricket.*;
import com.divisosoft.cricket.group.*;

public class Tdd{

public static void main(String[]args){
 

Cricket cric = new Cricket();

cric.name = "Icc Cricket worldcup";

//System.out.println(cric.name);

  cric.ind = new India();
  
  
  cric.ind.coachname = "Rahuldravid";
  
  System.out.println(cric.ind.coachname);
  
  
  cric.ind.mem[0] = new Member();
  
  cric.ind.mem[0].name="Rohit";
  
  //System.out.println(cric.ind.mem[0].name);
  
  cric.ind.mem[1] = new Member();
  
  cric.ind.mem[1].name ="Shubman";
  
 // System.out.println(cric.ind.mem[1].name);
  
  cric.ind.mem[2] = new Member();
  
  cric.ind.mem[2].name = "Virat";
  
  //System.out.println(cric.ind.mem[2].name);
  
  cric.ind.mem[3] = new Member();
  
  cric.ind.mem[3].name ="Kl Rahul";
  
  //System.out.println(cric.ind.mem[3].name);
  
  
  cric.ind.mem[4]= new Member();
  
  cric.ind.mem[4].name = "Sreyas";
  

  cric.aus = new Australia();
  
  cric.aus.coachname="Danielvettori";
  
  System.out.println(cric.aus.coachname);
  
   cric.aus.tea[0] = new Team();
   
   cric.aus.tea[0].name ="Warner";
   
  // System.out.println(cric.aus.tea[0].name);
  
  
  cric.aus.tea[1] = new Team();
  
  cric.aus.tea[1].name= "Head";
  
  //System.out.println(cric.aus.tea[1].name);
  
  
  cric.aus.tea[2] = new Team();
  
  cric.aus.tea[2].name ="Smith";
  
  //System.out.println(cric.aus.tea[2].name);
  
  cric.aus.tea[3] = new Team();
  
  cric.aus.tea[3].name ="Maxwell";
  
  //System.out.println(cric.aus.tea[3].name);
  
  
  cric.aus.tea[4]= new Team();
  
  cric.aus.tea[4].name ="Labushachane";
  
 // System.out.println(cric.aus.tea[4].name);
 
   
   cric.sri = new Srilanka();
   
   cric.sri.coachname ="markBoucher";
   
    System.out.println(cric.sri.coachname);
	
	cric.sri.hb[0]= new Hub();
	cric.sri.hb[0].name="Tharanga";
	
	//System.out.println(cric.sri.hb[0].name);
  
  
    cric.sri.hb[1]= new Hub();

    cric.sri.hb[1].name="Dilshan";

     //System.out.println(cric.sri.hb[1].name);	
	 
	 cric.sri.hb[2] = new Hub();
	 
	 cric.sri.hb[2].name="Sangakkara";
	 
	 //System.out.println(cric.sri.hb[2].name);
	 
	 cric.sri.hb[3]= new Hub();
	 
	 cric.sri.hb[3].name ="Jayawardana";
	 
	 //System.out.println(cric.sri.hb[3].name);
	 
	 
	 cric.sri.hb[4] = new Hub();
	 
	 cric.sri.hb[4].name="Samaraweera";
	 
	// System.out.println(cric.sri.hb[4].name);
	 
	 
  
  
  
  System.out.println(cric);
  
  
  
  
  
  
 
}

}