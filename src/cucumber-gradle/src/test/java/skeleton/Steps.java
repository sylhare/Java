package skeleton;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import static org.junit.Assert.*;

public class Steps {

    Belly belly;

    @Before
    public void SetUp(){
        //System.out.println("This will run before the Scenario");
        this.belly = new Belly();
    }

    //000
    @Given("^Belly is empty$")
    public void I_have_an_empty_belly() {

    }

    //001
    @Given("^I have (\\d+) cakes in my belly$")
    public void I_have_cakes_in_my_belly(int cakes) throws Throwable {
        belly.eat(cakes);
    }

    @When("^I wait (\\d+) hour$")
    public void I_wait_x_hours(int time) throws Throwable {
        belly.wait(time);
    }

    @Then("^My belly should growl$")
    public void Is_belly_growling() throws Throwable {
        assertEquals(Belly.GROWLS_SOUND, belly.growl());
    }

    //002
    @Then("^My belly should not growl$")
    public void Is_belly_not_growling() throws Throwable {
        assertEquals(Belly.REST_SOUND, belly.growl());
    }

    //003
    @Given("^There are (\\d+) \"([^\"]*)\"$")
    public void there_are_x_things(int cucumbers, String thing) {

    }

    @When("^I eat (\\d+) \"([^\"]*)\"$")
    public void I_eat_x_cucumbers(int cucumbers_eaten, String thing) {

    }

    @Then("^I should have (\\d+) \"([^\"]*)\"$")
    public void I_have_x_cucumbers_left(int cucumbers_left, String thing){

    }

    @After
    public void afterScenario(){
        //System.out.println("This will run after the Scenario");
        this.belly = null;
    }
}