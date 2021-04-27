package org.test.launch;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public  class BaseClass {
	public static  WebDriver  driver;
	//Browser setup
public void getDriver() {
WebDriverManager.chromedriver().setup();
driver =new ChromeDriver();
driver.manage().window().maximize();
}//browser url
public void launchUrl(String data) {
	driver.get(data);
}//by id
public WebElement findElementByid(String data) {
WebElement element = driver.findElement(By.id(data));
return element;
}//by name
public WebElement findElementByname(String data) {
WebElement element = driver.findElement(By.name(data));
return element;
}//by xpath
public WebElement findElementByXpath(String data) {
WebElement element = driver.findElement(By.xpath(data));
return element;
}
//enter Text
public void enterText(WebElement e,String data) {
e.sendKeys(data);
}
//btn click
public void btnClick(WebElement e) {
e.click();
}//get Attribute
public void getAttribute(WebElement e,String data) {
e.getAttribute(data);

}

public void getText(WebElement e) {
	e.getText();

}

public void moveToElement(WebElement e) {
	Actions ac = new Actions(driver);
	ac.moveToElement(e).perform();

}

public void dragAndDrop(WebElement e, WebElement e1) {
	Actions ac = new Actions(driver);
	ac.dragAndDrop(e, e1).perform();

}

public void doubleClick(WebElement e) {
	Actions ac = new Actions(driver);
	ac.doubleClick(e).perform();
}

public void rightClick(WebElement e) {
	Actions ac = new Actions(driver);
	ac.contextClick(e).perform();

}

public void keyUpAndDown(WebElement e, String data) {
	Actions ac = new Actions(driver);
	ac.keyDown(e, Keys.SHIFT).sendKeys(e, data).keyUp(e, Keys.SHIFT).perform();

}

public void alerts(String data) {
	Alert a = driver.switchTo().alert();
	a.accept();
	a.dismiss();
	a.sendKeys(data);

}

public void jSText(String data, WebElement e) {
	JavascriptExecutor j = (JavascriptExecutor) driver;
	j.executeScript("arguments[0].setAttribute('value','" + data + "')", e);

}

public void jsClick(WebElement e) {
	JavascriptExecutor j = (JavascriptExecutor) driver;
	j.executeScript("arguments[0].click()", e);
}

public void jSGetAtt(String data, WebElement e) {
	JavascriptExecutor j = (JavascriptExecutor) driver;
	j.executeScript("arguments[0].getAttribute('value','" + data + "')", e);
}

public void jSScrollDown(String data, WebElement e) {
	JavascriptExecutor j = (JavascriptExecutor) driver;
	j.executeScript("arguments[0].scrollIntoView(true)", e);

}

public void jSScrollUp(String data, WebElement e) {
	JavascriptExecutor j = (JavascriptExecutor) driver;
	j.executeScript("arguments[0].scrollIntoView(false)", e);
}

public void selectByIndex(WebElement e, int number) {
	Select s = new Select(e);
	s.selectByIndex(number);

}

public void selectByValue(WebElement e, String data) {
	Select s = new Select(e);
	s.selectByValue(data);
}

public void selectByVisible(WebElement e, String data) {
	Select s = new Select(e);
	s.selectByVisibleText(data);
}

public void deselectByIndex(WebElement e, int number) {
	Select s = new Select(e);
	s.deselectByIndex(number);

}

public void deSelectByValue(WebElement e, String data) {
	Select s = new Select(e);
	s.deselectByValue(data);
}

public void deselectByVisible(WebElement e, String data) {
	Select s = new Select(e);
	s.deselectByVisibleText(data);
}

// 24
public void getOptionBySelect(WebElement e) {
	Select s = new Select(e);
	s.getOptions();
}

// 25
public void getAllSelect(WebElement e) {
	Select s = new Select(e);
	s.getAllSelectedOptions();

}
//26
public void getFirstSelect(WebElement e) {
	Select s = new Select(e);
	s.getFirstSelectedOption();

}
//27
public void isMultiple(WebElement e) {
	Select s = new Select(e);
	s.isMultiple();

}
//28
public void deselectALL(WebElement e) {
	Select s = new Select(e);
	s.deselectAll();

}
//29
public void getSize(WebElement e) {
	e.getSize();

}
//30
public void frames(int number,String data,WebElement e) {
driver.switchTo().frame(number);
driver.switchTo().frame(data);
driver.switchTo().frame(e);
driver.switchTo().parentFrame();
driver.switchTo().defaultContent();

}
//31

public void findElements(String data) {
  driver.findElements(By.tagName(data));

}

//32
public void screenShot() {
  TakesScreenshot s = (TakesScreenshot) driver;
  s.getScreenshotAs(OutputType.FILE);

}
//33
public void windowsHandling(String data) {
driver.getWindowHandle();
driver.getWindowHandles();
driver.switchTo().window(data);

}
//34
public void navigation(String data) {
driver.navigate().to(data);	
driver.navigate().forward();	
driver.navigate().back();	
driver.navigate().refresh();	
}
}
