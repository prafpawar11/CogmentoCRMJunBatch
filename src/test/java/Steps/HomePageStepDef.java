package Steps;

import org.testng.Assert;

import BaseLayer.BaseClass;
import PageLayer.Homepage;
import io.cucumber.java.en.When;

public class HomePageStepDef extends BaseClass {
	private static Homepage homepage;

	@When("user is in home page validate homepage title.")
	public void user_is_in_home_page_validate_homepage_title() {

		homepage = new Homepage();
		Assert.assertEquals(homepage.getTitle(), "Cogmento CRM");
	}

	@When("validate home page URL.")
	public void validate_home_page_url() {
		Assert.assertEquals(homepage.getURL().contains("cogmento"), true);
	}

	@When("validate home page logo.")
	public void validate_home_page_logo() {
		Assert.assertEquals(homepage.getLogostatus(), true);

	}

}
