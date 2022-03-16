package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Dashboard;
import pages.GrtLoginPage;

public class GrtLoginPageTest {

	WebDriver driver = null;

	@BeforeTest
	public void setuptest() {


		String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath: "+projectPath);

		// To set the property for Google Chrome drive, without it, it will throw an error
		System.setProperty("webdriver.chrome.driver", projectPath+"/Drivers/DriverChrome/chromedriver.exe");
		driver = new ChromeDriver();

		// To maximize the browser window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);

	}

	@Test(priority = 0)
	public void login() throws InterruptedException {

		//GrtLoginPage loginPageObj = new GrtLoginPage(driver);
		GrtLoginPage logPageObj = new GrtLoginPage(driver);

		driver.get("https://grt-staging.azurewebsites.net/");

		TimeUnit.SECONDS.sleep(2);


		logPageObj.entertextinemailtextbox("admin@grthealthonline.com");

		TimeUnit.SECONDS.sleep(2);


		logPageObj.entertextinpasswordtextbox("@Grthealthadmin2021#");

		TimeUnit.SECONDS.sleep(2);

		logPageObj.clicksigninbutton();

		TimeUnit.SECONDS.sleep(15);

	}
	
	
	@Test(priority = 1)
	public void navclient() throws InterruptedException {

		//GrtLoginPage loginPageObj = new GrtLoginPage(driver);
		Dashboard navclientObj = new Dashboard(driver);

		navclientObj.clicknavclient();
	}
	
	
	@AfterTest
	public void teardowntest() {
		driver.close();
		driver.quit();

	}

}
