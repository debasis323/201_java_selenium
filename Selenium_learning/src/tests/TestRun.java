package tests;

import baseFramework.BaseClass;

public class TestRun extends BaseClass {

	public static void main(String args[]) throws InterruptedException {
		BaseClass base = new BaseClass();
		AddProgrammes add = new AddProgrammes();
		SignInFlow signIn = new SignInFlow();

		base.setupDriver();
		base.openHome();
		signIn.signInToiPlayer();

		Thread.sleep(4000);
//		add.addAProgramme();

		base.quitDriver();
	}

}
