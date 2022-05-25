package com.base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	
	public static WebDriver driver;
	
	@BeforeClass
	
	public WebDriver setup() throws IOException  {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91957\\eclipse-workspace\\Interfaces\\Miniproject\\src\\main\\resources\\drivers\\chromedriver.exe" );
		
		driver=new ChromeDriver();
		driver.get(Utility.readPropertyFileData("URL"));

		return driver;
		
	}
	
	//@AfterClass
	
	//public void tearDown() {
		
		//driver.close();
	//}

}
