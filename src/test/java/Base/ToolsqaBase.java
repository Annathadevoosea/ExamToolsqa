package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import Page.EnrollNow;
import Page.LinkCount;
import Page.NewTab;

public class ToolsqaBase {
	
		public static WebDriver driver;
		public LinkCount a;
		public NewTab b;
		public EnrollNow c;
		
		
		@BeforeTest
		public void setup()
		{
			driver=new ChromeDriver();
			driver.get("https://www.toolsqa.com/");
			driver.manage().window().maximize();
		}
		
		@BeforeMethod
		public void mthd()
		{
		   a=new LinkCount(driver);
		   b=new NewTab(driver);
		   c=new EnrollNow(driver);
		}

	}

