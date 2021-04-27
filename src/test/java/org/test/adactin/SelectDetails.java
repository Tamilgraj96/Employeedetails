package org.test.adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.launch.BaseClass;

public class SelectDetails extends BaseClass{
public SelectDetails() {
	PageFactory.initElements(driver, this);
}
@FindBy(name="radiobutton_0")
private WebElement clkbtn;
@FindBy(name="continue")
private WebElement continuebtn;
public WebElement getClkbtn() {
	return clkbtn;
}
public WebElement getContinuebtn() {
	return continuebtn;
}

}
