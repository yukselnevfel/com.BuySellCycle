package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
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

    public static Integer returnTextToInteger(WebElement element){
        String str=element.getText();
        int price=Integer.parseInt(str);
        return price;
    }
    @Given("Open browser and go to {string}, enter {string}, {string} and click sign in")
    public void open_browser_and_go_to_enter_and_click_sign_in(String adminUrl, String adminMail, String password) {
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
        clickWithJS(visitorHomePage.textBoxUserEmail);

        visitorHomePage.textBoxUserEmail.sendKeys(ConfigReader.getProperty(adminMail));
        clickWithJS(visitorHomePage.textBoxUserPassword);
        visitorHomePage.textBoxUserPassword.sendKeys(ConfigReader.getProperty(password));

        clickWithJS(visitorHomePage.signInButton);
       
        String expectedMessage="Logged In Successfully!";
        String actualMessage=adminDashboard.popUpMessage.getText();
        assertEquals(expectedMessage,actualMessage);

    }
    @Given("User searches {string} on the admin Dashboard and verifies that the search result is true")
    public void user_searches_on_the_admin_dashboard_and_verifies_that_the_search_result_is_true(String searchText){
        adminDashboard.searchBoxAdminDashboard.sendKeys(searchText);
        String expText="Follow seller History";
        String actText=adminDashboard.searchBoxAdminDashboard.getText();
        assertEquals(expText,actText);
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
        actions.moveToElement(adminDashboard.iconAdminProfile)
                .perform();
        wait(5);
    }
    @Given("Verify that Name text is visible")
    public void verify_that_name_text_is_visible() {
        assertTrue(adminDashboard.textName.isDisplayed());
    }
    @Given("Verify that the {string}, {string}, {string} ve {string} buttons is visible, click butons and verify that informations is changed")
    public void verify_that_the_ve_buttons_is_visible_click_butons_and_verify_that_informations_is_changed(String today, String thisWeek, String thisMounth, String thisYear) {
        WebElement elementToday = Driver.getDriver().findElement(By.xpath("//*[contains(text(),'" + today + "')]"));
        WebElement elementThisWeek = Driver.getDriver().findElement(By.xpath("//*[contains(text(),'" + thisWeek + "')]"));
        WebElement elementThisMonth = Driver.getDriver().findElement(By.xpath("//*[contains(text(),'" + thisMounth + "')]"));
        WebElement elementThisYear = Driver.getDriver().findElement(By.xpath("//*[contains(text(),'" + thisYear + "')]"));

        assertTrue(elementToday.isDisplayed());
        assertTrue(elementThisWeek.isDisplayed());
        assertTrue(elementThisMonth.isDisplayed());
        assertTrue(elementThisYear.isDisplayed());

        int intToday=returnTextToInteger(adminDashboard.labelVisitor);
        waitAndClick(elementThisWeek);
        wait(2);
        int intThisWeek=returnTextToInteger(adminDashboard.labelVisitor);
        waitAndClick(elementThisMonth);
        wait(2);
        int intThisMounth=returnTextToInteger(adminDashboard.labelVisitor);
        waitAndClick(elementThisYear);
        wait(2);
        int intThisYear=returnTextToInteger(adminDashboard.labelVisitor);

        System.out.println("intToday = " + intToday);
        System.out.println("intThisWeek = " + intThisWeek);
        System.out.println("intThisMounth = " + intThisMounth);
        System.out.println("intThisYear = " + intThisYear);

        assertNotEquals(intToday,intThisWeek);
        assertNotEquals(intToday,intThisMounth);
        assertNotEquals(intToday,intThisYear);
        assertNotEquals(intThisWeek,intThisMounth);
        assertNotEquals(intThisWeek,intThisYear);
        assertNotEquals(intThisMounth,intThisYear);
    }
    @Given("Verify that the Hambuger menu is visible")
    public void verify_that_the_hambuger_menu_is_visible() {
        assertTrue(adminDashboard.buttonHamburgerMenu.isDisplayed());
    }
    @Given("Verify that the hamburger menu opened or closed when clicked")
    public void verify_that_the_hamburger_menu_opened_or_closed_when_clicked() {

        clickWithJS(adminDashboard.buttonHamburgerMenu);
        if (adminDashboard.buttonHamburgerMenuControl.isDisplayed()) {

            assertTrue(adminDashboard.buttonHamburgerMenuControl.isDisplayed());
        } else {

            assertFalse(adminDashboard.buttonHamburgerMenuControl.isDisplayed());
        }
        clickWithJS(adminDashboard.buttonHamburgerMenu);
        if (adminDashboard.buttonHamburgerMenuControl.isDisplayed()) {

            assertTrue(adminDashboard.buttonHamburgerMenuControl.isDisplayed());
        } else {

            assertFalse(adminDashboard.buttonHamburgerMenuControl.isDisplayed());
        }

    }
    @Given("The user clicks Total Customer.")
    public void the_user_clicks_total_customer() {
        adminDashboard.totalCustomer.click();
    }

    @Given("Redirect to the Total Customer page.")
    public void redirect_to_the_total_customer_page() {
        String anasayfaWHD = Driver.getDriver().getWindowHandle();
        Driver.getDriver().switchTo().newWindow(WindowType.TAB).get("https://qa.buysellcycle.com/customer/active-customer-list");
        Assert.assertTrue(adminDashboard.labelcontrolTotalCustomer.isDisplayed());
        Driver.getDriver().switchTo().window(anasayfaWHD);
        waitForPageToLoad(5);
    }
    @Given("The user clicks Active Customer.")
    public void the_user_clicks_active_customer() {
        adminDashboard.activeCustomer.click();
    }

    @Given("Redirect to the Active Customer page.")
    public void redirect_to_the_active_customer_page() {
        String anaSayfaWHD = Driver.getDriver().getWindowHandle();
        Driver.getDriver().switchTo().newWindow(WindowType.TAB).get("https://qa.buysellcycle.com/customer/active-customer-list");
        Assert.assertTrue(adminDashboard.labelcontrolActiveCustomer.isDisplayed());
        Driver.getDriver().switchTo().window(anaSayfaWHD);

    }
    @Given("Click on the Website and Verify that the Home Page is opened that on new tab")
    public void click_on_the_website_and_verify_that_the_home_page_is_opened_that_on_new_tab() {
        clickWithJS(adminDashboard.linkWebsite);
        String expUrl="https://qa.buysellcycle.com/";

        Driver.getDriver().switchTo().newWindow(WindowType.TAB).get(expUrl);
        String actUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expUrl,actUrl);

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
        String expectedURL="https://qa.buysellcycle.com/account/transaction";
        String actualURL=Driver.getDriver().getCurrentUrl();
        assertEquals(expectedURL,actualURL);
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
        waitAndSendText(adminDashboard.buttonSearch,"Order Manage");
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
        assertEquals(0,adminDashboard.iconNotificiatonCount.getText());
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

    @Given("verifies that the Total Order page is accessible")
    public void verifies_that_the_total_order_page_is_accessible() {
        assertEquals("https://qa.buysellcycle.com/ordermanage/total-sales-list", Driver.getDriver().getCurrentUrl());
    }

    @Given("verifies that lists for Pending Orders, Confirmed Orders, Completed Orders, Pending Payment Orders, Refused and Cancelled Orders, and Inhouse Orders are displayed")
    public void verifies_that_lists_for_pending_orders_confirmed_orders_completed_orders_pending_payment_orders_refused_and_cancelled_orders_and_ınhouse_orders_are_displayed() {
        System.out.println(adminDashboard.totalOrderLists.getText());
        assertTrue(adminDashboard.totalOrderLists.getText().contains("PENDING PAYMENT ORDERS"));
    }

    @Given("clicks on the Details option to view detailed information")
    public void clicks_on_the_details_option_to_view_detailed_information() {
        clickWithJS(adminDashboard.pendingActionButton);
        clickWithJS(adminDashboard.confirmedSelectButton);
        clickWithJS(adminDashboard.confirmedDetailsSelectButton);
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
        assertEquals("Updated successfully!",adminDashboard.updateSuccesfully.getText());
    }

    @Given("approves the order")
    public void approves_the_order() {
        clickWithJS(adminDashboard.pendingOrderAction);
        clickWithJS(adminDashboard.notificiationRelevantSelectButton);
    }
    @Given("verifies that the order status is updated to confirmed")
    public void verifies_that_the_order_status_is_updated_to_confirmed() {
        clickWithJS(adminDashboard.confirmedOrderSelect);
        assertEquals("Status Updated successfully!",adminDashboard.updateSuccesfully.getText());
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
    @Given("enters a search query in the Quick Search text box in the Confirmed Orders List")
    public void enters_a_search_query_in_the_quick_search_text_box_in_the_confirmed_orders_list() {
        clickWithJS(adminDashboard.confirmedQuickSearch);
        adminDashboard.confirmedQuickSearch.sendKeys("......." + Keys.ENTER);

    }

    @Given("verifies that results matching the search query3 are displayed")
    public void verifies_that_results_matching_the_search_query3_are_displayed() {

    }

    @Given("selects a confirmed order from the list")
    public void selects_a_confirmed_order_from_the_list() {
        clickWithJS(adminDashboard.confirmedOrderButtonLink);
        clickWithJS(adminDashboard.confirmedActionButton);
        clickWithJS(adminDashboard.confirmedSelectButton);
        clickWithJS(adminDashboard.confirmedDetailsSelectButton);
    }
    @Given("verifies that detailed information of the selected confirmed order is displayed")
    public void verifies_that_detailed_information_of_the_selected_confirmed_order_is_displayed() {

    }

    @Given("selects the Completed Orders option")
    public void selects_the_completed_orders_option() {

    }
    @Given("enters a search query in the Quick Search text box in the Completed Orders List")
    public void enters_a_search_query_in_the_quick_search_text_box_in_the_completed_orders_list() {

    }
    @Given("verifies that results matching the search query2 are displayed")
    public void verifies_that_results_matching_the_search_query2_are_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("selects a completed order from the list")
    public void selects_a_completed_order_from_the_list() {
        clickWithJS(adminDashboard.completedOrderButtonLink);
        clickWithJS(adminDashboard.completedActionButton);
        clickWithJS(adminDashboard.confirmedSelectButton);
        clickWithJS(adminDashboard.completedDetail);
    }

    @Given("verifies that detailed information of the selected completed order is displayed")
    public void verifies_that_detailed_information_of_the_selected_completed_order_is_displayed() {
        assertTrue(adminDashboard.confirmedOrderConfirmText.isDisplayed());
    }

    @Given("selects the Pending Payment Orders option")
    public void selects_the_pending_payment_orders_option() {
        clickWithJS(adminDashboard.paymentOrderButtonLink);
    }

    @Given("enters a search query in the Quick Search text box in the Pending Payment Orders List")
    public void enters_a_search_query_in_the_quick_search_text_box_in_the_pending_payment_orders_list() {
        clickWithJS(adminDashboard.paymentSerchBox);
        adminDashboard.paymentSerchBox.sendKeys("......." + Keys.ENTER);
    }

    @Given("selects a pending payment order from the list")
    public void selects_a_pending_payment_order_from_the_list() {
        clickWithJS(adminDashboard.paymentOrderButtonLink);
    }

    @Given("verifies that detailed information of the selected pending payment order is displayed")
    public void verifies_that_detailed_information_of_the_selected_pending_payment_order_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("selects the Refused\\/Cancelled Orders option")
    public void selects_the_refused_cancelled_orders_option() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("enters a search query in the Quick Search text box in the Refused\\/Cancelled Orders List")
    public void enters_a_search_query_in_the_quick_search_text_box_in_the_refused_cancelled_orders_list() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("selects a refused\\/cancelled order from the list")
    public void selects_a_refused_cancelled_order_from_the_list() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("verifies that detailed information of the selected refused\\/cancelled order is displayed")
    public void verifies_that_detailed_information_of_the_selected_refused_cancelled_order_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
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





}