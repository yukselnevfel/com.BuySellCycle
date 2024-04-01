package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.Base;
import utils.Driver;
import utils.ConfigReader;

import java.util.Locale;
import java.util.Map;

import static org.junit.Assert.*;

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
        Assert.assertEquals(expectedUrl, actualUrl);


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
        Assert.assertEquals(expectedUrl, actualUrl);

    }

    @Given("Verify that navigated to the Register page")
    public void verify_that_navigated_to_the_register_page() {
        String expectedUrl = "https://qa.buysellcycle.com/register";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);

    }

    @Given("Click on the login link, Enter {string} and {string} and click sign in")
    public void click_on_the_login_link_enter_and_and_click_sign_in(String customerEmail, String password) {
        visitorHomePage.loginButton.click();
        visitorHomePage.textBoxUserEmail.click();
        visitorHomePage.textBoxUserEmail.sendKeys(ConfigReader.getProperty(customerEmail));
        visitorHomePage.textBoxUserPassword.click();
        visitorHomePage.textBoxUserPassword.sendKeys(ConfigReader.getProperty(password));
        wait(1);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        visitorHomePage.signInButton.click();
        String expectedUrl = "https://qa.buysellcycle.com/profile/dashboard";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
        wait(1);
    }


    //---------------------------Ayca Login Step Finish-------------------------------------------------------------------//


    //-------------Login Steps FIKRET-----------------/

    @Given("the user verifies that the Register button link is visible on the home page")
    public void the_user_verifies_that_the_register_button_link_is_visible_on_the_home_page() {
        assertTrue(visitorHomePage.linkRegister.isDisplayed());
    }

    @Given("the user verifies that the Register button link is active on the home page")
    public void the_user_verifies_that_the_register_button_link_is_active_on_the_home_page() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        assertTrue(visitorHomePage.linkRegister.isEnabled());
    }

    @Given("the user clicks the Register button link on the home page")
    public void the_user_clicks_the_register_button_link_on_the_home_page() {
        clickWithJS(visitorHomePage.linkRegister);
    }

    @Given("the user verifies the image and text in the right section")
    public void the_user_verifies_the_image_and_text_in_the_right_section() {
        assertTrue(visitorHomePage.labelPictureText.isDisplayed());
        assertTrue(visitorHomePage.picturePNG.isDisplayed());
    }

    @Given("the user validates the signUp form in the left section")
    public void the_user_validates_the_sign_up_form_in_the_left_section() {
        assertTrue(visitorHomePage.tableRegisterForm.isDisplayed());
    }

    @Given("the user verifies that the SignUp button is visible and active")
    public void the_user_verifies_that_the_sign_up_button_is_visible_and_active() {
        assertTrue(visitorHomePage.signUpButton.isDisplayed());
        assertTrue(visitorHomePage.signUpButton.isEnabled());
    }

    @Given("the user leaves all fields blank in the SignUp form and clicks the SignUp button")
    public void the_user_leaves_all_fields_blank_in_the_sign_up_form() {
        clickWithJS(visitorHomePage.signUpButton);
    }

    @Given("the user confirmed that registration failed")
    public void the_user_clicks_the_sign_up_button() {
        assertEquals(visitorHomePage.labelSignUpText.getText(), "Sign Up");
    }

    @Given("the user Terms of Service and Privacy Policy checkbox radioBotton click")
    public void the_user_terms_of_service_and_privacy_policy_checkbox_radio_botton_click() {
        clickWithJS(visitorHomePage.signUpRadyoButton);
    }

    @Given("the user clicks SignUp button link")
    public void the_user_clicks_sign_up_button_link() {
        clickWithJS(visitorHomePage.signUpButton);
    }


    @Given("the user enters a number in a valid telephone format")
    public void the_user_enters_a_number_in_a_valid_telephone_format() {
        visitorHomePage.textBoxEmail.sendKeys(visitorHomePage.generateRandomPhoneNumber());
    }

    @Given("It is confirmed that registration valid phone format")
    public void it_is_confirmed_that_registration_valid_phone_format() {
        assertFalse(visitorHomePage.labelEmailandPhoneError.isDisplayed());
    }

    @Given("the user enters a valid email address")
    public void the_user_enters_a_valid_email_address() {
        visitorHomePage.textBoxEmail.sendKeys(visitorHomePage.generateRandomEmail());
    }

    @Given("It is confirmed that registration valid email format")
    public void it_is_confirmed_that_registration_valid_email_format() {
        assertFalse(visitorHomePage.labelEmailandPhoneError.isDisplayed());
    }

    @Given("the user enters a valid password {string} that meets criteria")
    public void the_user_enters_a_valid_password_that_meets_criteria(String password) {
        visitorHomePage.textBoxUserPassword.sendKeys(password);
        visitorHomePage.textBoxPasswordConfirm.sendKeys(password);
    }

    @Given("the user confirms that it does not receive error message")
    public void the_user_confirms_that_it_does_not_receive_error_message() {
        assertFalse(visitorHomePage.labelPasswordError.isDisplayed());
    }

    @Given("the user clicks the SignIn buttonLink")
    public void the_user_clicks_the_sign_in_button_link() {
        clickWithJS(visitorHomePage.linkSignIn);
    }

    @Given("the user verifies that it is possible to navigate to the SignIn page")
    public void the_user_verifies_that_it_is_possible_to_navigate_to_the_sign_in_page() {
        assertTrue(visitorHomePage.labelSignInText.isDisplayed());
    }


    @Given("the user enters an invalid {string} email")
    public void the_user_enters_an_invalid_email(String email) {
        visitorHomePage.textBoxEmail.sendKeys(email);
    }

    @Given("It is confirmed that registration failed due to invalid email format")
    public void it_is_confirmed_that_registration_failed_due_to_invalid_email_format() {
        assertTrue(visitorHomePage.labelEmailandPhoneError.isDisplayed());
    }


    @Given("the user enters a password {string} that does not meet criteria")
    public void the_user_enters_a_password_that_does_not_meet_criteria(String password) {
        visitorHomePage.textBoxUserPassword.sendKeys(password);
        visitorHomePage.textBoxPasswordConfirm.sendKeys(password);
    }

    @Given("It is confirmed that registration failed due to weak password")
    public void it_is_confirmed_that_registration_failed_due_to_weak_password() {
        assertTrue(visitorHomePage.labelPasswordError.isDisplayed());
    }

    @Given("the user enters a number in an invalid phone format {string}")
    public void the_user_enters_a_number_in_an_invalid_phone_format(String phone) {
        visitorHomePage.textBoxEmail.sendKeys(phone);
    }

    @Given("It is confirmed that registration failed due to invalid phone format")
    public void it_is_confirmed_that_registration_failed_due_to_invalid_phone_format() {
        assertTrue(visitorHomePage.labelEmailandPhoneError.isDisplayed());
    }

    @When("the user selects the Terms of Service and Privacy Policy checkbox")
    public void the_user_selects_the_terms_of_service_and_privacy_policy_checkbox() {
        clickWithJS(visitorHomePage.signUpRadyoButton);
    }

    @Given("the user confirmed that registration failed checkButton")
    public void the_user_confirmed_that_registration_failed_check_button() {
        assertTrue(visitorHomePage.radyoButtonError.isDisplayed());
    }


    @Given("the user enters {string} {string} {string}")
    public void the_user_enters(String firstname, String lastname, String password) {
        visitorHomePage.textBoxFirstName.sendKeys(firstname);
        visitorHomePage.textBoxLastName.sendKeys(lastname);
        visitorHomePage.textBoxEmail.sendKeys(visitorHomePage.generateRandomEmail());
        visitorHomePage.textBoxUserPassword.sendKeys(password);
        visitorHomePage.textBoxPasswordConfirm.sendKeys(password);

    }

    @Then("the user should be successfully registered and redirected to the sign-in page")
    public void the_user_should_be_successfully_registered_and_redirected_to_the_sign_in_page() {
        assertTrue(visitorHomePage.loginButton.isDisplayed());
    }

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
    public void verify_that_the_is_visible() {
        assertTrue(visitorHomePage.linkHeaderBlog.isDisplayed());
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
        assertEquals("https://qa.buysellcycle.com/blog", Driver.getDriver().getCurrentUrl());
    }

    @Given("Verify that navigated to the Read More Page")
    public void verify_that_navigated_to_the_read_more_page() {
        clickWithJS(visitorHomePage.linkReadMore);
        assertTrue(visitorHomePage.labelCategoryText.isDisplayed());
    }

    @Given("Enter a keyword into the search texBox and press Enter")
    public void enter_a_keyword_into_the_tex_box_and_press() {
        visitorHomePage.blogSearchBox.sendKeys("metaverse " + Keys.ENTER);
    }

    @Given("Verify that the search results are relevant to the entered keyword")
    public void verify_that_the_search_results_are_relevant_to_the_entered_keyword() {
        assertTrue(visitorHomePage.labelMetaverseText.getText().contains("Metaverse"));
    }

    @When("Select a category from the Category section")
    public void select_a_category_from_the_category_section() {
        clickWithJS(visitorHomePage.selectCategoryPost);
    }

    @Then("Verify that blogs related to the selected category are listed")
    public void verify_that_blogs_related_to_the_selected_category_are_listed() {
        assertEquals("https://qa.buysellcycle.com/blog/category/posts/e-commerce-7", Driver.getDriver().getCurrentUrl());
    }

    @When("Select a keyword from the Keyword section")
    public void select_a_keyword_from_the_keyword_section() {
        clickWithJS(visitorHomePage.labelShoppingText);
    }

    @Then("Verify that relevant blogs are listed based on the selected keyword")
    public void verify_that_relevant_blogs_are_listed_based_on_the_selected_keyword() {

        clickWithJS(visitorHomePage.linkReadMore);
        assertTrue(visitorHomePage.labelTagShoppingText.isDisplayed());
    }

    @When("Select a category from the Popular Posts section")
    public void select_a_category_from_the_popular_posts_section() {
        clickWithJS(visitorHomePage.popularCategoryBlog);
    }

    @Then("Verify that the page with the selected blog post has been accessed")
    public void verify_that_the_page_with_the_selected_blog_post_has_been_accessed() {
        assertTrue(Driver.getDriver().getCurrentUrl().startsWith("https://qa.buysellcycle.com/blog/post/"));

    }

    @Given("Close the page")
    public void close_the_page() {
        Driver.quitDriver();
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

    //------------- Steps Sımge ------------------/
    @Given("Verify that the Contact link is visible")
    public void verify_that_the_contact_link_is_visible() {
        Assert.assertTrue(visitorHomePage.linkContact.isDisplayed());
    }

    @Given("Click on the Contact link")
    public void click_on_the_contact_link() {
        visitorHomePage.linkContact.click();
    }

    @Given("Verify that navigated to the Contact page")
    public void verify_that_navigated_to_the_contact_page() {
        String expectedUrl = "https://qa.buysellcycle.com/contact-us";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    @Given("Verify that the company phone number is visible under the Call or WhatsApp: heading on contact page")
    public void verify_that_the_company_phone_number_is_visible_under_the_call_or_whats_app_heading_on_contact_page() {
        String whatsapp = ConfigReader.getProperty("companyPhoneNumber");
        String actualWhatsapp = visitorHomePage.textWhatsapp.getText();
        Assert.assertEquals(whatsapp, actualWhatsapp);
    }

    @Given("Verify that the company mail is visible under the Get in touch: heading on contact page")
    public void verify_that_the_company_mail_is_visible_under_the_get_in_touch_heading_on_contact_page() {
        String mail = ConfigReader.getProperty("companyPhoneNumber");
        String actualMail = visitorHomePage.textWhatsapp.getText();
        Assert.assertEquals(mail, actualMail);
    }

    @Given("Verify that the company address is visible under the Head office: heading on contact page")
    public void verify_that_the_company_address_is_visible_under_the_head_office_heading_on_contact_page() {
        String address = ConfigReader.getProperty("companyPhoneNumber");
        String actualAddress = visitorHomePage.textWhatsapp.getText();
        Assert.assertEquals(address, actualAddress);
    }

    @Given("Verify that the Facebook, Instagram, X, Linkedin icons are visible under the Social Media: heading on contact page")
    public void verify_that_the_facebook_instagram_x_linkedin_icons_are_visible_under_the_social_media_heading_on_contact_page() {
        Assert.assertTrue(visitorHomePage.iconFacebook.isDisplayed());
        Assert.assertTrue(visitorHomePage.iconX.isDisplayed());
        Assert.assertTrue(visitorHomePage.iconLinkedin.isDisplayed());
        Assert.assertTrue(visitorHomePage.iconInstagram.isDisplayed());
    }

//====================STEPS ESRA BASLANGIC================================

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
        clickWithJS(visitorHomePage.linkTextCompare);
        assertTrue(visitorHomePage.titleProductCompare.isDisplayed());
    }

    @Given("Click on the WishList link on the top bar of the site and you will be redirected to the relevant page")
    public void click_on_the_wish_list_link_on_the_top_bar_of_the_site_and_you_will_be_redirected_to_the_relevant_page() {
        clickWithJS(visitorHomePage.linkTextWishList);
        assertTrue(visitorHomePage.titleSignIn.isDisplayed());
    }

    @Given("Click on the Cart link on the top bar of the site and you will be redirected to the relevant page")
    public void click_on_the_cart_link_on_the_top_bar_of_the_site_and_you_will_be_redirected_to_the_relevant_page() {
        clickWithJS(visitorHomePage.linkTextCart);
        assertTrue(visitorHomePage.titleOrderSummary.isDisplayed());
    }

    @Given("Click on the New User Zone link on the top bar of the site and you will be redirected to the relevant page")
    public void click_on_the_new_user_zone_link_on_the_top_bar_of_the_site_and_you_will_be_redirected_to_the_relevant_page() {
        clickWithJS(visitorHomePage.linkTextNewUserZone);
        assertTrue(visitorHomePage.titleSurpriseForNewUsers.isDisplayed());
    }

    @Given("Click on the Daily Deals link on the top bar of the site and you will be redirected to the relevant page")
    public void click_on_the_daily_deals_link_on_the_top_bar_of_the_site_and_you_will_be_redirected_to_the_relevant_page() {
        clickWithJS(visitorHomePage.linkTextDailyDeals);
        assertTrue(visitorHomePage.titleDealEndsIn.isDisplayed());
    }

    @When("Return to Home page")
    public void returnToHomePage() {
        Driver.getDriver().navigate().back();
    }

    @Given("Clicks on the Site logo")
    public void clicks_on_the_site_logo() {
        clickWithJS(visitorHomePage.logoSite);
    }

    @Given("Refreshes the home page")
    public void refreshes_the_home_page() {

        String expectedTitle = "BuySellCycle | Multivendor Marketplace";
        String actualTitle = Driver.getDriver().getTitle();
        assertEquals(expectedTitle, actualTitle);
    }

    @When("Click to the search box")
    public void clickToTheSearchBox() {
        clickWithJS(visitorHomePage.searchTextBox);
    }

    @When("User searches for products in the search box")
    public void userSearchesForProductsInTheSearchBox() {
        waitAndSendText(visitorHomePage.searchTextBox, "Belt");
        wait(2);

    }


    //=============STEPS ESRA SONU=================================


    //------------- Steps SAMET -----------------/

    @Given("Verify title is {string}")
    public void verify_that_title(String title) {
        String expectedTitle = title;
        String actualTitle = Driver.getDriver().getTitle();
        assertEquals(expectedTitle, actualTitle);
    }


}