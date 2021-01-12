package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import edu.tests.EvenOdd;
import org.junit.Assert;

public class EvenOddStepdefs {

    EvenOdd evenOdd;
    String result;

    @Given("^Create a EvenOdd programm$")
    public void create_a_EvenOdd_programm() throws Throwable {
//        System.out.println("Start");
        evenOdd = new EvenOdd();
    }

    @When("^Run with the (\\d+)$")
    public void run_with_the(int arg1) throws Throwable {
        result = evenOdd.check(arg1);
    }

    @Then("^The result is \"([^\"]*)\"$")
    public void theResultIs(String str) throws Throwable {
        Assert.assertEquals(result, str);
    }
}
