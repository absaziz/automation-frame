package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {


    @When("^I click login$")
    public void iClickLogin() throws Throwable {

    }

    @Given("^that I navigate to www.giftrt.com$")
    public void thatINavigateToWwwGiftrtCom() throws Throwable {


        WebDriver driver = new FirefoxDriver; String appUrl = "http://www.giftrete.com";
        driver.get(appUrl);
    }


    @And("^I entered the username \"([^\"]*)\"$")
    public void iEnteredTheUsername(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I entered the password \"([^\"]*)\"$")
    public void iEnteredThePassword(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I click on the login button$")
    public void iClickOnTheLoginButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I should be logged in$")
    public void iShouldBeLoggedIn() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I entered the invalid username\"([^\"]*)\"$")
    public void iEnteredTheInvalidUsername(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^i entered the invalid password \"([^\"]*)\"$")
    public void iEnteredTheInvalidPassword(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I should be not able to log in$")
    public void iShouldBeNotAbleToLogIn() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I entered the invalid username$")
    public void iEnteredTheInvalidUsername() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^i entered the invalid password$")
    public void iEnteredTheInvalidPassword() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I log out$")
    public void iLogOut() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^I navigate to giftrete site$")
    public void iNavigateToGiftreteSite() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I go to the registration page$")
    public void iGoToTheRegistrationPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I fill in all the registration data$")
    public void iFillInAllTheRegistrationData() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I should be able to register$")
    public void iShouldBeAbleToRegister() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^I navigate to wishlist https://www.giftrete.com$")
    public void iNavigateToWishlistHttpsWwwGiftreteCom() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I click on what I like$")
    public void iClickOnWhatILike() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I choose the products that I may wish to buy$")
    public void iChooseTheProductsThatIMayWishToBuy() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
