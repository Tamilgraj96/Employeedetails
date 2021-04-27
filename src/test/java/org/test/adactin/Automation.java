package org.test.adactin;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automation {
WebDriver driver;
@BeforeClass
private void browserLaunch() {
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
driver.get("http://demo.automationtesting.in/Register.html");
driver.manage().window().maximize();
}
@Test
@Parameters({"firstName","last","add","email","phone"})
private void insertValues(String firstName,String last ,String add ,String email,String phone) {
 driver.findElement(By.xpath("//input[@ng-model=\"FirstName\"]")).sendKeys(firstName);
 driver.findElement(By.xpath("//input[@ng-model=\'LastName\']")).sendKeys(last);
 driver.findElement(By.xpath("//textarea[@ng-model=\'Adress\']")).sendKeys(add);
driver.findElement(By.xpath("//input[@ng-model=\'EmailAdress\']")).sendKeys(email);
driver.findElement(By.xpath("//input[@ng-model=\'Phone\']")).sendKeys(phone);
driver.findElement(By.xpath("//input[@value=\"Male\"]")).click();
driver.findElement(By.xpath("//input[@value=\"Cricket\"]")).click();
driver.findElement(By.xpath("//div[@id=\"msdd\"]")).click();
driver.findElement(By.xpath("//a[text()='English']")).click();
WebElement skills = driver.findElement(By.id("Skills"));
Select s=new Select(skills);
s.selectByIndex(10);
WebElement country = driver.findElement(By.id("countries"));
Select s1=new Select(country);
s1
.selectByIndex(10);


}
}
