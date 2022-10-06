package defaultconstructor;

public class Test1 
{

	int a;
	int b;
	
	public void m1()
	{
		a=5;
		b=20;
		
		int sum=a+b;
		
		System.out.println(sum);
		
	}
	
	public static void main(String[] args) 
	
	{
	Test1 O1=new Test1();
	O1.m1();
	
	}
	
	
	
	
	
}
