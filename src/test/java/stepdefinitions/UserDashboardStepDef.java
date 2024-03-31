package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.Base;

import static org.junit.Assert.assertTrue;

public class UserDashboardStepDef extends Base {

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
        clickWithJS(userDashboard.proceedToCheckoutButton);
    }

    @Given("Displays the information of the product she wants to buy on the navigated page")
    public void displays_the_information_of_the_product_he_she_wants_to_buy_on_the_navigated_page() {
       assertTrue(userDashboard.productDetailContentInCart.isDisplayed());
    }

    @Given("Verify that it displays the total price")
    public void verify_that_it_displays_the_total_price() {
        assertTrue(userDashboard.labelTotalPrice.isDisplayed());

    }



    }



