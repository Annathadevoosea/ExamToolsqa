package Test;

import org.testng.annotations.Test;

import Base.ToolsqaBase;

public class NewTest extends ToolsqaBase {
	
	@Test(priority=1)
	public void OpenNewLink()
	{
	   b.New();
	}
	
	@Test(priority=2)
	public void NewTab()
	{
		b.Newtab();
	}
	
	@Test(priority=3)
	public void Titleverification()
	{
		b.Title();
	}
	
	@Test(priority=4)
	public void url()
	{
		b.URL();
	}
	
	@Test(priority=5)
	public void window()
	{
		b.parentwindow();
	}

}
