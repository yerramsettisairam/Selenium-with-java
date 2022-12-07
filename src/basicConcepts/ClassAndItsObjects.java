package basicConcepts;

import org.junit.Test;

public class ClassAndItsObjects
{
	//Modifier[opt] className  objectname = new Constructor();
	
	//public Student   s1 = new Student();
	
	@Test
	public  void createStudentObjects()
	{
		int empNum = 44;
		Student   s1 = new Student();
		System.out.println(s1.rollNum);
		System.out.println(s1.name);
		System.out.println(s1.marks);
	}
	@Test
	public void createEmployeeObjects()
	{
		Employee e1 = new Employee(22,"Ram");
		Employee e2 = new Employee(32,"Rama");
		Employee e3 = new Employee(42,"Ramu");
		Employee e4 = new Employee(52,"Ramesh");
		//System.out.println(e1.empID);
		//System.out.println(e1.empName);
		int[] numbers = {22,32,42,52};
		System.out.println("First array");
		for(int i=0;i<numbers.length;i++)
		{			
			System.out.println(numbers[i]);
		}			
		String[] names = {"Ram","Rama","Ramu","Ramesh"};
		System.out.println("Second Array");
		for(int i=0;i<names.length;i++)
		{			
			System.out.println(names[i]);
		}
		Employee[] employee = {e1,e2,e3,e4};
		System.out.println("Third Array");
		for(int i=0;i<employee.length;i++)
		{			
			Employee e = employee[i];
			int id = e.empID;
			String n = e.empName;
			System.out.println(employee[i].empID);
			System.out.println(employee[i].empName);
		}
	}
	

}


class Student  //Mould
{
	public Student()  //Default Constructor
	{
		
	}
	int rollNum = 44  ; //default - 0
	String name = "Ram" ; //default- null
	double marks = 99.45 ;
}

class Employee
{
	int empID;
	String empName;
	public Employee(int id,String name) //Constructor
	{
		empID = id;
		empName = name;
	}
	public void add111() //normal function
	{
		
	}
}











