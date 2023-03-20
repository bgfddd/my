package BeginingTestNG;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.ForgotPasswordPage;
import PageObjectModel.Home;

public class SignoutTest {
	
		 WebDriver driver;
	  @Test (priority = 1)
	  public void f() throws InterruptedException, IOException {
		  Home ob = new Home(driver);
		  ob.Email();
		  ob.PasswordField();
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
	  
	  
	  @BeforeClass
	  public void beforeClass() throws InterruptedException {
		  //System.setProperty("webdriver.chrome.driver", "C:\\Users\\fwzna\\eclipse-workspace\\AutomationRiview\\Drivers\\chromedriver.exe");
		//driver=new ChromeDriver();
		  //System.setProperty("webdriver.edge.driver", "C:\\Users\\fwzna\\eclipse-workspace\\AutomationRiview\\Drivers\\msedgedriver.exe");
		//driver= new EdgeDriver();
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\fwzna\\eclipse-workspace\\AutomationRiview\\Drivers\\geckodriver.exe");
		    driver= new FirefoxDriver();
			driver.navigate().to("Https://www.facebook.com");
			driver.manage().window().maximize();
			Thread.sleep(6000);
	  }

	  @AfterClass
	  public void afterClass() {
		  driver.close();
	  }

}
