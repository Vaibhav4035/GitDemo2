package com.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	
	@FindBy(name="txtUsername") private WebElement username;
	
	@FindBy(name="txtPassword") private WebElement password;
	
	@FindBy(name="Submit") private WebElement submit;
	
	
	public loginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void enterusername(String uname) {
		
		username.sendKeys(uname);
		
	}
	
    public void enterpassword(String userpass) {
		
    	password.sendKeys(userpass);
		
	}

    public void clicktoLogin() {
	
    	submit.click();
	
}

}
