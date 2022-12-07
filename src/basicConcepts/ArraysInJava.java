package basicConcepts;

import java.util.Arrays;

import org.junit.Test;

public class ArraysInJava {

	// Fixed Array

	// Modifier[opt] DataType[] name = { values } ;
	public int[] numbers = { 22, 45, 14, 12, 16, 25 };

	// java.lang.ArrayIndexOutOfBoundsException: 6
	@Test
	public void fixedIntegerArray() {
		// 0 1 2 3 4 5
		int[] numbers = { 22, 45, 14, 12, 16, 25 };
		int len = numbers.length;
		System.out.println("Length of the array :" + len);
		// int val = numbers[5];
		// System.out.println("Element at 0 index :" + val);
		for (int i = 0; i < len; i++) // 4<6 , 5<6 , 6<=6
		{
			int val = numbers[i];
			System.out.println("Element at  index before :" + i + "-" + val);
		}
		numbers[0] = 234;// writing in to the array
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = 234;
		}
		for (int i = 0; i < len; i++) // 4<6 , 5<6 , 6<=6
		{
			int val = numbers[i];
			System.out.println("Element at  index after :" + i + "-" + val);
		}
	}

	@Test
	public void findStudent() {
		int[] numbers = { 22, 45, 14, 12, 16, 25, 26, 31, 34, 36, 38, 41, 44 }; // students who came to the school today

		for (int i = 0; i < numbers.length; i++) {
			int std = numbers[i]; // reading from the array
			if (std == 34) {
				System.out.println("Found the student");
				break;
			}
		}

	}

	@Test
	public void findStudent_test() {
		int[] students = { 22, 45, 14, 12, 16, 25, 26, 31, 34, 36, 38, 41, 44 };
		boolean output = findStudent(students, 26);
		System.out.println(output);
	}
	@Test
	public void sortMyArray()
	{
		int[] students = { 22, 45, 14, 12, 16, 25, 26, 31, 34, 36, 38, 41, 44 };
		for (int i = 0; i < students.length; i++) 
		{
			int val = students[i];
			System.out.println("Elements before sorting " + val);
		}
		//Sorting the array
		Arrays.sort(students);
		for (int i = 0; i < students.length; i++) 
		{
			int val = students[i];
			System.out.println("Elements after sorting " + val);
		}
	}

	public boolean findStudent(int[] numbers, int num) {
		boolean result = false; // no student
		for (int i = 0; i < numbers.length; i++) {
			int std = numbers[i];
			if (std == num) {
				// System.out.println("Found the student");
				result = true;
				break;
			}
		}
		return result;
	}
	//Dynamic Array : In this while declaring the array we can specify the length of the array. We need not assign the values in to the array.
	  // We can assign the values in the array in run time .
	//Signature : Dynamic Array
	
	   // Modifier[opt]   DataType[]    name = new DataType[size];
	@Test
	public void dynamicIntegerArray()
	{
		//int[] students = { 22, 45, 14, 12, 16, 25, 26, 31, 34, 36, 38, 41, 44 }; //fixed array
		int[]  employees = new int[10]; //dynamic array
		for(int i=0;i<employees.length;i++)
		{
			int val = employees[i];
			System.out.println("Default values at :" + i + " - " + val);
		}
		
	}
	
	@Test
	public void dynamicStringArray()
	{
		//int[] students = { 22, 45, 14, 12, 16, 25, 26, 31, 34, 36, 38, 41, 44 }; //fixed array
		String[]  employees = new String[10]; //dynamic array
		for(int i=0;i<employees.length;i++)
		{
			String val = employees[i];
			System.out.println("Default values at :" + i + " - " + val);
		}
		
	}
	
	
	//Collection Framework
	
	
	
	
	
	
	
	
	

}
