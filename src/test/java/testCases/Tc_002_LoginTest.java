package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class Tc_002_LoginTest extends BaseClass{

	@Test(groups= {"Regression","Master"})
	void LoginTest() {
		logger.info("***** started Tc_002_LoginTest ********* ");
		
		try {
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		
		LoginPage lp=new LoginPage(driver);
		
		lp.txtEmail(p.getProperty("email"));
		lp.txtpasswod(p.getProperty("password"));
		lp.loginBtn();
		
		MyAccountPage macc=new MyAccountPage(driver);
		boolean val=macc.getMyAccountPageExits();
		Assert.assertEquals(val,true,"testFailed");
	}catch(Exception e) {
		Assert.fail();
	}
	
	logger.info("******* Finished Tc_002_LoginTest **********");
	
	}
}
