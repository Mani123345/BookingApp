package org.base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.hamcrest.MatcherAssert;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.pages.HomePage;

public class BaseClass {
	public static WebDriver  driver;
	public static WebDriverWait wait;
	public static WebDriver browserLaunch(String browserName) {
		if(browserName.equalsIgnoreCase("chrome")) {
	        driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("edge")) {
			driver= new EdgeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		return driver;
	}
	
	
	public static void urlLaunch(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	public static void sendKeys(WebElement webElement,String value) {
	   webElement.sendKeys(value);
	}
	
	public static void click(WebElement webElement) {
		webElement.click();
	}
	
	public static String getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}
	
	public static String getTitle() {
		String title = driver.getTitle();
		return title;
	}
	
	public static void assertTrue(Boolean bool) {
		Assert.assertTrue(bool);
	}
    
	public static Boolean stringContains(String s,String containString) {
		return s.contains(containString);
	}
	
	public static Boolean isDisplayedUsingXpath(String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
		return element.isDisplayed();
	}
	
	public static void sleep(int num) throws InterruptedException {
		Thread.sleep(num);
	}
	
	public static void quit() {
		driver.quit();
	}
	
	public static void doubleClickUsingXpath(String xpath) {
		Actions a = new Actions(driver);
		WebElement element = driver.findElement(By.xpath(xpath));
		a.contextClick(element).perform();
	}
	
	public static void rightClickUsingXpath(String xpath) {
		Actions a = new Actions(driver);
		WebElement element = driver.findElement(By.xpath(xpath));
		a.contextClick(element).perform();
	}
	
	public static void enterUsingXpath(String xpath) {
		Actions a = new Actions(driver);
		WebElement element = driver.findElement(By.xpath(xpath));
		a.keyDown(element,Keys.ENTER).perform();
		a.keyUp(element,Keys.ENTER).perform();
	}
	
	
	public static void getScreenshotAs(WebElement webElement,String filename) throws IOException {
	File src = webElement.getScreenshotAs(OutputType.FILE);
	File dest = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\"+filename+".png");
	FileUtils.copyFile(src, dest);

	}
	
	public static void webDriverWait(long seconds,WebElement webElement) {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
	wait.until(ExpectedConditions.visibilityOfElementLocated((By) webElement));
	}
	
	
	public static void refresh() {
		driver.navigate().refresh();
	}
	
	public static boolean isDisplayed(WebElement webElement) {
		return webElement.isDisplayed();
	}
	
	public static void downArrow(int times) {
		Actions a = new Actions(driver);
		for(int i=0;i<times;i++) {
		a.keyDown(Keys.ARROW_DOWN).perform();
		a.keyUp(Keys.ARROW_DOWN).perform();
		}
		a.keyDown(Keys.ENTER).perform();
		a.keyUp(Keys.ENTER).perform();
	}
	public static void calender(HomePage h,String date) {
		 WebElement tableBody = h.getSecondTable().findElement(By.tagName("tbody"));
		   List<WebElement> tableRow = tableBody.findElements(By.tagName("tr"));
		   for(int i=0;i<tableRow.size();i++) {
			   List<WebElement> tableData = tableRow.get(i).findElements(By.tagName("td"));
			   for(int j=0;j<tableData.size();j++) {
				   if(tableData.get(j).getText().equalsIgnoreCase(date)){
					   click(tableData.get(j));
					   break;
				   }
	     	   }  
		 }
	}
	
	public static void clickBasedOnTimes(int times,WebElement webElement) {
		for(int i=1;i<=times;i++) {
			click(webElement);
		}

	}
	public static void selectByIndex(WebElement webElement,int index) {
		Select s = new Select(webElement);
		s.selectByIndex(index);
	}
	
	public static void scrollUp(WebElement webElement) {
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false)", webElement);
	}
	
	public static void scrollDown(WebElement webElement) {
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", webElement);
	}
	
	public static void waitForElement(WebElement webElement) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(webElement));

	}
	public static  void selectByVisibleText(WebElement webElement,String text) {
		Select s = new Select(webElement);
		s.selectByVisibleText(text);
	}
	
	public static void selectByValue(WebElement webElement,String value) {
       Select s = new Select(webElement);
		s.selectByValue(value);
	}
	
	public static void switchToWindows(int windowId) {
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> li =new ArrayList<String>();
		li.addAll(windowHandles);
		driver.switchTo().window(li.get(windowId));
	}
    public static  void switchToFrame(WebElement webElement){
	driver.switchTo().frame(webElement);

    }
    
    public static void assertTrue(boolean bool) {
	 Assert.assertTrue(bool);
    }
    public static void getScreenShot(String scrshotName) throws IOException {
		TakesScreenshot tk =(TakesScreenshot)driver;
		File source = tk.getScreenshotAs(OutputType.FILE);
		File destination = new File("src\\test\\resources\\Screenshots\\"+scrshotName+".png");
        FileUtils.copyFile(source, destination);
	}
     
}
