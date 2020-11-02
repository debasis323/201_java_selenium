package tests;

import baseFramework.BaseClass;
import pages.HomePage;
import pages.SignInPage;
import utils.PropertiesReader;

public class SignInFlow extends BaseClass{
	HomePage home;
	SignInPage sign;
	PropertiesReader prop;
	
	public void signInToiPlayer() {
		home = new HomePage();
		sign = new SignInPage();
		prop = new PropertiesReader();
		findElement(home.sign_in).click();
		System.out.println(prop.userName());
		findElement(sign.userName).sendKeys(prop.userName());
		findElement(sign.password).sendKeys(prop.password());
		findElement(sign.signinButton).click();
		System.out.println(findElement(home.sign_in).getText());
		
	
	}

}
