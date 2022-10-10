package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import drivers.PageDriver;
import utilities.CommonMethods;
import utilities.GetScreenShot;

public class HomePage extends CommonMethods{
	
	ExtentTest test;
	
	public HomePage(ExtentTest test) {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		this.test = test;
	}
	
	@FindBy(id = "nav-menu-item-721")
	WebElement hoverBangla;

	@FindBy(css = "li[id='nav-menu-item-779']")
	WebElement selectkolpobiggyan;
	
	@FindBy(xpath = "//div[@class='shop-loop-after clearfix']//a[@class='next page-numbers']")
	WebElement goToNext;
	
	@FindBy(xpath = "//div[@class='inner']//img[@alt='বৈজ্ঞানিক কল্পকাহিনী প্রডিজি']")
	WebElement selectBook;
	
	@FindBy(xpath = "//button[@value='1412']")
	WebElement addCart;
	
	public void hoverAtBangla() throws IOException {
		test.info("Hover at Bangla");
		try {
			if (hoverBangla.isDisplayed()) { 
				hover(hoverBangla);
				sleep(5000);
				test.pass("<p style=\"color:green; font-size:13px\"><b>Bangla hovered.</b></p>");
				sleep();
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "hoverBanglaPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "hoverBanglaPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Bangla location not avialble.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "hoverBanglaFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "hoverBanglaFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(hoverBangla.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	
	public void clickOnKolpobiggyan() throws IOException {
		test.info("Click on kolpobiggyan");
		try {
			if (selectkolpobiggyan.isDisplayed()) {
				selectkolpobiggyan.click();
				test.pass("<p style=\"color:green; font-size:13px\"><b>Kolpobiggyan Clicked.</b></p>");
				sleep(5000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "clickKolpobiggyanPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "clickKolpobiggyanPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
			
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Kolpobiggyan not locateable.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "clickKolpobiggyanFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "clickKolpobiggyanFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(selectkolpobiggyan.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		sleep(8000);
	}
	
	public void scrollAndNext() throws IOException {
		test.info("Scroll and go to next page");
		try {
			if (goToNext.isDisplayed()) { 
				hover(goToNext);
				sleep(5000);
				goToNext.click();
				test.pass("<p style=\"color:green; font-size:13px\"><b>Scrolled down and Next page icon clicked.</b></p>");
				sleep();
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "clickNextPagePass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "clickNextPagePass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>NextPage location not avialble.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "clickNextPageFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "clickNextPageFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(goToNext.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	
	public void selectTheBook() throws IOException {
		test.info("Click on the book");
		try {
			if (selectBook.isDisplayed()) {
				selectBook.click();
				test.pass("<p style=\"color:green; font-size:13px\"><b>Book Clicked.</b></p>");
				sleep(5000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "clickBookPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "clickBookPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
			
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Book not locateable.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "clickBookFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "clickBookFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(selectBook.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		sleep(5000);
	}
	
	public void addToCartButton() throws IOException {
		test.info("Click on the Add to Cart button");
		try {
			if (addCart.isDisplayed()) {
				addCart.click();
				test.pass("<p style=\"color:green; font-size:13px\"><b>Add to cart button Clicked.</b></p>");
				sleep(5000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "addToCartPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "addToCartPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
			
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Add to Cart not locateable.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "addToCartFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "addToCartFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(selectBook.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		sleep(5000);
	}
}
