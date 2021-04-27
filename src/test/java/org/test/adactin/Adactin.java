package org.test.adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.launch.BaseClass;

public class Adactin extends BaseClass {
public Adactin() {
PageFactory.initElements(driver, this);
}@FindBy(id="username")
private WebElement txtusername;
@FindBy(id="password")
private WebElement txtpassword;
@FindBy(id="login")
private WebElement btnlogin;
public WebElement getTxtusername() {
	return txtusername;
}
public WebElement getTxtpassword() {
	return txtpassword;
}
public WebElement getBtnlogin() {
	return btnlogin;
}
}
