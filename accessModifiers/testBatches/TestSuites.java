package testBatches;

import org.junit.Test;

import testScenarios.TestCases;
//              A[Child]             B[Immediate parent]              C[grand parent]
public class TestSuites extends TestCases //,Rcomponents  // Multiple : A -> B,C [Immediate parents , Mother and Father]
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
