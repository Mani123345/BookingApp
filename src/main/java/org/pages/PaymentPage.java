package org.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage extends BaseClass{
	
	public PaymentPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(name ="book")
	private WebElement completeBooking;
	
	@FindBy(name = "name")
	private WebElement cardHolderName;
	
	public WebElement getCardHolderName() {
		return cardHolderName;
	}
	
	public WebElement getIframe() {
		return iframe;
	}
	
	@FindBy(xpath = "//iframe[@title='Payment']")
	private WebElement iframe;

	@FindBy(name = "cvc")
    private WebElement cvc;
	
	@FindBy(xpath = "/html/body/div[2]/div/div[3]/div[3]/main/form/div[2]/div/div/a")
	private WebElement errorMessage;
	
	
	public WebElement getErrorMessage() {
		return errorMessage;
	}

	public WebElement getCvc() {
		return cvc;
	}

	@FindBy(xpath = "/html/body/div[1]/div/div/div/div[2]/form/div[2]/div[1]/div/input[1]")
	private WebElement cardNumber;
	
	@FindBy(xpath = "/html/body/div[1]/div/div/div/div[2]/form/div[3]/div/div[1]/div/input[1]")
	private WebElement expDate;
	
	public WebElement getCardNumber() {
		return cardNumber;
	}

	public WebElement getExpDate() {
		return expDate;
	}

	public WebElement getCompleteBooking() {
		return completeBooking;
		
	}

}
