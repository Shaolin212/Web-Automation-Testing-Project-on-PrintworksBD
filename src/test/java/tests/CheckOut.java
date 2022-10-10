package tests;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import drivers.BaseDriver;
import drivers.PageDriver;
import pages.CheckOutPage;
import utilities.ExtentFactory;

public class CheckOut extends BaseDriver {

	ExtentReports report;
	ExtentTest parentTest;
	ExtentTest childTest;

	@BeforeClass
	public void startUrl() {
		report = ExtentFactory.getInstance();
		parentTest = report.createTest("<p style=\"color:BlueViolet; font-size:20px\"><b><em>CheckOut and Provide all information</em></b></p>")
				.assignAuthor("Shaolin").assignDevice("Windows");
		PageDriver.getCurrentDriver().manage().window().maximize();
	}

	@Test(priority = 0)
	public void hoverCartAndClickCheckout() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:MediumBlue; font-size:20px\"><b>Hover Cart Icon and Click Checkout.</b></p>");
		CheckOutPage checkOutPage = new CheckOutPage(childTest);
		checkOutPage.hoverCartIcon();
		checkOutPage.clickCheckout();
	}
	
	@Test(priority = 1)
	public void provideInformation() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:MediumBlue; font-size:20px\"><b>Provide all information on this page.</b></p>");
		CheckOutPage checkOutPage = new CheckOutPage(childTest);
		checkOutPage.enterFirstName();
		checkOutPage.enterLastName();
		checkOutPage.clickCountry();
		checkOutPage.enterAddressOne();
		checkOutPage.enterAddressTwo();
		checkOutPage.enterPostCode();
		checkOutPage.enterPhone();
		checkOutPage.enterEmail();
		checkOutPage.createAccountCheckbox();
		checkOutPage.enterPassword();
		checkOutPage.orderNotes();
		checkOutPage.onlinePayment();
		checkOutPage.clickOnTerms();
	}
	
	@AfterClass
	public void afterClass() {
		report.flush();
	}
}
