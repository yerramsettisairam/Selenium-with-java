package abstraction;


public class ClientImpl implements ClientInterface
{
	
	public String delete(String a) {
		String con = a;
		return con;	
	}
	
	public int subtraction(int a, int b) {
		int sub = a-b;
		return sub;
	}

	public int multi1(int a , int b) {
	   int multi = a*b;
		return multi;
	}

	public String name(String nam1, String nam2) {
	  String concat = nam1+nam2;
		return concat;
	}

	public int addiction1(int a , int b) {
		int add1 = a+b;
		return add1;
	}
	
	public int[] array1(int[]a ) {
		int[] arr1 = a;
		return arr1;
	}
}
