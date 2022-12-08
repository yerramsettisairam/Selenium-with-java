package multilevelInheritance;

import org.junit.Test;
//Access Modifiers : private[class level] -> default[package level] -> protected | public
//              child            parent
public class TestCases extends Rcomponents
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
