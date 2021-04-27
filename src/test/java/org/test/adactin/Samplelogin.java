package org.test.adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.test.launch.BaseClass;

public class Samplelogin extends BaseClass{
	public static void main(String[] args) {
	BaseClass bs = new BaseClass();
	bs.getDriver();
	bs.launchUrl("http://adactinhotelapp.com/index.php");
	Adactin ada=new Adactin();
	WebElement txtusername = ada.getTxtusername();
	bs.enterText(txtusername, "karthi007");
	WebElement txtpassword = ada.getTxtpassword();
	bs.enterText(txtpassword, "Karthi@1989");
	WebElement btnlogin = ada.getBtnlogin();
	btnlogin.click();
	SearchHotel searchhotel= new SearchHotel();
	WebElement selectLOcation = searchhotel.getSelectLOcation();
	bs.selectByIndex(selectLOcation, 3);
	WebElement selectHotel = searchhotel.getSelectHotel();
	bs.selectByIndex(selectHotel, 4);
	WebElement selectRoom = searchhotel.getSelectRoom();
	bs.selectByIndex(selectRoom, 3);
	WebElement noofRooms = searchhotel.getNoofRooms();
	bs.selectByIndex(noofRooms, 2);
	WebElement datepick = searchhotel.getDatepick();
	datepick.clear();
	bs.enterText(datepick, "28-04-2021");
	WebElement dateout = searchhotel.getDateout();
	dateout.clear();
	bs.enterText(dateout, "29-04-2021");
	WebElement adultRoom = searchhotel.getAdultRoom();
	bs.selectByIndex(adultRoom, 2);
	WebElement childRoom = searchhotel.getChildRoom();
	bs.selectByIndex(childRoom, 2);
	WebElement submit = searchhotel.getSubmit();
	submit.click();
	SelectDetails details=new SelectDetails();
	WebElement clkbtn = details.getClkbtn();
	clkbtn.click();
	WebElement continuebtn = details.getContinuebtn();
	continuebtn.click();
	PaymentPage payment=new PaymentPage();
	WebElement firstName = payment.getFirstName();
	bs.enterText(firstName, "Tamil selvan");
	WebElement lastName = payment.getLastName();
    bs.enterText(lastName, "G");
    WebElement address = payment.getAddress();
    bs.enterText(address, "chennai");
    WebElement cardNumber = payment.getCardNumber();
    bs.enterText(cardNumber, "9876543210012345");
    WebElement btnCardtype = payment.getBtnCardtype();
    bs.selectByIndex(btnCardtype, 2);
    WebElement btnExpmonth = payment.getBtnExpmonth();
    bs.selectByIndex(btnExpmonth, 6);
    WebElement btnExpyear = payment.getBtnExpyear();
    bs.selectByIndex(btnExpyear, 5);
    WebElement btncvv = payment.getBtncvv();
    bs.enterText(btncvv, "251");  
    WebElement btnclick = payment.getBtnclick();
    btnclick.click();
    BookingInformation bookinfo=new BookingInformation();
    WebElement btnitinerary = bookinfo.getBtnitinerary();
    btnitinerary.click();
	}


}
