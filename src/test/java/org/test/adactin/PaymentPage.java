package org.test.adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.launch.BaseClass;

public class PaymentPage extends BaseClass {
public PaymentPage() {
PageFactory.initElements(driver, this);
}
@FindBy(name="first_name")
private WebElement firstName;
@FindBy(name="last_name")
private WebElement lastName;
@FindBy(name="address")
private WebElement address;
@FindBy(name="cc_num")
private WebElement cardNumber;
@FindBy(name="cc_type")
private WebElement btnCardtype;
@FindBy(name="cc_exp_month")
private WebElement btnExpmonth;
@FindBy(name="cc_exp_year")
private WebElement btnExpyear;
@FindBy(name="cc_cvv")
private WebElement btncvv;
@FindBy(name="book_now")
private WebElement btnclick;
@FindBy(name="cancel")
private WebElement btncancel;
public WebElement getFirstName() {
	return firstName;
}
public WebElement getLastName() {
	return lastName;
}
public WebElement getAddress() {
	return address;
}
public WebElement getCardNumber() {
	return cardNumber;
}
public WebElement getBtnCardtype() {
	return btnCardtype;
}
public WebElement getBtnExpmonth() {
	return btnExpmonth;
}
public WebElement getBtnExpyear() {
	return btnExpyear;
}
public WebElement getBtncvv() {
	return btncvv;
}
public WebElement getBtnclick() {
	return btnclick;
}
public WebElement getBtncancel() {
	return btncancel;
}
}
