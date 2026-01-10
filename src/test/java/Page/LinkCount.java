package Page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkCount {
	
	WebDriver driver;
	
	@FindBy(tagName="a")
	List<WebElement> linkcount;
	
	 public LinkCount(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
	 
	 public void link()
	 {
		 System.out.println("Total links ="+linkcount.size());
		 
		 for(WebElement a:linkcount)
			{
				String href=a.getAttribute("href");
				String text=a.getText();
				System.out.println(href);
				
			}
		 
	 }

}
