package multiLevelInheritance;

import org.junit.Test;


// in this topic we discuss about how to inheritance grandparent to parent to child
public class TestSuite extends TestCase
{
	@Test
   public void launchApp(){
		System.out.println("***********launchapp for multilevel inheritance");
	   ComposeAndSendEmail();
	   ReplyEmail();
   }
	@Test
	public void launchapp2(){
		System.out.println("***********");
		Login();
		Open();
		Send();
		CloseApplication();
	}
}
