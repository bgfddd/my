package piit.AutomationRiview;
import org.testng.annotations.Test;
import M.common.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class browsersd extends Utility {
	
  @Test
  public void f() throws InterruptedException {
	 
	  WebElement ids=driver.findElement(By.name("email"));
	  ids.sendKeys("Mimiche@gamil.com");
	  Thread.sleep(6000);
	  WebElement passwoed=driver.findElement(By.name("pass"));
	  passwoed.sendKeys("Adan123");
	  Thread.sleep(6000);
	  WebElement loginbutton =driver.findElement(By.name("login"));
	  loginbutton.click();
	
	  
	  
  }
 

}
