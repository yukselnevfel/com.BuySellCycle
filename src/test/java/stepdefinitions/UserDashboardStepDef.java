package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Base;

public class UserDashboardStepDef extends Base {
    //Asli
    @When("I should see relevant {string} about the site")
    public void iShouldSeeRelevantAboutTheSite(String section) {
    }

    @Then("I should be able to modify the displayed information")
    public void iShouldBeAbleToModifyTheDisplayedInformation() {

    }

    @When("I should see relevant {string} about the Payment Page")
    public void iShouldSeeRelevantAboutThePaymentPage(String information) {
        userDashboard.verifyTheInformationsVisibility(information);
    }

    @When("I navigate to the Payment and Billing address section")
    public void iNavigateToThePaymentAndBillingAddressSection() {

    }

    @Then("I should be able to select different address types")
    public void iShouldBeAbleToSelectDifferentAddressTypes() {
    }

    @Then("I should see the Order Summary information displayed correctly")
    public void iShouldSeeTheOrderSummaryInformationDisplayedCorrectly() {
    }

    @When("I apply coupons")
    public void iApplyCoupons() {
    }

    @Then("they should be redeemable")
    public void theyShouldBeRedeemable() {
    }

    @Then("I should be redirected to the order completion page immediately")
    public void iShouldBeRedirectedToTheOrderCompletionPageImmediately() {
    }

    @Given("I have completed the order")
    public void iHaveCompletedTheOrder() {
    }

    @Then("I should see the message {string}")
    public void iShouldSeeTheMessage(String arg0) {
    }

    @And("the Order Number should be displayed")
    public void theOrderNumberShouldBeDisplayed() {
    }

    @And("the Order summary \\(items purchased) should be displayed")
    public void theOrderSummaryItemsPurchasedShouldBeDisplayed() {
    }

    @And("I should have access to the my-purchase-order-details page")
    public void iShouldHaveAccessToTheMyPurchaseOrderDetailsPage() {
    }

    @When("I finish the transaction")
    public void iFinishTheTransaction() {
    }

    @Then("the site should return to the home page")
    public void theSiteShouldReturnToTheHomePage() {
    }

    @Then("I should be able to modify the displayed {string}")
    public void iShouldBeAbleToModifyTheDisplayed(String arg0) {
    }

    //Asli
}
