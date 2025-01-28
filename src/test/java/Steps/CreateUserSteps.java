package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateUserSteps {

@Given("user in at signup page")
public void user_in_at_signup_page() {
    System.out.println("User lands on signup page");
}

@When("user enters name as {string}")
public void user_enters_name_as(String Name) {
System.out.println("user enters name "+Name);
}

@When("user enters age as {int}")
public void user_enters_age_as(Integer Age) {
 System.out.println("user entrs age "+Age);
}

@When("user confirm gender as {string}")
public void user_confirm_gender_as(String gender) {
   System.out.println("user Enters gender"+gender);
}

@When("user confirm mobile number as {int}")
public void user_confirm_mobile_number_as(Integer MobNum) {
	 System.out.println("user enters MobNum" +MobNum);

}
@Then("user gets created")
public void user_gets_created() {
System.out.println("user created successufully");
}

@Then("url should contain {string}")
public void url_should_contain(String login) {
   System.out.println("URL is containg "+login);
}



}