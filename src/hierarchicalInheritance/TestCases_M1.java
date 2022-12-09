package hierarchicalInheritance;

import org.junit.Test;

public class TestCases_M1 extends Rcomponents
{
	@Test
	public void composeAndSendAnEmail()
	{
		System.out.println("Test Case : ComposeAndSendAnEmail ");
		//launch , login , compose , send , logout , close
		launchApplication();
		loginToApplication();
		compose();
		send();
		logoutFromApplication();
		closeApplication();
	}
	@Test
	public void replyToAnEmail()
	{
		System.out.println("Test Case : ReplyToAnEmail ");
		//launch , login , open , reply , logout , close
		launchApplication();
		loginToApplication();
		open();
		reply();
		logoutFromApplication();
		closeApplication();
	}
	
}
