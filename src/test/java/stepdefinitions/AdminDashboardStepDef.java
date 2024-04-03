package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.ArrayList;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.Base;
import utils.ConfigReader;
import utils.Driver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import utils.ConfigReader;
import utils.Driver;

import java.awt.*;

import static org.junit.Assert.*;

public class AdminDashboardStepDef extends Base {
    // -------------------------Beytullah---------------------------------
    @Given("Open browser and go to {string}, enter {string}, {string} and click sign in")
    public void open_browser_and_go_to_enter_and_click_sign_in(String adminUrl, String adminMail, String password) {
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
        clickWithJS(visitorHomePage.textBoxUserEmail);

        visitorHomePage.textBoxUserEmail.sendKeys(ConfigReader.getProperty(adminMail));
        clickWithJS(visitorHomePage.textBoxUserPassword);
        visitorHomePage.textBoxUserPassword.sendKeys(ConfigReader.getProperty(password));

        clickWithJS(visitorHomePage.signInButton);

        String expectedMessage = "Logged In Successfully!";
        String actualMessage = adminDashboard.popUpMessage.getText();
        assertEquals(expectedMessage, actualMessage);

    }

    @Given("User searches {string} on the admin Dashboard and verifies that the search result is true")
    public void user_searches_on_the_admin_dashboard_and_verifies_that_the_search_result_is_true(String searchText) {
        adminDashboard.searchBoxAdminDashboard.sendKeys(searchText);
        String expText = "Follow seller History";
        String actText = adminDashboard.searchBoxAdminDashboard.getText();
        assertEquals(expText, actText);
    }
    @Given("Close the succesfull pop-up message")
    public void close_the_succesfull_pop_up_message() {
        adminDashboard.popUpMessage.click();
    }
    @Given("Verify that profile icon is visible")
    public void verify_that_profile_icon_is_visible() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("Hover mouse cursor over profile icon")
    public void hover_mouse_cursor_over_profile_icon() {
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(adminDashboard.iconAdminProfile)
                .perform();
    }
    @Given("Verify that Name text is visible")
    public void verify_that_name_text_is_visible() {
        assertTrue(adminDashboard.textName.isDisplayed());
    }

    // -------------------------Beytullah---------------------------------


    //================STEPS ESRA BASLANGIC===================================

    @When("Scroll down to the bottom of the Admin dashboard page")
    public void scrollDownToTheBottomOfTheAdminDashboardPage() {
        wait(1);
        scrollIntoViewJS(adminDashboard.textAccount);
    }

    @Given("Admin clicks Account link from Dashboard side bar")
    public void admin_clicks_account_link_from_dashboard_side_bar() {
        clickWithJS(adminDashboard.textAccount);
    }

    @When("Click on the Transaction link from the submenus and go to the relevant page")
    public void clickOnTheTransactionLinkFromTheSubmenusAndGoToTheRelevantPage() {
        clickWithJS(adminDashboard.textTransaction);
        String expectedURL = "https://qa.buysellcycle.com/account/transaction";
        String actualURL = Driver.getDriver().getCurrentUrl();
        assertEquals(expectedURL, actualURL);
    }

    @When("Click the search button in the Select Criteria window")
    public void clickTheSearchButtonInTheSelectCriteriaWindow() {
        clickWithJS(adminDashboard.searchSelectCriteria);
    }

    @When("Select the start and end dates and click the Apply button")
    public void selectTheStartAndEndDatesAndClickTheApplyButton() {
        clickWithJS(adminDashboard.buttonStartDate);
        clickWithJS(adminDashboard.buttonEndDate);
        clickWithJS(adminDashboard.buttonApply);
    }

    @When("Displays Date,Chart of Accounts,Bank Accounts,Title,Credit,Debit information according to the date range selected in the Transaction sub-window")
    public void displaysDateChartOfAccountsBankAccountsTitleCreditDebitInformationAccordingToTheDateRangeSelectedInTheTransactionSubWindow() {
        assertTrue(adminDashboard.dateTransaction.isDisplayed());
        assertTrue(adminDashboard.chartOfAccountTransaction.isDisplayed());
        assertTrue(adminDashboard.titleTransaction.isDisplayed());
        assertTrue(adminDashboard.creditTransaction.isDisplayed());

    }

