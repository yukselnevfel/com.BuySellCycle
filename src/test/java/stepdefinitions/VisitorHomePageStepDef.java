package stepdefinitions;
import com.sun.source.tree.AssertTree;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import jdk.incubator.foreign.CLinker;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;
import pages.Base;
import pages.VisitorHomePage;
import utils.Driver;
import utils.ConfigReader;

import java.util.ArrayList;
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
        wait(1);
        visitorHomePage.loginButton.click();
        wait(1);
        clickWithJS(visitorHomePage.textBoxUserEmail);
        visitorHomePage.textBoxUserEmail.sendKeys(ConfigReader.getProperty(customerEmail));
        clickWithJS(visitorHomePage.textBoxUserPassword);
        visitorHomePage.textBoxUserPassword.sendKeys(ConfigReader.getProperty(password));
        scrollIntoViewJS(visitorHomePage.signInButton);
        wait(1);
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
    @Given("Click on the Facebook icon on contact page")
    public void click_on_the_facebook_icon_on_contact_page() {
        visitorHomePage.iconFacebook.click();
    }
    @Given("Verify that the company's Facebook page is opened")
    public void verify_that_the_company_s_facebook_page_is_opened() {
        String expectedUrl="https://www.facebook.com/";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }
    @Given("Click on the X icon on contact page")
    public void click_on_the_x_icon_on_contact_page() {
     visitorHomePage.iconX.click();
    }
    @Given("Verify that the company's X page is opened")
    public void verify_that_the_company_s_x_page_is_opened() {
        String expectedUrl="https://twitter.com/";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }


    @Given("Click on the Linkedin icon on contact page")
    public void click_on_the_linkedin_icon_on_contact_page() {
        visitorHomePage.iconLinkedin.click();
    }
    @Given("Verify that the company's Linkedin page is opened")
    public void verify_that_the_company_s_linkedin_page_is_opened() {
        String expectedUrl="https://www.linkedin.com/";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }

    @Given("Click on the Instagram icon on contact page")
    public void click_on_the_instagram_icon_on_contact_page() {
        visitorHomePage.iconInstagram.click();
    }
    @Given("Verify that the company's Instagram page is opened")
    public void verify_that_the_company_s_instagram_page_is_opened() {
        String expectedUrl="https://www.instagram.com/";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }

    @Given("Verify that the Get in touch form title is visible on contact page")
    public void verify_that_the_get_in_touch_form_title_is_visible_on_contact_page() {
    Assert.assertTrue(visitorHomePage.textGetinTouch.isDisplayed());
    }
    @Given("Verify that the Enter Name placeholder is visible on contact page")
    public void verify_that_the_enter_name_placeholder_is_visible_on_contact_page() {
    Assert.assertTrue(visitorHomePage.textBoxName.isDisplayed());
    }
    @Given("Verify that the Enter Email Address placeholder is visible on contact page")
    public void verify_that_the_enter_email_address_placeholder_is_visible_on_contact_page() {
    Assert.assertTrue(visitorHomePage.textBoxEmail.isDisplayed());

    }
    @Given("Verify that the Order placeholder is visible on contact page")
    public void verify_that_the_order_placeholder_is_visible_on_contact_page() {
        Assert.assertTrue(visitorHomePage.checkBoxOrder.isDisplayed());
    }
    @Given("Verify that the Write Messages placeholder is visible on contact page")
    public void verify_that_the_write_messages_placeholder_is_visible_on_contact_page() {
        Assert.assertTrue(visitorHomePage.textBoxMessage.isDisplayed());
    }
    @Given("Verify that the Send Message button is visible on contact page")
    public void verify_that_the_send_message_button_is_visible_on_contact_page() {
        Assert.assertTrue(visitorHomePage.linkSendMessage.isDisplayed());

    }
    @Given("Click on the Enter Name textbox on contact page")
    public void click_on_the_enter_name_textbox_on_contact_page() {
        visitorHomePage.textBoxName.click();
    }
    @Given("Random name is entered")
    public void random_name_is_entered() {
        visitorHomePage.textBoxName.sendKeys(faker.name().fullName());
    }
    @Given("Click on the Enter Email Address textbox on contact page")
    public void click_on_the_enter_email_address_textbox_on_contact_page() {
        visitorHomePage.textBoxEmail.click();

    }
    @Given("Random mail is entered")
    public void random_mail_is_entered() {
        visitorHomePage.textBoxEmail.sendKeys(faker.internet().emailAddress());

    }

    @Given("Click on the Order and Payment is selected on contact page")
    public void click_on_the_order_and_payment_is_selected_on_contact_page() {
        visitorHomePage.checkBoxOrder.click();
        visitorHomePage.linkPayment.click();
        wait(1);
    }
    @Given("Click on the Write Messages textbox on contact page")
    public void click_on_the_write_messages_textbox_on_contact_page() {
        visitorHomePage.textBoxMessage.click();
    }
    @Given("Random message is entered")
    public void random_message_is_entered() {
     visitorHomePage.textBoxMessage.sendKeys(faker.lorem().paragraph(3));
    }
    @Given("Click on the Send Message button on contact page and verify that Message Sent successfully! is visible")
    public void click_on_the_send_message_button_on_contact_page_and_verify_that_message_sent_successfully_is_visible() {
        clickWithJS(visitorHomePage.linkSendMessage);
        wait(1);
        Assert.assertTrue(visitorHomePage.successfullAllert.isDisplayed());

    }
    @Given("Verify that the Electronics category  is visible on homepage")
    public void verify_that_the_electronics_category_is_visible_on_homepage() {
       scrollIntoViewJS(visitorHomePage.labelElectronics);
       wait(1);
       Assert.assertTrue(visitorHomePage.labelElectronics.isDisplayed());
    }
    @Given("Verify that the Telephone link is visible in Electronics category on homepage")
    public void verify_that_the_telephone_link_is_visible_in_electronics_category_on_homepage() {

       Assert.assertTrue(visitorHomePage.labelTelephone.isDisplayed());
    }
    @Given("Click on the Telephone link in Electronics category on homepage")
    public void click_on_the_telephone_link_in_electronics_category_on_homepage() {
        Assert.assertTrue(visitorHomePage.labelTelephone.isEnabled());
       clickWithJS(visitorHomePage.labelTelephone);

    }
    @Given("Verify that the phones are visible in the Electronics category on homepage")
    public void verify_that_the_phones_are_visible_in_the_electronics_category_on_homepage() {
       String phone=visitorHomePage.imagePhone.getText();
        Assert.assertTrue(phone.contains("Phone"));
    }
    @Given("Verify that the TV&Picture&Sound link is visible in Electronics category on homepage")
    public void verify_that_the_tv_picture_sound_link_is_visible_in_electronics_category_on_homepage() {
       Assert.assertTrue(visitorHomePage.labelTVPictureSound.isDisplayed());
    }
    @Given("Click on the TV&Picture&Sound link in Electronics category on homepage")
    public void click_on_the_tv_picture_sound_link_in_electronics_category_on_homepage() {
        clickWithJS(visitorHomePage.labelTVPictureSound);
        wait(1);
    }
    @Given("Verify that the TVs are visible in the Electronics category on homepage")
    public void verify_that_the_t_vs_are_visible_in_the_electronics_category_on_homepage() {
        wait(1);
        Assert.assertTrue(visitorHomePage.imageTV.isDisplayed());
        String tv = visitorHomePage.imageTV.getText();
        Assert.assertTrue(tv.contains("TV"));
    }
    @Given("Verify that the Photo&Camera link is visible in Electronics category on homepage")
    public void verify_that_the_photo_camera_link_is_visible_in_electronics_category_on_homepage() {
      Assert.assertTrue(visitorHomePage.labelPhotoCamera.isDisplayed());
    }
    @Given("Verify that the Computer&Tablet link is visible in Electronics category on homepage")
    public void verify_that_the_computer_tablet_link_is_visible_in_electronics_category_on_homepage() {
       Assert.assertTrue(visitorHomePage.labelComputerTablet.isDisplayed());
    }
    @Given("Verify that the Special for Players link is visible in Electronics category on homepage")
    public void verify_that_the_special_for_players_link_is_visible_in_electronics_category_on_homepage() {
      Assert.assertTrue(visitorHomePage.labelSpecialforPlayers.isDisplayed());
    }
    @Given("Verify that the Electronic Accessories link is visible in Electronics category on homepage")
    public void verify_that_the_electronic_accessories_link_is_visible_in_electronics_category_on_homepage() {
      Assert.assertTrue(visitorHomePage.labelElectronicAccessories.isDisplayed());
    }
    @Given("Verify that the compare icon is visible for the first product in Electronics category on homepage")
    public void verify_that_the_compare_icon_is_visible_for_the_first_product_in_electronics_category_on_homepage() {
        Assert.assertTrue(visitorHomePage.imagePhone.isDisplayed());
        actions.moveToElement(visitorHomePage.imagePhone).perform();
        wait(1);


       Assert.assertTrue(visitorHomePage.iconCompare.isDisplayed());
    }
    @Given("Click on the compare icon for the first product in Electronics category on homepage")
    public void click_on_the_compare_icon_for_the_first_product_in_electronics_category_on_homepage() {
        clickWithJS(visitorHomePage.iconCompare);

    }
    @Given("Verify that the product is added to the compare list")
    public void verify_that_the_product_is_added_to_the_compare_list() {
        wait(1);
        String expectedMessage="Product added to compare list successfully";
        String actualMessage=visitorHomePage.successfullAllert.getText();
        Assert.assertEquals(expectedMessage,actualMessage);
    }
    @Given("Verify that the wishlist icon is visible for the first product in Electronics category on homepage")
    public void verify_that_the_wishlist_icon_is_visible_for_the_first_product_in_electronics_category_on_homepage() {
        Assert.assertTrue(visitorHomePage.imagePhone.isDisplayed());
        actions.moveToElement(visitorHomePage.imagePhone).perform();
        wait(1);


        Assert.assertTrue(visitorHomePage.iconWishlist.isDisplayed());
    }
    @Given("Click on the wishlist icon for the first product in Electronics category on homepage")
    public void click_on_the_wishlist_icon_for_the_first_product_in_electronics_category_on_homepage() {
     clickWithJS(visitorHomePage.iconWishlist);
     wait(1);
    }
    @Given("Verify that the Please Login First warning is visible")
    public void verify_that_the_please_login_first_warning_is_visible() {
        String expectedMessage="Please login first";
        String actualMessage=visitorHomePage.successfullAllert.getText();
        Assert.assertEquals(expectedMessage,actualMessage);
    }
    @Given("Verify that the quick view icon is visible for the first product in Electronics category on homepage")
    public void verify_that_the_quick_view_icon_is_visible_for_the_first_product_in_electronics_category_on_homepage() {
        Assert.assertTrue(visitorHomePage.imagePhone.isDisplayed());

        actions.moveToElement(visitorHomePage.imagePhone).perform();
        wait(1);


        Assert.assertTrue(visitorHomePage.iconQuickView.isDisplayed());
    }
    @Given("Click on the quick view icon for the first product in Electronics category on homepage")
    public void click_on_the_quick_view_icon_for_the_first_product_in_electronics_category_on_homepage() {
        clickWithJS(visitorHomePage.iconQuickView);
        wait(1);
    }
    @Given("Verify that the detail window for the relevant product has opened")
    public void verify_that_the_detail_window_for_the_relevant_product_has_opened() {
        Assert.assertTrue(visitorHomePage.linkBuyNowElectronicsPage.isDisplayed());
      //String quickViewDetail=visitorHomePage.detailOfQuickView.getText();
     // Assert.assertTrue(quickViewDetail.contains("Phone"));
    }
    @Given("Verify that the add to cart icon is visible for the first product in Electronics category on homepage")
    public void verify_that_the_add_to_cart_icon_is_visible_for_the_first_product_in_electronics_category_on_homepage() {
       Assert.assertTrue(visitorHomePage.iconAddToCart.isDisplayed());
    }
    @Given("Click on the add to cart icon for the first product in Electronics category on homepage")
    public void click_on_the_add_to_cart_icon_for_the_first_product_in_electronics_category_on_homepage() {
     clickWithJS(visitorHomePage.iconAddToCart);
     wait(1);
    }
    @Given("Verify that the Item added to your cart warning is visible")
    public void verify_that_the_item_added_to_your_cart_warning_is_visible() {

        Assert.assertTrue(visitorHomePage.alertAddToCart.isDisplayed());
    }
    @Given("Verify that the Deal More link is visible in Electronics category on homepage")
    public void verify_that_the_deal_more_link_is_visible_in_electronics_category_on_homepage() {
       Assert.assertTrue(visitorHomePage.linkMoreDeals.isDisplayed());
    }
    @Given("Click on the Deal More link in Electronics category on homepage")
    public void click_on_the_deal_more_link_in_electronics_category_on_homepage() {
       clickWithJS(visitorHomePage.linkMoreDeals);
       wait(1);
    }
    @Given("Verify that the electronic category page is opened")
    public void verify_that_the_electronic_category_page_is_opened() {
       Assert.assertTrue(visitorHomePage.labelElectronicsPage.isDisplayed());
    }
    @Given("Verify that the wishlist icon is visible for the first product on Electronics category page")
    public void verify_that_the_wishlist_icon_is_visible_for_the_first_product_on_electronics_category_page() {
        Assert.assertTrue(visitorHomePage.imageElectronicsPage.isDisplayed());
        actions.moveToElement(visitorHomePage.imageElectronicsPage).perform();
        wait(2);
        Assert.assertTrue(visitorHomePage.iconWishlistElectronicsPage.isDisplayed());
    }
    @Given("Click on the wishlist icon for the first product on Electronics category page")
    public void click_on_the_wishlist_icon_for_the_first_product_on_electronics_category_page() {
     clickWithJS(visitorHomePage.iconWishlistElectronicsPage);
     wait(1);
    }
    @Given("Verify that the quick view icon is visible for the first product on Electronics category page")
    public void verify_that_the_quick_view_icon_is_visible_for_the_first_product_on_electronics_category_page() {
        Assert.assertTrue(visitorHomePage.imageElectronicsPage.isDisplayed());
        actions.moveToElement(visitorHomePage.imageElectronicsPage).perform();
        wait(2);
       Assert.assertTrue(visitorHomePage.iconQuickViewElectronicsPage.isDisplayed());
    }
    @Given("Click on the quick view icon for the first product on Electronics category page")
    public void click_on_the_quick_view_icon_for_the_first_product_on_electronics_category_page() {
        clickWithJS(visitorHomePage.iconQuickViewElectronicsPage);
        wait(2);
    }
    @Given("Verify that the compare icon is visible for the first product on Electronics category page")
    public void verify_that_the_compare_icon_is_visible_for_the_first_product_on_electronics_category_page() {
        Assert.assertTrue(visitorHomePage.imageElectronicsPage.isDisplayed());
        actions.moveToElement(visitorHomePage.imageElectronicsPage).perform();
        wait(2);
        Assert.assertTrue(visitorHomePage.iconCompareElectronicsPage.isDisplayed());
    }
    @Given("Click on the compare icon for the first product on Electronics category page")
    public void click_on_the_compare_icon_for_the_first_product_on_electronics_category_page() {
        clickWithJS(visitorHomePage.iconCompareElectronicsPage);
        wait(1);
    }
    @Given("Verify that the add to cart icon is visible for the first product on Electronics category page")
    public void verify_that_the_add_to_cart_icon_is_visible_for_the_first_product_on_electronics_category_page() {
        Assert.assertTrue(visitorHomePage.imageElectronicsPage.isDisplayed());
        actions.moveToElement(visitorHomePage.imageElectronicsPage).perform();
        wait(2);
        Assert.assertTrue(visitorHomePage.iconAddToCartElectronicsPage.isDisplayed());
    }
    @Given("Click on the add to cart icon for the first product on Electronics category page")
    public void click_on_the_add_to_cart_icon_for_the_first_product_on_electronics_category_page() {
       clickWithJS(visitorHomePage.iconAddToCartElectronicsPage);
       wait(2);
    }




