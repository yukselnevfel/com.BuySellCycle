package stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Base;
import pages.VisitorHomePage;
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


    }
    @Given("Verify that the relevant image")
    public void verify_that_the_relevant_image() {



    }
    @Given("Verify that the Sign-in form is visible")
    public void verify_that_the_sign_in_form_is_visible() {



    }
    @Given("Verify that the Sign In button is visible")
    public void verify_that_the_sign_in_button_is_visible() {



    }
    @Given("Verify that the Sign In button is clickable")
    public void verify_that_the_sign_in_button_is_clickable() {



    }
    @Given("Verify that the Remember me checkbox is selectable")
    public void verify_that_the_remember_me_checkbox_is_selectable() {



    }








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


 //---------------- Steps Asli----------------------/
    //US_8 - AboutPage

    @When("I should click on the {string} on the header")
    public void i_should_click_on_the_on_the_header(String string) {

waitAndClick();
    }
    @Then("I should be directed to the {string} page")
    public void i_should_be_directed_to_the_page(String string) {

    }
    @Then("I should see the character, status, and picture of {string}")
    public void i_should_see_the_character_status_and_picture_of(String string) {

    }


    @Given("I should see relevant section about the site, such as its mission, {string} , {string} , {string} , {string} and {string}")
    public void iShouldSeeRelevantSectionAboutTheSiteSuchAsItsMissionAnd(String arg0, String arg1, String arg2, String arg3, String arg4) {

    }

    @And("I should see each section contains a numeric value representing the relevant metric")
    public void iShouldSeeEachSectionContainsANumericValueRepresentingTheRelevantMetric() {
    }

    @Then("I should see that the numeric values are clearly visible and legible")
    public void iShouldSeeThatTheNumericValuesAreClearlyVisibleAndLegible() {
    }

    //---------------- Steps Asli----------------------/
}

