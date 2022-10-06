package userdefinedconstructor;

public class Test2

{
      //step 1 variable deceleration
	  
	  int a;
	  int b;
	  int c;
	  
	  // step 2 variable initialization
	  
	 // create constructor
	 
	 Test2 ()                                      // constructor 1     
	 {
	  a=5;
	  b=10;
	  c=15;
	 
	 }
	 
	 // non static method 
	 
	 public void addition ()                    //method 1 for one operation  
	 {
	 
	 int sum=a+b+c;
	 System.out.println("Total"+ "= " + sum);
	 
	 }

     public void multiplication()                     // method 2 for multipication
	 {
	 int total=a*b*c;
	 System.out.println(total);
	 
	 }
	 
	 public static void main (String [] args)
	 
	 {
	      Test2 O1=new Test2();                           //to call non static method create object 
		  O1.addition();                        // method 1
	 
	 
	     Test2 O2=new Test2 ();
		 O2.multiplication ();                    // method 2
		 
		 
	 }



}
