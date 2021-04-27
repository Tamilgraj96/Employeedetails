package org.test.launch;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	public static void main(String[] args) {
	//	WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Tamilselvan\\\\eclipse-workspace\\\\Selenium\\\\driver\\\\chromedriver.exe ");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement txtemail = driver.findElement(By.id("email"));
		txtemail.sendKeys("tet@123");
		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys("password");
		WebElement btnlogin = driver.findElement(By.name("login"));
		btnlogin.click();
	}
}
