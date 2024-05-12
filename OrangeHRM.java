package com.ameer.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM {
	WebDriver driver;
@Test	
public void LanuchApp() throws InterruptedException
{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	Thread.sleep(3000);
}
@Test
public void EnterLoginDetails() throws InterruptedException
{
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	Thread.sleep(3000);
	driver.findElement(By.xpath("txtPassword")).sendKeys("admin123");
	Thread.sleep(3000);
	driver.findElement(By.xpath("btnlogin")).click();
}
}
