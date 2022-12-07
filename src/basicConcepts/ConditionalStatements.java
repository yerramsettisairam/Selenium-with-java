package basicConcepts;

import org.junit.Test;

public class ConditionalStatements
{
	int a = 28;
	int b = 52;
	
	//if(expression -> boolean : t / f) {  Task  }
	//Write a program to find sum of two numbers if they are equal
	@Test
	public void compareNumbers()  //program / function / method
	{
		boolean val = (a==b);
		System.out.println(val);
		if(val)
		{ //true
			//Task
			int sum = (a+b);
			System.out.println("Sum of two numbers :" + sum);
		}
	}
	
	//Write a program to find sum of two numbers if they are equal if not do subtraction
	
	@Test
	public void compareNumbers_ifelse()  //program / function / method
	{
		boolean val = (a==b);
		System.out.println(val);
		if(val)
		{ //true
			//Task
			int sum = (a+b);
			System.out.println("Sum of two numbers :" + sum);
		}
		else
		{ //false
			int diff = (a-b);
			System.out.println("Difference of two numbers :" + diff);
		}
	}
	
	//Write a program to find sum of two numbers if they are equal , do subtraction  if a>b , do multiplication if a <b
	
	@Test
	public void multipleDecisions()  //program / function / method
	{
		if(a==b)
		{ //true
			//Task
			int sum = (a+b);
			System.out.println("Sum of two numbers :" + sum);
		}
		else if(a>b) {
			int diff = (a-b);
			System.out.println("Difference of two numbers :" + diff);
		}
		else if(a<b)
		{
			int prod = (a*b);
			System.out.println("Product of two numbers :" + prod);
		}
	}
	
	//[WAP] Write a program to read two numbers as inputs and perform the below task if and only if both inputs are above 10	
	 //Task : find sum of two numbers if they are equal , do subtraction  if a>b , do multiplication if a <b
	
	public void logicalOperator(int num1,int num2)
	{
		System.out.println("First Number :" + num1);
		System.out.println("Second Number :" + num2);
		//   T          T    -> T   // TF / FT / FF -> F		
		if((num1>10) && (num2>10)) //Outer condition //&& - Logical ,  //  > < ==  -> Relational Operators
		{ //true
			if(num1==num2) //Inner Condition //Nested if condition
			{ //true
				//Task
				int sum = (num1+num2);  //   = Assignment
				System.out.println("Sum of two numbers :" + sum);
			}
			else if(num1>num2) {
				int diff = (num1-num2); // + - * -> Arithemetic
				System.out.println("Difference of two numbers :" + diff);
			}
			else if(num1<num2)
			{
				int prod = (num1*num2);
				System.out.println("Product of two numbers :" + prod);
			}
		}
		else
		{
			System.out.println("Both A and B or any one of them might be below 10");
		}
		
	}
	
	@Test
	public void logicalOperator_test()
	{
		logicalOperator(8,4);
		logicalOperator(18,4);
		logicalOperator(8,44);
		logicalOperator(18,18);
		logicalOperator(48,18);
		logicalOperator(18,28);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void login() //fixed data
	{
		//enter user name  - ram
		//enter password - 1234
	}
	
	public void login(String uname,String pword)
	{
		//enter user name  - uname
		//enter password - pword
	}

}
