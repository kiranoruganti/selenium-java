package kirantestng;

import org.testng.annotations.Test;// Test is nothing but a class in TestNG

//import org.testng.annotations.Test;

public class firsttestngcode {
	
	
	
	
	@Test(priority = -1,description = "this testcase is to test login application")
	public void loginApplication()
	{
		System.out.println("login application");
		
	}
	@Test(priority = 2,description = "this testcase is to select items")
	public void selectItems()
	{
		System.out.println("select Items");
	}
	@Test(priority = -3,description = "this testcase is to test web element")
	public void webelement()
	{
		System.out.println("this is webelement");
	}
	}


