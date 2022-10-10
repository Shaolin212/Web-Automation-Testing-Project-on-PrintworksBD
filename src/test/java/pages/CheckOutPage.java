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

public class CheckOutPage extends CommonMethods{

	ExtentTest test;
	public CheckOutPage(ExtentTest test) {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		this.test=test;
	}
	
	@FindBy(id = "mini-cart")
	WebElement hoverCart;

	@FindBy(xpath = "//a[@class='button checkout wc-forward']")
	WebElement checkOutButton;

	@FindBy(id = "billing_first_name")
	WebElement firstName;
	
	@FindBy(id = "billing_last_name")
	WebElement lastName;
	
	@FindBy(xpath = "//select[@name='billing_country']")
	WebElement selectCountry;
	
	@FindBy(id = "billing_address_1")
	WebElement streetAddress;
	
	@FindBy(id = "billing_address_2")
	WebElement apartmentAddress;
	
	@FindBy(id = "billing_postcode")
	WebElement postCode;
	
	@FindBy(id = "billing_phone")
	WebElement phone;
	
	@FindBy(id = "billing_email")
	WebElement emailAddress;
	
	@FindBy(id = "createaccount")
	WebElement createAccount;
	
	@FindBy(id = "account_password")
	WebElement enterPass;
	
	@FindBy(id = "order_comments")
	WebElement orderNote;
	
	@FindBy(id = "payment_method_sslcommerz")
	WebElement onlinePay;

	@FindBy(id = "terms")
	WebElement clickTerms;
	
