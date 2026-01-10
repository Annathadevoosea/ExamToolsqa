package Test;

import org.testng.annotations.Test;

import Base.ToolsqaBase;

public class LinkTest extends ToolsqaBase  {
	
	@Test(priority=1)
	public void Link()
	{
		a.link();
	}
}
