package piit.AutomationRiview;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import M.common.Utility;
import PageObjectModel.ForgotPasswordPage;
import PageObjectModel.Home;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
public class Signout extends Utility {
	
  @Test (priority = 1)
  public void f() throws InterruptedException, IOException {
	  Home ob = new Home(driver);
//	  ob.Email();
//	  ob.PasswordField();
	  Thread.sleep(6000);
	  ob.ForgotPass();
	  ForgotPasswordPage it = new ForgotPasswordPage(driver);
	  it.UseId();
	  Thread.sleep(6000);
	  it.SearchButtonClick();
	  Thread.sleep(6000);
	  File screenshorts= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileHandler.copy(screenshorts,  new File("C:\\Users\\fwzna\\eclipse-workspace\\AutomationRiview\\Pivtures\\ShotOfPage.jpg"));
  }
  
  @Test(priority = 2 ,dependsOnMethods = "f")
  public void TextVerificationMethod() throws InterruptedException {
	  driver.navigate().back();
	  Thread.sleep(6000);
	  ForgotPasswordPage id = new ForgotPasswordPage(driver);
	  String Questions=id.QuestionOfText();
	  SoftAssert softit=new SoftAssert();
	  softit.assertEquals("Please enter your email or mobile number to search for your account.", Questions);
	  System.out.println("This is after assertion");
	  softit.assertAll();
  } 
  
  @Test(priority = 3)
  public void TextVerificationHomePage() throws InterruptedException {
	  driver.navigate().back();
	  Thread.sleep(6000);
	  ForgotPasswordPage tx = new ForgotPasswordPage(driver);
	  String Hometpage=tx.TextHomepage();
	  SoftAssert softit=new SoftAssert();
	  softit.assertEquals("Connect with friends and the world around you on Facebook.", Hometpage);
	  System.out.println("This is after assertion");
	  softit.assertAll();
  }
  
  
 
}