	public void hoverCartIcon() throws IOException {
		test.info("Hover Cart Icon");
		try {
			if (hoverCart.isDisplayed()) { 
				Actions actions = new Actions(PageDriver.getCurrentDriver());
				actions.moveToElement(hoverCart).perform();
				Thread.sleep(5000);
				test.pass("<p style=\"color:green; font-size:13px\"><b>Cart icon hovered.</b></p>");
				sleep();
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "hoverCartIconPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "hoverCartIconPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>CartIcon location not avialble.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "hoverCartIconFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "hoverCartIconFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(hoverCart.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	
	public void clickCheckout() throws IOException {
		try {
			test.info("Click Checkout");
			if (checkOutButton.isDisplayed()) {
				checkOutButton.click();
				test.pass("<p style=\"color:green; font-size:13px\"><b>Checkout button clicked.</b></p>");
				sleep(5000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "CheckoutPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "CheckoutPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
			
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Checkout not locateable.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "CheckoutFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "CheckoutFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(checkOutButton.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	
	public void enterFirstName() throws IOException {
		try {
			test.info("Enter First Name");
			if (firstName.isDisplayed()) {
				sendText(firstName, firstNameGenerate());
				test.pass("<p style=\"color:green; font-size:13px\"><b>First name entered.</b></p>");
				sleep(5000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "FirstNamePass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "FirstNamePass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
			
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>First name not locateable.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "FirstNameFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "FirstNameFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(firstName.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	
	public void enterLastName() throws IOException {
		try {
			test.info("Enter First Name");
			if (lastName.isDisplayed()) {
				sendText(lastName, lastNameGenerate());
				test.pass("<p style=\"color:green; font-size:13px\"><b>Last name entered.</b></p>");
				sleep(5000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "LastNamePass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "LastNamePass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
			
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Last name not locateable.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "LastNameFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "LastNameFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(lastName.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	
	
	public void clickCountry() throws IOException {
		try {
			test.info("Select Brazil");
			if (selectCountry.isDisplayed()) {
				selectItemByVisibleText(selectCountry, "Brazil");
				sleep(5000);
				test.pass("<p style=\"color:green; font-size:13px\"><b>Brazil country selected.</b></p>");
				sleep(5000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "selectCountryPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "selectCountryPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
			
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Brazil not locateable.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "selectCountryFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "selectCountryFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(selectCountry.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	
	public void enterAddressOne() throws IOException {
		try {
			test.info("Enter street address");
			if (streetAddress.isDisplayed()) {
				sendText(streetAddress, "First Address");
				test.pass("<p style=\"color:green; font-size:13px\"><b>Street address entered.</b></p>");
				sleep(5000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "streetAddressPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "streetAddressPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
			
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Street address not locateable.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "streetAddressFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "streetAddressFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(streetAddress.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	
	public void enterAddressTwo() throws IOException {
		try {
			test.info("Enter apartment address");
			if (apartmentAddress.isDisplayed()) {
				sendText(apartmentAddress, "Second Address");
				test.pass("<p style=\"color:green; font-size:13px\"><b>Apartment address entered.</b></p>");
				sleep(5000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "apartmentAddressPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "apartmentAddressPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
			
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Apartment address not locateable.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "apartmentAddressFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "apartmentAddressFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(apartmentAddress.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	
	public void enterPostCode() throws IOException {
		try {
			test.info("Enter postal code");
			if (postCode.isDisplayed()) {
				sendText(postCode, "1880");
				test.pass("<p style=\"color:green; font-size:13px\"><b>Post code entered.</b></p>");
				sleep(5000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "postCodePass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "postCodePass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
			
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Post code not locateable.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "postCodeFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "postCodeFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(postCode.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	
	public void enterPhone() throws IOException {
		try {
			test.info("Enter phone");
			if (phone.isDisplayed()) {
				sendText(phone, phoneNumberGenerate());
				test.pass("<p style=\"color:green; font-size:13px\"><b>Phone number entered.</b></p>");
				sleep(5000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "phoneNumberPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "phoneNumberPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
			
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Phone not locateable.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "phoneNumberFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "phoneNumberFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(phone.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	
	public void enterEmail() throws IOException {
		try {
			test.info("Enter email");
			if (emailAddress.isDisplayed()) {
				sendText(emailAddress, emailGenerate());
				test.pass("<p style=\"color:green; font-size:13px\"><b>Email entered.</b></p>");
				sleep(5000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "EmailPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "EmailPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
			
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Email not locateable.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "EmailFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "EmailFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(emailAddress.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	public void createAccountCheckbox() throws IOException {
		try {
			test.info("Click create account checkbox");
			if (createAccount.isDisplayed()) {
				createAccount.click();
				test.pass("<p style=\"color:green; font-size:13px\"><b>Create Account checkbox clicked.</b></p>");
				sleep(5000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "CreateAccountPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "CreateAccountPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
			
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Create Account checkbox not locateable.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "CreateAccountFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "CreateAccountFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(createAccount.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	public void enterPassword() throws IOException {
		try {
			test.info("Enter Password");
			if (enterPass.isDisplayed()) {
				sendText(enterPass, passwordGenerate());
				test.pass("<p style=\"color:green; font-size:13px\"><b>Password entered.</b></p>");
				sleep(5000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "enterPasswordPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "enterPasswordPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
			
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Password not locateable.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "enterPasswordFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "enterPasswordFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(enterPass.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	public void orderNotes() throws IOException {
		try {
			test.info("Enter order notes");
			if (orderNote.isDisplayed()) {
				sendText(orderNote, "Order comments");
				test.pass("<p style=\"color:green; font-size:13px\"><b>Order notes entered.</b></p>");
				sleep(5000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "OrderNotePass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "OrderNotePass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
			
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Order not locateable.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "OrderNoteFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "OrderNoteFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(orderNote.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	public void onlinePayment() throws IOException {
		try {
			test.info("Click online payment");
			if (onlinePay.isDisplayed()) {
				onlinePay.click();
				test.pass("<p style=\"color:green; font-size:13px\"><b>Online Payment clicked.</b></p>");
				sleep(5000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "OnlinePaymentPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "OnlinePaymentPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
			
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Online Payment not locateable.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "OnlinePaymentFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "OnlinePaymentFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(onlinePay.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	public void clickOnTerms() throws IOException {
		try {
			test.info("Click on terms & conditions");
			if (clickTerms.isDisplayed()) {
				clickTerms.click();
				test.pass("<p style=\"color:green; font-size:13px\"><b>Terms checkbox clicked.</b></p>");
				sleep(5000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "clickTermsPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "clickTermsPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
			
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Terms checkbox not locateable.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "clickTermsFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "clickTermsFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(clickTerms.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
}
