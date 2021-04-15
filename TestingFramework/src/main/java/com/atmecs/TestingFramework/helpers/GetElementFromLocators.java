package com.atmecs.TestingFramework.helpers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class GetElementFromLocators {
	static WebElement element;
	static List<WebElement> elements;

	
	public static WebElement matchLocatorsAndFetchElements(String locators,WebDriver driver) 
	{
		String locatorsArray[]=locators.split(";");
		switch(locatorsArray[0].toLowerCase())
		{
			case "id":
				element = driver.findElement(By.id(locatorsArray[1]));
				break;
				
			case "name":
				element = driver.findElement(By.name(locatorsArray[1]));
				break;
				
			case "class":
				element = driver.findElement(By.className(locatorsArray[1]));
				break;
			
			case "linktext":
				element = driver.findElement(By.linkText(locatorsArray[1]));
				break;
			
			case "partialLink":
				element = driver.findElement(By.partialLinkText(locatorsArray[1]));
				break;
				
			case "tag":
				element = driver.findElement(By.tagName(locatorsArray[1]));
				break;
			
			case "css":
				element = driver.findElement(By.cssSelector(locatorsArray[1]));
				break;
			
			case "xpath":
				element = driver.findElement(By.xpath(locatorsArray[1]));
				break;		
		}
	    return element;
	}
	
	public static List<WebElement> matchLocatorsAndFetchElementsList(String locators,WebDriver driver) 
	{
		String locatorsArray[]=locators.split(";");
		switch(locatorsArray[0].toLowerCase())
		{
			case "id":
				
				elements = driver.findElements(By.id(locatorsArray[1]));
			
				break;
				
			case "name":
				elements = driver.findElements(By.name(locatorsArray[1]));
				
				
				break;
				
			case "class":
				elements = driver.findElements(By.className(locatorsArray[1]));
				break;
			
			case "linktext":
				elements = driver.findElements(By.linkText(locatorsArray[1]));
				break;
			
			case "partialLink":
				elements = driver.findElements(By.partialLinkText(locatorsArray[1]));
				break;
				
			case "tag":
				elements = driver.findElements(By.tagName(locatorsArray[1]));
				break;
			
			case "css":
				elements = driver.findElements(By.cssSelector(locatorsArray[1]));
				break;
			
			case "xpath":
				elements = driver.findElements(By.xpath(locatorsArray[1]));
				
				
				break;		
		}
	    return elements;
	}
	
	
	
}
