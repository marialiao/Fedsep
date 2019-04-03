package fedsep;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageOject.LoginO;
import Resources.Base;

public class Login extends Base {

	static Logger logger = LogManager.getLogger(Login.class);

	@BeforeTest
	public void initialize() throws IOException {
		driver = Start();

		driver.get(pro.getProperty("URL"));
		logger.info("driver is initialized");

	}

	@Test()

	public void loginPages() throws IOException, InterruptedException {
		LoginO l = new LoginO(driver);
		assertEquals(l.VerifyTitle().getText(), "EQUAL EMPLOYMENT OPPORTUNITY COMMISSION (EEOC)");
		l.getEmail().sendKeys(pro.getProperty("Username"));
		l.getPassword().sendKeys(pro.getProperty("Password"));
		l.getLoginButton().click();

		logger.info("Sucessfully login");
	}

	@AfterTest
	public void tearDown() {
		driver.close();
		driver = null;

	}
	// @DataProvider
	// public Object[][] getData()
	// {
	// Object[][] data = new Object[1][2];
	// data[0][0]="fedseptest@yahoo.com";
	// data[0][1]="ML0000";
	//
	// return data;
	// }

}
