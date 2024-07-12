public class Tdd{

public static void main(String[] args){
	
	Hotel ho = new Hotel();
	
	ho.name = "Friends Hotel";
	
	ho.color ="yellow";
	
	System.out.println(ho.color);
	
	System.out.println(ho.name);
	
	
    ho.own = new Owner();
	
	ho.own.name ="Ramesan";
	
	ho.own.printOwnerDetails();
	
	
    ho.acc = new Accountant();
	
	ho.acc.name = "Gopinath";
	
	System.out.println(ho.acc.name);
	
	
    ho.supp[0] = new Suplayer();
	
	ho.supp[0].name ="Anil";
	
	System.out.println(ho.supp[0].name);
	
	ho.supp[1] = new Suplayer();
	
	ho.supp[1].name = "Vinayan";
	
	System.out.println(ho.supp[1].name);
	
	
	ho.supp[2]= new Suplayer();
	
	ho.supp[2].name = "Rama Krishna";
	
	System.out.println(ho.supp[2].name);
	
	
	ho.supp[3] = new Suplayer();
	
	ho.supp[3].name = "Adarsh";
	
	System.out.println(ho.supp[3].name);
	
	ho.supp[4] = new Suplayer();
	
	ho.supp[4].name = "Ramesan";
	
	System.out.println(ho.supp[4].name);
	
	
	ho.supp[5] = new Suplayer();
	
	ho.supp[5].name = "Suresh kumar";
	
	System.out.println(ho.supp[5].name);
	
	
	ho.kit = new Kitchen();
	
	ho.kit.name = "camel kitchen";
	
	System.out.println(ho.kit.name);
	
    ho.kit.she[0]= new Shef();
	
	ho.kit.she[0].name= "VINAL";
	
	System.out.println("shef name is"+ho.kit.she[0].name);
	
	
	
	ho.kit.she[1]= new Shef();
	
	ho.kit.she[1].name="AmalDev";
	
	System.out.println(ho.kit.she[1].name);
	
	ho.kit.she[2]=new Shef();
	
	ho.kit.she[2].name="Arun madhav";
	
	System.out.println(ho.kit.she[2].name);
	
	
	
	ho.kit.she[3]=new Shef();
	
	ho.kit.she[3].name="Kamal";
	
	System.out.println(ho.kit.she[3].name);
	
	ho.kit.plt = new Plate();
	
	ho.kit.plt.Brandname = "Prestige";
	
	System.out.println(ho.kit.plt.Brandname);
	
	
	
	ho.was = new Washroom();
	
	ho.was.bas = new Base();

    ho.was.bas.Name = "Phillipps";

    System.out.println(ho.was.bas.Name);	
	
	ho.was.pp = new Pipe();
	
	ho.was.pp.Size = 15;
	
	System.out.println(ho.was.pp.Size);
	
	
	ho.toi = new Toilet();
	
	ho.toi.name = "Toilet";
	System.out.println(ho.toi.name);
	
	
	ho.toi.li = new Light();
	
	ho.toi.li.brandname = "Lg";
	
	ho.toi.li.war =2;
	 System.out.println(ho.toi.li.brandname);
	 System.out.println(ho.toi.li.war);
	 
	 
	 
	 ho.cas = new Cashier();
	 
	 ho.cas.Name = "Jayakrishnan";
	 
	 ho.cas.Salary =20000;
	 
	 System.out.println(ho.cas.Name);
	 
	 System.out.println("Salary: \t"+ho.cas.Salary);
	 
	 
	 ho.ac[0] =new ALternative();
	 
	 
	 ho.ac[0].Brandname = "Voltas";
	 
	 System.out.println("Brandname: \t"+ho.ac[0].Brandname);
	 
	 
	 ho.ac[1] = new ALternative();
	 
	 ho.ac[1].Brandname ="Bluestar";
	 
	 System.out.println("brandname: \t"+ho.ac[1].Brandname);
	 
	 
	 ho.ac[2] = new ALternative();
	 
	 ho.ac[2].Brandname= "LG";
	 
	 System.out.println("Brandname is :\t"+ho.ac[2].Brandname);
	 
	 
	 
	 ho.fa = new Fan();
	 
	 ho.fa.Brandname = "Bajaj";
	 
	 ho.fa.color ="Brown";
	 
	 System.out.println(ho.fa.Brandname);
	 
	 System.out.println(ho.fa.color);
	
}


}