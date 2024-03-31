package stepdefinitions;
import com.sun.source.tree.AssertTree;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.Base;
import pages.VisitorHomePage;
import utils.Driver;
import utils.ConfigReader;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class VisitorHomePageStepDef extends Base {

    //-------------Login Steps AYCA-----------------//

    String originalWindowHandle;

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
        wait(2);
        visitorHomePage.loginButton.click();
        visitorHomePage.textBoxUserEmail.click();
        visitorHomePage.textBoxUserEmail.sendKeys(ConfigReader.getProperty(customerEmail));
        visitorHomePage.textBoxUserPassword.click();
        visitorHomePage.textBoxUserPassword.sendKeys(ConfigReader.getProperty(password));
        wait(1);
        scrollIntoViewJS(visitorHomePage.signInButton);
        clickWithJS(visitorHomePage.signInButton);
        String expectedUrl="https://qa.buysellcycle.com/profile/dashboard";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        if(expectedUrl.equals(actualUrl)){
            Assert.assertEquals(expectedUrl,actualUrl);}
        else {
            Assert.assertTrue(visitorHomePage.textLoginErrorMessage.isDisplayed());
        }
        wait(1);
    }

    // AYCA SLIDER IMAGES CHECK  //

    @Given("Verify that slider image, second navigation button and third navigation button is visible")
    public void verify_that_and_is_visible() {

        wait(5);
        if (visitorHomePage.cookieAllert.isDisplayed() && visitorHomePage.cookieAllert.isEnabled()) {
            visitorHomePage.cookieAllert.click();
        }
        Assert.assertTrue(visitorHomePage.imageSlider.isDisplayed());
        Assert.assertTrue(visitorHomePage.firstSlideNavigatorButton.isDisplayed());
        Assert.assertTrue(visitorHomePage.secondSlideNavigatorButton.isDisplayed());
        Assert.assertTrue(visitorHomePage.thirdSlideNavigatorButton.isDisplayed());

    }
    @Given("Click on the navigation button and Verify that image is visible")
    public void click_on_the_navigation_button_and_verify_that_image_is_visible() {

        wait(5);
        if (visitorHomePage.cookieAllert.isDisplayed() && visitorHomePage.cookieAllert.isEnabled()) {
            visitorHomePage.cookieAllert.click();
        }
        visitorHomePage.secondSlideNavigatorButton.click();
        Assert.assertTrue(visitorHomePage.imageSecondSlider.isDisplayed());
        visitorHomePage.thirdSlideNavigatorButton.click();
        Assert.assertTrue(visitorHomePage.imageThirdSlider.isDisplayed());
        visitorHomePage.firstSlideNavigatorButton.click();
        Assert.assertTrue(visitorHomePage.imageThirdSlider.isDisplayed());

    }

    @Given("Verify the slider images are visible automaticly")
    public void verify_the_slider_images_are_visible_automaticly() {

        wait(5);
        if (visitorHomePage.cookieAllert.isDisplayed() && visitorHomePage.cookieAllert.isEnabled()) {
            visitorHomePage.cookieAllert.click();
        }
        wait(3);
        Assert.assertTrue(visitorHomePage.imageSecondSlider.isDisplayed());
        wait(5);
        Assert.assertTrue(visitorHomePage.imageThirdSlider.isDisplayed());
        wait(5);
        Assert.assertTrue(visitorHomePage.imageFirstSlider.isDisplayed());

    }


    @Given("Click on the slider images in order and Verifying that navigate to the image Page")
    public void click_on_the_slider_images_in_order_and_verifying_that_navigate_to_the_image_page() {

        visitorHomePage.imageFirstSlider.click();


    }

    //---------AYCA FOOTER LINK CHECK-------------//
    @Given("Scroll down to the bottom of the home page.Verify that the About Us, Blog, Dashboard, My Profile, My Order, Help&Contact, Track Order, Return&Exchange,Track Order, Return&Exchange link are visible on footer table.")
    public void scroll_down_to_the_bottom_of_the_home_page_verify_that_the_about_us_blog_dashboard_my_profile_my_order_help_contact_track_order_return_exchange_track_order_return_exchange_link_are_visible_on_footer_table() {
        scrollIntoViewJS(visitorHomePage.tableFooter);
        Assert.assertTrue(visitorHomePage.linkFooterAboutUs.isDisplayed());

    }
    @Given("Click on the About Us link and verify the navigate to About Us Page.")
    public void click_on_the_about_us_link_and_verify_the_navigate_to_about_us_page() {

        scrollIntoViewJS(visitorHomePage.tableFooter);
        wait(2);
        clickWithJS(visitorHomePage.linkFooterAboutUs);
        wait(2);
        String expectedUrl = "https://qa.buysellcycle.com/about-us";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }
    @Given("Scroll down to the bottom of the home page.Click on the Blog link and verify the navigate to Blog Page.")
    public void scroll_down_to_the_bottom_of_the_home_page_click_on_the_blog_link_and_verify_the_navigate_to_blog_page() {

        scrollIntoViewJS(visitorHomePage.tableFooter);
        wait(2);
        clickWithJS(visitorHomePage.linkFooterBlog);
        wait(2);
        String expectedUrl = "https://qa.buysellcycle.com/blog";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);



    }
    @Given("Scroll down to the bottom of the home page.Click on the Dashboard link and verify the navigate to Sign In Page.Click on the website logo.")
    public void scroll_down_to_the_bottom_of_the_home_page_click_on_the_dashboard_link_and_verify_the_navigate_to_sign_in_page_click_on_the() {

        scrollIntoViewJS(visitorHomePage.tableFooter);
        wait(2);
        clickWithJS(visitorHomePage.linkFooterDashboard);
        wait(2);
        String expectedUrl = "https://qa.buysellcycle.com/login";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        clickWithJS(visitorHomePage.logoSite);



    }
    @Given("Scroll down to the bottom of the home page.Click on the My Profile link and verify the navigate to Sign In Page.Click on the website logo.")
    public void scroll_down_to_the_bottom_of_the_home_page_click_on_the_my_profile_link_and_verify_the_navigate_to_sign_in_page_click_on_the() {

        scrollIntoViewJS(visitorHomePage.tableFooter);
        wait(2);
        clickWithJS(visitorHomePage.linkFooterMyProfile);
        wait(2);
        String expectedUrl = "https://qa.buysellcycle.com/login";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        clickWithJS(visitorHomePage.logoSite);


    }
    @Given("Scroll down to the bottom of the home page.Click on the My Order link and verify the navigate to Sign In Page.Click on the website logo.")
    public void scroll_down_to_the_bottom_of_the_home_page_click_on_the_my_order_link_and_verify_the_navigate_to_sign_in_page_click_on_the() {

        scrollIntoViewJS(visitorHomePage.tableFooter);
        wait(2);
        clickWithJS(visitorHomePage.linkFooterMyOrder);
        wait(2);
        String expectedUrl = "https://qa.buysellcycle.com/login";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        clickWithJS(visitorHomePage.logoSite);

    }
    @Given("Scroll down to the bottom of the home page.Click on the Help&Contact link and verify the navigate to Contact Us Page.")
    public void scroll_down_to_the_bottom_of_the_home_page_click_on_the_help_contact_link_and_verify_the_navigate_to_contact_us_page() {


        scrollIntoViewJS(visitorHomePage.tableFooter);
        wait(2);
        clickWithJS(visitorHomePage.linkFooterHelpContact);
        wait(2);
        String expectedUrl = "https://qa.buysellcycle.com/contact-us";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);




    }
    @Given("Scroll down to the bottom of the home page.Click on the Track Order link and verify the navigate to Track Order Page.")
    public void scroll_down_to_the_bottom_of_the_home_page_click_on_the_track_order_link_and_verify_the_navigate_to_track_order_page() {

        scrollIntoViewJS(visitorHomePage.tableFooter);
        wait(2);
        clickWithJS(visitorHomePage.linkFooterTrackOrder);
        wait(2);
        String expectedUrl = "https://qa.buysellcycle.com/track-order";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);

    }
    @Given("Scroll down to the bottom of the home page.Click on the Return&Exchange link and verify the navigate to Return&Exchange Page.")
    public void scroll_down_to_the_bottom_of_the_home_page_click_on_the_return_exchange_link_and_verify_the_navigate_to_return_exchange_page() {


        scrollIntoViewJS(visitorHomePage.tableFooter);
        wait(2);
        clickWithJS(visitorHomePage.linkFooterReturnExchange);
        wait(2);
        String expectedUrl = "https://qa.buysellcycle.com/return-exchange";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);

    }

    @Given("Scroll down to the bottom of the home page. Enter an email on address field on subscribe and click the subscribe button.")
    public void scroll_down_to_the_bottom_of_the_home_page_enter_an_email_on_address_field_on_subscribe_and_click_the_subscribe_button() {
        scrollIntoViewJS(visitorHomePage.textFooterGetQuickQuite);
        wait(1);
        clickWithJS(visitorHomePage.textBoxFooterEmail);
        visitorHomePage.textBoxFooterEmail.sendKeys(faker.internet().emailAddress());
        wait(1);
        clickWithJS(visitorHomePage.subscribeButton);
        wait(1);
        Assert.assertTrue(visitorHomePage.textFooterSubscribeSuccessfully.isDisplayed());

    }

    @Given("Scroll down to the bottom of the home page. Enter a registered email on address field on subscribe and click the subscribe button.")
    public void scroll_down_to_the_bottom_of_the_home_page_enter_a_registered_email_on_address_field_on_subscribe_and_click_the_subscribe_button() {

        scrollIntoViewJS(visitorHomePage.textFooterGetQuickQuite);
        wait(1);
        clickWithJS(visitorHomePage.textBoxFooterEmail);
        visitorHomePage.textBoxFooterEmail.sendKeys(ConfigReader.getProperty("aycaCustomerEmail"));
        wait(1);
        clickWithJS(visitorHomePage.subscribeButton);
        wait(1);
        Assert.assertTrue(visitorHomePage.textFooterAlreadySubscribed.isDisplayed());


    }

    @Given("Scroll down to the bottom of the home page. Click on the Google Play link and verify that the navigate to Google Store Page")
    public void scroll_down_to_the_bottom_of_the_home_page_click_on_the_google_play_link_and_verify_that_the_navigate_to_google_store_page() {
        scrollIntoViewJS(visitorHomePage.linkFooterGooglePlay);
        wait(1);
        clickWithJS(visitorHomePage.linkFooterGooglePlay);
        wait(1);
        String expectedUrlGoogle = "https://play.google.com/store/games";
        String actualUrlGoogle = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrlGoogle,actualUrlGoogle);

    }
    @Given("Return to the website")
    public void return_to_the_website() {
        Driver.getDriver().navigate().back();
    }
    @Given("Scroll down to the bottom of the home page. Click on the The Apple Store link and verify that the navigate to The Apple Store Page")
    public void scroll_down_to_the_bottom_of_the_home_page_click_on_the_the_apple_store_link_and_verify_that_the_navigate_to_the_apple_store_page() {

        scrollIntoViewJS(visitorHomePage.linkFooterAppleStore);
        clickWithJS(visitorHomePage.linkFooterAppleStore);
        wait(1);
        String expectedUrlApple = "https://www.apple.com/app-store/";
        String actualUrlApple = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrlApple,actualUrlApple);


    }



    @Given("Scroll down to the bottom of the home page. Verify that the enf of the footer text is visible")
    public void scroll_down_to_the_bottom_of_the_home_page_verify_that_the_enf_of_the_footer_text_is_visible() {

        scrollIntoViewJS(visitorHomePage.tableFooter);
        wait(2);
        Assert.assertTrue(visitorHomePage.textFooterCopyRight.isDisplayed());

    }

    @Given("Scroll down to the bottom of the home page. Click on the go to top button and verify that reached the top of the page")
    public void scroll_down_to_the_bottom_of_the_home_page_click_on_the_button_and_verify_that_reached_the_top_of_the_page() {
        scrollIntoViewJS(visitorHomePage.tableFooter);
        wait(2);
        waitAndClick(visitorHomePage.goTopButton);
        wait(2);
        Assert.assertTrue(visitorHomePage.homeHeaderButton.isDisplayed());

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
        visitorHomePage.blogKeyword.sendKeys("shopping");
    }

    @Then("Verify that relevant blogs are listed based on the selected keyword")
    public void verify_that_relevant_blogs_are_listed_based_on_the_selected_keyword() {
        String actualTagName = visitorHomePage.blogKeyword.getTagName();
        String expectedTagName = "shopping";
        assert actualTagName.equals(expectedTagName) : "Something went wrong";
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






    //-------------Login Steps İlteriş-----------------//


    @Given("Click on the {string} button")
    public void click_on_the_button(String string) {
    }

    @Given("New User Zone should be displayed on the home page navBar and the page should be accessed")
    public void new_user_zone_should_be_displayed_on_the_home_page_nav_bar_and_the_page_should_be_accessed() {

    }




    //=========================== STEPS  NEVFEL ====================================/

    @Given("Click on the Track your Order link")
    public void click_on_the_track_your_order_link() {
        clickWithJS(visitorHomePage.linkTextTrackYourOrder);
    }
    @Given("Verify that the Order Tracking Number text is visible")
    public void verify_that_the_order_tracking_number_text_is_visible() {
        assertTrue(visitorHomePage.textBoxOrderTrackingNumber.isDisplayed());
    }
    @Given("Verify that Order Tracking Number is clickable")
    public void verify_that_order_tracking_number_is_clickable() {
        assertTrue(visitorHomePage.textBoxOrderTrackingNumber.isEnabled());
    }

    @Given("Verify that Track Now button is visible")
    public void verify_that_track_now_button_is_visible() {

       assertTrue( visitorHomePage.trackNowButton.isDisplayed());
    }
    @Given("Verify that Track Now button is clickable")
    public void verify_that_track_now_button_is_clickable() {
        clickWithJS(visitorHomePage.trackNowButton);
        assertTrue(visitorHomePage.trackNowButton.isEnabled());
    }


    @Given("Enter a unvalid {string} password in the Order Tracking Number field")
    public void enter_a_unvalid_password_in_the_order_tracking_number_field(String unvalidpass) {
        visitorHomePage.textBoxOrderTrackingNumber.sendKeys(unvalidpass);

    }
    @Given("Enter a unvalid {string} password in the Secret ID")
    public void enter_a_unvalid_password_in_the_secret_id(String unvalidID) {
       visitorHomePage.textBoxSecretID.sendKeys(unvalidID);
    }
    @Given("Click on the Track Now")
    public void click_on_the_track_now() {
        clickWithJS(visitorHomePage.trackNowButton);

    }
    @Given("Show warning message on the page")
    public void show_warning_message_on_the_page() {
        visitorHomePage.labelOrderNumberUnvalidText.isDisplayed();

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
        Assert.assertEquals(expectedUrl,actualUrl);
    }
    @Given("Verify that the company phone number is visible under the Call or WhatsApp: heading on contact page")
    public void verify_that_the_company_phone_number_is_visible_under_the_call_or_whats_app_heading_on_contact_page() {
        String whatsapp=ConfigReader.getProperty("companyPhoneNumber");
        String actualWhatsapp = visitorHomePage.textWhatsapp.getText();
        Assert.assertEquals(whatsapp,actualWhatsapp);
    }
    @Given("Verify that the company mail is visible under the Get in touch: heading on contact page")
    public void verify_that_the_company_mail_is_visible_under_the_get_in_touch_heading_on_contact_page() {
        String mail=ConfigReader.getProperty("companyPhoneNumber");
        String actualMail = visitorHomePage.textWhatsapp.getText();
        Assert.assertEquals(mail,actualMail);
    }
    @Given("Verify that the company address is visible under the Head office: heading on contact page")
    public void verify_that_the_company_address_is_visible_under_the_head_office_heading_on_contact_page() {
        String address=ConfigReader.getProperty("companyPhoneNumber");
        String actualAddress = visitorHomePage.textWhatsapp.getText();
        Assert.assertEquals(address,actualAddress);
    }
    @Given("Verify that the Facebook, Instagram, X, Linkedin icons are visible under the Social Media: heading on contact page")
    public void verify_that_the_facebook_instagram_x_linkedin_icons_are_visible_under_the_social_media_heading_on_contact_page() {
        Assert.assertTrue(visitorHomePage.iconFacebook.isDisplayed());
        Assert.assertTrue(visitorHomePage.iconX.isDisplayed());
        Assert.assertTrue(visitorHomePage.iconLinkedin.isDisplayed());
        Assert.assertTrue(visitorHomePage.iconInstagram.isDisplayed());
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
    public void i_should_click_on_the_on_the_header(String headerMenuElement) {
        clickHeaderElementLink(headerMenuElement);
    }
    @Then("I should be directed to the {string} page")
    public void i_should_be_directed_to_the_page(String pageName) {
        waitForPageToLoad(2);
        checkTheTitle(pageName);
    }
    @Then("I should see the character, status, and picture of {string}")
    public void i_should_see_the_character_status_and_picture_of(String teamMember) {
        visitorHomePage.verifyTheTeamMembersInfo(teamMember);

    }

    @Given("I am on the {string} Page")
    public void iAmOnThePage(String page) {

        checkTheTitle(page);
    }




    //---------------- Steps Asli----------------------/




//====================STEPS ESRA BASLANGIC=============================================

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
        waitAndSendText(visitorHomePage.searchTextBox,"Belt");
        wait(2);

    }

    @When("Displays All Categories dropdown")
    public void displaysAllCategoriesDropdown() {
        assertTrue(visitorHomePage.linkAllCategories.isDisplayed());
    }

    @When("Click All Categories dropdown menu")
    public void clickAllCategoriesDropdownMenu() {
       clickWithJS(visitorHomePage.linkAllCategories);
    }

    @When("Displays the subheadings of the dropdown menu that opens")
    public void displaysTheSubheadingsOfTheDropdownMenuThatOpens() {
        //AllCategories alt basliklarini goruntuler
        wait(2);
        assertTrue(visitorHomePage.linkElectronics.isDisplayed());
        assertTrue(visitorHomePage.linkFashion.isDisplayed());
        assertTrue(visitorHomePage.linkBaby.isDisplayed());
        assertTrue(visitorHomePage.linkHomeFurniture.isDisplayed());
        assertTrue(visitorHomePage.linkSporOutdoor.isDisplayed());
        assertTrue(visitorHomePage.linkAccessories.isDisplayed());
        assertTrue(visitorHomePage.linkBeauty.isDisplayed());
        assertTrue(visitorHomePage.linkBookStationery.isDisplayed());
        assertTrue(visitorHomePage.linkHobiMusic.isDisplayed());
        assertTrue(visitorHomePage.linkSupermarket.isDisplayed());
        assertTrue(visitorHomePage.linkAutoGardenDiyStore.isDisplayed());
    }

    @Given("Click the Electronics link")
    public void click_the_electronics_link() {

    }
    @Given("Displays Electronics subcategories")
    public void displays_electronics_subcategories() {

    }
    @Given("Click the Fashion link")
    public void click_the_fashion_link() {

    }
    @Given("Displays Fashion subcategories")
    public void displays_fashion_subcategories() {

    }
    @Given("Click the Baby link")
    public void click_the_baby_link() {

    }
    @Given("Displays Baby subcategories")
    public void displays_baby_subcategories() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("Click the Home-Furniture link")
    public void click_the_home_furniture_link() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("Displays  Home-Furniture subcategories")
    public void displays_home_furniture_subcategories() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("Click the Sport-Outdoor link")
    public void click_the_sport_outdoor_link() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("Displays Sport-Outdoor subcategories")
    public void displays_sport_outdoor_subcategories() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("Click the Accessories link")
    public void click_the_accessories_link() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("Displays Accessories subcategories")
    public void displays_accessories_subcategories() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("Click the Beauty link")
    public void click_the_beauty_link() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("Displays Beauty subcategories")
    public void displays_beauty_subcategories() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("Click the Book-Stationery link")
    public void click_the_book_stationery_link() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("Displays Book-Stationery subcategories")
    public void displays_book_stationery_subcategories() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("Click the Hobi-Music link")
    public void click_the_hobi_music_link() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("Displays Hobi-Music subcategories")
    public void displays_hobi_music_subcategories() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("Click the Supermarket link")
    public void click_the_supermarket_link() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("Displays Supermarket subcategories")
    public void displays_supermarket_subcategories() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("Click the Auto-Garden-DiyStore link")
    public void click_the_auto_garden_diy_store_link() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("Displays Auto-Garden-DiyStore subcategories")
    public void displays_auto_garden_diy_store_subcategories() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



    //=============STEPS ESRA SONU=================================//


}

