package org.test.adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.launch.BaseClass;

public class SearchHotel extends BaseClass {
public SearchHotel() {
	PageFactory.initElements(driver, this);
}
@FindAll({@FindBy(xpath="//select[@id='location']"),@FindBy(name="location")})
private WebElement selectLOcation; 
@FindAll({@FindBy(xpath="//select[@id=\'hotels\']"),@FindBy(id="hotels")})
private WebElement selectHotel;
@FindAll({@FindBy(xpath="//select[@id=\"room_type\"]"),@FindBy(id="room_type")})
private WebElement selectRoom;
@FindAll({@FindBy(xpath="//select[@id=\"room_nos\"]"),@FindBy(id="room_nos")})
private WebElement NoofRooms;
@FindBy(name="datepick_in")
private WebElement datepick;
@FindBy(name="datepick_out")
private WebElement dateout;
@FindBy(name="adult_room")
private WebElement adultRoom;
@FindBy(name="child_room")
private WebElement childRoom;
@FindBy(name="Submit")
private WebElement submit;
public WebElement getSelectLOcation() {
	return selectLOcation;
}
public WebElement getSelectHotel() {
	return selectHotel;
}
public WebElement getSelectRoom() {
	return selectRoom;
}
public WebElement getNoofRooms() {
	return NoofRooms;
}
public WebElement getDatepick() {
	return datepick;
}
public WebElement getDateout() {
	return dateout;
}
public WebElement getAdultRoom() {
	return adultRoom;
}
public WebElement getChildRoom() {
	return childRoom;
}
public WebElement getSubmit() {
	return submit;
}




}













