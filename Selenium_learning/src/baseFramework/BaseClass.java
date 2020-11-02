package baseFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.PropertiesReader;

public class BaseClass {

	public static WebDriver driver;
	public WebDriverWait wait;
	PropertiesReader prop = new PropertiesReader();

	public void setupDriver() {
		driver = new ChromeDriver();
	}

	public void openHome() {

//		driver.get("https://www.bbc.co.uk/iplayer");
		driver.get(prop.getAppUrl());
		System.out.println("Home Opened");
	}

	public void quitDriver() {
		driver.close();
		System.out.println("Driver close");

		driver.quit();
		System.out.println("driver quit");
	}

	public void waitForTheVisibilityOf(By by) {
		wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}

	public WebElement findElement(By by) {
		waitForTheVisibilityOf(by);
		return driver.findElement(by);
	}
}
