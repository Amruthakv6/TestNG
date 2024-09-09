package fb_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Crossbrowser {
	WebDriver driver;
	@BeforeMethod
	@Parameters("browser")
	public void setup(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\Automation\\chromedriver-win64");
			driver = new ChromeDriver();
		//} else if(browser.equalsIgnoreCase("firefox")) {
		//	System.setProperty("webdriver.gecko.driver", "");
		//	driver = new FirefoxDriver();
		//} else if (browser.equalsIgnoreCase("Edge")) {
		//	System.setProperty("WebDriver.edge.driver", "");
			//driver = new EdgeDriver();
		}
			
		driver.manage().window().maximize();
	}
  @Test
  public void testfacebooklogin() {
	  driver.get("https://www.facebook.com");
	  
	  
  }
  @AfterMethod
  public void teardown() {
	  //close the browser
	  if(driver !=null) {
		  driver.quit();
	  }
  }

}
