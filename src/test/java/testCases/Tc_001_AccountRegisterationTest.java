package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegistrationPage;
import testBase.BaseClass;

public class Tc_001_AccountRegisterationTest extends BaseClass  {
	
	
	@Test(groups={"Sanity","Master"})
	void AccountRegisterationTest() {
		try {
		logger.info("***** Started Tc_001_AccountRegisterationTest *****");
		HomePage hp=new HomePage(driver);
		logger.info("click on My Account");
		hp.clickMyAccount();
		logger.info("click on register");
		hp.clickRegister();
		
		logger.info("Sending Deatils to the inputs");
		RegistrationPage rp=new RegistrationPage(driver);
		
		rp.FirstName(randomMessage());
		rp.LastName(randomMessage());
		rp.Email(randomMessage()+"@gmail.com");
		rp.Number(randomNumber());
		String pwd=randomAlphaNumeric();
		rp.Password(pwd);
		rp.ConformPassword(pwd);
		rp.CheckBox();
		rp.Button();
		
		logger.info("Validating Message");
		String conforMessage=rp.getconformMsg();
		Assert.assertEquals(conforMessage, "Your Account Has Been Created!");
		}
		catch(Exception e) {
			Assert.fail();
			logger.debug("test Failed");
		}
		
	}
	
	
	
}
