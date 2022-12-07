package basicConcepts;

public class MainMethod 
{
	//CR - psvm
	public static void main(String[] args)
	{
		System.out.println("Inside MAIN - Welcome to Selenium Java Automation");
		addition();
		//Ram - sal - 40000
		addition(40000);
		//Ravi
		addition(30000,80000);
		//Rajesh
		addition(35000,85000);
		//subtraction();
		//multiplication();
		//division();
	}	
	//Modifier[opt]  ReturnType  Name(DataType arg1,DataType arg2,.....){ body }
	public static void addition()
	{
		System.out.println("This program is for Addition");
		int sum = 25+35;
		System.out.println("Sum of two numbers [0] :" + sum);
	}
	public static void addition(int sal) // salary calculation
	{
		int sum = 25000+sal;
		System.out.println("Sum of two numbers [1] :" + sum);
	}
	public static void addition(int bonus,int sal) // salary calculation
	{
		int sum = bonus+sal;
		System.out.println("Sum of two numbers [2] :" + sum);
	}
	
	public static void subtraction()
	{
		System.out.println("This  program is for Subtraction");
	}
	public static void multiplication()
	{
		System.out.println("This  program is for Multiplication");
	}
	public static void division()
	{
		System.out.println("This  program is for Division");
	}

}
