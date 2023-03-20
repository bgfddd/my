package BeginingTestNG;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class OpenBeowser {
	static WebDriver driver;
	  @Test
	  public void f() throws InterruptedException {
		 
		  WebElement ids=driver.findElement(By.name("email"));
		  ids.sendKeys("Mimiche@gamil.com");
		  Thread.sleep(6000);
		  WebElement passwoed=driver.findElement(By.name("pass"));
		  passwoed.sendKeys("Adan123");
		  Thread.sleep(6000);
		  WebElement loginbutton =driver.findElement(By.name("login"));
		  loginbutton.click();
		  
		  
	  }
	  @BeforeClass
	  public void beforeClass() throws InterruptedException {
		 // System.setProperty("webdriver.chrome.driver", "C:\\Users\\fwzna\\eclipse-workspace\\AutomationRiview\\Drivers\\chromedriver.exe");
		 // driver=new ChromeDriver();
		  System.setProperty("webdriver.firefox.driver", "C:\\Users\\fwzna\\eclipse-workspace\\AutomationRiview\\Drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.navigate().to("Https://www.facebook.com");
			driver.manage().window().maximize();
			Thread.sleep(6000);
			
	  } 

	  @AfterClass 
	  public void afterClass() {
		  driver.close();
	  }
}
