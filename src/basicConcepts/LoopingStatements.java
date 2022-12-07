package basicConcepts;

import org.junit.Test;

public class LoopingStatements
{
	@Test
	public void applyColor()
	{
		System.out.println("Apply color to step 1");
		System.out.println("Apply color to step 2");
		System.out.println("Apply color to step 3");
		System.out.println("Apply color to step 4");
		System.out.println("Apply color to step 5");
	}
	
	//Starting point , how long , step size  -> Task[apply color]
	//starting point , how long [101] , step size -> Task [Temple]
	//for(int iterator=1; iterator < target; step size) {  Task  } 
	@Test
	public void doPradhakshina()
	{
		//for(int i=1;i<101;i=i+1) //1<101 -> t 2<101 -> t 99<101 -> t 100<101 -> t 101<101 -> f  101<=101 -> t
		for(int i=1;i<=101;i=i+1)
		{
			System.out.println("Pradakshina Number " + i);
		}
	}
	
	//Write a program to print the first 100 numbers
	@Test
	public void printFirst100Numbers()
	{
		for(int i=1;i<=100;i=i+1)
		{
			System.out.println(i);
		}
	}
	
	//WAP to find a student in a class room [100 students]
	@Test
	public void findStudent()  //22
	{
		for(int i=1;i<=100;i++)
		{
			System.out.println("Student Number :" + i);
			if(i == 22)
			{
				System.out.println("Found the Student ");
				break;
			}
		}
	}
	@Test
	public void applyColorToSteps() //Skip every multiple of 10
	{
		for(int i=1;i<=100;i++)
		{
			if((i % 10)  == 0)
			{
				System.out.println("Dont apply Green color to Step :" + i);
				System.out.println("Apply RED color to step :" + i); 
				continue;
			}
			System.out.println("Apply Green Color to step :" + i);
		}
		
	}
	@Test
	public void printEvenNumbers()
	{
		for(int i=1;i<=100;i++)
		{
			if((i % 2)==0)
			{
				System.out.println("Even Number :" + i);
			}
		}
	}
	
	@Test
	public void printOddNumbers()
	{
		for(int i=1;i<=100;i++)
		{
			if(!((i % 2)==0))
			{
				System.out.println("Odd Number :" + i);
			}
		}
	}
	//WAP to find sum of n numbers
	@Test
	public void sumOfNumbers() //10 > 12 3456789
	{
		int sum = 0;
		for(int i=1;i<=100;i++) //i=1 2 3 4 5 6 10 11<=10
		{
			sum = sum + i; // 0+1+2+3
		}
		System.out.println("Sum of Numbers :"+ sum);
	}
	@Test
	public void findFactorial()  // 10 * 9 ....1
	{
		int fact = 1;
		for(int i=1;i<=5;i++)
		{
			fact = fact * i; // 1 2 3 4 5 6 7 ...10
		}
		System.out.println("Factorial of the given number :" + fact);
	}
	@Test
	public void findFactorial_dowhile()
	{
		int fact = 1;
		int num = 5;
		do
		{
			fact = fact * num;  //1x5
			num = num-1;
		}
		while(num>1);
		System.out.println("Factorial of the given number :" + fact);
	}
	
	
	@Test
	public void findFactorial_while()
	{
		int fact = 1;
		int num = 5;
		while(num>1)
		{
			fact = fact * num;  //1x5
			num = num-1;
		}
		
		System.out.println("Factorial of the given number :" + fact);
	}
	
	
	
	
	
	
	
	

}
