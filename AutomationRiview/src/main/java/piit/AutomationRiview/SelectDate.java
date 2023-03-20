package piit.AutomationRiview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;


public class SelectDate {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fwzna\\eclipse-workspace\\AutomationRiview\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.expedia.com");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		WebElement departure=driver.findElement(By.id("d1-btn"));
		departure.click();
		Thread.sleep(6000);
		
	
	   /* WebElement goingTo=driver.findElement(By.xpath("(//form//button)[8]"));
        goingTo.click();
        Thread.sleep(6000);
        
        WebElement searchfield =driver.findElement(By.id("location-field-destination"));
        searchfield.sendKeys("Paris");
        Thread.sleep(6000);
        
        Select obj=new Select(searchfield);
        obj.selectByVisibleText("Paris (CDG - Roissy-Charles de Gaulle) France");
        Thread.sleep(6000);*/
        
        String monthYear =driver.findElement(By.xpath("(//*[@type='button'])[11]")).getText();
		System.out.println(monthYear);
		
		WebElement departuricon=driver.findElement(By.className("uitk-date-picker-selection-date"));
         departuricon.click();
         
       //  (//tr/td/button)[25]
		WebElement departureTodate=driver.findElement(By.xpath("(//tr/td/button)[25]"));
		//ob.moveToElement(departureTodate).click().build().perform();
		departureTodate.click();

		WebElement done=driver.findElement(By.xpath("(//button[text()='Done'])[2]"));
		done.click();

		WebElement Checkout=driver.findElement(By.id("d2-btn"));
		Checkout.click();
		//*[@data-day='9'])[2]r
		WebElement returnDate=driver.findElement(By.xpath("(//td/button)[31]"));
		returnDate.click();
		WebElement dn=driver.findElement(By.cssSelector("button[class='uitk-button uitk-button-medium uitk-button-has-text uitk-button-primary']"));
		dn.click();

		WebElement search=driver.findElement(By.xpath("//*[text()='Search']"));
		search.click();
		
		driver.close();
	}
}
