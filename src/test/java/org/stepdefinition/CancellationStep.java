package org.stepdefinition;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.pages.BookingPage;
import org.pages.CheckBooking;
import org.pages.DetailsPage;
import org.pages.HomePage;
import org.pages.PaymentPage;
import org.pages.ReservePage;

import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;

public class CancellationStep extends BaseClass{
	static HomePage h ;
	static BookingPage b;
	boolean displayed;
	static ReservePage r;
	static DetailsPage d;
	Scanner sc = new Scanner(System.in);
	@Given("The user need to Book the application")
	public void the_user_need_to_Book_the_application() throws InterruptedException {
	   h = new HomePage();
	   sendKeys(h.getGoing(),"chennai");
	   Thread.sleep(3000);
	   downArrow(2);
//	   System.out.println("Enter the CheckInDate : ");
//	   String cidate = sc.nextLine();
//	   System.out.print("Enter the CheckOutDate : ");
//	   String codate = sc.nextLine();
	   try {
	   calender(h,"21");
	   calender(h,"25");
	   }
	   catch (Exception e) {
	    System.out.println("Pass Through.");
	   }
	  
	   click(h.getMembers());
	   clickBasedOnTimes(1,h.getIadult());
	   clickBasedOnTimes(1,h.getIchild());
	   selectByIndex(h.getChildAges(),4);
	   clickBasedOnTimes(1,h.getIrooms());
	   Thread.sleep(1000);
	   click(h.getSearch());
	}

	@When("The user now Select the Hotel")
	public void the_user_now_Select_the_Hotel() throws InterruptedException, IOException {
       
	    b=new BookingPage();
	    waitForElement(b.getCloseMap());
	    if(b.getCloseMap().isDisplayed()) {
	    click(b.getCloseMap());
	    }
	    else {
	    	System.out.println("No MAP");
	    }
	   
	    if(b.getFreeCancellation().isDisplayed()) {
	    	click(b.getFreeCancellation());
	    }
	    click(b.getBookWithoutCreditCard());
	    
	    File f = new File("E:\\Eclipse\\eclipse\\BookingApp\\src\\test\\resources\\Excel\\.xlsx");
	    Workbook w = new XSSFWorkbook();
	    Sheet s = w.createSheet("Login");
	    for(int i=0;i<b.getListOfHotels().size()-5;i++) {
	    	Row r = s.createRow(i);
	    	for(int j=0;j<1;j++) {
	    	r.createCell(j).setCellValue(b.getListOfHotels().get(i).getText());
	    	r.createCell(j+1).setCellValue(b.getRatings().get(i).getText());
	    	r.createCell(j+2).setCellValue(b.getPrices().get(i).getText());
	    	}
	    }
	    FileOutputStream fo = new FileOutputStream(f);
	  	w.write(fo);
	    System.out.println("--------------------");
//	    System.out.println("Enter the HotelNo : ");
//	    int hotelNo = sc.nextInt();
	    click(b.getAllImages().get(6));
	    switchToWindows(1);
	}
	

    
        @When("the user need to reserve the Hotel and fill all details{string}")
        public void the_user_need_to_reserve_the_Hotel_and_fill_all_details(String type) throws InterruptedException { 
       if(type.equalsIgnoreCase("valid")) {
        r = new ReservePage();
	    click(r.getReserve());
	    Thread.sleep(2000);
	    selectByIndex(r.getRooms(),1);
	    click(r.getConfirmReserve());
	    Thread.sleep(2000);
	    d = new DetailsPage();
	    sendKeys(d.getFirstName(),"Manicom");
	    sendKeys(d.getLastName(),"S");
	    sendKeys(d.getEmail(),"Abc@gmail.com");
	    selectByVisibleText(d.getCountry(),"India");
	    selectByValue(d.getCountryCode(),"in");
	    sendKeys(d.getPhoneNo(),"7898456578");
	    sendKeys(d.getFullGuestName(),"Peace");
	    click(d.getRentingCar());
	    sendKeys(d.getSpecialRequest(),"Seeking a hotel in Chennai for the night of April 10, 2025. Budget is ₹15,000 per night. A hotel with a gym is required");
	    selectByIndex(d.getEstimatedArrivalTime(),5);
	    click(d.getFinalDetails()); 
       }
       if(type.equalsIgnoreCase("invalid")) {
    	r = new ReservePage();
    	click(r.getReserve());
   	    Thread.sleep(2000);
   	    selectByIndex(r.getRooms(),1);
   	    click(r.getConfirmReserve());
   	    Thread.sleep(2000);
   	    d = new DetailsPage();
   	    sendKeys(d.getFirstName(),"Manicom");
   	    sendKeys(d.getLastName(),"S");
   	    sendKeys(d.getEmail(),"Abc");
   	    click(d.getFinalDetails()); 
       }
	}
	
	@When("The user Confirm the booking")
	public void the_user_Confirm_the_booking() throws InterruptedException {
	    Thread.sleep(2000);
		PaymentPage p = new PaymentPage();
		click(p.getCompleteBooking());
		displayed= isDisplayed(p.getErrorMessage());
	}

	@When("The user click the cancellation btn")
	public void the_user_click_the_cancellation_btn() {
	   assertTrue(displayed);
	}


	@Then("The user receive the email{string}")
	public void the_user_receive_the_email(String email) {
	    if(email.equalsIgnoreCase("booked")) {
	    	CheckBooking c = new CheckBooking();
	    	click(c.getCheckBooking());
	    	if(c.getCompleteMyBooking().getText().contains("Complete booking")) {
	    		System.out.println("Hotel Booked.");
	    		System.out.println("Eamil Received.....");
	    	}
	    }
	    else if(email.equalsIgnoreCase("cancelled")) {
	    	System.out.println("Email Received .  ");
		    System.out.println("Done Good Job......");
	    }
	    else {
	    	System.out.println("Not done!");
	    }
	}

	@Then("The user receive the Error Message")
	public void the_user_receive_the_Error_Message() {
		System.out.println("here........................");
		System.out.println(isDisplayed(d.getInvalidEmail()));
	    if(isDisplayed(d.getInvalidEmail())) {
	    	System.out.println("invalid Details Booking incompleted");
	    }
	    else {
	    	System.out.println("retry...");
	    }
	}

}
