package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//h2[normalize-space()='My Account']") WebElement account_name;
	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Logout']") WebElement lnklogout;
	public boolean getMyAccountPageExits() {
		try {
		return (account_name.isDisplayed()) ;
		}
		catch(Exception e) {
			return false;
		}
	}
	
	public void clickLogOut() {
		lnklogout.click();
	}
	
	
	
}
