package abstraction;

import org.junit.Test;

public class Customer extends CalculatorImpl
{
	@Test
	public void customer(){  // class to class
	CalculatorImpl cal = new CalculatorImpl();
	String sum = cal.sendEmail("sai", "ram");
	System.out.println(sum);
	}     
	
	@Test
	public void customer2(){
		Calculator cust2 = new CalculatorImpl();  // interface to implclass
		
		int sum = cust2.addition(20, 30);
		System.out.println(sum);
	}
}
