package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Base;
import pages.UserDashboard;
import utils.ConfigReader;
import utils.Driver;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class UserDashboardStepDef extends Base {

    //------------------------- SIMGE STEPS BASLANGIC ---------------------------//
    @Given("Verify that My Order link is visible in the Dashboard side bar")
    public void verify_that_my_order_link_is_visible_in_the_dashboard_side_bar() {
        Assert.assertTrue(userDashboard.linkMyOrder.isDisplayed());
    }
    @Given("Click on the My Order link in the Dashboard side bar")
    public void click_on_the_my_order_link_in_the_dashboard_side_bar() {
       clickWithJS(userDashboard.linkMyOrder);
    }
    @Given("Verify that the All link is visible and clickable")
    public void verify_that_the_all_link_is_visible_and_clickable() {
        Assert.assertTrue(userDashboard.linkAll.isDisplayed());
        Assert.assertTrue(userDashboard.linkAll.isEnabled());
    }
    @Given("Verify that the To Pay link is visible and clickable")
    public void verify_that_the_to_pay_link_is_visible_and_clickable() {
        Assert.assertTrue(userDashboard.linkToPay.isDisplayed());
        Assert.assertTrue(userDashboard.linkToPay.isEnabled());
    }
    @Given("Verify that the To Ship link is visible and clickable")
    public void verify_that_the_to_ship_link_is_visible_and_clickable() {
        Assert.assertTrue(userDashboard.linkToShip.isDisplayed());
        Assert.assertTrue(userDashboard.linkToShip.isEnabled());
    }
    @Given("Verify that the To Receive link is visible and clickable")
    public void verify_that_the_to_receive_link_is_visible_and_clickable() {
        Assert.assertTrue(userDashboard.linkToReceive.isDisplayed());
        Assert.assertTrue(userDashboard.linkToReceive.isEnabled());
    }
    @Given("Verify that the number of products to be listed is visible and clickable")
    public void verify_that_the_number_of_products_to_be_listed_is_visible_and_clickable() {
        Assert.assertTrue(userDashboard.linkProductNumber.isDisplayed());
        Assert.assertTrue(userDashboard.linkProductNumber.isEnabled());
    }
    @Given("Verify that the Cancel Order button is visible and clickable, If the order status is not confirmed")
    public void verify_that_the_cancel_order_button_is_visible_and_clickable_if_the_order_status_is_not_confirmed() {
        wait(2);
        if (!userDashboard.textStatus.getText().contains("Completed")){
           Assert.assertTrue(userDashboard.linkCancelOrder.isDisplayed());
           Assert.assertTrue(userDashboard.linkCancelOrder.isEnabled());
        }
    }
    @Given("Verify that the Order Details button is visible and clickable")
    public void verify_that_the_order_details_button_is_visible_and_clickable() {
        Assert.assertTrue(userDashboard.linkOrderDetail.isDisplayed());
        Assert.assertTrue(userDashboard.linkOrderDetail.isEnabled());
    }
    @Given("Click on the Order Details link")
    public void click_on_the_order_details_link() {
       clickWithJS(userDashboard.linkOrderDetail);
    }
    @Given("Verify that the Package title is visible")
    public void verify_that_the_package_title_is_visible() {
        visibleWebElement("Package");


    }
    @Given("Verify that the Sold By title is visible")
    public void verify_that_the_sold_by_title_is_visible() {
        visibleWebElement("Sold By");
    }
    @Given("Verify that the Price title is visible")
    public void verify_that_the_price_title_is_visible() {
        visibleWebElement("Price");
    }
    @Given("Verify that the Shipping Info title is visible")
    public void verify_that_the_shipping_info_title_is_visible() {
        visibleWebElement("Shipping Info");
    }
    @Given("Verify that the Billing Info title is visible")
    public void verify_that_the_billing_info_title_is_visible() {
        visibleWebElement("Billing Info");
    }
    @Given("Verify that the Payment Info title is visible")
    public void verify_that_the_payment_info_title_is_visible() {
        visibleWebElement("Payment Info");
    }
    @Given("Verify that the Cancel Order button on detail page is visible and clickable, If the order status is not confirmed")
    public void verify_that_the_cancel_order_button_on_detail_page_is_visible_and_clickable_if_the_order_status_is_not_confirmed() {
        scrollIntoViewJS(userDashboard.linkCancelOrderDetailPage);
        if (!userDashboard.textStatus.getText().contains("Completed")){
            Assert.assertTrue(userDashboard.linkCancelOrderDetailPage.isEnabled());
            Assert.assertTrue(userDashboard.linkCancelOrderDetailPage.isEnabled());
        }
    }
    @Given("Verify that the Order ID title is visible")
    public void verify_that_the_order_id_title_is_visible() {
    Assert.assertTrue(userDashboard.textOrderPage.getText().contains("Order ID"));
    }
    @Given("Verify that the Status title is visible")
    public void verify_that_the_status_title_is_visible() {
        Assert.assertTrue(userDashboard.textOrderPage.getText().contains("Status"));
    }
    @Given("Verify that the Order Date title is visible")
    public void verify_that_the_order_date_title_is_visible() {
        Assert.assertTrue(userDashboard.textOrderPage.getText().contains("Order date"));
    }
    @Given("Verify that the Order Amount title is visible")
    public void verify_that_the_order_amount_title_is_visible() {
        Assert.assertTrue(userDashboard.textOrderPage.getText().contains("Order amount"));
    }
    @Given("Verify that the Paid By title is visible")
    public void verify_that_the_paid_by_title_is_visible() {
        Assert.assertTrue(userDashboard.textOrderPage.getText().contains("Paid By"));
    }
    @Given("Verify that My Wishlist link is visible in the Dashboard side bar")
    public void verify_that_my_wishlist_link_is_visible_in_the_dashboard_side_bar() {
        Assert.assertTrue(userDashboard.linkMyWishlist.isDisplayed());
    }
    @Given("Click on the My Wishlist link in the Dashboard side bar")
    public void click_on_the_my_wishlist_link_in_the_dashboard_side_bar() {
      clickWithJS(userDashboard.linkMyWishlist);
    }
    @Given("Verify that the products added to the Wishlist are listed")
    public void verify_that_the_products_added_to_the_wishlist_are_listed() {
     String result = String.valueOf(userDashboard.textOfResult.getText().subSequence(17,26));
     int resultt = Integer.parseInt(result.replaceAll("\\D",""));
       Assert.assertTrue(resultt>0);
    }
    @Given("Verify that the New bar is visible")
    public void verify_that_the_new_bar_is_visible() {
        Assert.assertTrue(userDashboard.linkNewBar.isDisplayed());
    }
    @Given("Click on the New bar")
    public void click_on_the_new_bar() {
       clickWithJS(userDashboard.linkNewBar);
    }
    @Given("Click on the New button")
    public void click_on_the_new_button() {
       clickWithJS(userDashboard.linkNew);
    }
    @Given("Click on the New Product Deals")
    public void click_on_the_new_product_deals() {
      clickWithJS(userDashboard.linkNewProductDeals);
    }
    String select;
    @Given("Add to wishlist first product")
    public void add_to_wishlist_first_product() {
       actions.moveToElement(userDashboard.imageFirst).perform();
       wait(1);
       clickWithJS(visitorHomePage.iconWishlist);
       userDashboard.selectedFirstProduct = userDashboard.linkFirstProduct.getText();

    }
    @Given("Add to wishlist second product")
    public void add_to_wishlist_second_product() {
        actions.moveToElement(userDashboard.imageSecond).perform();
        wait(1);
        clickWithJS(visitorHomePage.iconSecondWishlist);
        userDashboard.selectedSecondProduct = userDashboard.linkSecondProduct.getText();

    }

    @Given("Click on the Wishlist link in the header")
    public void click_on_the_wishlist_link_in_the_header() {

        clickWithJS(userDashboard.linkWishlistHeader);
    }

    @Given("Verify that the products are sorted from newest to oldest")
    public void verify_that_the_products_are_sorted_from_newest_to_oldest() {
      userDashboard.actualFirstProduct = userDashboard.linkFirstProductinWishlist.getText();
      Assert.assertTrue(userDashboard.actualFirstProduct.contains(userDashboard.selectedFirstProduct));
    }
    @Given("Click on the Old button")
    public void click_on_the_old_button() {
       clickWithJS(userDashboard.linkOld);
       wait(2);
    }
    @Given("Verify that the products are sorted from oldest to newest")
    public void verify_that_the_products_are_sorted_from_oldest_to_newest() {
        userDashboard.actualFirstProduct = userDashboard.linkFirstProductinWishlist.getText();
       Assert.assertFalse(userDashboard.actualFirstProduct.contains(userDashboard.selectedSecondProduct));
    }
    @Given("Click on the Price \\(Low to high) button")
    public void click_on_the_price_low_to_high_button() {
     clickWithJS(userDashboard.linkLowtoHigh);
     wait(2);
    }
    @Given("Verify that products are sorted from low to high prices")
    public void verify_that_products_are_sorted_from_low_to_high_prices() {
         ArrayList <Integer> prices = new ArrayList<>();
         int pricess=0;
        for (WebElement price:userDashboard.textPriceOfProduct) {

           pricess= Integer.parseInt(price.getText().replaceAll("\\D",""));
           prices.add(pricess);
        }
        for (int i=0;i<prices.size();i++) {

           Assert.assertTrue(prices.get(i)<prices.get(i+1));


        }

    }
    @Given("Click on the Price \\(High to low) button")
    public void click_on_the_price_high_to_low_button() {
        clickWithJS(userDashboard.linkHightoLow);
        wait(2);
    }
    @Given("Verify that products are sorted from high to low prices")
    public void verify_that_products_are_sorted_from_high_to_low_prices() {
        ArrayList <Integer> prices = new ArrayList<>();
        int pricess=0;
        for (WebElement price:userDashboard.textPriceOfProduct) {

            pricess= Integer.parseInt(price.getText().replaceAll("\\D",""));
            prices.add(pricess);
        }
        for (int i=0;i<prices.size();i++) {

            Assert.assertTrue(prices.get(i)>prices.get(i+1));
        }
    }
    @Given("Verify that the Show Item's bar is visible")
    public void verify_that_the_show_item_s_bar_is_visible() {
        Assert.assertTrue(userDashboard.linkShowItemBar.isDisplayed());
        clickWithJS(userDashboard.linkShowItemBar);
        wait(2);
    }
    @Given("Click on the Show {int} Item's  button")
    public void click_on_the_show_item_s_button(Integer int1) {
        WebElement secim = userDashboard.selectItemBar(int1);

        secim.click();
        wait(2);
    }
    @Given("Verify that {int} products are displayed on the page")
    public void verify_that_products_are_displayed_on_the_page(Integer int1) {
        assertEquals(userDashboard.textPriceOfProduct.size(), (int) int1);
    }
    @Given("Verify that the compare icon is visible for the first product on My Wishlist page")
    public void verify_that_the_compare_icon_is_visible_for_the_first_product_on_my_wishlist_page() {
         actions.moveToElement(userDashboard.imageFirst).perform();
         wait(2);
         Assert.assertTrue(userDashboard.iconCompareInWishlist.isDisplayed());
    }
    @Given("Click on the compare icon for the first product on My Wishlist page")
    public void click_on_the_compare_icon_for_the_first_product_on_my_wishlist_page() {
        clickWithJS(userDashboard.iconCompareInWishlist);
    }
    @Given("Verify that the quick view icon is visible for the first product in  My Wishlist page")
    public void verify_that_the_quick_view_icon_is_visible_for_the_first_product_in_my_wishlist_page() {
        actions.moveToElement(userDashboard.imageFirst).perform();
        wait(1);
       Assert.assertTrue(userDashboard.iconQuickViewInWishlist.isDisplayed());
    }
    @Given("Click on the quick view icon for the first product in My Wishlist page")
    public void click_on_the_quick_view_icon_for_the_first_product_in_my_wishlist_page() {
        clickWithJS(userDashboard.iconQuickViewInWishlist);
    }
    @Given("Verify that the delete icon is visible for the first product in  My Wishlist page")
    public void verify_that_the_delete_icon_is_visible_for_the_first_product_in_my_wishlist_page() {
        actions.moveToElement(userDashboard.imageFirst).perform();
        wait(1);
        Assert.assertTrue(userDashboard.iconDeleteInWishlist.isDisplayed());
    }
    @Given("Click on the delete icon for the first product in My Wishlist page")
    public void click_on_the_delete_icon_for_the_first_product_in_my_wishlist_page() {
        clickWithJS(userDashboard.iconDeleteInWishlist);
    }
    @Given("Verify that the Are you sure to delete?  query screen is visible")
    public void verify_that_the_are_you_sure_to_delete_query_screen_is_visible() {
        wait(2);
        Assert.assertTrue(userDashboard.textDelete.isDisplayed());
    }
    @Given("Click on the Delete button")
    public void click_on_the_delete_button() {
       clickWithJS(userDashboard.linkDelete);
       wait(1);
    }

    @Given("Verify that the relevant product has been deleted\"")
    public void verify_that_the_relevant_product_has_been_deleted() {
      String expedtedAllert ="Deleted successfully!";
      String actualAllert = visitorHomePage.successfullAllert.getText();
      Assert.assertEquals(expedtedAllert,actualAllert);
    }
    @Given("Verify that the add to cart icon is visible for the first product in  My Wishlist page")
    public void verify_that_the_add_to_cart_icon_is_visible_for_the_first_product_in_my_wishlist_page() {
        Assert.assertTrue(userDashboard.iconAddToCartInWishlist.isDisplayed());
    }
    @Given("Click on the add to cart icon for the first product in My Wishlist page")
    public void click_on_the_add_to_cart_icon_for_the_first_product_in_my_wishlist_page() {
        clickWithJS(userDashboard.iconAddToCartInWishlist);
        wait(2);
    }


    //----------------------------SIMGE STEPS BITIS--------------------------//}

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


    @When("I should see relevant {string} about the Payment Page")
    public void iShouldSeeRelevantAboutThePaymentPage(String information) {
        userDashboard.verifyTheInformationsVisibility(information);
    }

    @Then("I should be able to select different address types")
    public void iShouldBeAbleToSelectDifferentAddressTypes() {
        waitAndClick(userDashboard.useADifferentBillingAddress);
    }

    @Then("I should see the Order Summary information displayed correctly")
    public void iShouldSeeTheOrderSummaryInformationDisplayedCorrectly() {
        assertTrue(userDashboard.orderSummary.isDisplayed());
    }

    @And("the Order Number should be displayed")
    public void theOrderNumberShouldBeDisplayed() {
        assertTrue(userDashboard.orderNumber.isDisplayed());
    }

    @And("the Order summary \\(items purchased) should be displayed")
    public void theOrderSummaryItemsPurchasedShouldBeDisplayed() {
        assertTrue(userDashboard.orderSummary.isDisplayed());
    }

    @And("I should have access to the my-purchase-order-details page")
    public void iShouldHaveAccessToTheMyPurchaseOrderDetailsPage() {
        waitAndClick(userDashboard.viewOrderButton);
    }

    @When("I submit on the Continue to shipping button")
    public void iSubmitOnTheContinueToShippingButton() {
        waitAndClick(userDashboard.continueToShippingButton);
    }

    @Then("Click on the Proceed to Checkout buttonlink")
    public void clickOnTheProceedToCheckoutButtonlink() {
        waitAndClick(userDashboard.proceedToCheckoutButton);
    }

    @When("Click on the {string} buttonlink")
    public void clickOnTheButtonlink(String payMethod) {
        userDashboard.orderPayButton(payMethod);
    }

    @And("I should be able to select the Snipe Payment Method")
    public void iShouldBeAbleToSelectTheSnipePaymentMethod() {
        waitAndClick(userDashboard.stripePayment);
    }


    @Then("Click on the {string} link on the top")
    public void clickOnTheLinkOnTheTop(String arg0) {
        clickWithJS(userDashboard.cartLinkOnTheTop);
        wait(2);
    }

    @Given("I am on the \\{Checkout} Page")
    public void iAmOnTheCheckoutPage() {
        waitForPageToLoad(2);
    }


    @Given("Click on My Wishlist")
    public void click_on_my_wishlist() {
        waitAndClick(userDashboard.myWishListMenu);
    }

    //-------------Login Steps FIKRET-----------------/
    @Then("Stripe select")
    public void stripe_select() {
        clickWithJS(userDashboard.stripeCheckRadioButton);
    }

    @When("Click paynow button")
    public void Click_paynow_button() {
        clickWithJS(userDashboard.payNow);

    }


    @When("Close on stripe window")
    public void close_on_stripe_window() {
        Driver.getDriver().switchTo().frame(0);
        userDashboard.stripeCardNumberTextBox.sendKeys("4242 42");
        wait(6);
        clickWithJS(userDashboard.stripeEscape);
    }

    @And("{int} seconds pause")
    public void saniyeBekler(int saniye) {

        try {
            Thread.sleep(saniye*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Then("the user should see the Purchase History menu in the Dashboard sidebar")
    public void the_user_should_see_the_menu_in_the_dashboard_sidebar() {
       assertTrue(userDashboard.linkPurchaseHistory.isDisplayed());
    }

    @Then("the user verifies that the Purchase History link is active")
    public void the_user_verifies_that_the_link_is_active() {
        assertTrue(userDashboard.linkPurchaseHistory.isEnabled());
    }

    @Given("the user clicks on the Purchase History link in the Dashboard sidebar")
    public void the_user_clicks_on_the_link_in_the_dashboard_sidebar() {
        clickWithJS(userDashboard.linkPurchaseHistory);
    }

    @Then("the user verifies the presence of details such as Details, Amount, Delivery Status, Payment Status, and Action")
    public void the_user_verifies_the_presence_of_details_such_as_details_amount_delivery_status_payment_status_and_action() {
        //actions.sendKeys(Keys.PAGE_DOWN).perform();
        userDashboard.tableCellDisplayed(7);
    }

    @Given("the user filters the purchase history by Payment Status")
    public void the_user_filters_the_purchase_history_by_payment_status() {
        clickWithJS(userDashboard.allHistoryFilter);
        clickWithJS(userDashboard.pendingPurchase);
    }

    @Then("the user verifies that the filtering is applied correctly")
    public void the_user_verifies_that_the_filtering_is_applied_correctly() {
        assertTrue(userDashboard.pendingText.isDisplayed());
    }

    @Given("the user clicks on the invoice download link under Action")
    public void the_user_clicks_on_the_invoice_download_link_under_action() {

        clickWithJS(userDashboard.iconDownload);
    }

    @Then("the user verifies that the invoice is downloaded successfully")
    public void the_user_verifies_that_the_invoice_is_downloaded_successfully() {
        String dosyaYolu = "C:\\Users\\ZEYBEK\\Downloads\\Documents\\20240323000043.pdf";
        assertTrue(Files.exists(Paths.get(dosyaYolu)));
    }

    @Given("the user clicks on the invoice view link under Action")
    public void the_user_clicks_on_the_invoice_view_link_under_action() {
        clickWithJS(userDashboard.iconBurgerPurchase);
    }

    @Then("the user verifies the displayed invoice details such as Order code, Package code, Delivery Process, Order Details, Order Summary, and Payment Type")
    public void the_user_verifies_the_displayed_invoice_details_such_as_order_code_package_code_delivery_process_order_details_order_summary_and_payment_type() {
        System.out.println(userDashboard.invoicePageText.getText());
        assertTrue(userDashboard.invoicePageText.getText().contains("Order code"));
        assertTrue(userDashboard.invoicePageText.getText().contains("Package code"));
        assertTrue(userDashboard.invoicePageText.getText().contains("Order Details"));
        assertTrue(userDashboard.invoicePageText.getText().contains("Order Summary"));
        assertTrue(userDashboard.invoicePageText.getText().contains("Delivered"));
        assertTrue(userDashboard.paymentTypeText.getText().contains("No Gateway"));
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
        System.out.println(result);
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
        System.out.println("prices = " + price1 + " " + price2 + " " + price3);
        assertTrue(price1 < price2 && price2 < price3);

    }

    @Given("Verify that products are sorted from high price to low price")
    public void verify_that_products_are_sorted_from_high_price_to_low_price() {
        String sonuc = userDashboard.pruduct1.getText();
        int price1 = Integer.parseInt(sonuc.replaceAll("\\D", ""));
        sonuc = userDashboard.pruduct2.getText();
        int price2 = Integer.parseInt(sonuc.replaceAll("\\D", ""));
        sonuc = userDashboard.pruduct3.getText();
        int price3 = Integer.parseInt(sonuc.replaceAll("\\D", ""));
        System.out.println("prices = " + price1 + " " + price2 + " " + price3);
        assertTrue(price1 > price2 && price2 > price3);
    }

    @Given("Add a product to the Compare list and verify that it has been added")
    public void add_a_product_to_the_compare_list_and_verify_that_it_has_been_added() {
        actions.moveToElement(userDashboard.comparePruduct).perform();
        userDashboard.comparePruduct.click();
        wait(1);
        userDashboard.addToCompare.click();
        wait(2);
        String count = userDashboard.compareCount.getText().replaceAll("//D", "");
        int countCompare = Integer.parseInt(count);
        System.out.println("countCompare = " + countCompare);
        assertTrue(countCompare > 0);
    }

    @Given("Click the Quick View button and verify that the product information is displayed")
    public void click_the_quick_view_button_and_verify_that_the_product_information_is_displayed() {
        actions.moveToElement(userDashboard.comparePruduct).perform();
        userDashboard.quickViewButton.click();
        wait(3);
        assertTrue(userDashboard.puroductDetails.isDisplayed());
        userDashboard.closePage.click();

    }

    @Given("Click the Add To Cart button and confirm that the product has been added to the cart")
    public void click_the_add_to_cart_button_and_confirm_that_the_product_has_been_added_to_the_cart() {
        actions.moveToElement(userDashboard.comparePruduct).perform();
        wait(3);
        userDashboard.quickViewButton.click();
        wait(3);
        userDashboard.addToCart.click();
        wait(3);
        String message = userDashboard.itemAdded.getText();
        assertTrue(message.contains("Item added to your cart"));
        userDashboard.closePage2.click();

    }

    @Given("Click on the Delete button and confirm that the product has been deleted from Wishlist")
    public void click_on_the_delete_button_and_confirm_that_the_product_has_been_deleted_from_wishlist() {
        String sonuc = userDashboard.resultsWishlist.getText();
        int result = Integer.parseInt(sonuc.substring(17).replaceAll("\\D", ""));
        actions.moveToElement(userDashboard.comparePruduct).perform();
        wait(2);
        userDashboard.deleteButton.click();
        wait(1);
        userDashboard.dataDeleteBtn.click();
        wait(5);
        sonuc = userDashboard.resultsWishlist.getText();
        int result2 = Integer.parseInt(sonuc.substring(17).replaceAll("\\D", ""));
        System.out.println(result2 + "   " + result);
        assertTrue(result2 < result);
    }

    @Given("Go on the next page")
    public void go_on_the_next_page() {
        waitAndClick(userDashboard.nextPage);
        wait(3);
    }

    @Given("Verify that the My Couppons menu is visible")
    public void verify_that_the_my_couppon_menu_is_visible() {
        assertTrue(userDashboard.myCouponsListMenu.isDisplayed());
    }

    @Given("Click on My Couppons")
    public void click_on_my_couppon() {
        waitAndClick(userDashboard.myCouponsListMenu);
    }

    @Given("Write {string} in the code section")
    public void write_in_the_code_section(String code) {
        userDashboard.codePlaceHolder.sendKeys(ConfigReader.getProperty(code));
    }

    @Given("Click on the Add Coupon button")
    public void click_on_the_add_coupon_button() {
        waitAndClick(userDashboard.addCouppon);
        wait(3);
    }

    @Given("Verify that the Add Coupons is visible")
    public void verify_that_the_add_coupons_is_visible() {
        assertTrue(userDashboard.addCouppon.isDisplayed());
    }

    @Given("Verify that the {string} has been added")
    public void verify_that_the_has_been_added(String code) {
        String actualCode = userDashboard.coupponCode.getText();
        String expectedCode = ConfigReader.getProperty(code);
        assertEquals(expectedCode, actualCode);
    }

    @Given("Verify that coupons are listed under the Collected Coupons heading")
    public void verify_that_coupons_are_listed_under_the_collected_coupons_heading() {
        assertTrue(userDashboard.coupponCode.isDisplayed());
    }

    @Given("Click on the copy icon under the Action heading of the coupon")
    public void click_on_the_copy_icon_under_the_action_heading_of_the_coupon() {
        waitAndClick(userDashboard.coppyCode);
        wait(2);
    }

    @Given("Confirms that copying has occurred")
    public void confirms_that_copying_has_occurred() {
        assertTrue(userDashboard.coupponCode.isDisplayed());

    }

    @Given("Click on the delete icon under the Action heading of the coupon")
    public void click_on_the_delete_icon_under_the_action_heading_of_the_coupon() {
        userDashboard.deleteCouppon.click(); wait(1);
        userDashboard.deleteSure.click(); wait(3);

    }

    @Given("Verify that the deletion has occurred")
    public void verify_that_the_deletion_has_occurred() {

        assertTrue(userDashboard.emptyList.isDisplayed());

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
        assertTrue(userDashboard.labelUserProfileInformationText.isDisplayed());

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
        assertTrue(userDashboard.labelSummaryInformationBoard1.isEnabled());
    }

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
        waitAndClick(userDashboard.linkHeaderLogout);
    }

    @Given("Verify that Logout is visible and functional in the Dashboard sidebar")
    public void verify_that_logout_is_visible_and_functional_in_the_dashboard_sidebar() {
        scrollIntoViewJS(userDashboard.linkDassboardSideBarLogout);
        assertTrue(userDashboard.linkDassboardSideBarLogout.isDisplayed() &&
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


    //===============STEPS ESRA BASLADI=========================================

    @Given("Scroll down to the bottom of the dashboard page")
    public void scroll_down_to_the_bottom_of_the_dashboard_page() {
       scrollIntoViewJS(userDashboard.buttonNotification);
    }
    @Given("Clicks on the Notification link and goes to the relevant page")
    public void clicks_on_the_notification_link_and_goes_to_the_relevant_page() {
       clickWithJS(userDashboard.buttonNotification);
       String expectedURL="https://qa.buysellcycle.com/profile/notifications";
       String actualURL=Driver.getDriver().getCurrentUrl();
       assertEquals(expectedURL,actualURL);
    }

    @When("Displays Title and Date information of incoming notifications")
    public void displaysTitleAndDateInformationOfIncomingNotifications() {
        assertTrue(userDashboard.textNotification.isDisplayed());
        assertTrue(userDashboard.dateNotification.isDisplayed());
    }

    @When("Clicks on the View button and goes to the relevant page")
    public void clicksOnTheViewButtonAndGoesToTheRelevantPage() {
        clickWithJS(userDashboard.buttonView);
        assertTrue(userDashboard.textOrderId.isDisplayed());
    }

    @Given("Return to notifications page")
    public void return_to_notifications_page() {
        Driver.getDriver().navigate().back();
    }
    @Given("Click on the Setting button and reach the relevant page")
    public void click_on_the_button_and_reach_the_relevant_page() {
       clickWithJS(userDashboard.buttonSetting);
       String expectedURL="https://qa.buysellcycle.com/profile/notification_setting";
       String actualURL=Driver.getDriver().getCurrentUrl();
       assertEquals(expectedURL,actualURL);

    }
    @Given("Updates the Types of Events in the Setting list")
    public void updates_the_types_of_events_in_the_setting_list() {
        clickWithJS(userDashboard.buttonEventType);
        wait(3);
        String expectedMessage="Updated successfully!";
        String actualMessage=visitorHomePage.successfullAllert.getText();
        assertEquals(expectedMessage,actualMessage);
    }

    //=================STEPS ESRA SONU========================================

    //----------------AYCA Support Ticket-----------------------//

    @Given("Scroll down to the bottom of the page.Click on the support ticket menu")
    public void scroll_down_to_the_bottom_of_the_page_click_on_the_support_ticket_menu() {

       scrollIntoViewJS(userDashboard.imageAdsBar);
        wait(1);
        assertTrue(userDashboard.linkSupportTicket.isDisplayed());
        clickWithJS(userDashboard.linkSupportTicket);
        wait(2);


    }
    @Given("Verify that the navigate to Support Ticket Page.")
    public void verify_that_the_navigate_to_support_ticket_page() {

        String expectedSupportTicketUrl = "https://qa.buysellcycle.com/support-ticket";
        String actualSupportTicketUrl = Driver.getDriver().getCurrentUrl();
        assertEquals(expectedSupportTicketUrl,actualSupportTicketUrl);


    }

    @Given("Verify that the Tickets should be listed with title information in All Submitted Ticket List.")
    public void verify_that_the_tickets_should_be_listed_with_information_in_all_submitted_ticket_list() {

        wait(2);
        List<String> requiredTitles = Arrays.asList("Ticket ID", "Subject", "Priority", "Last Update");
        List<WebElement> headers = Driver.getDriver().findElements(By.xpath("//table/thead/tr/th"));
        for (String title : requiredTitles) {
            boolean isTitlePresent = headers.stream().anyMatch(th -> th.getText().equalsIgnoreCase(title));
            Assert.assertTrue("The title '" + title + "' is not present in the ticket list.", isTitlePresent);
        }

        System.out.println("all title displayed");
     }


    @Given("Click on the ticket View button")
    public void click_on_the_ticket_button() {

        clickWithJS(userDashboard.actionDetailSupportTicketButton);
        wait(2);

    }
    @Given("Verify that Status, Priority, Category  text is displayed")
    public void verify_that_status_priority_category_text_is_displayed() {


        assertTrue(userDashboard.labelStatus.isDisplayed());
        wait(1);
        assertTrue(userDashboard.labelPriority.isDisplayed());
        wait(1);
        assertTrue(userDashboard.labelCategory.isDisplayed());
        wait(1);
        System.out.println("all category displayed");


    }

    @Given("User should be able to display admin return message")
    public void user_should_be_able_to_display_admin_return_message() {

       assertTrue(userDashboard.labelCustomerMessage.isDisplayed());

    }
    @Given("User should be able to respond to admin message")
    public void user_should_be_able_to_respond_to_admin_message() {
        clickWithJS(userDashboard.replyButton);
        wait(1);
        userDashboard.replyMessageBox.sendKeys("deneme mesaj");
        wait(1);
        clickWithJS(userDashboard.replyNowButton);
        wait(1);

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5)); // 10 saniye kadar bekle
        WebElement toastrMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".toast-message")));

        boolean isDisplayed = toastrMessage.isDisplayed();
        System.out.println("Is Toastr message displayed? " + isDisplayed);

        String messageText = toastrMessage.getText();
        System.out.println("Toastr message text: " + messageText);

    }

    @Given("Click on the all ticket filter menu")
    public void click_on_the_all_ticket_filter_menu() {

        wait(2);
        clickWithJS(userDashboard.filterDropDownMenu);
        wait(1);


    }
    @Given("Click on the Pending submenu and verify if any tickets appear in the list")
    public void click_on_the_pending_submenu_and_verify_if_any_tickets_appear_in_the_list() {


        clickWithJS(userDashboard.pendingSubMenu);
        wait(2);
        assertTrue(userDashboard.ticketFirstRow.isDisplayed());


    }
    @Given("Click on the On Going submenu and verify if any tickets appear in the list")
    public void click_on_the_on_going_submenu_and_verify_if_any_tickets_appear_in_the_list() {


        clickWithJS(userDashboard.onGoingSubMenu);
        wait(2);
        assertTrue(userDashboard.ticketFirstRow.isDisplayed());


    }
    @Given("Click on the Completed submenu and verify if any tickets appear in the list")
    public void click_on_the_completed_submenu_and_verify_if_any_tickets_appear_in_the_list() {

        clickWithJS(userDashboard.completedSubMenu);
        wait(2);
        assertTrue(userDashboard.ticketFirstRow.isDisplayed());


    }
    @Given("Click on the Closed submenu and verify if any tickets appear in the list")
    public void click_on_the_closed_submenu_and_verify_if_any_tickets_appear_in_the_list() {


        clickWithJS(userDashboard.closedSubMenu);
        wait(2);
        assertTrue(userDashboard.ticketFirstRow.isDisplayed());


    }
    @Given("Click on the All Ticket submenu and verify if any tickets appear in the list")
    public void click_on_the_all_ticket_submenu_and_verify_if_any_tickets_appear_in_the_list() {

        clickWithJS(userDashboard.allTicketSubMenu);
        wait(2);
        assertTrue(userDashboard.ticketFirstRow.isDisplayed());

    }

    @Given("Click on the add new button")
    public void click_on_the_add_new_button() {


        clickWithJS(userDashboard.addNewSupportTicketButton);

    }
    @Given("Required information is entered in the required fields")
    public void required_information_is_entered_in_the_required_fields() {

        wait(2);
        clickWithJS(userDashboard.subjectButton);
        userDashboard.subjectButton.sendKeys("Order Information");
        clickWithJS(userDashboard.categorySubmenu);
        wait(1);
        clickWithJS(userDashboard.othersCategorySubMenuButton);
        clickWithJS(userDashboard.priorityDropDownMenuButton);
        clickWithJS(userDashboard.priorityMediumSubmenuButton);


    }
    @Given("Click on the description text and enter message")
    public void click_on_the_description_text_and_enter_message() {


        clickWithJS(userDashboard.descriptionBox);
        wait(1);
        userDashboard.descriptionBox.sendKeys("want to change my address");
        wait(1);
        scrollIntoViewJS(userDashboard.createNowSupportTicketButton);

    }
    @Given("Click on the create now button and verify that the message create successfully")
    public void click_on_the_create_now_button_and_verify_that_the_message_create_successfully() {

        wait(1);
        clickWithJS(userDashboard.createNowSupportTicketButton);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
        WebElement toastrMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".toast-message")));

        boolean isDisplayed = toastrMessage.isDisplayed();
        System.out.println("Is Toastr message displayed? " + isDisplayed);

        String messageText = toastrMessage.getText();
        System.out.println("Toastr message text: " + messageText);


    }



    //----------------AYCA Support Ticket SON-----------------------//


    @When("Click on the Pay Now buttonlink")
    public void clickOnThePayNowButtonlink() {
        scrollIntoViewJS(userDashboard.payNowButton);
        waitAndClick(userDashboard.payNowButton);

    }

    @And("I should be able to click on email box on Stripe Payment")
    public void iShouldBeAbleToClickOnEmailBoxOnStripePayment() {
        Driver.getDriver().switchTo().frame(0);
        userDashboard.emailStripePaymentBox.click();
        System.out.println("iframe is changed");
    }

    @And("I should be able to enter {string} on the email box")
    public void iShouldBeAbleToEnterOnTheEmailBox(String email) {
        waitAndSendText(userDashboard.emailStripePaymentBox, ConfigReader.getProperty(email));
        wait(1);
        userDashboard.emailStripePaymentBox.sendKeys(Keys.TAB);
    }

    @When("I should be able to enter {string} on the card number box")
    public void iShouldBeAbleToEnterOnTheCardNumberBox(String cardNumber) {
        actions.sendKeys(userDashboard.stripeCardNoBox, ConfigReader.getProperty(cardNumber)).perform();
        wait(1);
        userDashboard.stripeCardNoBox.sendKeys(Keys.TAB);
    }

    @When("I should be able to enter {string} on the exp box")
    public void iShouldBeAbleToEnterOnTheExpBox(String expDate) {
        actions.sendKeys(userDashboard.expDateStripePaymentBox, ConfigReader.getProperty(expDate)).perform();
        wait(1);
        userDashboard.expDateStripePaymentBox.sendKeys(Keys.TAB);
    }

    @Then("I should be able to enter {string} on the cvc box")
    public void iShouldBeAbleToEnterOnTheCvcBox(String cvc) {
        waitAndSendText(userDashboard.cvcStripePaymentBox, ConfigReader.getProperty(cvc));
        wait(1);
        userDashboard.cvcStripePaymentBox.sendKeys(Keys.TAB);
    }

    @And("I should be able to submit the payment")
    public void iShouldBeAbleToSubmitThePayment() {
        waitAndSubmit(userDashboard.submitPayment);
    }

    @When("Click on the Order Now buttonlink")
    public void clickOnTheOrderNowButtonlink() {
       // scrollIntoViewJS(userDashboard.orderNowButton);
        //waitAndClick(userDashboard.orderNowButton);
    }

    @Given("Navigate to Dashboard")
    public void navigate_to_dashboard() {
        waitAndClick(userDashboard.linkHeaderDashboard);
    }


    @Given("Verify that the Follow menu is visible and enabled in the sidebar")
    public void verify_that_the_follow_menu_is_visible_and_enabled_in_the_sidebar() {
        assertTrue(userDashboard.followMenuItem.isDisplayed());
    }

    @Given("Click on Follow Menu Item")
    public void click_on_follow_menu_item() {
        waitAndClick(userDashboard.followMenuItem);
    }
    @Given("Verify that the Follow seller History List displayed")
    public void verify_that_the_follow_seller_history_list_displayed() {
        assertTrue(userDashboard.followListDashboard.isDisplayed());
    }

    @Given("Click on the Unfollow button on the Follow page")
    public void click_on_the_unfollow_button_on_the_follow_page() {
        UserDashboard.waitAndClick(userDashboard.unFollowButton);
    }

    @Given("Verify that the selected seller is removed from the Follow Seller History List")
    public void verify_that_the_selected_seller_is_removed_from_the_follow_seller_history_list() {
        assertTrue(userDashboard.followSeller.isDisplayed());

    }

    @Given("Verify that the Empty List text ist displayed.")
    public void verify_that_the_empty_list_text_ist_displayed() {

        assertTrue(userDashboard.emptyText.isDisplayed());

    }

    @And("I should be able to write a note {string}")
    public void iShouldBeAbleToWriteANote(String note) {
        waitAndSendText(userDashboard.notePad, note);
    }

    @And("I should be able to enter {string} as coupon code on Code Box")
    public void iShouldBeAbleToEnterAsCouponCodeOnCodeBox(String code) {
        waitAndClick(userDashboard.couponBoxPaymentPage);
        waitAndSendText(userDashboard.couponBoxPaymentPage, ConfigReader.getProperty(code));
    }

    @When("I apply coupon code.")
    public void iApplyCouponCode() {
        waitAndSubmit(userDashboard.applyButtonCouponCode);
    }

    // ====================== Beytullah's Steps =====================
    @Given("User clicks on the {string}")
    public void user_clicks_on_the(String text) {
        WebElement element=Driver.getDriver().findElement(By.xpath("//*[text()='"+text
                +"']"));
        wait(3);
        clickWebElement(text);

    }

    @Given("User verifies that the {string} is visible")
    public void user_verifies_that_the_is_visible(String text) {

        WebElement element=Driver.getDriver().findElement(By.xpath("//*[text()='"+text
                +"']"));
        scrollIntoViewJS(element);
        assertTrue(element.isDisplayed());


    }

    @Given("User clicks on the Referral")
    public void user_clicks_on_the_referral() {
        scrollIntoViewJS(userDashboard.buttonReferral);

        clickWithJS(userDashboard.buttonReferral);
    }
    @Given("Verify that the Copied Successfully pup up is visible")
    public void verify_that_the_copied_successfully_pup_up_is_visible() {
        String expPopUpMessage="Code Copied Successfully.";
        String actPopUpMessage=adminDashboard.popUpMessage.getText();
       assertEquals(expPopUpMessage,actPopUpMessage);
    }

    @Given("I should see the message {string}")
    public void iShouldSeeTheMessage(String text) {
        wait(3);
        assertTrue(userDashboard.thankyouText.isDisplayed());
        wait(3);
    }


    // ====================== End Of Beytullah's Steps End =====================
}




