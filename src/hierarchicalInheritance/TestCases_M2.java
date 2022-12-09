package hierarchicalInheritance;

import org.junit.Test;

public class TestCases_M2 extends Rcomponents
{
	@Test
	public void forwardAnEmail()
	{
		System.out.println("Test Case : ForwardAnEmail ");
		//launch , login , open , forward , logout , close
		launchApplication();
		loginToApplication();
		open();
		forward();
		logoutFromApplication();
		closeApplication();
	}
	@Test
	public void deleteAnEmail()
	{
		System.out.println("Test Case : DeleteAnEmail ");
		//launch , login , open , delete , logout , close
		launchApplication();
		loginToApplication();
		open();
		delete();
		logoutFromApplication();
		closeApplication();
	}


}
