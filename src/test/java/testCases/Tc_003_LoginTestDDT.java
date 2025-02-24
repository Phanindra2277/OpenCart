package testCases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class Tc_003_LoginTestDDT extends BaseClass{
	
	@Test(dataProvider="LoginData",dataProviderClass=DataProvider.class)
	void LoginTest(String email,String password,String exp) {
		try {
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		
		LoginPage lp=new LoginPage(driver);
		
		lp.txtEmail(email);
		lp.txtpasswod(password);
		lp.loginBtn();
		
		MyAccountPage macc=new MyAccountPage(driver);
		boolean targetpage=macc.getMyAccountPageExits();
		
		if(exp.equalsIgnoreCase("Valid")) {
			
			if(targetpage==true) {
				macc.clickLogOut();
				Assert.assertTrue(true);
			}else {
				Assert.fail();
			}
				
		}
		if(exp.equalsIgnoreCase("Invalid")) {
					
					if(targetpage==true) {
						macc.clickLogOut();
						Assert.fail();
					}else {
						Assert.assertTrue(true);
					}
						
				}
		
		
		
		}
		catch(Exception e) {
			Assert.fail();
		}
	}
	
	
	
}
