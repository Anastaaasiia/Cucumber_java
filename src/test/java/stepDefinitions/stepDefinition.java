package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class stepDefinition {

    @Given("^User is on landing page$")
    public void user_is_on_landing_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Elo elo");
    }

    @When("^User login into application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_app(String username, String pass){
        //code to user login into app
        System.out.println("User login into app");
    }

    @When("^User sign up with following details$")
    public void user_sign_up_with_username_and_pass(DataTable data){
        //code to user login into app
        List<String> obj = data.asList();
        System.out.println("User sign up with:");
        for(int i=0;i<obj.size();i++){
            System.out.print(obj.get(i)+" ");
        }
    }

    @Then("^Home page is populated$")
    public void is_home_page_populated(){
        //code to check is home page populated
        System.out.println("\nValidated homepage");
    }

    @Then("^Cards displayed are \"([^\"]*)\"$")
    public void is_cards_displayed(String isPassed){
        //code to check is cards displayed
        System.out.println("Validated cards is displayed? - "+ isPassed);
    }

    @When("^User login in to application with username (.+) and password (.+)$")
    public void userLoginIntoApplicationWithUsernameUsernameAndPasswordPassword(String user, String pass) {
        System.out.println("User: "+user + "\nPass: "+pass);
    }

    @Given("Validate The browser")
    public void validate_the_browser() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Browser validated");
    }
    @When("Browser is triggering")
    public void browser_is_triggering() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Browser triggered");
    }
    @Then("Check if browser is started")
    public void check_if_browser_is_started() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Browser started");
    }

}
