package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.Base;
import utils.ConfigReader;
import utils.Driver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import static org.junit.Assert.assertTrue;

public class UserDashboardStepDef extends Base {

      //============================ SAMET =============================

    @Given("Log in to the page with valid {string} and {string} information.")
    public void log_in_to_the_page_with_valid_and_information(String user, String password) {
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        waitAndSendText(userDashboard.loginEmail, ConfigReader.getProperty(user));
        waitAndSendText(userDashboard.loginPassword, ConfigReader.getProperty(password));
        waitAndClick(userDashboard.sigInButton);
    }

    @Given("Verify that the My Wishlist menu is visible")
    public void verify_that_the_my_wishlist_menu_is_visible() {
        assertTrue(userDashboard.myWishListMenu.isDisplayed());
    }

    @Given("Click on My Wishlist")
    public void click_on_my_wishlist() {
        waitAndClick(userDashboard.myWishListMenu);
    }

    @Given("Verify that page url is {string}")
    public void verify_that_page_url_is(String url) {
        String expectedUrl = url;
        String actualUrl = Driver.getDriver().getCurrentUrl();
        assertEquals(expectedUrl, actualUrl);
    }

    @Given("It is verified that the liked products are displayed on the entered page.")
    public void it_is_verified_that_the_liked_products_are_displayed_on_the_entered_page() {
        String sonuc = userDashboard.resultsWishlist.getText();
        int result = Integer.parseInt(sonuc.substring(17).replaceAll("\\D", ""));
        assertTrue(result > 0);
    }

    @Given("It is verified that there are {int} products on the page")
    public void sayfada_adet_urun_oldugu_dogrulanir(Integer int1) {
        String sonuc = userDashboard.resultsWishlist.getText();
        int result = Integer.parseInt(sonuc.substring(11, 15).replaceAll("\\D", ""));
        assertTrue(result == int1);
        wait(1);
    }

    @Given("Click on the Show 8 Item’s")
    public void click_on_the_show_8item_s() {
        waitAndClick(userDashboard.show8Items);
    }

    @Given("Click on the Show 12 Item’s")
    public void click_on_the_show_12item_s() {
        waitAndClick(userDashboard.show12Items);
        wait(2);
    }

    @Given("Click on the Show 16 Item’s")
    public void click_on_the_show_16item_s() {
        waitAndClick(userDashboard.show16Items);
        wait(2);
    }

    @Given("Select Price \\(Low to high)")
    public void select_price_low_to_high() {
        waitAndClick(userDashboard.newDDM);
        waitAndClick(userDashboard.priceLowToHigh);
        wait(2);
    }

    @Given("Select Price \\(High to Low)")
    public void select_price_high_to_low() {
        waitAndClick(userDashboard.newDDM);
        waitAndClick(userDashboard.priceHighToLow);
        wait(2);
    }
    @Given("Verify that products are sorted from low price to high price")
    public void verify_that_products_are_sorted_from_low_price_to_high_price() {
        String sonuc = userDashboard.pruduct1.getText();
        int price1 = Integer.parseInt(sonuc.replaceAll("\\D", ""));
         sonuc = userDashboard.pruduct2.getText();
        int price2 = Integer.parseInt(sonuc.replaceAll("\\D", ""));
         sonuc = userDashboard.pruduct3.getText();
        int price3 = Integer.parseInt(sonuc.replaceAll("\\D", ""));
        System.out.println("prices = " + price1+" "+price2+" "+price3);
        assertTrue(price1<price2 && price2<price3);

    }
    @Given("Verify that products are sorted from high price to low price")
    public void verify_that_products_are_sorted_from_high_price_to_low_price() {
        String sonuc = userDashboard.pruduct1.getText();
        int price1 = Integer.parseInt(sonuc.replaceAll("\\D", ""));
        sonuc = userDashboard.pruduct2.getText();
        int price2 = Integer.parseInt(sonuc.replaceAll("\\D", ""));
        sonuc = userDashboard.pruduct3.getText();
        int price3 = Integer.parseInt(sonuc.replaceAll("\\D", ""));
        System.out.println("prices = " + price1+" "+price2+" "+price3);
        assertTrue(price1>price2 && price2>price3);
    }
    @Given("Add a product to the Compare list and verify that it has been added")
    public void add_a_product_to_the_compare_list_and_verify_that_it_has_been_added() {
     actions.moveToElement(userDashboard.comparePruduct).perform();
        userDashboard.comparePruduct.click();
        userDashboard.addToCompare.click();
    }
    @Given("Click the Quick View button and verify that the product information is displayed")
    public void click_the_quick_view_button_and_verify_that_the_product_information_is_displayed() {

    }
    @Given("Click the Add To Cart button and confirm that the product has been added to the cart")
    public void click_the_add_to_cart_button_and_confirm_that_the_product_has_been_added_to_the_cart() {

    }
    @Given("Click on the Delete button and confirm that the product has been deleted from Wishlist")
    public void click_on_the_delete_button_and_confirm_that_the_product_has_been_deleted_from_wishlist() {

    }



    //=========================== STEPS  NEVFEL ====================================/

    @Given("Verify that the Dasboard link is visible and functional")
    public void verify_that_the_dasboard_link_is_visible_and_functional() {
       assertTrue(userDashboard.linkHeaderDashboard.isDisplayed() && userDashboard.linkHeaderDashboard.isEnabled());
    }

