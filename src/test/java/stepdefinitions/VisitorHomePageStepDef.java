package stepdefinitions;
import io.cucumber.java.en.Given;
import pages.Base;
import utils.Driver;
import utils.ConfigReader;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class VisitorHomePageStepDef extends Base {

    //-------------Login Steps AYCA-----------------//




    
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
}

