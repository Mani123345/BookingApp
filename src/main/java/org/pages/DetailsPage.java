package org.pages;

import java.util.List;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DetailsPage extends BaseClass{
	public DetailsPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(name ="firstname")
	private WebElement firstName;

	@FindBy(name="lastname")
	private WebElement lastName;
	
	@FindBy(name ="email")
	private WebElement email;
	
	@FindBy(name ="cc1")
	private WebElement country;
	
	@FindBy(id ="countryCode")
	private WebElement countryCode;
	
	@FindBy(name ="phoneNumber")
	private WebElement phoneNo;
	
	@FindBy(xpath ="/html/body/div[3]/div/div[3]/div[3]/main/form/div[1]/div/div/div[8]/fieldset/div/div[4]/div/div[1]/div/input")
	private WebElement city;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
	private WebElement freePaperLessConfirmation;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[3]/div[3]/main/form/div[1]/div/div/div[4]/div/div[2]")
	private WebElement invalidEmail;
	

	@FindBy(xpath = "(//input[@type='text'])[4]")
	private WebElement fullGuestName;
	
	@FindBy(xpath = "(//div[@class='a53cbfa6de e6208ee469'])[7]")
	private WebElement interestInAirportShuttle;
	
	@FindBy(xpath = "(//div[@class='a53cbfa6de e6208ee469'])[8]")
	private WebElement needFlightForMyTrip;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[3]/div[3]/main/form/div[4]/div/div/ul/li[2]/div/div/div[1]/div[1]/div/div/label/span[3]/div")
	private WebElement rentingCar;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[3]/div[3]/main/form/section[1]/div/div[2]/div/div[2]/div/div[1]/textarea")
	private WebElement specialRequest;
	
	@FindBy(xpath = "(//span[@class='bui-checkbox__label'])[1]")
	private WebElement freePrivateParking;
	
	@FindBy(xpath = "//select[@name='checkin_eta_hour']")
	private WebElement estimatedArrivalTime;
	
	@FindBy(xpath = "(//span[@class='bui-checkbox__label'])[2]")
	private WebElement extraBed;
	
	@FindBy(id ="bookconditions")
	private WebElement bookingConditions;
	
	@FindBy(xpath ="/html/body/div[3]/div/div[3]/div[3]/main/form/div[7]/div/div/button")
	private WebElement finalDetails;
	
	

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getCountryCode() {
		return countryCode;
	}

	public WebElement getPhoneNo() {
		return phoneNo;
	}

	public WebElement getFreePaperLessConfirmation() {
		return freePaperLessConfirmation;
	}

	public WebElement getFullGuestName() {
		return fullGuestName;
	}

	public WebElement getInterestInAirportShuttle() {
		return interestInAirportShuttle;
	}

	public WebElement getInvalidEmail() {
		return invalidEmail;
	}

	public WebElement getNeedFlightForMyTrip() {
		return needFlightForMyTrip;
	}

	public WebElement getRentingCar() {
		return rentingCar;
	}

	public WebElement getSpecialRequest() {
		return specialRequest;
	}

	public WebElement getFreePrivateParking() {
		return freePrivateParking;
	}

	public WebElement getEstimatedArrivalTime() {
		return estimatedArrivalTime;
	}

	public WebElement getExtraBed() {
		return extraBed;
	}

	public WebElement getBookingConditions() {
		return bookingConditions;
	}

	public WebElement getFinalDetails() {
		return finalDetails;
	}
	
	public WebElement getCity() {
		return city;
	}

	
	

}
