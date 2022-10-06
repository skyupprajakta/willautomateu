package userdefinedconstructor;

public class Test1

{

// step 1 variable decleration

      int a;                                          // always a non static variables
	  int b;
	  
	  
//step2 variable initialization

// to initialization of variable we create constructor        // use 1
// the name of constructor is always the name of class	  
	  
	  Test1 ()                                               // constructor without parameters
	  
	  {
	    a=10;                           
		b=20;
	  
	  }
	  
// non static method	  
	  
	  public void addition()
	  {
	  
	  int sum= a+b;
	  
	  System.out.println(sum);
	  
	  }

// to call non static method create main method

     public static void main (String []args)

     { 
	   Test1 O1=new Test1();
	   
	   O1.addition ();

     }   

}