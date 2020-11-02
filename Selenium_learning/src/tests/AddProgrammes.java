package tests;

import baseFramework.BaseClass;
import pages.HomePage;

public class AddProgrammes extends BaseClass {
	HomePage home;

	public void addAProgramme() {
		home = new HomePage();

		findElement(home.channel).click();

		findElement(home.news).click();

	}

}
