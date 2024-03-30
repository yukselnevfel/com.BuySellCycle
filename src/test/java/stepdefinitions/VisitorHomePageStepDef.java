package stepdefinitions;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.Base;
import utils.Driver;
import utils.ConfigReader;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class VisitorHomePageStepDef extends Base {

    //-------------Login Steps AYCA-----------------//

    @Given("Verify that the {string} is visible")
    public void verify_that_the_is_visible(String textLogin) {


        visibleWebElement(textLogin);


    }
    @Given("Click on the {string}")
    public void click_on_the(String textLogin) {

        clickWebElement(textLogin);

    }
    @Given("Verify that navigated to the login page")
    public void verify_that_navigated_to_the_login_page() {


        String expectedUrl = "https://qa.buysellcycle.com/login";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);



    }
    @Given("Verify that the relevant image")
    public void verify_that_the_relevant_image() {

        Assert.assertTrue(visitorHomePage.imageLoginPage.isDisplayed());


    }
    @Given("Verify that the Sign-in form is visible")
    public void verify_that_the_sign_in_form_is_visible() {

        Assert.assertTrue(visitorHomePage.loginForm.isDisplayed());

    }
    @Given("Verify that the Sign In button is visible")
    public void verify_that_the_sign_in_button_is_visible() {

        Assert.assertTrue(visitorHomePage.signInButton.isDisplayed());

    }
    @Given("Verify that the Sign In button is clickable")
    public void verify_that_the_sign_in_button_is_clickable() {

        Assert.assertTrue(visitorHomePage.signInButton.isEnabled());


    }
    @Given("Verify that the Remember me checkbox is selectable")
    public void verify_that_the_remember_me_checkbox_is_selectable() {

        Assert.assertTrue(visitorHomePage.checkBoxRememberMe.isEnabled());

    }

    @Given("Verify that navigated to the password reset page")
    public void verify_that_navigated_to_the_password_reset_page() {

        String expectedUrl = "https://qa.buysellcycle.com/password/reset";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);

    }

    @Given("Verify that navigated to the Register page")
    public void verify_that_navigated_to_the_register_page() {
        String expectedUrl = "https://qa.buysellcycle.com/register";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);

    }

    @Given("Click on the login link, Enter {string} and {string} and click sign in")
    public void click_on_the_login_link_enter_and_and_click_sign_in(String customerEmail, String password) {
        visitorHomePage.loginButton.click();
        visitorHomePage.textBoxUserEmail.click();
        visitorHomePage.textBoxUserEmail.sendKeys(ConfigReader.getProperty(customerEmail));
        visitorHomePage.textBoxUserPassword.click();
        visitorHomePage.textBoxUserPassword.sendKeys(ConfigReader.getProperty(password));
        wait(1);
        visitorHomePage.signInButton.click();
        String expectedUrl="https://qa.buysellcycle.com/profile/dashboard";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        wait(1);
    }













    //---------------------------Ayca Login Step Finish-------------------------------------------------------------------//







    //-------------Login Steps FIKRET-----------------/

    @Given("Open browser and Go to {string}")
    public void open_browser_and_go_to(String bSCUrl) {
        Driver.getDriver().get(ConfigReader.getProperty("bSCUrl"));
    }

    @Given("Close the pop-up message")
    public void close_the_pop_up_message() {
        if (visitorHomePage.cookieAllert.isDisplayed() && visitorHomePage.cookieAllert.isEnabled()) {
            visitorHomePage.cookieAllert.click();
        }
    }

    @Given("Verify that the Blog link is visible")
    public void verify_that_the_is_visible() {assertTrue(visitorHomePage.linkHeaderBlog.isDisplayed());
    }

    @Given("Verify that the Blog link is active")
    public void verify_that_the_is_active() {
        assertTrue(visitorHomePage.linkHeaderBlog.isEnabled());
    }

    @Given("Click on the Blog link")
    public void click_on_the() {
        visitorHomePage.linkHeaderBlog.click();
    }

    @Given("Verify that navigated to the Blog Page")
    public void verify_that_navigated_to_the_page() {
        String expectedURL = "https://qa.buysellcycle.com/blog";
        String actualURL = Driver.getDriver().getCurrentUrl();
        assertEquals(expectedURL, actualURL);
    }
    @Given("Verify that navigated to the Read More Page")
    public void verify_that_navigated_to_the_read_more_page() {

    }

    @Given("Enter a keyword into the search texBox and press Enter")
    public void enter_a_keyword_into_the_tex_box_and_press() {

    }

    @Given("Verify that the search results are relevant to the entered keyword")
    public void verify_that_the_search_results_are_relevant_to_the_entered_keyword() {

    }

    @Given("Close the page")
    public void close_the_page() {
        Driver.quitDriver();
    }


    //------------- Steps SAMET -----------------/

    @Given("Verify title is {string}")
    public void verify_that_title(String title) {
        String expectedTitle = title;
        String actualTitle = Driver.getDriver().getTitle();
        assertEquals(expectedTitle, actualTitle);
    }








    //------------- Steps NEVFEL -----------------/

    @Given("Click on the Track your Order link")
    public void click_on_the_track_your_order_link() {


    }
    @Given("Verify that the Order Tracking Number text is visible")
    public void verify_that_the_order_tracking_number_text_is_visible() {
        assertTrue(visitorHomePage.textBoxOrderTrackingNumber.isDisplayed());

    }
    @Given("Verify that Order Tracking Number is clickable")
    public void verify_that_order_tracking_number_is_clickable() {
        assertTrue(visitorHomePage.textBoxOrderTrackingNumber.isEnabled());

    }




}

