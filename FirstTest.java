package com.ameer.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {
	
	@Test
	public void TestGoogle() throws InterruptedException 
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("hyr Tutorials",Keys.ENTER);
		Thread.sleep(3000);
		driver.quit();
		
	}
	
	
	@Test
	public void TestFacebook() throws InterruptedException 
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("(//input[@id='email'])[1]")).sendKeys("mahammadameer0502@gmail.com");
		driver.findElement(By.xpath("(//input[@id='pass'])[1]")).sendKeys("Tashuammu@241");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		driver.quit();
		
	}

}
