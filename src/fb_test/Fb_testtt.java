package fb_test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Fb_testtt {WebDriver driver;
  @Test
  public void f() {
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();

		WebElement usernamee = driver.findElement(By.xpath("//*[starts-with(@id, 'email')]"));
		usernamee.sendKeys("ammu");
		WebElement password = driver.findElement(By.xpath("//*[starts-with(@name, 'pass')]"));
		password.sendKeys("123467");
		WebElement logins = driver.findElement(By.xpath("//*[starts-with(@type, 'submit' )]"));
		logins.click();
		
  }
  @BeforeTest
  public void beforeTest() {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\dell\\\\Desktop\\\\Automation\\\\chromedriver-win64\\\\chromedriver.exe");
	driver = new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
driver.close();
  }

}
