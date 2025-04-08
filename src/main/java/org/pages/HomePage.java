package org.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass {
	
	public HomePage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(name ="ss")
	private WebElement going;
	
	@FindBy(xpath = "(//span[contains(text(),'Check')])[1]")
	private WebElement checkInDate;
	
	@FindBy(xpath = "(//span[contains(text(),'Check')])[2]")
	private WebElement checkOutDate;
	
	@FindBy(xpath = "(//table[@class='eb03f3f27f'])[1]")
	private WebElement firstTable;
	
	@FindBy(xpath = "(//table[@class='eb03f3f27f'])[2]")
	private WebElement secondTable;
	
	@FindBy(xpath = "//span[@data-testid='occupancy-config-icon']")
	private WebElement members;
	
	@FindBy(xpath = "(//span[@class='eedba9e88a'])[2]")
	private WebElement Dadult;
	
	@FindBy(xpath = "(//span[@class='eedba9e88a'])[3]")
	private WebElement Iadult;
	
	@FindBy(xpath = "(//span[@class='eedba9e88a'])[4]")
	private WebElement Dchild;
	
	@FindBy(xpath = "(//span[@class='eedba9e88a'])[5]")
	private WebElement Ichild;
	
	@FindBy(xpath = "(//span[@class='eedba9e88a'])[6]")
	private WebElement Drooms;
	
	@FindBy(xpath = "(//span[@class='eedba9e88a'])[7]")
	private WebElement Irooms;
	
	@FindBy(name = "age")
	private WebElement childAges; 
	
	@FindBy(xpath = "(//button[@type='button'])[14]")
	private WebElement done;
	
	@FindBy(xpath="//*[@id=\"indexsearch\"]/div[2]/div/form/div/div[4]/button")
	private WebElement search;
	
	

	public WebElement getDone() {
		return done;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getMembers() {
		return members;
	}

	public WebElement getDadult() {
		return Dadult;
	}

	public WebElement getIadult() {
		return Iadult;
	}

	public WebElement getDchild() {
		return Dchild;
	}

	public WebElement getIchild() {
		return Ichild;
	}

	public WebElement getDrooms() {
		return Drooms;
	}

	public WebElement getIrooms() {
		return Irooms;
	}

	public WebElement getChildAges() {
		return childAges;
	}

	public WebElement getGoing() {
		return going;
	}

	public WebElement getCheckInDate() {
		return checkInDate;
	}

	public WebElement getCheckOutDate() {
		return checkOutDate;
	}

	public WebElement getFirstTable() {
		return firstTable;
	}

	public WebElement getSecondTable() {
		return secondTable;
	}


}
