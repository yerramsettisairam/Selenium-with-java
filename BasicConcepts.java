package basicConcepts;


//double slash line are commented line java complier ignore the doubleslash line what u write it will not show the output.	
//once you start your project file name and class name should be same
	//in side the file only one public class and remaining all are sub class
// classname should be in uppercase letters only it should not allow special characters.use CamelCase.
	
	// signature of the class :
    // modifier class Name{members: variable and function | Method}
    // modifiers means public,default,protected,private

   // signature of the variable:
   // modifier[opt] DataType Name;->declaration;   modifier[opt] DataType Name = 10;=>assignment;
   // integer we have different type : byte, short,int,long.
   // in the DataTypes we have typemissmatching or typecasting

   // signatur of the function or method
   // modifier[opt] returntype Name(){body}
  // modifier[opt] returntype name(DataType args1,DataType args2){}
 // while using same function name should not use again and  also input type.java will not allow

// by using main method we run the program of functions
//public  static void main(String[] args){
//	System.out.println("inside main method");
//
//}

public class BasicConcepts {
	
	public  static void main(String[] args){
		System.out.println("inside main method");
         addition(10,30);
         substraction(40,10);
         multiplicatiion(10,10,10);
	}
   public String name = "sairam";
 //  System.out.println("sairam iam using variable"+name);

	public  static void addition(int a, int b){
		int sum = a+b;
		System.out.println("addiction"+sum);
	}
	public static void substraction(int c ,int d){
		int sub =c-d;
		System.out.println("sub"+sub);
	}
	public static void multiplicatiion(int e,int f,int g){
		int multi =e*f-g;
		System.out.println("multiplication"+multi); // it is called methodoverloading ans also polymorishm in oops
	}
}


