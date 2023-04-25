package com.pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Test1
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\NEW_FRAMEWORK\\SampleProject\\Server\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		// Implicitly Wait
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		
		WebElement txtWebElm = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps')]"));
		
		Actions act = new Actions(driver);
		
		act.doubleClick(txtWebElm).perform();
		
		
		// Control+C
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
		Thread.sleep(2000);
		
		WebElement emailTxtWebElem = driver.findElement(By.id("email"));
		
		// Control+V
		act.keyDown(emailTxtWebElem, Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		WebElement pw = driver.findElement(By.id("pass"));
		pw.sendKeys("Abcd@123");
		
		act.sendKeys(Keys.ENTER).perform();
	
		
	}

}
