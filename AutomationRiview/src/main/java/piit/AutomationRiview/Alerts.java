package piit.AutomationRiview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fwzna\\eclipse-workspace\\AutomationRiview\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		WebElement Alert =driver.findElement(By.name("alert"));
		Alert.click();
		Thread.sleep(6000);
		driver.switchTo().alert().accept();
		WebElement prompt =driver.findElement(By.name("prompt"));
		prompt.click();
		Thread.sleep(6000);
		driver.switchTo().alert().sendKeys("texted");
		driver.switchTo().alert().dismiss();

	}
}
