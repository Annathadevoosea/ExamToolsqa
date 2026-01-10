package Page;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EnrollNow {
	
	WebDriver driver;
	
	@FindBy(xpath="//a[@class='btn btn-primary-shadow btn-block']")
	WebElement Enroll;
	
	@FindBy(xpath="//input[@id='first-name']")
	WebElement Fname;
	
	@FindBy(xpath="//input[@id='last-name']")
	WebElement Lname;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='mobile']")
	WebElement phone;
	
	@FindBy(xpath="//select[@id='country']")
	WebElement country;
	
	@FindBy(xpath="//input[@id='city']")
	WebElement city;
	
	@FindBy(xpath="//textarea[@id='message']")
	WebElement msg;
	
	
	
	public EnrollNow(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Register1(String value1,String value2,String value3,String value4,String value5,String value6,String value7 )
	{
		Enroll.click();
		Fname.sendKeys(value1);
		Lname.sendKeys(value2);
		email.sendKeys(value3);
		phone.sendKeys(value4);
		
		Select drop=new Select(country);
		drop.selectByVisibleText(value5);
		
		city.sendKeys(value6);
		msg.sendKeys(value7);
		
		
	}
	
	public void screenshot() throws Exception
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("./Screenshot/NewScreenshot.png"));
	}
	

}
