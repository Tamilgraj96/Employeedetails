package org.test.launch;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownPrint {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Tamilselvan\\\\eclipse-workspace\\\\Selenium\\\\driver\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		WebElement countries = driver.findElement(By.id("countries"));
		countries.click();
		Select s=new Select(countries);
		List<WebElement> allopt = s.getOptions();
		File fi=new File("C:\\Users\\Tamilselvan\\eclipse-workspace\\MavenLaunch\\Excel Sheet\\dropdown.xlsx");
		Workbook w=new XSSFWorkbook();
		Sheet sh = w.createSheet("Value");
		for (int i = 0; i < allopt.size(); i++) {
			WebElement a = allopt.get(i);
			String text = a.getText();
			System.out.println(text);
			Row r = sh.createRow(i);
			Cell c = r.createCell(0);
			c.setCellValue(text);
		}
		FileOutputStream out=new FileOutputStream(fi);
		w.write(out);
		
}}
