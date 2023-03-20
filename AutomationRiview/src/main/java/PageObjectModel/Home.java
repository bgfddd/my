package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	WebDriver driver;
	@FindBy(name = "email") WebElement Ids;
	@FindBy(name="pass") WebElement Pass;
	@FindBy(xpath  = "//*[text()='Forgot password?']") WebElement Forgot;
	
	
	public Home(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Email() {
		Ids.sendKeys("John@mail.com");
	}
	public void PasswordField() {
		Pass.sendKeys("Sliver");
	}
	public void ForgotPass() {
		Forgot.click();
	}
}
