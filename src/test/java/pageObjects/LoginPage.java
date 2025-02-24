package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	

	//input[@id='input-email']
	//input[@id='input-password']
	//input[@value='Login']
	
	@FindBy(xpath="//input[@id='input-email']") WebElement txtemail;
	@FindBy(xpath="//input[@id='input-password']") WebElement txtpasswod;
	@FindBy(xpath="//input[@value='Login']") WebElement login_btn;
	
	public void txtEmail(String email) {
		txtemail.sendKeys(email);
	}
	
	public void txtpasswod(String pwd) {
		txtpasswod.sendKeys(pwd);
	}
	
	public void loginBtn() {
		login_btn.click();
	}
	
	
}
