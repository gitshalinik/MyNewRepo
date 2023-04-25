package com.pack1;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


// Case 1: How to close Unwanted Browser/Tab

public class WindowHandling1 {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\NEW_FRAMEWORK\\SampleProject\\Server\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.irctctourism.com/");
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Bus Tickets']")));
		
		WebElement busTktWebElem = driver.findElement(By.xpath("//span[text()='Bus Tickets']"));
		busTktWebElem.click();
		
		Thread.sleep(4000);
		
		// Capture main window id
		String mainWinId = driver.getWindowHandle();
		
		// Capture all win ID
		Set<String> allWInID = driver.getWindowHandles();
		
		String expectedTitleVal = "Bus Reservation";
		
		
		for(String winId: allWInID)
		{
			driver.switchTo().window(winId);
			String actualTitle = driver.getTitle();
			if(actualTitle.contains(expectedTitleVal))
			{
				WebElement busPageWebELm = driver.findElement(By.xpath("//h2[text()='Trending Packages ']"));
				System.out.println(busPageWebELm.getText());
				driver.close();
			}
		}
		
		// Switch back to main window
		driver.switchTo().window(mainWinId);
	}

}
