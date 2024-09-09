package fb_test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

public class Parallel_Testing {
	
	

	public class cross_browser_testing {
		WebDriver Driver;
		
	  @Test 
	  public void testfacebooklogin() {
		 Driver.navigate().to("https://www.facebook.com/");
	  }
	  
	  
	  @BeforeMethod
	  @Parameters("browser")
	  public void setup(String browser) {
	if (browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SIJISH\\Desktop\\Automation\\chromedriver-win64…
	
}
}