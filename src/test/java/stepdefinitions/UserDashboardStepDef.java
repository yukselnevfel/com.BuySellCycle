package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.Base;

import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.Assert.assertTrue;

public class UserDashboardStepDef extends Base {

    //-------------Login Steps FIKRET-----------------/
    @And("{int} saniye bekler")
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
        //actions.sendKeys(Keys.PAGE_DOWN).perform();
    }
    @Then("the user verifies the displayed invoice details such as Order code, Package code, Delivery Process, Order Details, Order Summary, and Payment Type")
    public void the_user_verifies_the_displayed_invoice_details_such_as_order_code_package_code_delivery_process_order_details_order_summary_and_payment_type() {
        System.out.println(userDashboard.invoicePageText.getText());
        //actions.sendKeys(Keys.PAGE_DOWN).perform();
        assertTrue(userDashboard.invoicePageText.getText().contains("Order code"));
        assertTrue(userDashboard.invoicePageText.getText().contains("Package code"));
        assertTrue(userDashboard.invoicePageText.getText().contains("Order Details"));
        assertTrue(userDashboard.invoicePageText.getText().contains("Order Summary"));
        assertTrue(userDashboard.invoicePageText.getText().contains("Delivered"));
        assertTrue(userDashboard.paymentTypeText.getText().contains("No Gateway"));
    }

}
