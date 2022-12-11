package testScript;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import commonUtils.getProp;
import objects.indexPageObject;
import org.apache.logging.log4j.Logger;

public class indexPage {
	
	public ChromeDriver driver;
	public Logger log = LogManager.getLogger(indexPage.class);
	
	@Test(priority = 0)
	public void test1() throws IOException
	{
		driver = new ChromeDriver();
		getProp gp = new getProp();
		driver.get(gp.getProperties("url"));
		driver.manage().window().maximize();
		indexPageObject ip = new indexPageObject(driver);
		ip.email().sendKeys("ArunVenkatesh");
		log.debug(driver.getTitle());
		//log.error(null, ip, ip, ip, ip, ip, ip, ip, gp, ip);
		
		
	}
	
	

}
