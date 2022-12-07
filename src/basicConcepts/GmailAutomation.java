package basicConcepts;

import org.junit.Test;

public class GmailAutomation
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
	//*******************************************************
	public void launchApplication()
	{
		System.out.println("RC : Launch Application");
	}
	public void loginToApplication()
	{
		//We have to write the code required to do login - may be 20 lines of code
		System.out.println("RC : Login to Application");
	}
	public void logoutFromApplication()
	{
		System.out.println("RC : Logout From Application");
	}
	public void closeApplication()
	{
		System.out.println("RC : Close Application");
	}
	public void compose()
	{
		System.out.println("RC : Compose Mail");
	}
	public void send()
	{
		System.out.println("RC : Send Mail");
	}
	public void open()
	{
		System.out.println("RC : Open Mail");
	}
	public void reply()
	{
		System.out.println("RC : Reply Mail");
	}
	public void forward()
	{
		System.out.println("RC : Forward Mail");
	}
	public void delete()
	{
		System.out.println("RC : Delete Mail");
	}


}
