package multilevelInheritance;

import org.junit.Test;
//              A[Child]             B[Immediate parent]              C[grand parent]
public class TestSuites extends       TestCases                     // Rcomponents
{
	@Test
	public void smokeSuite()
	{
		//launchApplication();
		System.out.println("TestSuite : SMOKE");
		composeAndSendAnEmail();
		replyToAnEmail();
	}
	
	@Test
	public void regressionSuite()
	{
		System.out.println("TestSuite : REGRESSION");
		composeAndSendAnEmail();
		replyToAnEmail();
		forwardAnEmail();
		deleteAnEmail();
	}

}
