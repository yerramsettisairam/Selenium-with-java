package inheritanceByObject;

public class ReusableComponents
{
	//constructor overloading
	public ReusableComponents() //default constructor
	{
		System.out.println("Open default browser : CHROME");
	}
	public ReusableComponents(String browser)
	{
		if(browser.equalsIgnoreCase("CHROME"))
		   System.out.println("Open browser : CHROME");
		else if(browser.equalsIgnoreCase("FIREFOX"))
			System.out.println("Open browser : FIREFOX");
		else if(browser.equalsIgnoreCase("EDGE"))
			System.out.println("Open browser : EDGE");
		else
			System.out.println("Browser type not supported :" + browser);
	}
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
