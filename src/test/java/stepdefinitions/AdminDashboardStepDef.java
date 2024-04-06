package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;
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

    @Given("Verify that the profile icon is visible on the Dashboard page")
    public void verify_that_the_profile_icon_is_visible_on_the_dashboard_page() {
        adminDashboard.iconCloseSuccessMessage.click();
        adminDashboard.verifyVisible(adminDashboard.imageProfile);
    }

    @Given("Verify that subheadings are visible when hovering over the profile icon")
    public void verify_that_subheadings_are_visible_when_hovering_over_the_profile_icon() {
        actions.moveToElement(adminDashboard.imageProfile).perform();
        assertTrue(adminDashboard.subMenuProfile.isDisplayed());
    }


    @Given("Confirm that the My profile page has been opened")
    public void confirm_that_the_my_profile_page_has_been_opened() {
        adminDashboard.verifyVisible(adminDashboard.labelBasicInfo);
    }

    @Given("Hover over your profile icon click on the My profile link.")
    public void hover_over_your_profile_icon_click_on_the_my_profile_link() {
        adminDashboard.iconCloseSuccessMessage.click();
        actions.moveToElement(adminDashboard.imageProfile).perform();
        wait(2);
        adminDashboard.linkMyProfile.click();
    }

    @Given("Verify that First Name, Last Name, E-mail Address, Phone Number, Date of Bird information is visible in the Basic Info section.")
    public void verify_that_first_name_last_name_e_mail_address_phone_number_date_of_bird_information_is_visible_in_the_basic_info_section() {
        adminDashboard.verifyVisible(adminDashboard.labelFirstNameText);
        adminDashboard.verifyVisible(adminDashboard.labelLastNameText);
        adminDashboard.verifyVisible(adminDashboard.labelEmailText);
        adminDashboard.verifyVisible(adminDashboard.labelPhoneNumberText);
        adminDashboard.verifyVisible(adminDashboard.labelDateOfBirthText);
    }

    @Given("Verify that the update and avatar buttons are visible and functional")
    public void verify_that_the_update_and_avatar_buttons_are_visible_and_functional() {
        adminDashboard.verifyEnable(adminDashboard.buttonAvatar);
        adminDashboard.verifyEnable(adminDashboard.buttonUpdate);
    }

    @Given("Verify that the information can be updated")
    public void verify_that_the_information_can_be_updated() {
        adminDashboard.textBoxfirstName.clear();
        adminDashboard.textBoxfirstName.sendKeys("Beytullah");
        adminDashboard.textBoxPhoneNumber.sendKeys("12345678");
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        adminDashboard.buttonUpdate.click();
        wait(2);
        assertTrue(adminDashboard.labelSuccessMessage.isDisplayed());
    }

    @Given("Click on the Change password button and verify that you are directed to the relevant page.")
    public void click_on_the_change_password_button_and_verify_that_you_are_directed_to_the_relevant_page() {
        wait(2);
        adminDashboard.clickVerification(adminDashboard.buttonChangePassword, adminDashboard.labelChangePassword);
        wait(3);
        assertTrue(adminDashboard.labelChangePassword.isDisplayed());
    }

    @Given("Verify that the CURRENT PASSWORD, NEW PASSWORD, RE ENTER NEW PASSWORD textboxes are visible")
    public void verify_that_the_current_password_new_password_re_enter_new_password_textboxes_are_visible() {
        assertTrue(adminDashboard.textBoxCurrentPassword.isDisplayed());
        assertTrue(adminDashboard.textBoxNewPassword.isDisplayed());
        assertTrue(adminDashboard.textBoxRePassword.isDisplayed());
        wait(2);
    }

    @Given("Verify that the password can be updated")
    public void verify_that_the_password_can_be_updated() {
        adminDashboard.textBoxCurrentPassword.sendKeys(ConfigReader.getProperty("password"));
        adminDashboard.textBoxNewPassword.sendKeys("123123123");
        adminDashboard.textBoxRePassword.sendKeys("123123123");
        adminDashboard.buttonUpdateChangePassword.click();
    }

    @Given("Click on the Address button")
    public void click_on_the_address_button() {
        wait(2);
        adminDashboard.buttonAddress.click();
    }

    @Given("Verify that the Add new address button is visible and active")
    public void verify_that_the_add_new_address_button_is_visible_and_active() {
        adminDashboard.verifyEnable(adminDashboard.buttonAddNewAddress);
    }

    @Given("Verify that the Address page opens")
    public void verify_that_the_address_page_opens() {
        wait(2);
        assertTrue(adminDashboard.buttonAddNewAddress.isDisplayed());
    }

    @Given("Verify that address information is visible")
    public void verify_that_address_information_is_visible() {
        assertTrue(adminDashboard.tableAddressInformation.isDisplayed());
    }

    @Given("Click the Add new address button")
    public void click_the_add_new_address_button() {
        adminDashboard.buttonAddNewAddress.click();
    }

    @Given("Verify that save button is visible")
    public void verify_that_save_button_is_visible() {

        assertTrue(adminDashboard.buttonSaveAddress.isDisplayed());
    }

    @Given("Fill in the starred fields and click the save button.")
    public void fill_in_the_starred_fields_and_click_the_save_button() {

        adminDashboard.addInfo();
    }

    @Given("Verify that the address has been added")
    public void verify_that_the_address_has_been_added() {
        assertTrue(adminDashboard.labelSuccessMessage.isDisplayed());
    }

    @Given("Select the select from options option from Country dropdown")
    public void select_the_select_from_options_option_from_country_dropdown() {
        adminDashboard.dropDownCountry.click();
        wait(3);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        adminDashboard.subMenuSelectFromOptions.click();
    }
    @Given("Clicks on the save button")
    public void clicks_on_the_save_button() {
        adminDashboard.buttonSave.click();
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


    //-------------US_035-----------------/
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
        if(adminDashboard.notificiationReadAllButton.isDisplayed()){
            clickWithJS(adminDashboard.notificiationReadAllButton);
            System.out.println("All notifications have been read!");
        } else{
            if(adminDashboard.noNotificiationtext.isDisplayed() && adminDashboard.noNotificiationtext.getText().equals("No unread message")){
                System.out.println("No unread message text displayed");
            }else  System.out.println("An unexpected situation!");

        }

    }

    @Given("Verify that all messages have been read")
    public void verify_that_all_messages_have_been_read() {
        assertFalse(adminDashboard.iconNotificiatonCount.isDisplayed());
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


    //=====================STEPS NEVFEL====================================/

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
        if (adminDashboard.activeCustomerActionButton.isDisplayed()) {
            clickWithJS(adminDashboard.activeCustomerActionButton);
            clickWithJS(adminDashboard.activeCustomerSelectButton);
            clickWithJS(adminDashboard.activeCustomerEditButton);
            clickWithJS(adminDashboard.basicInfoActiveButton);
        } else {
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
        if (adminDashboard.activeCustomerButton.isDisplayed()) {
            clickWithJS(adminDashboard.activeCustomerActionButton);
            clickWithJS(adminDashboard.activeCustomerSelectButton);
            clickWithJS(adminDashboard.activeCustomerDeleteButton);
            clickWithJS(adminDashboard.popUpDeleteButton);
        } else {
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
        if (adminDashboard.activeCustomerButton.isDisplayed()) {
            clickWithJS(adminDashboard.activeCustomerActionButton);
            clickWithJS(adminDashboard.activeCustomerSelectButton);
            clickWithJS(adminDashboard.activeCustomerDetailButton);
        } else {
            clickWithJS(adminDashboard.InActiveCustomerActionButton);
            clickWithJS(adminDashboard.inActiveCustomerSelectButton);
            clickWithJS(adminDashboard.inActiveCustomerDetailButton);
        }

    }
    @Given("Click on the Create Customer")
    public void click_on_the_create_customer() {
        clickWithJS(adminDashboard.labelCreateCustomer);
    }
    @Given("Enters a name in the FirstName textbox")
    public void enters_a_name_in_the_first_name_textbox() {
        adminDashboard.textBoxFirstNameCreateCustomer.sendKeys(faker.name().firstName());
        wait(1);
    }
    @Given("Enters last name in LastName textbox")
    public void enters_last_name_in_last_name_textbox() {
        adminDashboard.textBoxLastNameCreateCustomer.sendKeys(faker.name().lastName());
        wait(1);
    }
    @Given("Password enters {string} password suitable for the criteria in the textbox")
    public void password_enters_password_suitable_for_the_criteria_in_the_textbox(String password) {;
        adminDashboard.textBoxPasswordCreateCustomer.sendKeys(password);
        wait(1);
    }
    @Given("Enters {string} the same password in the Confirm Password textbox")
    public void enters_the_same_password_in_the_confirm_password_textbox(String confirmPass) {
        adminDashboard.textBoxConfirmPasswordCreateCustomer.sendKeys(confirmPass);
        wait(1);
    }
    @Given("Enters an email suitable for the criteria in the email or phone textbox.")
    public void enters_an_email_suitable_for_the_criteria_in_the_email_or_phone_textbox(String email) {
        adminDashboard.textBoxEmailOrPhoneCreateCustomer.sendKeys(faker.internet().emailAddress());
        wait(1);
    }
    @Given("Click on the Create button")
    public void click_on_the_create_button() {
        clickWithJS(adminDashboard.createButtonCreateCustomer);
        wait(1);

    }
    @Given("Verify that the Create operation has occurred")
    public void verify_that_the_create_operation_has_occurred() {
        assertTrue(adminDashboard.labelAllCutomer.isDisplayed());
        wait(1);
    }

    @Given("Leaves the FirstName textbox empty")
    public void leaves_the_first_name_textbox_empty() {
       adminDashboard.textBoxFirstNameCreateCustomer.sendKeys("");

    }
    @Given("Verify that login is not available")
    public void verify_that_login_is_not_available() {
        assertTrue(adminDashboard.textBoxFirstNameCreateCustomer.isDisplayed());
    }

    @Given("Enters a password suitable for the criteria in the Password textbox")
    public void enters_a_password_suitable_for_the_criteria_in_the_password_textbox() {
        adminDashboard.textBoxPasswordCreateCustomer.sendKeys(faker.code().isbn10());
        wait(1);

    }
    @Given("Password enters a different password in the textbox.")
    public void password_enters_a_different_password_in_the_textbox() {
        adminDashboard.textBoxConfirmPasswordCreateCustomer.sendKeys(faker.code().gtin8());
        wait(1);

    }
    @Given("Verify that the Passwords do not match.")
    public void verify_that_the_passwords_do_not_match() {
        assertTrue(adminDashboard.incorrectPassportNumbertext.isDisplayed());
    }

    @Given("Enters a password {string} that does not meet the criteria in the password textbox")
    public void enters_a_password_that_does_not_meet_the_criteria_in_the_password_textbox(String pass) {
        adminDashboard.textBoxPasswordCreateCustomer.sendKeys(pass);



    }
    @Given("Verify that you cannot log in")
    public void verify_that_you_cannot_log_in() {
        assertTrue(adminDashboard.textBoxPasswordCreateCustomer.isDisplayed());

    }



    @Given("Enters a special character  in the iPhone textbox.")
    public void enters_a_special_character_in_the_i_phone_textbox() {
        adminDashboard.textBoxEmailOrPhoneCreateCustomer.sendKeys(faker.number().digit());

    }
    @Given("Email enters a mail that does not meet the criteria  in the textbox")
    public void email_enters_a_mail_that_does_not_meet_the_criteria_in_the_textbox() {
        adminDashboard.textBoxEmailOrPhoneCreateCustomer.sendKeys(faker.name().fullName());

    }












    //====================NEVFEL STEPS END===============================================



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
    //------------------------SIMGE BASLANGIC------------------------
    @Given("Verify that the Human Resource link is visible")
    public void verify_that_the_human_resource_link_is_visible() {
      Assert.assertTrue(adminDashboard.linkHumanResource.isDisplayed());
    }
    @Given("Click on the Human Resource link in the Dashboard side bar")
    public void click_on_the_human_resource_link_in_the_dashboard_side_bar() {
        clickWithJS(adminDashboard.linkHumanResource);
    }
    @Given("Verify that the Staff link is visible")
    public void verify_that_the_staff_link_is_visible() {
        Assert.assertTrue(adminDashboard.linkStaff.isDisplayed());
    }
    @Given("Click on the Staff link")
    public void click_on_the_staff_link() {
      clickWithJS(adminDashboard.linkStaff);
    }
    @Given("Verify that the Staff page is opened")
    public void verify_that_the_staff_page_is_opened() {
        String expectedUrl="https://qa.buysellcycle.com/hr/staffs";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }
    @Given("Verify that the Staff List\\(SL, Name, Email, Phone, Role, Status, Department, Registered Date, Action) is visible")
    public void verify_that_the_staff_list_sl_name_email_phone_role_status_department_registered_date_action_is_visible() {
        for (WebElement list:adminDashboard.linkStaffList) {
            Assert.assertTrue(list.isDisplayed());
            Assert.assertTrue(list.isEnabled());
        }
    }
    @Given("Verify that the the status of the first employee is active")
    public void verify_that_the_the_status_of_the_first_employee_is_active() {
        for (WebElement status: adminDashboard.linkStaffStatus) {
            Assert.assertTrue(status.isEnabled());
        }
    }

    @Given("Verify that the Select button is visible")
    public void verify_that_the_select_button_is_visible() {
        for (WebElement select: adminDashboard.linkStaffSelect) {
            Assert.assertTrue(select.isDisplayed());
        }
    }
    @Given("Click on the Select button")
    public void click_on_the_select_button() {
        for (int i = 0; i < 1; i++) {
            clickWithJS(adminDashboard.linkStaffSelect.get(i));
        }
    }
    @Given("Verify that the View link is visible")
    public void verify_that_the_view_link_is_visible() {
        Assert.assertTrue(adminDashboard.linkView.isDisplayed());
    }
    @Given("Click on the View link")
    public void click_on_the_view_link() {
        wait(2);
       clickWithJS(adminDashboard.linkView);
    }
    @Given("Verify that the Staff Info page is opened")
    public void verify_that_the_staff_info_page_is_opened() {
     Assert.assertTrue(adminDashboard.labelStaffInfo.isDisplayed());
    }
    @Given("Verify that the Edit link is visible")
    public void verify_that_the_edit_link_is_visible() {
        wait(2);
     Assert.assertTrue(adminDashboard.linkEdit.isDisplayed());
    }
    @Given("Click on the Edit link")
    public void click_on_the_edit_link() {
        clickWithJS(adminDashboard.linkEdit);
    }
    @Given("Verify that the employee's edit staff info page is opened")
    public void verify_that_the_employee_s_edit_staff_info_page_is_opened() {
     Assert.assertTrue(adminDashboard.labelEditStaffInfo.isDisplayed());
    }
    @Given("Verify that the Delete button is visible")
    public void verify_that_the_delete_button_is_visible() {
        Assert.assertTrue(adminDashboard.linkDelete.isDisplayed());
    }
    @Given("Click on the Delete button in Staff Page")
    public void click_on_the_delete_button_in_staff_page() {
       clickWithJS(adminDashboard.linkDelete);
    }
    @Given("Verify that the relevant employee has been deleted")
    public void verify_that_the_relevant_employee_has_been_deleted() {
        String expectedAllert ="Deleted successfully!";
        String actualAllert=visitorHomePage.successfullAllert.getText();
        Assert.assertEquals(expectedAllert,actualAllert);
    }
    @Given("Click on the Delete button in query")
    public void click_on_the_delete_button_in_query() {
       clickWithJS(adminDashboard.linkDelete2);
    }
    @Given("Verify that the Quick Search TextBox is visible")
    public void verify_that_the_quick_search_text_box_is_visible() {
      Assert.assertTrue(adminDashboard.textBoxSearch.isDisplayed());
    }
    @Given("Verify that the Quick Search TextBox is active")
    public void verify_that_the_quick_search_text_box_is_active() {
        Assert.assertTrue(adminDashboard.textBoxSearch.isEnabled());
    }
    @Given("Verify that the ADD NEW STAFF button is visible")
    public void verify_that_the_add_new_staff_button_is_visible() {
        Assert.assertTrue(adminDashboard.linkAddNewStaff.isDisplayed());
    }
    @Given("Click on the ADD NEW STAFF button")
    public void click_on_the_add_new_staff_button() {
       clickWithJS(adminDashboard.linkAddNewStaff);
    }
    @Given("Verify that the Add New Staff page is opened")
    public void verify_that_the_add_new_staff_page_is_opened() {
        String expectedUrl="https://qa.buysellcycle.com/hr/staffs/create";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }
    @Given("Verify that the Role bar is visible")
    public void verify_that_the_role_bar_is_visible() {
        Assert.assertTrue(adminDashboard.linkRoleTextBox.isDisplayed());
    }
    @Given("Click on the Role bar")
    public void click_on_the_role_bar() {
        clickWithJS(adminDashboard.linkRoleTextBox);
    }
    @Given("Click on the Staff")
    public void click_on_the_staff() {
        clickWithJS(adminDashboard.linkStaffDdm);
    }
    @Given("Verify that the Department bar is visible")
    public void verify_that_the_department_bar_is_visible() {
        Assert.assertTrue(adminDashboard.linkDepartmentTextBox.isDisplayed());
    }
    @Given("Click on the Department bar")
    public void click_on_the_department_bar() {
        clickWithJS(adminDashboard.linkDepartmentTextBox);
    }
    @Given("Click on the Marketing")
    public void click_on_the_marketing() {
        clickWithJS(adminDashboard.linkMarketingDdm);
    }
    @Given("Verify that the Email textbox is visible")
    public void verify_that_the_email_textbox_is_visible() {
        Assert.assertTrue(adminDashboard.linkEmailTextBox.isDisplayed());
    }
    @Given("Verify that the First Name textbox is visible")
    public void verify_that_the_first_name_textbox_is_visible() {
        Assert.assertTrue(adminDashboard.linkFirstNameTextBox.isDisplayed());
    }
    @Given("Verify that the Last Name textbox is visible")
    public void verify_that_the_last_name_textbox_is_visible() {
        Assert.assertTrue(adminDashboard.linkLastNameTextBox.isDisplayed());
    }
    @Given("Verify that the Phone textbox is visivle")
    public void verify_that_the_phone_textbox_is_visivle() {
        Assert.assertTrue(adminDashboard.linkPhoneTextBox.isDisplayed());
    }
    @Given("Verify that the Password textbox is visible")
    public void verify_that_the_password_textbox_is_visible() {
        Assert.assertTrue(adminDashboard.linkPasswordTextBox.isDisplayed());
    }
    @Given("Verify that the Date of Birth textbox is visible")
    public void verify_that_the_date_of_birth_textbox_is_visible() {
        Assert.assertTrue(adminDashboard.linkDateOfBirthTextBox.isDisplayed());
    }
    @Given("Verify that the Address textbox is visible")
    public void verify_that_the_address_textbox_is_visible() {
        Assert.assertTrue(adminDashboard.linkAddressTextBox.isDisplayed());
    }
    @Given("Verify that the Date of Joining textbox is visible")
    public void verify_that_the_date_of_joining_textbox_is_visible() {
        Assert.assertTrue(adminDashboard.linkDateOfJoiningTextBox.isDisplayed());
    }
    @Given("Verify that the APPLICABLE FOR LEAVE textbox is visible")
    public void verify_that_the_applicable_for_leave_textbox_is_visible() {
        Assert.assertTrue(adminDashboard.linkApplicableForLeaveTextBox.isDisplayed());
    }
    @Given("Verify that the Bank Name textbox is visible")
    public void verify_that_the_bank_name_textbox_is_visible() {
        Assert.assertTrue(adminDashboard.linkBankNameTextBox.isDisplayed());
    }
    @Given("Verify that the Branch Name textbox is visible")
    public void verify_that_the_branch_name_textbox_is_visible() {
        Assert.assertTrue(adminDashboard.linkBranchNameTextBox.isDisplayed());
    }
    @Given("Verify that the Account Name textbox is visible")
    public void verify_that_the_account_name_textbox_is_visible() {
        Assert.assertTrue(adminDashboard.linkAccountNameTextBox.isDisplayed());
    }
    @Given("Verify that the Account Number textbox is visible")
    public void verify_that_the_account_number_textbox_is_visible() {
        Assert.assertTrue(adminDashboard.linkAccountNumberTextBox.isDisplayed());
    }
    @Given("Click on the Email textbox")
    public void click_on_the_email_textbox() {
        clickWithJS(adminDashboard.linkEmailTextBox);
    }
    @Given("Random email is entered")
    public void random_email_is_entered() {
           adminDashboard.linkEmailTextBox.sendKeys(faker.internet().emailAddress());
    }

    @Given("Click on the First Name textbox")
    public void click_on_the_first_name_textbox() {
        clickWithJS(adminDashboard.linkFirstNameTextBox);
    }
    @Given("Random First Name is entered")
    public void random_first_name_is_entered() {
        adminDashboard.linkFirstNameTextBox.sendKeys(faker.name().firstName());
    }

    @Given("Click on the Last Name textbox")
    public void click_on_the_last_name_textbox() {
        clickWithJS(adminDashboard.linkLastNameTextBox);
    }
    @Given("Random Last Name is entered")
    public void random_last_name_is_entered() {
        adminDashboard.linkLastNameTextBox.sendKeys(faker.name().lastName());
    }

    @Given("Click on the Phone textbox")
    public void click_on_the_phone_textbox() {
        clickWithJS(adminDashboard.linkPhoneTextBox);
    }
    @Given("Random Phone is entered")
    public void random_phone_is_entered() {
        adminDashboard.linkPhoneTextBox.sendKeys(faker.phoneNumber().phoneNumber());
    }

    @Given("Click on the Password textbox")
    public void click_on_the_password_textbox() {
        clickWithJS(adminDashboard.linkPasswordTextBox);
    }
    @Given("Random Password is entered \\({int} character)")
    public void random_password_is_entered_character(Integer int1) {
        adminDashboard.linkPasswordTextBox.sendKeys(faker.internet().password(int1,15));
    }

    @Given("Click on the Date of Birth textbox")
    public void click_on_the_date_of_birth_textbox() {
        clickWithJS(adminDashboard.linkDateOfBirthTextBox);
    }
    @Given("Clean on the Date of Birth textbox")
    public void clean_on_the_date_of_birth_textbox() {
        adminDashboard.linkDateOfBirthTextBox.clear();
    }
    @Given("Random Date is entered \\(mm\\/dd\\/yyyy)")
    public void random_date_is_entered_mm_dd_yyyy() {

        adminDashboard.linkDateOfBirthTextBox.sendKeys("04/09/1993");
    }
    @Given("Click on the Address textbox")
    public void click_on_the_address_textbox() {
        clickWithJS(adminDashboard.linkAddressTextBox);
    }
    @Given("Random Address is entered")
    public void random_address_is_entered() {
        adminDashboard.linkAddressTextBox.sendKeys(faker.address().fullAddress());
    }

    @Given("Click on the Date of Joining textbox")
    public void click_on_the_date_of_joining_textbox() {
        clickWithJS(adminDashboard.linkDateOfJoiningTextBox);
        adminDashboard.linkDateOfJoiningTextBox.clear();
    }
    @Given("Random Date of Joining is entered")
    public void random_date_of_joining_is_entered() {
        Date date = new Date();
        SimpleDateFormat dateTimeFormatter = new SimpleDateFormat("MM/dd/yyyy");

        adminDashboard.linkDateOfJoiningTextBox.sendKeys(dateTimeFormatter.format(date.getTime()));
    }

    @Given("Click on the APPLICABLE FOR LEAVE textbox")
    public void click_on_the_applicable_for_leave_textbox() {
        clickWithJS(adminDashboard.linkApplicableForLeaveTextBox);
    }
    @Given("Random APPLICABLE FOR LEAVE is entered")
    public void random_applicable_for_leave_is_entered() {
        adminDashboard.linkApplicableForLeaveTextBox.clear();
       adminDashboard.linkApplicableForLeaveTextBox.sendKeys("01/01/2025");
    }

    @Given("Click on the Bank Name textbox")
    public void click_on_the_bank_name_textbox() {
        clickWithJS(adminDashboard.linkBankNameTextBox);
    }
    @Given("Random Bank Name is entered")
    public void random_bank_name_is_entered() {
        adminDashboard.linkBankNameTextBox.sendKeys(faker.name().firstName()+"Bank");
    }

    @Given("Click on the Branch Name textbox")
    public void click_on_the_branch_name_textbox() {
        clickWithJS(adminDashboard.linkBranchNameTextBox);
    }
    @Given("Random Branch Name is entered")
    public void random_branch_name_is_entered() {
        adminDashboard.linkBranchNameTextBox.sendKeys(faker.name().title());
    }

    @Given("Click on the Account Name textbox")
    public void click_on_the_account_name_textbox() {
        clickWithJS(adminDashboard.linkAccountNameTextBox);
    }
    @Given("Random Account Name is entered")
    public void random_account_name_is_entered() {
        adminDashboard.linkAccountNameTextBox.sendKeys(faker.name().username());
    }

    @Given("Click on the Account Number textbox")
    public void click_on_the_account_number_textbox() {
       clickWithJS(adminDashboard.linkAccountNumberTextBox);
    }
    @Given("Random Account Number is entered")
    public void random_account_number_is_entered() {
        adminDashboard.linkAccountNumberTextBox.sendKeys(faker.number().digits(8));
    }

    @Given("Verify that the newly added staff is successfull")
    public void verify_that_the_newly_added_staff_is_successfull() {
        String expectedMessage ="Added successfully!";
        String actualMessage = visitorHomePage.successfullAllert.getText();
        Assert.assertEquals(expectedMessage,actualMessage);
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

    @Given("Click on the Products menu")
    public void click_on_the_products_menu() {
        waitAndClick(adminDashboard.puroductsMenu);
    }

    @Given("The product information to be added is entered")
    public void the_product_information_to_be_added_is_entered() {
        adminDashboard.nameProduct.sendKeys("SmrWatch");
        wait(1);
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
        wait(1);
        waitAndClick(adminDashboard.secilecekResim);
        wait(1);
        waitAndClick(adminDashboard.addFilesButton);
        wait(2);

    }

    @Given("Select Related Product")
    public void select_related_product() {
        waitAndClick(adminDashboard.related);
        wait(2);

    }

    @Given("Select Up Sale Product")
    public void select_up_sale_product() {
        waitAndClick(adminDashboard.upSale);
        wait(2);
    }

    @Given("Select Cross Sale Product")
    public void select_cross_sale_product() {
        waitAndClick(adminDashboard.crossSale);
    }

    @Given("Click on General Information")
    public void click_on_general_information() {
        wait(2);
        waitAndClick(adminDashboard.generalInformation);
        wait(1);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
    }

    @Given("Click Save and Publish")
    public void click_save_and_publish() {
        waitAndClick(adminDashboard.savePublish);
        wait(2);
    }

    @Given("Write the product {string} on the search button and search.")
    public void write_the_product_on_the_search_button_and_search(String string) {
        wait(2);
        visitorHomePage.searchTextBox.sendKeys(string + Keys.ENTER);

    }

    @Given("Verify that the product has been installed")
    public void verify_that_the_product_has_been_installed() {
        assertTrue(adminDashboard.updatedProduct.isDisplayed());

    }

    @Given("Click on the saved product")
    public void click_on_the_saved_product() {
        waitAndClick(adminDashboard.myProduct);
        wait(3);
    }

    @Given("Verify Cross Sale, Up Sale and Related Product")
    public void verify_cross_sale_up_sale_and_related_product() {
        wait(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        wait(2);
        assertTrue(adminDashboard.crossUrun.isDisplayed());
        assertTrue(adminDashboard.upSellUrun.isDisplayed());
        assertTrue(adminDashboard.relatedUrun.isDisplayed());
    }

    @Given("Verify that the Name Text Box is visible")
    public void verify_that_the_name_text_box_is_visible() {
        assertTrue(adminDashboard.nameProduct.isDisplayed());
    }

    @Given("Verify that the Product SKU Text Box is visible")
    public void verify_that_the_product_sku_text_box_is_visible() {
        assertTrue(adminDashboard.sku.isDisplayed());
    }

    @Given("Verify that the Model Number Text Box is visible")
    public void verify_that_the_model_number_text_box_is_visible() {
        assertTrue(adminDashboard.modelNumber.isDisplayed());
    }

    @Given("Verify that the Category Text Box is visible")
    public void verify_that_the_category_text_box_is_visible() {
        assertTrue(adminDashboard.categoryProduct.isDisplayed());
    }

    @Given("Verify that the Brand Text Box is visible")
    public void verify_that_the_brand_text_box_is_visible() {
        assertTrue(adminDashboard.brand.isDisplayed());

    }

    @Given("Verify that the Unit Text Box is visible")
    public void verify_that_the_unit_text_box_is_visible() {
        assertTrue(adminDashboard.unitProduct.isDisplayed());
    }

    @Given("Verify that the Barcode Type Text Box is visible")
    public void verify_that_the_barcode_type_text_box_is_visible() {
        assertTrue(adminDashboard.barcodeType.isDisplayed());
    }

    @Given("Verify that the Minimum Order QTY Text Box is visible")
    public void verify_that_the_minimum_order_qty_text_box_is_visible() {
        assertTrue(adminDashboard.minOrder.isDisplayed());
    }

    @Given("Verify that the Max Order QTY Text Box is visible")
    public void verify_that_the_max_order_qty_text_box_is_visible() {
        assertTrue(adminDashboard.maxOrder.isDisplayed());
    }

    @Given("Verify that the Tags\\(Comma Separated) Text Box is visible")
    public void verify_that_the_tags_comma_separated_text_box_is_visible() {
        assertTrue(adminDashboard.tags.isDisplayed());
    }


    @Given("Click on the CTEGORY \\(ADD NEW) link.")
    public void click_on_the_ctegory_add_new_link() {
        adminDashboard.categoryAddNew.click();
        wait(1);
    }

    @Given("Click on the BRAND \\(ADD NEW) link.")
    public void click_on_the_brand_add_new_link() {
        adminDashboard.closePage.click();
        wait(1);
        adminDashboard.brandAddNew.click();
        wait(1);
    }

    @Given("Click on the UNIT \\(ADD NEW) link.")
    public void click_on_the_unit_add_new_link() {
        adminDashboard.closePage2.click();
        wait(1);
        adminDashboard.unitAddNew.click();
        wait(1);
    }

    @Given("Verify that {string} can be entered in the WEIGHT [GM], LENGTH [CM], BREADTH [CM], HEIGHT [CM] and ADDITIONAL SHIPPING CHARGE boxes")
    public void verify_that_can_be_entered_in_the_weight_gm_length_cm_breadth_cm_height_cm_and_additional_shipping_charge_boxes(String value) {adminDashboard.weight.sendKeys(value);
    adminDashboard.lenght.sendKeys(value);
    adminDashboard.breadth.sendKeys(value);
    adminDashboard.height.sendKeys(value);
    adminDashboard.asc.sendKeys(value);
    wait(1);
    }

    @Given("Verify that image is uploaded")
    public void verify_that_image_is_uploaded() {
        wait(1);
    assertTrue(adminDashboard.uploadedImage.isDisplayed());
    }
    @Given("Verify that Save Button is displayed and click")
    public void verify_that_save_button_is_displayed_and_active() {
        assertTrue(adminDashboard.saveOnly.isDisplayed());
        waitAndClick(adminDashboard.saveOnly);
    }
    @Given("Verify that Save and Publish Button is displayed and click")
    public void verify_that_save_and_publish_button_is_displayed_and_active() {
        assertTrue(adminDashboard.savePublish.isDisplayed());
        waitAndClick(adminDashboard.savePublish);
    }


}