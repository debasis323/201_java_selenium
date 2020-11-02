package pages;

import org.openqa.selenium.By;

import baseFramework.BaseClass;

public class SignInPage extends BaseClass {
	
	public By userName= By.xpath("//input[@id='user-identifier-input']");
	public By password = By.xpath("//input[@id='password-input']");
	public By signinButton = By.xpath("//button[@id='submit-button']");
	

}
