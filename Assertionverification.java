package com.ameer.test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertionverification {

	@Test
	public void TestFacebook() throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("(//input[@id='email'])[1]")).sendKeys("mahammadameer0502@gmail.com");
		driver.findElement(By.xpath("(//input[@id='pass'])[1]")).sendKeys("Yuhaan@241");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		
		//Title assertion
		String actualTitle =driver.getTitle();
		String expectedTitle = "Log in to Facebook";
		assertEquals(actualTitle,expectedTitle, "Title is mismatched" );
		
		//URL assertion
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl= "https://www.facebook.com/";
		assertEquals(actualUrl, expectedUrl, "URL is mismatched");
		
		//Text Assertion
		String actualText = driver.findElement(By.name("email")).getAttribute("value");
		String expectedText = "mahammadameer0502@gmail.com";
		assertEquals(actualUrl, expectedUrl, "Username text  is mismatched");
		
		//Border assertion
		String actualBorder =driver.findElement(By.name("email")).getCssValue("boder");
		String expectedBorder = "1px solid rgb(221, 223, 226)";
		assertEquals(actualBorder,expectedBorder, " Username border is mismatched" );
		
		
		//errormessage 
				driver.quit();
		
	}
}
