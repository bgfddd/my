package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage {
	WebDriver driver;
	@FindBy(xpath  = "(//*[@name='email'])[2]") WebElement Id;
	@FindBy(name="did_submit") WebElement SearchButtonClick;
	@FindBy(xpath = "//*[contains(text(),'Please enter your email')]") WebElement Question;
	@FindBy(xpath = "//*[contains(text(),'Connect ')]") WebElement TextHomepage;
	
	
	public   ForgotPasswordPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void UseId() {
		Id.sendKeys("John@mail.com");
		
	} 
	public void SearchButtonClick() {
		SearchButtonClick.click();
	} 
	public String QuestionOfText() {
		String Questions=Question.getText();
		return Questions; 
	}
	public String TextHomepage() {
		String Hometpage=TextHomepage.getText();
		return Hometpage;
	}

}
