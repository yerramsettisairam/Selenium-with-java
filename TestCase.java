package multiLevelInheritance;

import org.junit.Test;

public class TestCase extends Rcomponents
{
     // it is a child component because inheritance from parent component
	// i want to create the test for gmail;
	@Test
 public void ComposeAndSendEmail(){
	 // launchapplication ,login, open ,send, logout,closeApp
		System.out.println("test case for compose and send mail");
		LaunchApplication();
		Login();
		Open();
		Send();
		logout();
		CloseApplication();
 }
	@Test
public void ReplyEmail(){
	 // launchapplication ,login, open ,reply, logout,closeApp
		System.out.println("test case replyemail");
	LaunchApplication();
	Login();
	Open();
	Reply();
	logout();
	CloseApplication();
 }
@Test
public void DeleteEmail(){
	 // launchapplication ,login, open ,delete, logout,closeApp
	System.out.println("test case for delete email");
	LaunchApplication();
	Login();
	Open();
	Delete();
	logout();
	CloseApplication();
}

@Test
public void ForwardEmail(){
	 // launchapplication ,login, open ,forward, logout,closeApp
	System.out.println("test case for forward email");
	LaunchApplication();
	Login();
	Open();
	Forward();
	logout();
	CloseApplication();
}

}
