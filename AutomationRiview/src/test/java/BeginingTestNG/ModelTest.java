package BeginingTestNG;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.ForgotPasswordPage;
import PageObjectModel.Home;

public class ModelTest {
	WebDriver driver;
	  @Test (priority = 1)
	  public void f() throws InterruptedException, IOException {
		  Home ob = new Home(driver);
		  ob.Email();
		  Thread.sleep(6000);
		  Pictures();
		  Thread.sleep(6000);
		  ob.PasswordField();
		  Thread.sleep(6000);
		  Pictures();
		  Thread.sleep(6000);
		  ob.ForgotPass();
		  ForgotPasswordPage it = new ForgotPasswordPage(driver);
		  it.UseId();
		  Thread.sleep(6000);
		  Pictures();
		  Thread.sleep(6000);
		  it.SearchButtonClick();
		  Thread.sleep(6000);
		
		  
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
		Browsers("Firefox");
	  }

	  @AfterClass
	  public void afterClass() {
		  driver.close();
	  }
   
	  
	  public void Browsers(String window) throws InterruptedException {
		  if(window.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\fwzna\\eclipse-workspace\\AutomationRiview\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.navigate().to("Https://www.facebook.com");
			driver.manage().window().maximize();
			Thread.sleep(6000);
			
		  }else if(window.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\fwzna\\eclipse-workspace\\AutomationRiview\\Drivers\\msedgedriver.exe");
			driver= new EdgeDriver();
			driver.navigate().to("Https://www.facebook.com");
			driver.manage().window().maximize();
			Thread.sleep(6000);
		  }else if(window.equalsIgnoreCase("Firefox")) {
			  System.setProperty("webdriver.gecko.driver", "C:\\Users\\fwzna\\eclipse-workspace\\AutomationRiview\\Drivers\\geckodriver.exe");
			    driver= new FirefoxDriver();
				driver.navigate().to("Https://www.facebook.com");
				driver.manage().window().maximize();
				Thread.sleep(6000);
			  
		  }
		  
		    
		  
	  }
	  
	  public void Pictures() throws IOException {
		  Date dt=new Date();
		  String sk=dt.toString().replace(" ", "_").replace(":", "_");
		  System.out.println(sk);
		  System.out.println(dt);
		  File screenshorts= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileHandler.copy(screenshorts,  new File("C:\\Users\\fwzna\\eclipse-workspace\\AutomationRiview\\Pivtures\\"+sk+"ShotOfPage.jpg"));
	  }
}
