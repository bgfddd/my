package piit.AutomationRiview;

import org.openqa.selenium.By;
//import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ilocators {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\fwzna\\eclipse-workspace\\AutomationRiview\\Drivers\\chromedriver.exe");
	//	driver=new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\fwzna\\eclipse-workspace\\AutomationRiview\\Drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.navigate().to("Https://www.amazon.com");
		driver.manage().window().maximize();
		Thread.sleep(6000);

		WebElement Searchfield= driver.findElement(By.name("field-keywords"));
		Searchfield.sendKeys("Computer");

		//Thread.sleep(6000);
		WebElement Searchicon= driver.findElement(By.id("nav-search-submit-button"));
		Searchicon.click();

		WebElement linktx=driver.findElement(By.linkText("Registry"));
		linktx.click();
		Thread.sleep(6000);

		WebElement care=driver.findElement(By.partialLinkText("24/7 care"));
		care.click();
		
		// Xpath  absolute  (Ctrl+f)
	    /*  html/body/div/header/div/div/div/div/div/a[11]   */

		WebElement booksicon=driver.findElement(By.xpath("html/body/div/header/div/div/div/div/div/a[11]"));
		Thread.sleep(6000);
		booksicon.click();
		/*html/body/div/header/div/div/div/div/form/div/div/input*/
		WebElement searchfield=driver.findElement(By.xpath("html/body/div/header/div/div/div/div/form/div/div/input"));
		Thread.sleep(6000);
		searchfield.sendKeys("Computer");
		
		WebElement searchicon=driver.findElement(By.xpath("html/body/div/header/div/div/div/div/form/div/div/span/input"));
		Thread.sleep(6000);
		searchicon.click();

		//Relative Xpath
		  //tagName[@Atrubiotenotseportedbyselenium='value']  //a[@aria-label='Amazon']
		
		WebElement amazologo=driver.findElement(By.xpath("//a[@aria-label='Amazon']"));
		Thread.sleep(6000);
		amazologo.click();

		//Xpath Text() Function only where is just text
		/*  //tagName[text()='text']   for grouping and indexing   (//tagName[text()='text'])[num] */
		
		WebElement newreleases = driver.findElement(By.xpath("(//a[text()='New Releases'])[1]"));
		Thread.sleep(6000);
		newreleases.click();
		
		// Contains Xpath:  used for dynamic web element
		//tagName[contains(text(),'text')] for grouping and indexing(//tagName[contains(text(),'text')])[]
		
		WebElement bestsell = driver.findElement(By.xpath("(//a[contains(text(),'Best Sellers')])[1]"));
		Thread.sleep(6000);
		bestsell.click();
		

		

		driver.close();

	}

}
