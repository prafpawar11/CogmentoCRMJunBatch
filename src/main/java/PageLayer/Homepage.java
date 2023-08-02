package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class Homepage extends BaseClass {

	@FindBy(xpath = "//div[@class='header item']")
	private WebElement logo;

	public Homepage() {
		PageFactory.initElements(driver, this);
	}

	public String getTitle() {
		return driver.getTitle();
	}

	public String getURL() {
		return driver.getCurrentUrl();
	}

	public boolean getLogostatus() {

		return logo.isDisplayed();

	}

}
