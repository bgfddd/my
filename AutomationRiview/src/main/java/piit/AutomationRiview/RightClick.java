package piit.AutomationRiview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fwzna\\eclipse-workspace\\AutomationRiview\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://deluxe-menu.com/popup-mode-sample.html");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		WebElement Picture=driver.findElement(By.xpath("//*[@style='cursor: pointer;']"));
		Actions objt=new Actions(driver);
		Thread.sleep(6000); 
		//click
		objt.moveToElement(Picture).click().build().perform();
		Thread.sleep(6000);
		objt.moveToElement(Picture).build().perform();
		//WebElement farm=driver.findElement(By.xpath("(//*[@align='center'])[14]"));
		//objt.moveToElement(Picture).click().build().perform();
		//right click
		objt.contextClick(Picture).perform();
		System.out.println("Right click Context Menu displayed");

	}
}
