package Test;

import org.testng.annotations.Test;

import Base.ToolsqaBase;

public class EnroolTest extends ToolsqaBase{
	
	@Test(priority=1)
	public void Enroll()
	{
		c.Register1("Anna", "Thadevoose", "anna@gmail.com", "123456789", "India","Kochi" , "Hellow");
	}
	
	@Test(priority=2)
	public void ScreenShot() throws Exception
	{
		c.screenshot();
	}

}
