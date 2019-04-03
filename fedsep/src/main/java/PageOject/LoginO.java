package PageOject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginO {

public WebDriver driver;
	
	By email =By.xpath("//input[@title='Email*']");
	By password =By.id("j_idt19:pwd1");
	By login =By.id("j_idt19:j_idt43");
	By title= By.xpath("//b[contains(text(),'EQUAL EMPLOYMENT OPPORTUNITY COMMISSION (EEOC)')]");
	
	public LoginO(WebDriver driver) 
	{
		
		this.driver = driver;
	}



	public WebElement getEmail()
	{
		return driver.findElement(email);
		
	}
	public WebElement getPassword()
	{
		return driver.findElement(password);
		
	}
	public WebElement getLoginButton()
	{
		return driver.findElement(login);
		
	}
	
	public WebElement VerifyTitle()
	{
		return driver.findElement(title);
	}
	
	
}
