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
           assertEquals("https://qa.buysellcycle.com/blog", Driver.getDriver().getCurrentUrl());
    }
    @Given("Verify that navigated to the Read More Page")
    public void verify_that_navigated_to_the_read_more_page() {
        clickWithJS(visitorHomePage.linkReadMore);
        assertTrue(visitorHomePage.labelCategoryText.isDisplayed());
    }

    @Given("Enter a keyword into the search texBox and press Enter")
    public void enter_a_keyword_into_the_tex_box_and_press() {
        visitorHomePage.blogSearchBox.sendKeys("metaverse "+ Keys.ENTER);
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
        waitAndSendText(visitorHomePage.searchTextBox,"Belt");
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


