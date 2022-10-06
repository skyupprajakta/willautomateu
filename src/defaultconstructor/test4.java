package defaultconstructor;

public class test4
{


// step 1 variable declecation

    int a;
	int b;
	String Name;
	
// step 2 variable initialization

// create constructor of class name

    test4 ()
    {
	a=20;
	b=20;
	Name="Prajakta";
	
	}	
	
//usage

// create non static method

public void addition()
{
 int sum = a+b;
 
 System.out.print(sum + " " + Name); //  type syso then press ctrl +space button
 System.out.print(sum);

}

public static void main(String[] args)  //type main then press control +space 
{
	test4 O3=new test4();
	O3.addition ();
}
}
