package utilities;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.javafaker.Faker;

import drivers.PageDriver;

public class CommonMethods {

	/************************
	 * Get Current Page URL *
	 ************************
	 */

	public String currentPageUrl() {
		return PageDriver.getCurrentDriver().getCurrentUrl();
	}

	/**************************
	 * Get Current Page Title *
	 **************************
	 */

	public String getTitle() {
		return PageDriver.getCurrentDriver().getTitle();
	}

	/************************************************************
	 * Write in a input field *
	 * 
	 * @param element This is the target element where to write *
	 * @param value   what to write *
	 ************************************************************
	 */

	public void sendText(WebElement element, String value) {
		element.clear();
		element.sendKeys(value);
	}

	/****************************************************************************
	 * Perform Hover on an element *
	 * 
	 * @param element This is the target element where to perform hover action *
	 ****************************************************************************
	 */

	public void hover(WebElement element) {
		Actions action = new Actions(PageDriver.getCurrentDriver());
		action.clickAndHold(element).build().perform();
	}

	

	/************************************************
	 * Handle Select Tag Related Element Task *
	 * 
	 * @param element locator of Select tag *
	 * @param value   attribute value of option tag *
	 ************************************************
	 */

	public void selectItemByValue(WebElement element, String value) {
		Select selectItems = new Select(element);
		selectItems.selectByValue(value);
	}

	public void selectItemByVisibleText(WebElement element, String value) {
		Select selectItems = new Select(element);
		selectItems.selectByVisibleText(value);
	}

	public void selectItemByIndex(WebElement element, int index) {
		Select selectItems = new Select(element);
		selectItems.selectByIndex(index);
	}

	/********************************************
	 * Get selected Item's Text *
	 ********************************************
	 */

	public String selectedItemText(WebElement element) {
		Select selectItems = new Select(element);
		return selectItems.getFirstSelectedOption().getText();
	}


	/****************************
	 * Handle Wait Related Task *
	 ****************************
	 */

	WebDriverWait wait;

	// wait for default set seconds
	public void sleep() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	// wait for customize given seconds
	public void sleep(int durationMS) {
		try {
			Thread.sleep(durationMS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	
	/****************************
	 * Faker Related Task *
	 ****************************
	 */

	static Faker faker = new Faker(new Locale("en-US"));
	
	public static String email;

	public static String emailGenerate() {
		email = faker.bothify("????##@mail.com");
		return email;
	}
	
	public static String firstName;

	public static String firstNameGenerate() {
		firstName = faker.name().firstName();
		return firstName;
	}

	public static String lastName;

	public static String lastNameGenerate() {
		lastName = faker.name().lastName();
		return lastName;
	}

	public static String phoneNumber;

	public String phoneNumberGenerate() {
		phoneNumber = faker.numerify("###-###-####");
		return phoneNumber;
	}
	
	public static String password;

	public String passwordGenerate() {
		password = faker.animal().name();
		return password;
	}


}
