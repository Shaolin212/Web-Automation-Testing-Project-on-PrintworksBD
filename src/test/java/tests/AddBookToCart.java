package tests;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import drivers.BaseDriver;
import drivers.PageDriver;
import pages.HomePage;
import utilities.ExtentFactory;

public class AddBookToCart extends BaseDriver {

	ExtentReports report;
	ExtentTest parentTest;
	ExtentTest childTest;

	@BeforeClass
	public void openUrl() {
		report = ExtentFactory.getInstance();
		parentTest = report.createTest("<p style=\"color:BlueViolet; font-size:20px\"><b><em>Add a Book to Cart</em></b></p>")
				.assignAuthor("Shaolin").assignDevice("Windows");
		PageDriver.getCurrentDriver().get(baseURL);
		PageDriver.getCurrentDriver().manage().window().maximize();
	}

	@Test(priority = 0)
	public void hoverAndClickKolpobiggyan() throws IOException {
		childTest = parentTest.createNode("<p style=\"color:MediumBlue; font-size:20px\"><b>Hover Bangla and select Kolpobiggyan.</b></p>");
		HomePage homePage = new HomePage(childTest);
		homePage.hoverAtBangla();
		homePage.clickOnKolpobiggyan();
	}
	
	@Test(priority = 1)
	public void scrollAndGoNext() throws IOException {
		childTest = parentTest.createNode("<p style=\"color:MediumBlue; font-size:20px\"><b>Scroll down and Go to the Next page.</b></p>");
		HomePage homePage = new HomePage(childTest);
		homePage.scrollAndNext();
	}
	
	@Test(priority = 2)
	public void viewAnyBook() throws IOException {
		childTest = parentTest.createNode("<p style=\"color:MediumBlue; font-size:20px\"><b>View a book.</b></p>");
		HomePage homePage = new HomePage(childTest);
		homePage.selectTheBook();
	}
	
	@Test(priority = 3)
	public void addToCart() throws IOException {
		childTest = parentTest.createNode("<p style=\"color:MediumBlue; font-size:20px\"><b>Add to Cart.</b></p>");
		HomePage homePage = new HomePage(childTest);
		homePage.addToCartButton();
	}
	
	@AfterClass
	public void afterClass() {
		report.flush();
	}
}
