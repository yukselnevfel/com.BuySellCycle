package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.Base;

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



    //----------------------------SIMGE STEPS BITIS--------------------------//
}