    @When("Clicks the Search text box on the Transaction page and performs a page search")
    public void clicksTheSearchTextBoxOnTheTransactionPageAndPerformsAPageSearch() {
        clickWithJS(adminDashboard.buttonSearch);
        waitAndSendText(adminDashboard.buttonSearch, "Order Manage");
        hover(adminDashboard.menuSearch);
    }


    //===============STEPS ESRA SONU==========================================


    //-------------Login Steps FIKRET-----------------/
    @Given("Clicks and confirms the registration request")
    public void clicks_and_confirms_the_registration_request() {
        clickWithJS(adminDashboard.confirmedRegisterSelect);
    }

    @Given("Click demo register View")
    public void click_demo_register_view() {
        clickWithJS(adminDashboard.demoRegesterVievButton);
    }

    @Given("Open browser and Go to admin {string}")
    public void open_browser_and_go_to(String adminUrl) {
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
    }

    @Given("Enter {string} and {string} and click sign in")
    public void enter_and_and_click_sign_in(String adminEmail, String password) {
        visitorHomePage.textBoxUserEmail.sendKeys(ConfigReader.getProperty(adminEmail));
        visitorHomePage.textBoxUserPassword.sendKeys(ConfigReader.getProperty(password));
        clickWithJS(visitorHomePage.signInButton);
    }

    @Given("Verify that the notification icon is visible at the top of the page")
    public void verify_that_the_notification_icon_is_visible_at_the_top_of_the_page() {
        assertTrue(adminDashboard.iconNotificiaton.isDisplayed());
    }

    @Given("Print the number of unread notifications above the notification icon")
    public void print_the_number_of_unread_notifications_above_the_notification_icon() {
        System.out.println(adminDashboard.iconNotificiatonCount.getText());
    }

    @Given("Click the notification icon at the top of the page")
    public void click_the_notification_icon_at_the_top_of_the_page() {

        clickWithJS(adminDashboard.iconNotificiaton);
    }

    @Given("Click on the Personal Notification Setting option from the menu")
    public void click_on_the_personal_notification_setting_option_from_the_menu() {
        clickWithJS(adminDashboard.linkNotificiationSetting);
    }

    @Given("Verify access to the Personal Notification page")
    public void verify_access_to_the_personal_notification_page() {
        assertTrue(adminDashboard.labelNotificationSetText.isDisplayed());
    }

    @Given("Click togle status")
    public void click_togle_status() {

        clickWithJS(adminDashboard.togleAktivePassive);
    }

    @Given("Verify that the Type tab can toggle active and passive")
    public void verify_that_the_type_tab_can_toggle_active_and_passive() {
        assertFalse(adminDashboard.togleAktivePassive.isSelected());
    }

    @Given("Click Read All from the Information menu")
    public void click_read_all_from_the_information_menu() {
        clickWithJS(adminDashboard.notificiationReadAllButton);
    }

    @Given("Verify that all messages have been read")
    public void verify_that_all_messages_have_been_read() {
        assertEquals(0, adminDashboard.iconNotificiatonCount.getText());
    }

    @Given("Click View from the Notification menu")
    public void click_view_from_the_notification_menu() {
        clickWithJS(adminDashboard.notificiationViewButton);
    }

    @Given("Verify that you can access the Notification List page")
    public void verify_that_you_can_access_the_notification_list_page() {
        assertTrue(adminDashboard.notificationListText.isDisplayed());
    }

    @Given("Click View from the Relevant menu")
    public void click_view_from_the_relevant_menu() {
        clickWithJS(adminDashboard.notificiationViewButton);
    }

    @Given("Click View under Action")
    public void click_view_under_action() {
        clickWithJS(adminDashboard.notificiationRelevantViewButton);
    }

    @Given("Click Select buttonLink under Action")
    public void click_select_button_link_under_action() {
        clickWithJS(adminDashboard.notificiationRelevantSelectButton);
    }

    @Given("Access the information page by clicking Details from the dropdown menu")
    public void access_the_information_page_by_clicking_details_from_the_dropdown_menu() {
        clickWithJS(adminDashboard.notificiationRelevantDetailsButton);
    }

    @Given("Verify the details")
    public void verify_the_details() {
        assertTrue(adminDashboard.notificiationRelevantDetailsText.isDisplayed());
    }

    @Given("clicks on the Order Manage menu link")
    public void clicks_on_the_order_manage_menu_link() {
        clickWithJS(adminDashboard.orderManageLink);
    }

