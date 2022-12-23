package basicConcepts;

import org.junit.Test;

public class ForLoopStatement {
	// i want to print 1to20 redcolor, 21 to 40 bluecolor, 41 to 50 graycolor.
@Test
	public void findcolor(){
		for(int i=1; i<=50; i++){
			if(i<=20){
				System.out.println("print the redcolor"+i);
			}else if(i<=40){
				System.out.println("print the bluecolor"+i);
			}else if (i<=50){
				System.out.println("print the graycolor"+i);
			}
		}
	}
// i want to find the student roll nmbr of 55 out of 100.

public void findStudent(int std){
	for(int i=1; i<=100; i++){
		if(i==std){
			System.out.println("find the roll nmbr of"+i);
			break;
			//continue;
		}
		System.out.println("print the all the student roll nmbr"+i);
	}
}
@Test
public void findStudents_test(){
	findStudent(55);
}
// factorial :-> if method calls same method itself then it is called factorial
   public int factorial (int num){
	   if(num < 1){
		   return 1;
	   }
	   else{
		  return num * factorial(num-1);
	   }
   }
   @Test
   public void factorial_test(){
	   int result= factorial(3);
	   System.out.println("print the  of 3"+result);
   }

}