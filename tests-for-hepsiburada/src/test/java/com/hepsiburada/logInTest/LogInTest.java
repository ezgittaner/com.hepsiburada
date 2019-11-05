package com.hepsiburada.logInTest;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.hepsiburada.base.TestUtilities;
import com.hepsiburada.pages.WelcomePageObject;

public class LogInTest extends TestUtilities {
	@Parameters({ "mail", "password2" })
	@Test
	public void logInTest(String mail, String password2) {

		// open main page
		WelcomePageObject welcomePage = new WelcomePageObject(driver, log);
		welcomePage.openPage();
		takeScreenshot("Welcome Page opened");
		welcomePage.logIn1();
		welcomePage.logIn2();
		sleep(2000);
		welcomePage.eMail();
		welcomePage.puteMail(mail);
		welcomePage.password();
		welcomePage.putPassword(password2);
		takeScreenshot("Mail and password writed");
		sleep(2000);
		welcomePage.entryButton();

	}

}