    @Given("clicks on the Total Order submenu link")
    public void selects_the_total_order_submenu_link() {
        clickWithJS(adminDashboard.totalOrderSubLink);
    }

    //US_044
    @Given("verifies that the Total Order page is accessible")
    public void verifies_that_the_total_order_page_is_accessible() {
        assertEquals("https://qa.buysellcycle.com/ordermanage/total-sales-list", Driver.getDriver().getCurrentUrl());
    }

    @Given("verifies that lists for Pending Orders, Confirmed Orders, Completed Orders, Pending Payment Orders, Refused and Cancelled Orders, and Inhouse Orders are displayed")
    public void verifies_that_lists_for_pending_orders_confirmed_orders_completed_orders_pending_payment_orders_refused_and_cancelled_orders_and_ınhouse_orders_are_displayed() {
        System.out.println(adminDashboard.totalOrderLists.getText());
        assertTrue(adminDashboard.totalOrderLists.getText().contains("PENDING PAYMENT ORDERS"));
    }


    @Given("verifies that detailed information of the selected pending order is displayed")
    public void verifies_that_detailed_information_of_the_selected_pending_order_is_displayed() {
        assertTrue(adminDashboard.confirmedOrderConfirmText.isDisplayed());
    }

    @Given("updates the order confirmation, payment status, and completion status randomly")
    public void updates_the_order_confirmation_payment_status_and_completion_status_randomly() {
        clickWithJS(adminDashboard.orderConfirmationSelect);
        clickWithJS(adminDashboard.updateRandomSelectSub);

    }

    @Given("clicks on the Update button to save the changes")
    public void clicks_on_the_update_button_to_save_the_changes() {
        clickWithJS(adminDashboard.confirmUpdateButton);
    }

    @Given("verifies that the changes are saved successfully")
    public void verifies_that_the_changes_are_saved_successfully() {
        assertEquals("Updated successfully!", adminDashboard.updateSuccesfully.getText());
    }
    @Given("clicks on the pending Confirm option to view detailed information")
    public void clicks_on_the_pending_confirm_option_to_view_detailed_information() {
        clickWithJS(adminDashboard.pendingActionButton);
        clickWithJS(adminDashboard.pendingSelectButton);
        clickWithJS(adminDashboard.pendingconfirmedOrder);
    }

    @Given("verifies that the order status is updated to confirmed")
    public void verifies_that_the_order_status_is_updated_to_confirmed() {
        clickWithJS(adminDashboard.pendingconfirmedOrder);
        assertEquals("Status Updated successfully!", adminDashboard.updateSuccesfully.getText());
    }

    @Given("enters a search query in the Quick Search text box in the Pending Orders List")
    public void enters_a_search_query_in_the_quick_search_text_box_in_the_pending_orders_list() {
        clickWithJS(adminDashboard.pendingQuickSearch);
        adminDashboard.pendingQuickSearch.sendKeys("nobady" + Keys.ENTER);
    }

    @Given("verifies that results matching the search query are displayed")
    public void verifies_that_results_matching_the_search_query_are_displayed() {
        System.out.println(adminDashboard.quickSearchResultText.getText());
        assertTrue(adminDashboard.quickSearchResultText.getText().contains("nobady"));
    }

    @Given("selects the Confirmed Orders option")
    public void selects_the_confirmed_orders_option() {
        clickWithJS(adminDashboard.confirmedOrderButtonLink);

    }

    @Given("enters a search query3 in the Quick Search text box in the Confirmed Orders List")
    public void enters_a_search_query3_in_the_quick_search_text_box_in_the_confirmed_orders_list() {
        clickWithJS(adminDashboard.confirmedQuickSearch);
        adminDashboard.confirmedQuickSearch.sendKeys("ugur" + Keys.ENTER);

    }

    @Given("verifies that results matching the search query3 are displayed")
    public void verifies_that_results_matching_the_search_query3_are_displayed() {
        List<String> tableStr = strListeOlustur(adminDashboard.confirmedSearchResult);
        System.out.println(tableStr.size());
        assertTrue(tableStr.size() > 0);
    }


    @Given("clicks on the confirmed Details option to view detailed information")
    public void clicks_on_the_confirmed_details_option_to_view_detailed_information() {
        clickWithJS(adminDashboard.confirmedOrderButtonLink);
        clickWithJS(adminDashboard.confirmedActionButton);
        clickWithJS(adminDashboard.confirmedSelectButton);
        clickWithJS(adminDashboard.confirmedDetailsSelect);
    }

