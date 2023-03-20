package piit.AutomationRiview;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windowkit {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fwzna\\eclipse-workspace\\AutomationRiview\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("Https://www.amazon.com");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		Actions ob=new Actions(driver);
		WebElement newrealeselink=driver.findElement(By.linkText("New Releases"));
		ob.keyDown(Keys.SHIFT).build().perform();
		newrealeselink.click();
		ob.keyUp(Keys.SHIFT).build().perform();
		driver.getWindowHandle();
		//we can not stored into string data type because it arrays we need set<String>
		Set<String> windowhendles=driver.getWindowHandles();
		//then we need iterator for handle that
		Iterator<String> iterators= windowhendles.iterator();
		String Parent=  iterators.next();          //it's pointer to first[iterators.next();] window and save it on string
		String secondwindow=  iterators.next();    //it's pointer to first[iterators.next();] window and save it on string
		System.out.println("This is parent window ="+Parent);
		System.out.println("This is second window ="+secondwindow);
		driver.switchTo().window(secondwindow);
		Thread.sleep(6000);
		WebElement Produts=driver.findElement(By.xpath("//*[text()='Camera & Photo Products']"));
		Thread.sleep(6000);
		Produts.click();
		driver.close();
		driver.switchTo().window(Parent);
		Thread.sleep(6000);
		driver.quit();
		
		
		
		
	}

}
