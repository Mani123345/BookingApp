package org.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckBooking  extends BaseClass{
public CheckBooking() {
	PageFactory.initElements(driver,this);
}
	
	
	@FindBy(name ="review")
	private WebElement checkBooking;
	
	@FindBy(name = "book")
	private WebElement completeMyBooking;

	public WebElement getCheckBooking() {
		return checkBooking;
	}

	public WebElement getCompleteMyBooking() {
		return completeMyBooking;
	}
}