    @Given("selects the Completed Orders option")
    public void selects_the_completed_orders_option() {
        clickWithJS(adminDashboard.completedOrderButtonLink);
    }

    @Given("enters a search query in the Quick Search text box in the Completed Orders List")
    public void enters_a_search_query_in_the_quick_search_text_box_in_the_completed_orders_list() {
        clickWithJS(adminDashboard.completedQuickSearch);
        adminDashboard.completedQuickSearch.sendKeys("fikret" + Keys.ENTER);
    }

    @Given("verifies that results matching the search query2 are displayed")
    public void verifies_that_results_matching_the_search_query2_are_displayed() {
        List<String> tableStr = strListeOlustur(adminDashboard.completedSearchResult);
        System.out.println(tableStr.size());
        assertTrue(tableStr.size() > 0);
    }

    @Given("selects a completed order from the list")
    public void selects_a_completed_order_from_the_list() {
        clickWithJS(adminDashboard.completedOrderButtonLink);
        clickWithJS(adminDashboard.completedActionButton);


    }

    @Given("clicks on the completed Details option to view detailed information")
    public void clicks_on_the_completed_details_option_to_view_detailed_information() {
        clickWithJS(adminDashboard.confirmedSelectButton);
        clickWithJS(adminDashboard.completedDetail);
    }

    @Given("verifies that detailed information is displayed")
    public void verifies_that_detailed_information_is_displayed() {
        assertTrue(adminDashboard.confirmedOrderConfirmText.isDisplayed());
    }

    @Given("selects the Pending Payment Orders option")
    public void selects_the_pending_payment_orders_option() {
        clickWithJS(adminDashboard.paymentOrderButtonLink);
    }

    @Given("enters a search query in the Quick Search text box in the Pending Payment Orders List")
    public void enters_a_search_query_in_the_quick_search_text_box_in_the_pending_payment_orders_list() {
        clickWithJS(adminDashboard.paymentSerchBox);
        adminDashboard.paymentSerchBox.sendKeys("fikret" + Keys.ENTER);
    }


    @Given("verifies that payment results matching the search query are displayed")
    public void verifies_that_payment_results_matching_the_search_query_are_displayed() {
        List<String> tableStr = strListeOlustur(adminDashboard.paymentSearchResult);
        System.out.println(tableStr.size());
        assertTrue(tableStr.size() > 0);
    }

    @Given("selects a pending payment order from the list")
    public void selects_a_pending_payment_order_from_the_list() {
        clickWithJS(adminDashboard.paymentOrderButtonLink);
        clickWithJS(adminDashboard.paymentActionButton);
    }

    @Given("clicks on the payment Details option to view detailed information")
    public void clicks_on_the_payment_details_option_to_view_detailed_information() {
        clickWithJS(adminDashboard.paymentSelectButton);
        clickWithJS(adminDashboard.paymentDetailsLink);
    }

    @Given("selects the RefusedCancelled Orders option")
    public void selects_the_refused_cancelled_orders_option() {
       clickWithJS(adminDashboard.refusedCancelledButtonLink);
    }

    @Given("enters a search query in the Quick Search text box in the RefusedCancelled Orders List")
    public void enters_a_search_query_in_the_quick_search_text_box_in_the_refused_cancelled_orders_list() {
        clickWithJS(adminDashboard.refusedQuickSerchBox);
        adminDashboard.refusedQuickSerchBox.sendKeys("ugur" + Keys.ENTER);

    }


    @Given("Search in the quick search box and verify the results")
    public void selects_a_refused_cancelled_order_from_the_list() {
        List<String> tableStr = strListeOlustur(adminDashboard.refusedSearchResult);
        System.out.println(tableStr.size());
        assertTrue(tableStr.size() > 0);
    }

    @Given("clicks on the pending Details option to view detailed information")
    public void clicks_on_the_pending_details_option_to_view_detailed_information() {
        clickWithJS(adminDashboard.pendingActionButton);
        clickWithJS(adminDashboard.pendingSelectButton);
        clickWithJS(adminDashboard.pendingDetails);
    }

    @Given("Click on RefusedCancelled Orders at the top")
    public void click_on_refused_cancelled_orders_at_the_top() {
       clickWithJS(adminDashboard.refusedCancelledButtonLink);
    }

