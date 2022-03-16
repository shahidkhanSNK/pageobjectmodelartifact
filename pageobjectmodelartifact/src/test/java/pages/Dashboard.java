package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dashboard {
	
	WebDriver driver = null;

	By nav_client = By.xpath("/html[1]/body[1]/app-root[1]/app-home[1]/div[1]/div[1]/app-sidebar[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/i[1]");

	
	public Dashboard(WebDriver driver) {
		this.driver = driver;
	}



	public void clicknavclient() {

		driver.findElement(nav_client).click();
	}


}
