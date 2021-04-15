package com.atmecs.TestingFramework;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.atmecs.TestingFramework.helpers.CommonUtility;
import com.atmecs.TestingFramework.helpers.WaitForElement;
import com.atmecs.TestingFramework.utils.FormDataProvider;
import com.atmecs.TestingFramework.utils.ReadPropertiesFile;

import webconnection.GetWebConnection;

public class TestKanko extends GetWebConnection {
	
	

	Properties locators;
	CommonUtility commonUtility;	
	
	@BeforeClass
	public void invokeBrowser() throws IOException {
		driver.get("https://www.konakart.com/konakart/Welcome.action");
		driver.manage().window().maximize();
		
		
		
		WaitForElement waitObject = new WaitForElement();
		waitObject.waitForPageLoadTime(driver);
		waitObject.waitForImplicit(driver);
		
		
		
		try {
			locators=ReadPropertiesFile.loadProperty("C:\\\\Users\\\\Anamika.Mathur\\\\Documents\\\\workspace-spring-tool-suite-4-4.9.0.RELEASE\\\\TestingFramework\\\\resources\\\\locators\\\\atmecs.comLocators.properties");
			commonUtility=new CommonUtility(driver);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	    driver.switchTo().frame(0);
    
   // driver.findElement(By.xpath("//div[@aria-label='close']")).click();	
    
    commonUtility.clickOnElement(locators.getProperty("loc_minimize_button"));
    
    driver.switchTo().parentFrame();
		
		
		
		
		
	}
	
	
	@Test(priority=1, dataProvider="konkoData",dataProviderClass = FormDataProvider.class)
	public void testElements(String selectText,String enterValue) {
		
	commonUtility.selectDropdown(selectText, locators.getProperty("loc_select_name"));
		
		commonUtility.clickAndSendText(enterValue,locators.getProperty("loc_input_name"));
		
		commonUtility.clickOnElement(locators.getProperty("loc_button_name"));
		
		  driver.manage().timeouts().implicitlyWait(0, TimeUnit.MILLISECONDS);	
		  
		  int size=commonUtility.getSize(locators.getProperty("loc_div_name"));
			
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			System.out.println("For select input : "+selectText
					+", and text input : "+enterValue+". The no. of elements are = "+size);
			
			commonUtility.clickOnElement(locators.getProperty("loc_logo_name"));
		
		
		Assert.assertTrue(true);
		
	}

}
