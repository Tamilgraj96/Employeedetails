package org.test.launch;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JunitAssertion {
	static WebDriver driver;
	@BeforeClass
	public static void browserLaunch() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("http://www.facebook.com/");
	driver.manage().window().maximize();
	}
	@AfterClass
	public static void browserClose() {
	driver.quit();
	}
@Test
public void test() {
String title = driver.getTitle();
boolean b = title.contains("log in");
Assert.assertTrue("verify title", b);
WebElement txtusername = driver.findElement(By.id("email"));
txtusername.sendKeys("hello");
String name = txtusername.getAttribute("value");
Assert.assertEquals("verify username","hello",name);
WebElement txtpass = driver.findElement(By.id("pass"));
txtpass.sendKeys("password");
String pass = txtpass.getAttribute("value");
Assert.assertEquals("verify username","password",pass);
WebElement btnlogin = driver.findElement(By.name("login"));
btnlogin.click();
}
}
