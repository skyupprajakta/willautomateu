package constructorwithparameters;

public class test2 

{
    //step 1 variable decleration
	
	int Num1;                      // non static variables
	int Num2;
	
	// variable initialization
	
	test2 ()
	
	{
			Num1=10;
			Num2=15;
					
	}
	
	test2 (int a, int b)
	{
		Num1=a;
		Num2=b;
		
	}

 public void m1()
 {
	 
	 int sum= Num1+Num2;           
	 System.out.println(sum);
	 
	 
	 int mul=Num1*Num2;
	  System.out.println(mul);                 // we can perform different action in one method 
	  
	  int div= Num1/Num2;
	  System.out.println(div);

 }

 
 public void m2()
 {
	 
	 int sum2= Num1+Num2;           
	 System.out.println(sum2);
	 
	 
	 int mul2=Num1*Num2;
	  System.out.println(mul2);                 // we can perform different action in one method 
	  
	  int div2= Num1/Num2;
	  System.out.println(div2);

 }



public static void main(String[] args) 
{
   test2 O1=new test2(20,20);                 // same object 2 methods are stored in
   O1.m1();
	
   
   test2 O2=new test2(80,20);
   O2.m2();
 



}





}




