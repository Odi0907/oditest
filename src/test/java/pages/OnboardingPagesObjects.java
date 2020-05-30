package pages;
import com.youtility.runner.RunTest;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;

public class OnboardingPagesObjects extends RunTest {
    private AppiumDriver driver;

    public OnboardingPagesObjects(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        this.driver = driver;
    }
    @AndroidFindBy(id =" com.youtility.test:id/tvTop")
    private MobileElement takeControlOfFinancTxt ;

    @AndroidFindBy(id = "com.youtility.test:id/btnGetStarted")
    private MobileElement startedButton;

    @AndroidFindBy(id = "com.youtility.test:id/cbTermsAndConditions")
    private MobileElement termsAndConditions;

    @AndroidFindBy(id = "com.youtility.test:id/btnContinue")
    private MobileElement continueBttn;

    @AndroidFindBy(id = "com.youtility.test:id/etEmail")
    private MobileElement emailField;

    @AndroidFindBy(id = "com.youtility.test:id/checkEmail")
    private MobileElement checkYourEmailtext;

    public MobileElement getTakeControlOfFinancTxt() { return takeControlOfFinancTxt; }
    public MobileElement getStartedButton() { return startedButton; }
    public MobileElement getTermsAndConditions() { return termsAndConditions; }
    public MobileElement getContinueBttn() { return continueBttn; }
    public MobileElement getEmailField(){ return emailField; }
    public MobileElement checkYourEmailtext() { return checkYourEmailtext; }

    public void tapOnGetStartedButton(){
        getStartedButton().click();
    }
    public void selectTermsAndConditions(){
        getTermsAndConditions().click();
    }
    public void clickOnContinueBttn(){
        getContinueBttn().click();

    }

}
