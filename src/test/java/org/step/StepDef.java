package org.step;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.pom.PageObjectModel;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef extends BaseClass {
	
	PageObjectModel p;
	
	@Given("User in on login page")
	public static void user_in_on_login_page() {
		LaunchURL("http://localhost:8081/index/");
	}
	@When("User enters valid {string}, {string} and {string}")
	public void user_enters_valid_and(String string, String string2, String string3) {
		p = new PageObjectModel();
		
		String text = getText(p.getTextRegistration());
		Assert.assertEquals("Registration", text);
		
		WebElement txtEmail = p.getTxtEmail();
		enterText(txtEmail, string);
		
		WebElement txtName = p.getTxtName();
		enterText(txtName, string2);
		
		WebElement txtPass = p.getTxtPass();
		enterText(txtPass, string3);
		
	}
	@When("User clicks on gender checkbox")
	public void user_clicks_on_gender_checkbox() {
		WebElement btnGender = p.getBtnGender();
		click(btnGender);
	}
	@When("User clicks on submit button")
	public void user_clicks_on_submit_button() {
		WebElement btnSubmit = p.getBbtnSubmit();
		click(btnSubmit);
	}
	@Then("User sees Success message")
	public void user_sees_success_message() {
		String text = getText(p.getTextSuccess());
		Assert.assertEquals("Success", text);
		
	}
}
