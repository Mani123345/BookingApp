package org.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReservePage extends BaseClass{
	
	public ReservePage() {
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "(//button[contains(@data-testid,'wishlist-button')])[1]")
	private WebElement wishList;
	
	@FindBy(xpath = "//button[@data-testid='property-share-button']")
	private WebElement share;
	
	@FindBy(id = "hp_book_now_button")
	private WebElement reserve;
	
	@FindBy(xpath ="(//button[contains(@type,'submit')])[3]")
	private WebElement confirmReserve;
	
	@FindBy(xpath = "(//select[@class='hprt-nos-select js-hprt-nos-select'])[1]")
	private WebElement rooms;

	public WebElement getRooms() {
		return rooms;
	}

	public WebElement getConfirmReserve() {
		return confirmReserve;
	}

	public WebElement getWishList() {
		return wishList;
	}

	public WebElement getShare() {
		return share;
	}

	public WebElement getReserve() {
		return reserve;
	}
	
	

}
