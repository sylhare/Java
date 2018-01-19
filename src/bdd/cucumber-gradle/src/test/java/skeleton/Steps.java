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

    @Given("^I have (\\d+) cakes in my belly$")
    public void I_have_cakes_in_my_belly(int cakes) throws Throwable {
        belly.eat(cakes);
    }

    @When("^I wait (\\d+) hour$")
    public void I_wait_x_hours(int time) throws Throwable {
        belly.wait(time);
    }

    @Then("^my belly should growl$")
    public void Is_belly_growling() throws Throwable {
        assertEquals(Belly.GROWLS_SOUND, belly.growl());
    }

    @After
    public void afterScenario(){
        //System.out.println("This will run after the Scenario");
        this.belly = null;
    }

}
