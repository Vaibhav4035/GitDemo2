package Com.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.base.Utility;
import com.login.loginPage;

public class testPage extends BaseClass {
	
	Utility utility;
	loginPage login;
	String tcID;
	
	
	@Test
	public void login() throws IOException {

		//driver.get(Utility.readPropertyFileData("URL"));
		
		 login = new loginPage(driver);
		
		login.enterusername(utility.getTestData(0, 0));
		login.enterpassword(utility.getTestData(0, 1));
		login.clicktoLogin();
	   
	}
	
	@Test
	
   public void testdata() {
		
		tcID="101";
		
		login.clicktoLogin();
		
		String actualurl="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
		String expectedurl="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
		
		Assert.assertEquals(actualurl, expectedurl);
	}
	
		
	
	
	@AfterMethod
	public void takesceenshot(ITestResult result) throws IOException {
		if(ITestResult.FAILURE==result.getStatus()) 
		{
			
			utility.captureScreenshot(driver, tcID);
		}
	
	}

}
