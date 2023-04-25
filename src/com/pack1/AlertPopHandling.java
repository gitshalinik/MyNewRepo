package com.pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopHandling {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "E:\\NEW_FRAMEWORK\\SampleProject\\Server\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		WebElement custInWebElm = driver.findElement(By.xpath("//input[@name='cusid']"));
		custInWebElm.sendKeys("asdf1234");
		
		WebElement submitBtnWebELm = driver.findElement(By.name("submit"));
		submitBtnWebELm.click();
		
		Thread.sleep(3000);
		
		try
		{
			// Switch to Alert Window
			Alert alt = driver.switchTo().alert();
			
			// Capture the Alert Text
			String val = alt.getText();
			System.out.println(val);
			
			Thread.sleep(3000);
			
			// Click on OK Button
			alt.accept();
			
			String expectedTxt = "Customer Successfully Delete!";
			
			// Switch to other Alert Popup for verification
			Alert alt1 = driver.switchTo().alert();
			String actualTxt = alt1.getText();
			if(actualTxt.equals(expectedTxt))
			{
				System.out.println("Customer deleted Sucessfully");
			}
			else
			{
				System.out.println("Customer not deleted Sucessfully");
			}
			
			Thread.sleep(3000);
			
			alt1.accept();
		}
		catch (Exception e)
		{	
			e.printStackTrace();
		}	
	}
}
