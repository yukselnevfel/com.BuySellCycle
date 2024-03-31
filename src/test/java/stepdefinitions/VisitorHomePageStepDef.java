package stepdefinitions;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
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
    @Given("Order kutusu tıklanır ve payment seçilir")
    public void order_kutusu_tıklanır_ve_payment_seçilir() {
    visitorHomePage.checkBoxOrder.click();
    wait(1);
    }
    @Given("Click on the Order and Payment is selected on contact page")
    public void click_on_the_order_and_payment_is_selected_on_contact_page() {
        visitorHomePage.linkPayment.click();

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
      String quickViewDetail=visitorHomePage.detailOfQuickView.getText();
      Assert.assertTrue(quickViewDetail.contains("Phone"));
    }





}

