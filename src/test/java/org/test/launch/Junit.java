package org.test.launch;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Junit {
	static WebDriver driver;
@BeforeClass
public static void browserLaunch() {
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
driver.get("http://adactinhotelapp.com/");
driver.manage().window().maximize();
}
@AfterClass
public static void browserClose() {
driver.quit();
}
@Before
public void beforeMethod() {
	Date date=new Date();
	System.out.println(date);
}
@After
public void afterMethod() {
	Date date= new Date();
	System.out.println(date);
}
@Test
public void test() {
//WebElement 
 driver.findElement(By.id("username")).sendKeys("Testuser");
//txtuserName.sendKeys("Testuser");
//WebElement txtPassword 
 driver.findElement(By.id("password")).sendKeys("Password");
//txtPassword.sendKeys("Password");
WebElement btnlogin = driver.findElement(By.id("login"));
btnlogin.click();
}










}
