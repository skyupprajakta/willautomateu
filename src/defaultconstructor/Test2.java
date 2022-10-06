package defaultconstructor;

public class Test2 

{
	
	public void m2()    // non static method 
	{
		
	int a=5;
	int b=10;
	
	int sum= a+b;
	
	System.out.println(sum);
	
	}

	public static void main(String[] args)    //main method
	
	{
	
		Test2 O1=new Test2();      // Test 2 default constructor
		O1.m2();
		
	}
	
	
	
}
