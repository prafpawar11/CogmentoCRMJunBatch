package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilsLayer.UtilsClass;
import lombok.experimental.UtilityClass;

public class Contactpage extends BaseClass {

	@FindBy(xpath = "//a[@href='/contacts']")
	private WebElement contactLink;

	@FindBy(xpath = "//a[@href='/contacts/new']")
	private WebElement createButton;

	@FindBy(name = "first_name")
	private WebElement fname;

	@FindBy(name = "last_name")
	private WebElement lname;

	@FindBy(xpath = "//button[text()='Save']")
	private WebElement saveButton;

	public Contactpage() {
		PageFactory.initElements(driver, this);
	}

	public String clickOnConatactLink() {
		UtilsClass.click(contactLink);
		return driver.getCurrentUrl();
	}

	public void clickOnCreateButton() {
		UtilsClass.click(createButton);
	}

	public void conatctPageFunctionality(String firstname, String lastname) {

		UtilsClass.sendKeys(fname, firstname);
		UtilsClass.sendKeys(lname, lastname);

	}

	public void clickOnSaveButton() {
		UtilsClass.click(saveButton);

	}

}
