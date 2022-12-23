package basicConcepts;

import org.junit.Test;

public class ConditionalStatements {
         int a = 10;
         int b = 20;
	
 @Test
	public void comparenuber(){
		if(a<b){
			int sum = a-b;
			System.out.println("sum of two nmbr comparsion"+sum);
		}
		else{
			int sun = a+b;
			System.out.println("sum of the two numbr "+sun);
		}
	}
 
 //write the program if two number are equal than perform addiction, if two nmbr not equal perfom sub, if two nmbr a<b then multiple
//   int c =21;
//   int d =20;
 
 public void multiple(int c,int d){
		if(c==d){
			int equal =c+d;
			System.out.println("sum of two nmbr comparsion"+equal);
		}
		else if(c<d){
			int notequal = c-d;
			System.out.println("sub of the two numbr "+notequal);
		}
		else if(c!=d){
			int lessthan = c*d;
			System.out.println("multiple of two nmbr"+lessthan);
		}
	}
 @Test
 public void multiple_test(){
	 multiple(2,21);
 }
}
