package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {

	
	public RegistrationPage(WebDriver driver) {
		super(driver);
	}
	
	
	
	@FindBy(xpath="//input[@id='input-firstname']") WebElement txtfirstname;
	@FindBy(xpath="//input[@id='input-lastname']") WebElement txtlastname;
	@FindBy(xpath="//input[@id='input-email']") WebElement txtemail;
	@FindBy(xpath="//input[@id='input-telephone']") WebElement txtnumber;
	
	@FindBy(xpath="//input[@id='input-password']") WebElement txtpassword;
	@FindBy(xpath="//input[@id='input-confirm']") WebElement txtconformpwd;
	
	@FindBy(xpath="//input[@name='agree']") WebElement checkbox;
	@FindBy(xpath="//input[@value='Continue']") WebElement clickbtn;
	
	
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']") WebElement finalMsg;
	
	
	public void FirstName(String fname) {
		txtfirstname.sendKeys(fname);
	}
	
	public void LastName(String lname) {
		txtlastname.sendKeys(lname);
	}
	public void Email(String email) {
		txtemail.sendKeys(email);
	}
	public void Number(String number) {
		txtnumber.sendKeys(number);
	}
	public void Password(String pwd) {
		txtpassword.sendKeys(pwd);
	}
	public void ConformPassword(String pwd) {
		txtconformpwd.sendKeys(pwd);
	}
	public void CheckBox() {
		checkbox.click();
	}
	
	public void Button() {
		clickbtn.click();
	}
	
	
	public String getconformMsg() {
		try {
			return(finalMsg.getText());
		}catch(Exception e) {
			return(e.getMessage());
		}
	}
	
}