//---------------- Simge Steps Sonu --------------/



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

    @When("I should see relevant {string} about the site")
    public void iShouldSeeRelevantAboutTheSite(String section) {
    }

    @Then("I should be able to modify the displayed information")
    public void iShouldBeAbleToModifyTheDisplayedInformation() {
    }

    @When("I should see relevant {string} about the Payment Page")
    public void iShouldSeeRelevantAboutThePaymentPage(String information) {
        visitorHomePage.verifyTheInformationsVisibility(information);
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

    //===================== Beytullah's Steps =========================
    @Given("User verifies that the New Product Deals link is visible")
    public void user_verifies_that_the_new_product_deals_link_is_visible() {
        Assert.assertTrue(visitorHomePage.linkNewProductDeals.isDisplayed());
    }

    @Given("User clicks on the New Product Deals link")
    public void user_clicks_on_the_new_product_deals_link() {
        waitAndClick(visitorHomePage.linkNewProductDeals);
    }

    @Given("User verifies that navigated to the BEST DEALS page")
    public void user_verifies_that_navigated_to_the_best_deals_page() {

        String expUrl = "https://qa.buysellcycle.com/category/best_deals?item=product";
        String actUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expUrl, actUrl);
    }

    @Given("User verifies that the filters is visible on the left side")
    public void user_verifies_that_the_filters_is_visible_on_the_left_side() {

        Assert.assertTrue(visitorHomePage.checkBoxWoman.isDisplayed());
        Assert.assertTrue(visitorHomePage.checkBoxTelephone.isDisplayed());
    }

    @Given("User clicks filters and verifies that the filters fulfill their functions")
    public void user_clicks_filters_and_verifies_that_the_filters_fulfill_their_functions() {
        waitAndClick(visitorHomePage.checkBoxWoman);
        wait(5);

    }

    @Given("User verifies that the Product number id visible")
    public void user_verifies_that_the_product_number_id_visible() {
        String productNumber = visitorHomePage.labelProductnumber.getText();
        productNumber = productNumber.replaceAll("\\D", "");
        int intProductNumber = Integer.parseInt(productNumber);
        Assert.assertTrue(intProductNumber > 0);
    }

    @Given("Verify that the Listing button, items DDM and sorting DDM is visible")
    public void verify_that_the_listing_button_items_ddm_and_sorting_ddm_is_visible() {
        Assert.assertTrue(visitorHomePage.buttonlistWiew.isDisplayed());
        Assert.assertTrue(visitorHomePage.ddmItems.isDisplayed());
        Assert.assertTrue(visitorHomePage.ddmSorting.isDisplayed());
    }

    @Given("User clicks on the Listing button and verifies that button works")
    public void user_clicks_on_the_listing_button_and_verifies_that_button_works() {
        clickWithJS(visitorHomePage.buttonlistWiew);
        Assert.assertTrue(visitorHomePage.elementFirstProduct.isDisplayed());
        wait(5);
    }

    @Given("User clicks on the items DDM and clicks on second item")
    public void user_clicks_on_the_items_ddm_and_clicks_second_item() {
        clickWithJS(visitorHomePage.ddmItems);
        clickWithJS(visitorHomePage.ddmSecondItem);
        wait(3);
        String pageSizeType = visitorHomePage.labelProductnumber.getText();
        pageSizeType = pageSizeType.substring(8, 14);
        String expPageSizeType = "1 - 12";
        String actPageSizeType = pageSizeType;
        Assert.assertEquals(expPageSizeType, actPageSizeType);
    }

    @Given("User verifies that items DDM works")
    public void user_verifies_that_items_ddm_works() {
        List<Integer> productPrice=new ArrayList<>();

        for (int i = 0; i < visitorHomePage.textProductprice.size(); i++) {


        }

        String strProductPrice = visitorHomePage.labelProductnumber.getText();
        System.out.println("strProductPrice = " + strProductPrice);

    }

    @Given("User clicks on the sorting DDM and clicks on fifth item")
    public void user_clicks_on_the_sorting_ddm_and_clicks_fifth_item() {

    }

    @Given("User verifies that sorting DDM works")
    public void user_verifies_that_sorting_ddm_works() {

    }


// ====================== End Of Beytullah's Steps End =====================

}

