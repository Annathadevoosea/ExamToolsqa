package Page;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class NewTab {
	
	WebDriver driver;
	
	
	@FindBy(xpath="/html[1]/body[1]/header[1]/nav[1]/div[1]/div[1]/div[3]/div[1]/div[1]/ul[1]/li[2]/a[1]")
	WebElement Selenium;
	
	
	
	public NewTab(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void New()
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(Selenium));
		
		Selenium.click();
		
		
	}
	
	public void Newtab()
	{
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.toolsqa.com/selenium-training?q=headers");
	}
	
	public void Title()
	{
		String act=driver.getTitle();
		String exp="Tools QA - Selenium Training";
		Assert.assertEquals(act,exp);
		if(act.equals(exp))
		{
			System.out.println("Correct Title:"+act);
		}
		else
		{
			System.out.println("Incorrect");
		}
	}
	
	public void URL()
	{
		String actual=driver.getCurrentUrl();
		String expected="https://www.toolsqa.com/selenium-training?q=headers";
		Assert.assertEquals(actual,expected);
		if(actual.equals(expected))
		{
			System.out.println("Correct URL:"+actual);
		}
		else
		{
			System.out.println("Incorrect");
		}
	}
	
	public void parentwindow()
	{
		
        ArrayList<String> li=new ArrayList<>(driver.getWindowHandles());
		
		driver.switchTo().window(li.get(1));

    }
	


		
	
 

}
