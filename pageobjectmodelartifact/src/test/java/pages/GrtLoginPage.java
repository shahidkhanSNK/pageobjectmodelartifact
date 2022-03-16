package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GrtLoginPage {

	WebDriver driver = null;

	By textbox_email = By.id("email");
	By textbox_password = By.id("password");
	By Sign_in_button = By.tagName("button");
	
	public GrtLoginPage(WebDriver driver) {
		this.driver = driver;
	}



	public void entertextinemailtextbox(String text) {

		driver.findElement(textbox_email).sendKeys(text);
	}


	public void entertextinpasswordtextbox(String text) {

		driver.findElement(textbox_password).sendKeys(text);
	}


	public void clicksigninbutton() {
		driver.findElement(Sign_in_button).sendKeys(Keys.RETURN);
	}

}
