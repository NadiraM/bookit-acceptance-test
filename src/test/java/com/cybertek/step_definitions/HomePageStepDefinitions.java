package com.cybertek.step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageStepDefinitions {

    @Given ("user on the login page")
    public final void user_on_the_login_page ( ) {
        System.out.println ("I'm opening the login page" );
    }

    @When("user logs in as a team lead")
    public final void user_logs_in_as_a_team_lead ( ) {
        System.out.println ("I am logging in " );
    }

    @Then("homepage should be displayed")
    public final void homepage_should_be_displayed ( ) {
        System.out.println ("I can see the home page now!!" );
    }
}


