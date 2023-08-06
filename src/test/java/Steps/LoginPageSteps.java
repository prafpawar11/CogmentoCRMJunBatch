package Steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginPageSteps extends BaseClass {
	private static LoginPage loginPage;

	@Given("user is on login page")
	public void user_is_on_login_page() {
		BaseClass.initialization();
	}

	@When("user enter valid username and password and click on login button")
	public void user_enter_valid_username_and_password_and_click_on_login_button() {

		loginPage = new LoginPage();
		loginPage.loginFunctionality(prop.getProperty("uname"), prop.getProperty("pass"));
	}

	@AfterStep
	public static void teardown(Scenario scenario) {

		if (scenario.isFailed()) {
			byte[] f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(f, "image/png", scenario.getName());
		} else {
			byte[] f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(f, "image/png", scenario.getName());

		}
	}

}
