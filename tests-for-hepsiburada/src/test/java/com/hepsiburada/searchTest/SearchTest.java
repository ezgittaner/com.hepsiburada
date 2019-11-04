package com.hepsiburada.searchTest;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.hepsiburada.base.TestUtilities;
import com.hepsiburada.pages.WelcomePageObject;

public class SearchTest extends TestUtilities {
	@Parameters({ "anything" })
	@Test
	public void searchTest(String anything) {
		// open main page
		WelcomePageObject welcomePage = new WelcomePageObject(driver, log);
		welcomePage.openPage();
		takeScreenshot("Welcome Page opened");
		welcomePage.searchArea();
		welcomePage.searchAnything(anything);
		takeScreenshot("Anything is writed!");
		sleep(2000);
		welcomePage.searchButton();
	}

}
