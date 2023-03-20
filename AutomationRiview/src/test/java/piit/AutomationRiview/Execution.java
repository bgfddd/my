package piit.AutomationRiview;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Execution {
  @Test //5
  public void f() {
	  System.out.println("This is test annotation");
  }
  @BeforeMethod //4
  public void beforeMethod() {
	  System.out.println("Thi is before method annotation");
  }

  @AfterMethod //6
  public void afterMethod() {
	  System.out.println("Thi is after method  annotation");
  }
  
  @Test
  public void Test2() {
	  System.out.println("Thi is test2 annotation");
  }

  @BeforeClass //3
  public void beforeClass() {
	  System.out.println("Thi is before class annotation");
  }

  @AfterClass //7
  public void afterClass() {
	  System.out.println("Thi is after class annotation");
  
  }

  @BeforeTest //2
  public void beforeTest() {
	  System.out.println("Thi is before test annotation");
  }

  @AfterTest //8
  public void afterTest() {
	  System.out.println("Thi is after test annotation");
  }

  @BeforeSuite //1
  public void beforeSuite() {
	  System.out.println("Thi is  defore suite annotation");
  }

  @AfterSuite //9
  public void afterSuite() {
	  System.out.println("Thi is  after suite annotation");
  }

}
