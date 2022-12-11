package objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class registerObject {
	
	public ChromeDriver driver;
	
	public registerObject(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@placeholder='First Name']")
	WebElement firstName;
	
	public WebElement firstName()
	{
		return firstName;
	}
}
