package org.test.adactin;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Adactinhotel {
	WebDriver driver;
@BeforeClass
private void browserLaunch() {
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
driver.get("http://adactinhotelapp.com/");
driver.manage().window().maximize();
}
@AfterClass
private void browserClose() {
driver.quit();
}
@Test
private void login() {
driver.findElement(By.id("username")).sendKeys("tester");
driver.findElement(By.id("password")).sendKeys("password");
driver.findElement(By.id("login")).click();
}
@BeforeMethod
private void beforeTime() {
Date date=new Date();
System.out.println(date);
}
@AfterMethod
private void afterMethod() {
Date date=new Date();
System.out.println(date);
}
}