    @Given("Clicks any Action in the RefusedCancelled Orders List")
    public void clicks_any_action_in_the_refused_cancelled_orders_list() {
        clickWithJS(adminDashboard.refusedCancelledActionButton);
    }

    @Given("Clicks Select buttonLink under refusedAction")
    public void clicks_select_button_link_under_refused_action() {
        clickWithJS(adminDashboard.refusedCancelledSelectButton);
        clickWithJS(adminDashboard.refusedCancelledDetailsLink);
    }

    @Given("Click on Details to view the results")
    public void click_on_details_to_view_the_results() {
        assertTrue(adminDashboard.orderCancelledText.isDisplayed());
    }


    //-------------Login Steps NEVFEL-----------------/

    @Given("Click on the  Customer  in Dashboard side bar")
    public void click_on_the_customer_in_dashboard_side_bar() {
        clickWithJS(adminDashboard.labelCustomer);
    }

    @Given("Click on the All Customer")
    public void click_on_the_all_customer() {
        clickWithJS(adminDashboard.labelAllCutomer);
        wait(1);
    }

    @Given("Verify that All Costumer List")
    public void verify_that_all_costumer_list() {
        assertTrue(adminDashboard.columnAllCustomerList.isDisplayed());
        wait(1);
    }

    @Given("Quick Search Text Box searches {string} with a valid mail")
    public void quick_search_text_box_searches_with_a_valid_mail(String validmaill) {
        adminDashboard.searchBoxQuickSearch.sendKeys(validmaill);

    }
    @Given("Is Active icon changes the active-passive status of the customer")
    public void is_active_icon_changes_the_active_passive_status_of_the_customer() {
       clickWithJS(adminDashboard.iconIsActive);
    }
    @Given("Click on the Active Customer")
    public void click_on_the_active_customer() {
        clickWithJS(adminDashboard.activeCustomerButton);

    }
    @Given("Click on  the EDID from the select dropdown menu")
    public void click_on_the_edid_from_the_select_dropdown_menu() {
       if (adminDashboard.activeCustomerActionButton.isDisplayed()){
           clickWithJS(adminDashboard.activeCustomerActionButton);
           clickWithJS(adminDashboard.activeCustomerSelectButton);
           clickWithJS(adminDashboard.activeCustomerEditButton);
           clickWithJS(adminDashboard.basicInfoActiveButton);
       }else {
           clickWithJS(adminDashboard.InActiveCustomerActionButton);
           clickWithJS(adminDashboard.InActiveCustomerActionButton);
           clickWithJS(adminDashboard.inActiveCustomerEditButton);
           clickWithJS(adminDashboard.basicInfoInActiveButton);



       }


    }
    @Given("Click on the Update button")
    public void click_on_the_update_button() {
        clickWithJS(adminDashboard.updateButton);
    }

    @Given("Click on  the DELETE from the select dropdown menu")
    public void click_on_the_delete_from_the_select_dropdown_menu() {
        if(adminDashboard.activeCustomerButton.isDisplayed()){
            clickWithJS(adminDashboard.activeCustomerActionButton);
            clickWithJS(adminDashboard.activeCustomerSelectButton);
            clickWithJS(adminDashboard.activeCustomerDeleteButton);
            clickWithJS(adminDashboard.popUpDeleteButton);
        }else {
            clickWithJS(adminDashboard.InActiveCustomerActionButton);
            clickWithJS(adminDashboard.inActiveCustomerSelectButton);
            clickWithJS(adminDashboard.inActiveCustomerDeleteButton);
            clickWithJS(adminDashboard.popUpDeleteButton);
        }



    }
    @Given("Clicks on  the Delete button in the resulting alert")
    public void clicks_on_the_delete_button_in_the_resulting_alert() {
       clickWithJS(adminDashboard.popUpDeleteButton);
    }

    @Given("Click on  the DETAIL  from the select dropdown menu")
    public void click_on_the_detail_from_the_select_dropdown_menu() {
        if (adminDashboard.activeCustomerButton.isDisplayed()){
            clickWithJS(adminDashboard.activeCustomerActionButton);
            clickWithJS(adminDashboard.activeCustomerSelectButton);
            clickWithJS(adminDashboard.activeCustomerDetailButton);
        }else {
            clickWithJS(adminDashboard.InActiveCustomerActionButton);
            clickWithJS(adminDashboard.inActiveCustomerSelectButton);
            clickWithJS(adminDashboard.inActiveCustomerDetailButton);
        }




    }
    @Given("Verify that Customer Profile, Order Summary, Wallet Summary information is displayed")
    public void verify_that_customer_profile_order_summary_wallet_summary_information_is_displayed() {
        assertTrue(adminDashboard.customerProfileDetailWindow.isDisplayed());

    }

