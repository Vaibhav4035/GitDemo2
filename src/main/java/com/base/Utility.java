package com.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;



public class Utility {
	
	public static String readPropertyFileData(String key) throws IOException 
	{
		Properties prop=new Properties();
		FileInputStream file= new FileInputStream("C:\\Users\\91957\\eclipse-workspace\\Interfaces\\Miniproject\\src\\main\\resources\\Credentials\\login.properties");
		prop.load(file);
	
		String value = prop.getProperty(key);
		System.out.println("-----reading property file---------");
		return value;
	}
	
public static String getTestData(int rowIndex, int colIndex) throws EncryptedDocumentException, IOException {
		
		FileInputStream file =new FileInputStream("F:\\Exceldata\\Testdata.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet4");
		String value = sh.getRow(rowIndex).getCell(colIndex).getStringCellValue();
		
		return value;

}

public static void captureScreenshot(WebDriver driver,String tcID) throws IOException  
{
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest =new File("C:\\Users\\91957\\eclipse-workspace\\Interfaces\\Miniproject\\src\\main\\Screenshotminiproject"+tcID+"_Image.jpg");		
	FileHandler.copy(src, dest);
}


}
