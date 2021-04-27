package org.test.adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.launch.BaseClass;

public class BookingInformation extends BaseClass{
public BookingInformation() {
PageFactory.initElements(driver, this);
}
@FindBy(id="search_hotel")
private WebElement btnSearch;
@FindBy(name="my_itinerary")
private WebElement btnitinerary;
@FindBy(name="logout")
private WebElement btnLogout;
public WebElement getBtnSearch() {
	return btnSearch;
}
public WebElement getBtnitinerary() {
	return btnitinerary;
}
public WebElement getBtnLogout() {
	return btnLogout;
}
}
