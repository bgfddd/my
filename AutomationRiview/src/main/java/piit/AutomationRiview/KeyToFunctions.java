package piit.AutomationRiview;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyToFunctions {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fwzna\\eclipse-workspace\\AutomationRiview\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		WebElement searchfield=driver.findElement(By.id("twotabsearchtextbox"));
		searchfield.sendKeys("Computer");
		Actions ob=new Actions(driver);
		//how to select all
		ob.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(6000);
		//how to copy
		ob.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		searchfield.clear();
		Thread.sleep(6000);
		searchfield.click();
		//how to paste
		ob.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(6000);
		//how to press Enter
		ob.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(6000);
		driver.close(); 

	}

}
