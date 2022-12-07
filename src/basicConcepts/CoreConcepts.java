package basicConcepts;

// A line with double slash is called a comment line , java compiler will ignore this comment line
                                      //Signature : CLASS

 //***************Modifier[opt]   class   Name{  Members:variables | functions }   ***************//
 
//AccessModifiers : private , default , public [protected]
//Naming Convention : CLASS
  // Class name must start with UPPER CASE letter , no space with in the class name , no special characters are allowed in class name
  // class name and its file name must be same 
  // In a given java file we can have only one public class and that public class name must be same as java file name
public class CoreConcepts{
	
	//Members:variables | functions
	//Signature : VARIABLE
	  //Modifier[opt]   DataType Name; -> Declaration     Modifier[opt]   DataType Name = value ; -> Assignment
	//Rice Bag - 10 Kg capacity   , 20 Kg , 30 Kg , 40 Kg
	//integer : byte 8 bit , short , int , long
	byte num1 = 99; //00....09..10........99..100
	short num2 =9999;//000.....999
	String num3 = "Ram";
	long num4 = 999999999;
	public   int    stdNum = 22; 
	public  double  stdMarks = 99.44;
	private  char   stdGrade  = 'A';
	        boolean  result = false;
	public  String  stdName = "Ram";
	//type mismatch error - type casting
	
	//Signature : FUNCTION  | METHOD | PROGRAM
	  //Modifier[opt]  ReturnType  Name(inputs....[opt]){ body }
	  //Modifier[opt]  ReturnType  Name(DataType arg1,DataType arg2,.....){ body }
	//Naming Convention for Variable / Function : 
	 //Member of a class  can be started with 
											// _ , $ , a-z , A-Z  , it should follow camelCasing
	//Constructor of a class will not follow camelCasing
	//Member of a class  should not have 
	                                      //  space within , no special characters , should not start with numeric
	int empNum;  int _empNum;  int $empNum;  int EmpNum;  int emp_Num ;   int empNum_;  int emp$Num;   int empNum$;  int empNum1; int emp1Num;
	
	// int emp Num; //int emp@Num; //int #empNum;  //int 1empNum;
	
	//psvm
	public static void main(String[] args) //CL/CR -> Class Leader / Class Rep
	{
		System.out.println("Welcome to Selenium Java Automation");
	}
	private void  addition()
	{
		int sum = 22+44;
		System.out.println("Sum of two numbers :"+ sum);
	}	
	void addition(int arg)
	{
		//body
	}
	public void addition(int arg1,int arg2)
	{
		//body
	}
	public void addition(int arg1,int arg2,int arg3) //Method Overloading -> Polymorpism -> Oops
	{
		//body
	}
	//Naming Conventions - Variable / Functions
	//What is main method and how to run programs/functions/methods
}
class Positive{
	
	
}

class Amazon{
	
}

class Flipkart{
	
}

