package abstraction;

import org.junit.Test;

public class Customer2 extends ClientImpl
{
	@Test
	public void customer1(){
		ClientInterface cl = new ClientImpl();
		int add = cl.addiction1(10,5);
		int sub  = cl.subtraction(20,5);
		int multi  = cl.multi1(20,5);
		String name  = cl.name("a", "b");
		 System.out.println(add);
		 System.out.println(sub);
		 System.out.println(name);
		 System.out.println(multi);

	}
	@Test
	public void customer2(){
		ClientImpl c2 = new ClientImpl();
		 String nam =c2.delete("sai");
		 System.out.println(nam);
	}
	     
}
