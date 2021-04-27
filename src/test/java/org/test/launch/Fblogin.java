package org.test.launch;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fblogin {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Tamilselvan\\\\eclipse-workspace\\\\Selenium\\\\driver\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		File file = new File("C:\\Users\\Tamilselvan\\eclipse-workspace\\MavenLaunch\\Excel Sheet\\mavenexcel.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook w = new XSSFWorkbook(stream);
		Sheet s = w.getSheet("fb");
		Row r = s.getRow(1);
		Cell c = r.getCell(0);
        Cell c1 = r.getCell(1);
		String name = c.getStringCellValue();
		double pass = c1.getNumericCellValue();
	   long l = (long)pass;
	   String password = String.valueOf(l);
		WebElement txtemail = driver.findElement(By.id("email"));
		txtemail.sendKeys(name);
		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys(password);
		WebElement btnlogin = driver.findElement(By.name("login"));
		btnlogin.click();
		//WebElement errormsg = driver.findElement(By.xpath("//div[@class=\"_9ay7\"]"));
		//String txt = errormsg.getText();
		Cell c2 = r.createCell(4);
		c2.setCellValue("tamil");
	//	System.out.println(txt);
		FileOutputStream out=new FileOutputStream(file);
		w.write(out);
		
		
	}}
