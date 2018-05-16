package skeleton;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

import static java.text.MessageFormat.format;

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

    // Reg Ex Example in steps with Cucumber
    // http://blog.czeczotka.com/2014/08/17/writing-cucumber-jvm-step-definitions/

    // 101 - Exact match
    @Given("^I have a cucumber step$")
    public void i_have_a_cucumber_step() throws Throwable {
        System.out.println ("Step definition exact match");
    }

    // 102 - Non-capturing group
    @Given("^I have a (?:tasty|nasty|rusty) cucumber step$")
    public void i_have_a_X_cucumber_step() throws Throwable {
        System.out.println ("Step definition with a non-capturing group");
    }

    // 103 - Capture integers and strings
    @Given("^I have (\\d+) (.*) in my basket$")
    public void i_have_in_my_basket(int number, String veg) throws Throwable {
        System.out.println(format("I have {0} {1} in my basket", number, veg));
    }

    // 104 - Singular and plural
    @Given("^There (?:is|are) (\\d+) (?:cats?|ox|oxen) fed by (\\d+) (?:persons?|people)$")
    public void animals_fed_by_people(int animals, int persons) throws Throwable {
        System.out.println(format("{0} animal(s) fed by {1} person(s)", animals, persons));
    }

    // 105 - Data tables
    @Given ("^I have the following order$")
    public void i_have_the_following_order (DataTable table) throws Throwable {
        for (Map<String, String> map : table.asMaps(String.class, String.class)) {
            String vegetable = map.get("vegetable");
            String amount = map.get("amount");
            String cost = map.get("cost");
            System.out.println (format("Order of {0} {1}s at the cost of {2}", amount, vegetable, cost));
        }
    }

    // 106 - List of domain objects
    @Given("^I have another order$")
    public void i_have_another_order(List<VeggieShop> list) throws Throwable {
        for (VeggieShop orderItem : list) {
            String vegetable = orderItem.getVegetable ();
            int amount = orderItem.getAmount();
            int cost = orderItem.getCost ();
            System.out.println (format("Order of {0} {1}s at the cost of {2}", amount, vegetable, cost));
        }
    }

    //107
    @Given("^I have a shop named \"(.*)\"$")
    public void i_have_a_shop_named(String shopName) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        System.out.println ("Step definition exact match " + shopName);
    }

    @After
    public void afterScenario(){
        //System.out.println("This will run after the Scenario");
        this.belly = null;
    }
}