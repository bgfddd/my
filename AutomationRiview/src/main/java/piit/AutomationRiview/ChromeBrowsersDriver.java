package piit.AutomationRiview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class ChromeBrowsersDriver { 

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\fwzna\\eclipse-workspace\\AutomationRiview\\Drivers\\chromedriver.exe");
		//driver=new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\fwzna\\eclipse-workspace\\AutomationRiview\\Drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.navigate().to("Https://www.amazon.com");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		driver.navigate().back();
		Thread.sleep(6000);
		driver.navigate().forward();
		Thread.sleep(6000);
		driver.navigate().refresh(); 
		Thread.sleep(6000);
		String ur= driver.getCurrentUrl();
		System.out.println(ur);
		Thread.sleep(6000);
		String windowHondle= driver.getWindowHandle();
		System.out.println(windowHondle);
		Thread.sleep(6000);
		driver.close();

	} 

}
