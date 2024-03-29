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

    //===============STEPS ESRA BASLANGIC==============================

    @Given("Displays the Track Your Order link on the top bar of the site")
    public void displays_the_track_your_order_link_on_the_top_bar_of_the_site() {
        assertTrue(visitorHomePage.linkTextTrackYourOrder.isDisplayed());
    }
    @Given("Displays the Compare link on the top bar of the site")
    public void displays_the_compare_link_on_the_top_bar_of_the_site() {
        assertTrue(visitorHomePage.linkTextCompare.isDisplayed());
    }
    @Given("Displays the Wish List link on the top bar of the site")
    public void displays_the_wish_list_link_on_the_top_bar_of_the_site() {
        assertTrue(visitorHomePage.linkTextWishList.isDisplayed());
    }
    @Given("Displays the Cart link on the top bar of the site")
    public void displays_the_cart_link_on_the_top_bar_of_the_site() {
        assertTrue(visitorHomePage.linkTextCart.isDisplayed());
    }
    @Given("Displays the New User Zone link on the top bar of the site")
    public void displays_the_new_user_zone_link_on_the_top_bar_of_the_site() {
        assertTrue(visitorHomePage.linkTextNewUserZone.isDisplayed());
    }
    @Given("Displays the Daily Deals link on the top bar of the site")
    public void displays_the_daily_deals_link_on_the_top_bar_of_the_site() {
       assertTrue(visitorHomePage.linkTextDailyDeals.isDisplayed());
    }

    @Given("Click on the Track your Order link on the top bar of the site and you will be redirected to the relevant page")
    public void click_on_the_track_your_order_link_on_the_top_bar_of_the_site_and_you_will_be_redirected_to_the_relevant_page() {
        clickWithJS(visitorHomePage.linkTextTrackYourOrder);
        assertTrue(visitorHomePage.buttonTrackNow.isDisplayed());
    }
    @Given("Click on the Compare link on the top bar of the site and you will be redirected to the relevant page")
    public void click_on_the_compare_link_on_the_top_bar_of_the_site_and_you_will_be_redirected_to_the_relevant_page() {

    }
    @Given("Click on the WishList link on the top bar of the site and you will be redirected to the relevant page")
    public void click_on_the_wish_list_link_on_the_top_bar_of_the_site_and_you_will_be_redirected_to_the_relevant_page() {

    }
    @Given("Click on the Cart link on the top bar of the site and you will be redirected to the relevant page")
    public void click_on_the_cart_link_on_the_top_bar_of_the_site_and_you_will_be_redirected_to_the_relevant_page() {

    }
    @Given("Click on the New User Zone link on the top bar of the site and you will be redirected to the relevant page")
    public void click_on_the_new_user_zone_link_on_the_top_bar_of_the_site_and_you_will_be_redirected_to_the_relevant_page() {

    }
    @Given("Click on the Daily Deals link on the top bar of the site and you will be redirected to the relevant page")
    public void click_on_the_daily_deals_link_on_the_top_bar_of_the_site_and_you_will_be_redirected_to_the_relevant_page() {

    }

    //====================STEPS ESRA SONU============================================





}

