package com.hepsiburada.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePageObject extends BasePageObject {

	private String pageUrl = "https://www.hepsiburada.com/";
	private By searchArea = By.cssSelector("input#productSearch");
	private By searchButton = By.cssSelector("button#buttonProductSearch");

	public WelcomePageObject(WebDriver driver, Logger log) {
		super(driver, log);
	}

	/** Open WelcomePage with it's url */
	public void openPage() {
		log.info("Opening page: " + pageUrl);
		openUrl(pageUrl);
		log.info("Page opened!");
	}

	public WelcomePageObject searchArea() {
		log.info("Clicking Search Area");
		click(searchArea);
		return new WelcomePageObject(driver, log);

	}

	public WelcomePageObject searchButton() {
		log.info("Clicking Search Button");
		click(searchButton);
		return new WelcomePageObject(driver, log);
	}

	public void searchAnything(String anything) {
		type(anything, searchArea);
	}

}
