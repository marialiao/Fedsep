package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Base {
	public static WebDriver driver;
	public static Properties pro;

	@Test
	public WebDriver Start() throws IOException {
		pro = new Properties();
		FileInputStream file = new FileInputStream(
				"D:\\Users\\RLIAO\\workspace\\testcase\\fedsep\\src\\main\\java\\Resources\\dataResources");

		pro.load(file);
		String browers = pro.getProperty("browser");

		if (browers.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"D:\\Users\\RLIAO\\OneDrive - EEOC\\_UPF\\Desktop\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browers.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"D:\\Users\\RLIAO\\OneDrive - EEOC\\_UPF\\Desktop\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		return driver;

	}

}
