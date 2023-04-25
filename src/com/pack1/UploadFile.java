package com.pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\NEW_FRAMEWORK\\SampleProject\\Server\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/SHALINIK/Desktop/UploadC.html");
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Thread.sleep(5000);
		WebElement uploadWebELem = driver.findElement(By.xpath("//label[text()='Select a file:']"));
		uploadWebELem.click();
		Thread.sleep(5000);
		
		Runtime.getRuntime().exec("E:\\uploadFile\\uploadFile1.exe"+" "+"E:\\SeleniumJar\\ATUReport\\index.html");
		
		test1();
		test2();
		test3();
		test4();
	}
	
	
	public static void test1()
	{
		System.out.println("PASS");
	}
	
	public static void test2()
	{
		System.out.println("FAIL");
	}
	
	public static void test3()
	{
		System.out.println("PASS");
	}
	
	public static void test4()
	{
		System.out.println("FAIL");
	}

}