    @Given("Verify that the order list can be accessed")
    public void verify_that_the_order_list_can_be_accessed() {
        scrollIntoViewJS(adminDashboard.ordersIsDisplayedText);
        assertTrue(adminDashboard.ordersIsDisplayedText.isEnabled());

    }
    @Given("Verify that the list of Wallet Histories can be accessed")
    public void verify_that_the_list_of_wallet_histories_can_be_accessed() {
        scrollIntoViewJS(adminDashboard.walletHistoriesIsDisplayedText);
        assertTrue(adminDashboard.walletHistoriesIsDisplayedText.isEnabled());

    }
    @Given("Verify that the Addresses list can be accessed")
    public void verify_that_the_addresses_list_can_be_accessed() {
        scrollIntoViewJS(adminDashboard.addressesIsDisplayedText);
        assertTrue(adminDashboard.addressesIsDisplayedText.isEnabled());

    }

    @Given("Click on the Inactive Customer")
    public void click_on_the_inactive_customer() {
        clickWithJS(adminDashboard.inActiveCustomerButton);

    }

    @Given("Verify that there is a Variant option")
    public void verify_that_there_is_a_variant_option() {
        assertTrue(adminDashboard.checkMark2.isDisplayed());
    }

    @Given("Verify that at least one of the options is selectable")
    public void verify_that_at_least_one_of_the_options_is_selectable() {
        adminDashboard.checkMark2.click();
        wait(2);
        assertTrue(adminDashboard.checkMark.isEnabled());
    }

    @Given("The product information to be added is entered")
    public void the_product_information_to_be_added_is_entered() {
        adminDashboard.nameProduct.sendKeys("SmrWatch");
        waitAndClick(adminDashboard.categoryProduct);
        wait(2);
        waitAndClick(adminDashboard.electronic);
        waitAndClick(adminDashboard.unitProduct);
        waitAndClick(adminDashboard.pair);
        actions.sendKeys(adminDashboard.tags, "car").sendKeys(Keys.ENTER).perform();
        adminDashboard.sellinPrice.sendKeys("230");

    }

    @Given("Add image for product")
    public void add_image_for_product() {
        waitAndClick(adminDashboard.chooseImages);
        waitAndClick(adminDashboard.secilecekResim);
        waitAndClick(adminDashboard.addFilesButton);

    }

    @Given("Select Related Product")
    public void select_related_product() {
        waitAndClick(adminDashboard.related);
        wait(1);

    }

    @Given("Select Up Sale Product")
    public void select_up_sale_product() {
        waitAndClick(adminDashboard.upSale);
        wait(1);
    }

    @Given("Select Cross Sale Product")
    public void select_cross_sale_product() {
        waitAndClick(adminDashboard.crossSale);
    }

    @Given("Click on General Information")
    public void click_on_general_information() {
        wait(2);
        waitAndClick(adminDashboard.generalInformation);
    }

    @Given("Click Save and Publish")
    public void click_save_and_publish() {
        wait(2);
        waitAndClick(adminDashboard.savePublish);
    }

    @Given("Write the product {string} on the search button and search.")
    public void write_the_product_on_the_search_button_and_search(String string) {
        visitorHomePage.searchTextBox.sendKeys(string + Keys.ENTER);
        wait(2);

    }

    @Given("Verify that the product has been installed")
    public void verify_that_the_product_has_been_installed() {
assertTrue(adminDashboard.updatedProduct.isDisplayed());
    }

    @Given("Click on the saved product")
    public void click_on_the_saved_product() {
        waitAndClick(adminDashboard.myProduct);
    }

    @Given("Verify Cross Sale, Up Sale and Related Product")
    public void verify_cross_sale_up_sale_and_related_product() {
assertTrue(adminDashboard.crossUrun.isDisplayed());
assertTrue(adminDashboard.upSellUrun.isDisplayed());
assertTrue(adminDashboard.relatedUrun.isDisplayed());
    }


}