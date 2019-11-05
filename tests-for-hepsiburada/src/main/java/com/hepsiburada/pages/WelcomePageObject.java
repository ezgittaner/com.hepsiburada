package com.hepsiburada.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePageObject extends BasePageObject {

	private String pageUrl = "https://www.hepsiburada.com/";
	private By searchArea = By.cssSelector("input#productSearch");
	private By searchButton = By.cssSelector("button#buttonProductSearch");
	private By logIn1 = By.cssSelector("div#myAccount > a:nth-of-type(2)");
	private By logIn2 = By.cssSelector("a#login");
	private By eMail = By.cssSelector("input#email");
	private By password = By.cssSelector("input#password");
	private By entryButton = By.cssSelector(".btn.btn-login-submit.full");

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

	public WelcomePageObject logIn1() {
		click(logIn1);
		return new WelcomePageObject(driver, log);

	}

	public WelcomePageObject logIn2() {
		log.info("Clicking Log In Button");
		click(logIn2);
		return new WelcomePageObject(driver, log);

	}

	public WelcomePageObject eMail() {
		log.info("Clicking e-mail Area");
		click(eMail);
		return new WelcomePageObject(driver, log);

	}

	public WelcomePageObject password() {
		log.info("Clicking Password Area");
		click(password);
		return new WelcomePageObject(driver, log);

	}

	public void puteMail(String mail) {
		type(mail, eMail);
	}

	public void putPassword(String password2) {
		type(password2, password);
	}

	public WelcomePageObject entryButton() {
		log.info("Clicking Entry Button");
		click(entryButton);
		return new WelcomePageObject(driver, log);

	}
}
