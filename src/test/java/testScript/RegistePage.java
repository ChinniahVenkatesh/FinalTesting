package testScript;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import commonUtils.getProp;
import junit.framework.Assert;
import objects.registerObject;

public class RegistePage {
	
public ChromeDriver driver;
	@Test()
	public void Register() throws IOException
	{
		driver = new ChromeDriver();
		getProp gp = new getProp();
		driver.get(gp.getProperties("RegisterUrl"));
		driver.manage().window().maximize();
		registerObject ro = new registerObject(driver);
		ro.firstName().sendKeys("Arun");
	}
	
	@Test(priority = 1)
	public void testFail()
	{
		Assert.assertTrue(true);
	}
}
