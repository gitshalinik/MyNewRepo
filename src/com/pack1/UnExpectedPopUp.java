package com.pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Case 1: If you know which page the Popup will come

public class UnExpectedPopUp 
{
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "E:\\NEW_FRAMEWORK\\SampleProject\\Server\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.jdwilliams.co.uk/");
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		for(int i=0; i<=10; i++)
		{
			try 
			{
				WebElement popupWebElm  = driver.findElement(By.xpath("//button[text()='Accept All Cookies']"));
				popupWebElm.click();
				break;
			} 
			catch (Exception e) 
			{
				Thread.sleep(2000);
			}
		}
	}
}
