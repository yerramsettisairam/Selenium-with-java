package inheritanceByObject;

import org.junit.Test;
//            child                parent ->Simple Inheritance
public class TestCases //extends ReusableComponents
{	
	//Modifier ClassName obj = new Constructor();
	//public ReusableComponents   rc = new ReusableComponents();
	public ReusableComponents   rc = new ReusableComponents("firefox");
	@Test
	public void composeAndSendAnEmail()
	{
		System.out.println("Test Case : ComposeAndSendAnEmail ");
		//launch , login , compose , send , logout , close
		rc.launchApplication();
		rc.loginToApplication();
		rc.compose();
		rc.send();
		rc.logoutFromApplication();
		rc.closeApplication();
	}
	@Test
	public void replyToAnEmail()
	{
		System.out.println("Test Case : ReplyToAnEmail ");
		//launch , login , open , reply , logout , close
		rc.launchApplication();
		rc.loginToApplication();
		rc.open();
		rc.reply();
		rc.logoutFromApplication();
		rc.closeApplication();
	}
	@Test
	public void forwardAnEmail()
	{
		System.out.println("Test Case : ForwardAnEmail ");
		//launch , login , open , forward , logout , close
		rc.launchApplication();
		rc.loginToApplication();
		rc.open();
		rc.forward();
		rc.logoutFromApplication();
		rc.closeApplication();
	}
	@Test
	public void deleteAnEmail()
	{
		System.out.println("Test Case : DeleteAnEmail ");
		//launch , login , open , delete , logout , close
		rc.launchApplication();
		rc.loginToApplication();
		rc.open();
		rc.delete();
		rc.logoutFromApplication();
		rc.closeApplication();
	}
}
