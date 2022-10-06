package constructorwithparameters;

public class test1

{

	//step 1 variable decleration 
	
	int a;
	int b;
	
	// step 2 variable initialization
	
	test1 ()         // without parameter constructor
	{
		a=10;
		b=20;
		
	}
	
	test1 (int c, int d)
	
	{
		a=c;
		b=d;
		
		
	}
	//usage        // non static method
	
	public void m1()
	{
		
		int sum= a+b;
		System.out.println(sum);
		
		
	}
	
	
	
	// constructor with parameters
	
	public static void main(String[] args)
	
	{
	
		test1 O1=new test1(18, 10);
		O1.m1();
		
		test1 O2= new test1 (20,20);
		O2.m1();
		
		test1 O3=new test1 (40,50);
		O3.m1();
	}
	
	
	
	
	
	
	
}
