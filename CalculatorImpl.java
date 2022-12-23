package abstraction;

public  class CalculatorImpl implements Calculator
{
	
	public String sendEmail(String name1,String name2){
		String name = name1+name2;
		return name;
	}
	
	public String replyEmail(String name1,String name2){
		String name = name1+name2;
		return name;
	}
	
   public int addition(int a, int b){
	   int sum = a+b;
	   return sum;
   }
   
   public int subtraction(int a, int b){
	   int sub = a-b;
	   return sub;
   }

public int multi(int a, int b) {
	int prod = a*b;
	return prod;
}

public int division(int a, int b) {
	int div = a/b;
	return div;
}
}
