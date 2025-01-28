package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps 
{
	@Given("user is at login page")
	public void user_is_at_login_page() {
	    System.out.println("at login page");
	}

	@When("user enter UN")
	public void user_enter_un() {
	   System.out.println("enter UN");
	}

	@When("user enter PWD")
	public void user_enter_pwd() {
		System.out.println("Enter pwd");
	   
	}

	@When("user click on login btn")
	public void user_click_on_login_btn() {
	   System.out.println("click login button");
	}

	@Then("user should redirect to home page")
	public void user_should_redirect_to_home_page() {
	  System.out.println("At Home Page");
	}

	@Then("title of page should visible")
	public void title_of_page_should_visible() {
	    System.out.println("Tital is visible");
	}


@When("user enter UN as {string}")
public void user_enter_un_as(String UN) {
    System.out.println("username"+UN);
}

@When("user enter PWD as {string}")
public void user_enter_pwd_as(String PWD) {
    System.out.println("password"+PWD);
}

@When("user enter pin {int}")
public void user_enter_pin(Integer int1) {
 System.out.println("pin"+ int1);
}

@Then("user profile picture should display")
public void user_profile_picture_should_display() {
   System.out.println("---DP displaying----");
}




@Then("get title & verify")
public void get_title_verify() {
   System.out.println("tital is expected");
}

@When("user click on profile tab")
public void user_click_on_profile_tab() {
    System.out.println("user tab is displaying");
}

@Then("verify profile name")
public void verify_profile_name() {
   System.out.println("user name is displaying");
}

@Then("user click on logout btn")
public void user_click_on_logout_btn() {
  System.out.println("use lands on home page");
}








}
