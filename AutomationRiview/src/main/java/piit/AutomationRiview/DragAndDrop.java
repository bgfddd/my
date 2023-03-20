package piit.AutomationRiview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\fwzna\\eclipse-workspace\\AutomationRiview\\Drivers\\chromedriver.exe");
	//	driver=new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\fwzna\\eclipse-workspace\\AutomationRiview\\Drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.navigate().to("https://jqueryui.com");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		WebElement dropable=driver.findElement(By.linkText("Droppable"));
		dropable.click();
		driver.switchTo().frame(0);
		WebElement ElementToDrop=driver.findElement(By.id("draggable"));
		WebElement DropToHere=driver.findElement(By.id("droppable"));
		Actions obj=new Actions(driver);
		Thread.sleep(6000);
		obj.dragAndDrop(ElementToDrop, DropToHere).build().perform();
		driver.switchTo().parentFrame();
		WebElement Sorting=driver.findElement(By.linkText("Sortable"));
		Sorting.click(); 
		driver.close();
	}

}
