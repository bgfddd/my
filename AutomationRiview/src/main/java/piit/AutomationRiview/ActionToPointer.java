package piit.AutomationRiview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionToPointer {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\fwzna\\eclipse-workspace\\AutomationRiview\\Drivers\\chromedriver.exe");
	//	driver=new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\fwzna\\eclipse-workspace\\AutomationRiview\\Drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.navigate().to("https://www.amazon.com");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		Actions ob=new Actions(driver);
		WebElement hovers=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		ob.moveToElement(hovers).build().perform();

 

		Thread.sleep(6000);
		driver.close();

	}

}
