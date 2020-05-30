package steps;

import cucumber.api.PendingException;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.OnboardingPagesObjects;
public class endToEndSteps {

    private final AppiumDriver driver = null;
    private OnboardingPagesObjects onboardingPagesObjects;

    public endToEndSteps() {
        onboardingPagesObjects = new OnboardingPagesObjects(this.driver);
    }

    @Given("^user launches the app successfully \\(and the introductory screen displays\\)$")
    public void userLaunchesTheAppSuccessfullyAndTheIntroductoryScreenDisplays() {
        driver.launchApp();
        Assert.assertTrue(onboardingPagesObjects.getTakeControlOfFinancTxt().isDisplayed());
    }

    @When("^user taps on ‘Get Started’$")
    public void userTapsOnGetStarted() {
        onboardingPagesObjects.tapOnGetStartedButton();
    }

    @And("^‘I accept the Terms of Service’ is selected$")
    public void iAcceptTheTermsOfServiceIsSelected() {
        onboardingPagesObjects.selectTermsAndConditions();
        onboardingPagesObjects.clickOnContinueBttn();
    }

    @And("^when ‘What’s your email address’ screen displays$")
    public void whenWhatSYourEmailAddressScreenDisplays() {
        Assert.assertTrue(onboardingPagesObjects.getEmailField().isDisplayed());

    }

    @And("^user adds an \"([^\"]*)\" of a valid format and taps on Continue$")
    public void userAddsAnOfAValidFormatAndTapsOnContinue(String arg0) throws Throwable {
        onboardingPagesObjects.getEmailField().sendKeys("obeg0@hotmail.co.uk");
        onboardingPagesObjects.clickOnContinueBttn();
        throw new PendingException();
    }
    @Then("^check your email screen displays$")
    public void checkYourEmailScreenDisplays() {
        Assert.assertTrue(onboardingPagesObjects.checkYourEmailtext().isDisplayed());

    }
}



