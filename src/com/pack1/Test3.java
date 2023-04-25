package com.pack1;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test3 {

	public static void main(String[] args) throws Exception
	{

		System.setProperty("webdriver.chrome.driver", "E:\\NEW_FRAMEWORK\\SampleProject\\Server\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jdwilliams.co.uk/");
		// implicitlyWait --> will for every page navigation
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		try
		{
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[text()='Accept All Cookies']")));
			
			driver.findElement(By.xpath("//button[text()='Accept All Cookies']")).click();
		} 
		catch (Exception e) {}
		
		WebElement newInWebELm = driver.findElement(By.id("topNav_NewIn"));
		newInWebELm.click();
		
		// Explicitly Wait
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//img[@class='js-plp-image'])[1]")));
		
		WebElement w1 = driver.findElement(By.xpath("(//img[@class='js-plp-image'])[1]"));
		w1.click();
		
		// Fluent Wait
		Wait<WebDriver> fwait = new FluentWait<WebDriver>(driver)
						.withTimeout(60, TimeUnit.SECONDS)
						.pollingEvery(2, TimeUnit.SECONDS)
						.ignoring(NoSuchElementException.class);
		
		WebElement addToBagWebElm = fwait.until(new Function<WebDriver, WebElement>() {
			
			public WebElement apply(WebDriver driver)
			{
				WebElement w1 = driver.findElement(By.xpath("//button[text()='Write a review']"));
				return w1;
			}
		});
		
		addToBagWebElm.click();
		
	}

}
