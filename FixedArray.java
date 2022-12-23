package collections;

import org.junit.Test;

public class FixedArray {
           //FixedArray
//signature of the array:
	// modifier[opt] DataType[] name = {values};
	
	
	@Test
	public void ExampleOfFixedArray(){//fixed values array
		int [] fixedArray ={10,50,1,22,127,24};// decalartion of array
		for(int i=0;i<fixedArray.length;i++){
			if(i==4){
				System.out.println("found the array index value "+i+"-"+fixedArray[2]);// reading of array
				break;
			}
			System.out.println("find the length of the array using forloop"+i);
		}
	}
	
	public boolean sample(int[] numbers,int num){
		boolean result = false;
		for(int i=0;i<numbers.length;i++){
			int sam = numbers[i];
		if(sam == num){
			result =true;
			break;
		}
		}
		return result;
	}
	
	@Test
	public void sample_test(){
		int [] numbers = {1,2,3,4,5,6,7,8,9};
		boolean output=sample(numbers,12);
		System.out.println("fidnt eh"+"="+output);
	}
	
	// example of using strings 
//	public String ExampleString(String[] names, name){
//		String result = null;
//		for(String i=0; i<names;i++){
//			String nam =names[i];
//			if(nam == names){
//				result = value;
//				break;
//			}
//		}
//		return result;
//		
//	}
//	
//	@Test
//	public void ExampleString_test(){
//		String[] names = {"sai","ram","jhonn"};
//	String output=	ExampleString(names,"ram");
//	System.out.println("find the string value"+output);
//	}
	
	// dynamic array 
	//signature :
	//modifier[opt] DataType[] Name = new DataType[SIZE];
	@Test
	public void dynamicArray(){
		int[] dynamic = new int[5];
		for(int i=0;i<dynamic.length;i++){
			int sam = dynamic[i];
			System.out.println("find the sam "+i+"="+sam);
		}
	}
	
	@Test
	public void sample(){
		int [] sai = new int[8];
		int[] nmbr ={1,2,3,4,5,6,7,8,9};
		System.out.println("find the nmbr"+nmbr.length +"="+nmbr[5]);
	}
}
