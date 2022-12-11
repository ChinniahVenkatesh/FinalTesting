package objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class indexPageObject {
	
	public ChromeDriver driver;
	
	public indexPageObject(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//pageFactory - pom -> page object model
	
	@FindBy(xpath="//input[@id='email']")
	WebElement email;
	
	public WebElement email()
	{
		return email;
	}
}
