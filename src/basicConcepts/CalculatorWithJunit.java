package basicConcepts;

import org.junit.Test;

public class CalculatorWithJunit
{
	//We need Junit to run the individual methods or to run all methods
	//Junit is a java project , it will be available in web as a jar file , we have to add this junit jar file as a reference to our project
	@Test
	public  void addition() //java method , after adding @Test it will be treated as a TestCase by Junit
	{
		System.out.println("This  program is for Addition");
	}
	@Test
	public  void subtraction()
	{
		System.out.println("This  program is for Subtraction");
	}
	@Test
	public  void multiplication()
	{
		System.out.println("This  program is for Multiplication");
	}
	@Test
	public  void division()
	{
		System.out.println("This  program is for Division");
	}
	//@Before , @After

}
