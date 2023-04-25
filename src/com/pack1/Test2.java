package com.pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test2 
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\NEW_FRAMEWORK\\SampleProject\\Server\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		
		WebElement w1 = driver.findElement(By.xpath("//a[contains(text(),'Create new account')]"));
		w1.click();
		Thread.sleep(10000);
		
		WebElement monthDD = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select sel = new Select(monthDD);
		
		List<WebElement> allOpt = sel.getOptions();
		
		int len = allOpt.size();
		
		String[] s1 = new String[len];
		int i=0;
		
		for(WebElement w: allOpt)
		{
			String val = w.getText();
			s1[i] = val;
			i++;
		}
		
		String[] sortedArr = soryArray(s1);
		
		for(String s: sortedArr)
		{
			System.out.println(s);
		}
		
	}
	
	static String[] soryArray(String[] arr)
	{
		int len = arr.length;
		
		for(int i=0; i<=len-1; i++)
		{
			for(int j=i+1; j<=len-1; j++)
			{
				int a = arr[j].compareTo(arr[i]);
				if(a<0)
				{
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
}
