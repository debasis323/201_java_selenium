package pages;

import org.openqa.selenium.By;

import baseFramework.BaseClass;

public class HomePage extends BaseClass {
//	BaseClass base = new BaseClass();
	public By channel = By.xpath("//span[text()='Channels']");
//	public WebElement channel = driver.findElement(By.xpath("//span[text()='Channels']"));
	public By news = By.xpath("//a[@href='/tv/bbcnews']/parent::li");

	public By art = By.xpath("");
	public By sign_in = By.xpath("//span[@id='idcta-username']");

}
