package com.pack1;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static WebDriver driver;
	
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "E:\\NEW_FRAMEWORK\\SampleProject\\Server\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Thread.sleep(3000);

		WebElement datePicketWebElm = driver.findElement(By.xpath("//input[@id='datepicker']"));
		datePicketWebElm.click();
		Thread.sleep(2000);
		datePicker("2023", "May", "20");
	}
	
	public static void datePicker(String year, String month, String date) throws Exception
	{
		for(int i=1; i<=12; i++)
		{
			try
			{
				WebElement datePic = driver.findElement(By.xpath("//span[text()='"+month+"']//following::span[text()='"+year+"']//following::a[text()='"+date+"']"));
				datePic.click();
				break;
			}
			catch(Exception e)
			{
				WebElement nxtWebElm = driver.findElement(By.xpath("//span[text()='Next']"));
				nxtWebElm.click();
				Thread.sleep(2000);
			}
		}
	}
}
