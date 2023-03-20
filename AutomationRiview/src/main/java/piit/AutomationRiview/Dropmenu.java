package piit.AutomationRiview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropmenu {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\fwzna\\eclipse-workspace\\AutomationRiview\\Drivers\\chromedriver.exe");
	//	driver=new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\fwzna\\eclipse-workspace\\AutomationRiview\\Drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.navigate().to("Https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		WebElement create=driver.findElement(By.xpath("//*[text()='Create new account']"));
		create.click();
		Thread.sleep(6000);
		WebElement month=driver.findElement(By.name("birthday_month"));
		Select ob=new Select(month);
		ob.selectByValue("6");
		WebElement day=driver.findElement(By.name("birthday_day"));
		Select ob2=new Select( day);
		ob2.selectByVisibleText("6");
		WebElement year=driver.findElement(By.name("birthday_year"));
		Select ob3=new Select(year);
		ob3.selectByIndex(23); 
		Thread.sleep(6000);
		driver.close();
	}
	
	
}
