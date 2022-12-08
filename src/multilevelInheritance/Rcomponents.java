package multilevelInheritance;

public class Rcomponents
{
	//variables / functions -> Members of a class | properties of the class
	 void launchApplication()
	{
		System.out.println("RC : Launch Application");
	}
	void loginToApplication()
	{
		//We have to write the code required to do login - may be 20 lines of code
		System.out.println("RC : Login to Application");
	}
	void logoutFromApplication()
	{
		System.out.println("RC : Logout From Application");
	}
	protected void closeApplication()
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
	void open()
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