    @Given("Click on the Dasboard link")
    public void click_on_the_dasboard_link() {
      userDashboard.linkHeaderDashboard.click();

    }
    @Given("Verify that user profile information is displayed on the Dashboard page")
    public void verify_that_user_profile_information_is_displayed_on_the_dashboard_page() {
       assertTrue( userDashboard.labelUserProfileInformationText.isDisplayed());

    }
    @Given("Verify that user balance information is displayed on the Dashboard page")
    public void verify_that_user_balance_information_is_displayed_on_the_dashboard_page() {
      assertTrue(userDashboard.labelUserBalanceInformationText.isDisplayed());

    }
    @Given("Verify that user recent transaction information is displayed on the Dashboard page")
    public void verify_that_user_recent_transaction_information_is_displayed_on_the_dashboard_page() {
      assertTrue(userDashboard.labelLastTransactionText.isDisplayed());

    }

    @Given("Verify that user summary information boards are displayed on the Dashboard page")
    public void verify_that_user_summary_information_boards_are_displayed_on_the_dashboard_page() {
       assertTrue(userDashboard.labelSummaryInformationBoards.isDisplayed());
    }
    @Given("Verify that user summary information boards are active on the Dashboard page")
    public void verify_that_user_summary_information_boards_are_active_on_the_dashboard_page() {
        assertTrue(userDashboard.labelSummaryInformationBoard1.isEnabled());}

        @Given("Verify that Purchase History information is displayed on the Dashboard page")
         public void verify_that_purchase_history_information_is_displayed_on_the_dashboard_page() {
         assertTrue(userDashboard.columnPurchaseHistory.isDisplayed());

        }
        @Given("Verify that My Wishlist is displayed on the Dashboard page")
        public void verify_that_my_wishlist_is_displayed_on_the_dashboard_page() {
            assertTrue(userDashboard.columnMyWishlist.isDisplayed());

        }
        @Given("Verify that Recent Order is displayed on the Dashboard page")
        public void verify_that_recent_order_is_displayed_on_the_dashboard_page() {
        scrollIntoViewJS(userDashboard.columnRecentOrder);
            assertTrue(userDashboard.columnRecentOrder.isDisplayed());

        }
        @Given("Confirm that Product in Cart is displayed on the Dashboard page")
        public void confirm_that_product_in_cart_is_displayed_on_the_dashboard_page() {
        scrollIntoViewJS(userDashboard.columnProductInCart);
            assertTrue(userDashboard.columnProductInCart.isDisplayed());

        }

    @Given("Verify that the Logout link on the home page is visible")
    public void verify_that_the_logout_link_on_the_home_page_is_visible() {
        assertTrue(userDashboard.linkHeaderLogout.isDisplayed());

    }
    @Given("Click on the Logout link")
    public void click_on_the_logout_link() {
        userDashboard.linkHeaderLogout.click();
    }

    @Given("Verify that Logout is visible and functional in the Dashboard sidebar")
    public void verify_that_logout_is_visible_and_functional_in_the_dashboard_sidebar() {
        scrollIntoViewJS(userDashboard.linkDassboardSideBarLogout);
        assertTrue( userDashboard.linkDassboardSideBarLogout.isDisplayed() &&
                            userDashboard.linkDassboardSideBarLogout.isEnabled());
    }


    @Given("Click on the Proceed to Checkout button")
    public void click_on_the_proceed_to_checkout_button() {
        scrollIntoViewJS(userDashboard.proceedToCheckoutButton);
        clickWithJS(userDashboard.proceedToCheckoutButton);
        wait(2);
    }

    @Given("Displays the information of the product she wants to buy on the navigated page")
    public void displays_the_information_of_the_product_he_she_wants_to_buy_on_the_navigated_page() {
       assertTrue(userDashboard.productDetailContentInCart.isDisplayed());
    }

    @Given("Verify that it displays the total price")
    public void verify_that_it_displays_the_total_price() {
        assertTrue(userDashboard.labelTotalPrice.isDisplayed());

    }

    @Given("Scrolls the page until you see the Contact Information heading")
    public void scrolls_the_page_until_you_see_the_contact_information_heading() {
        scrollIntoViewJS(userDashboard.labelContactInformationTitle);
        wait(1);
    }
    @Given("Verify that contact details are displayed")
    public void verify_that_contact_details_are_displayed() {
        assertTrue(userDashboard.labelContactInformationTitle.isDisplayed());
        wait(1);
    }
    @Given("Click on the subscriber button")
    public void click_on_the_subscriber_button() {
        clickWithJS(userDashboard.radioButtonSubscriber);
        wait(1);

    }
    @Given("Click on the Note textbox")
    public void click_on_the_note_textbox() {
        scrollIntoViewJS(userDashboard.textBoxNote);
        clickWithJS(userDashboard.textBoxNote);

    }
    @Given("Enters message {string} in Note section")
    public void enters_message_in_note_section(String note) {
        userDashboard.textBoxNote.sendKeys(note);
        wait(1);
    }

    @Given("Scrolls the page until you see the Continue To Shipping Button")
    public void scrolls_the_page_until_you_see_the_continue_to_shipping_button() {
        scrollIntoViewJS(userDashboard.continueToShippingButton);
        wait(2);

    }
    @Given("Verify that the Return To Cart button is active")
    public void verify_that_the_return_to_cart_button_is_active() {
        userDashboard.returnToCartButton.isEnabled();
        wait(2);
    }
    @Given("Click on the Continue To Shipping")
    public void click_on_the_continue_to_shipping() {
        clickWithJS(userDashboard.continueToShippingButton);
        wait(1);

    }
    @Given("Verify that there is an obligation to check the checkBox {string}")
    public void verify_that_there_is_an_obligation_to_check_the_check_box(String text) {
        String expectedResult=text;
        String actualResult=userDashboard.labelWarningText.getText();
        assertEquals(expectedResult,actualResult);



    }



}



