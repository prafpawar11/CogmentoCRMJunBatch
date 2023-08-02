package Steps;

import org.testng.Assert;

import BaseLayer.BaseClass;
import PageLayer.Contactpage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactPageStepDef extends BaseClass {

	private static Contactpage cpage;

	@When("Click on contact links and validate user is on contact page")
	public void click_on_contact_links_and_validate_user_is_on_contact_page() {

		cpage = new Contactpage();
		String url = cpage.clickOnConatactLink();
		Assert.assertEquals(url.contains("contacts"), true);

	}

	@Then("User click on create button")
	public void user_click_on_create_button() {
		cpage.clickOnCreateButton();
	}

	@Then("User enter firstname and lastname")
	public void user_enter_firstname_and_lastname() {
		cpage.conatctPageFunctionality("Vishnu", "Shegokar");

	}

	@Then("Click on save button")
	public void click_on_save_button() {
		cpage.clickOnSaveButton();
	}

}
