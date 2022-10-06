package userdefinedconstructor;

public class Test3
{


// step 1 variable declecation

    int a;
	int b;
	//String Name;
	
// step 2 variable initialization

// create constructor of class name

    Test3 ()
    {
	a=20;
	b=20;
	//Name="Prajakta";
	
	}	
	
//usage

// create non static method

 public void addition()
 {
  int sum = a+b;
 
 System.out.println(sum);

 }
 
 public static void main(String[] args)
 
 {
	Test3 O1=new Test3();
	O1.addition();
}

}