package org.pages;

import java.util.List;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingPage extends BaseClass {
	
	public WebElement getCloseMap() {
		return closeMap;
	}
	public WebElement getFreeCancellation() {
		return freeCancellation;
	}
	public BookingPage() {
		PageFactory.initElements(driver, this);
	}
	public List<WebElement> getListOfHotels(){
		return listOfHotels;
	}
	public List<WebElement> getRatings() {
		return ratings;
	}
	public List<WebElement> getPrices() {
		return prices;
	}

	public List<WebElement> getAllImages() {
		return allImages;
	}
	
	@FindBy(xpath = "//div[contains(text(),'Book without credit card')]")
	private WebElement bookWithoutCreditCard;
	
	public WebElement getBookWithoutCreditCard() {
		return bookWithoutCreditCard;
	}

	@FindBy(xpath = "//button[@aria-label='Close map']")
	private WebElement closeMap;
	
	@FindBy(xpath = "(//div[contains(text(),'Free cancellation')])[1]")
	private WebElement freeCancellation;
	
	@FindBy(xpath = "//div[contains(@data-testid,'title')]")
    private List<WebElement> listOfHotels;
	
	@FindBy(xpath ="//div[contains(text(),'Scored')]")
	private List<WebElement> ratings;
	
	@FindBy(xpath ="//span[contains(@data-testid,'price-and-discounted-price')]")
	private List<WebElement> prices;
	
	@FindBy(xpath = "//img[@data-testid='image']")
	private List<WebElement> allImages;


	
	
	
}
