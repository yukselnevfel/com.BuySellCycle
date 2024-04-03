package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminDashboard extends Base{

    // -------------------------Beytullah's Locates----------------------------
    @FindBy(xpath = "(//input[@type='text'])[1]")
    public WebElement searchBoxAdminDashboard;
    //*[@class='toast-message']
    @FindBy(xpath = "//*[@class='toast-message']")
    public WebElement popUpMessage;

// -------------------------End of Beytullah's Locates----------------------------


    //============LOCATE ACCOUNT ESRA===================
    @FindBy(xpath = "//*[text()='Account']")
    public WebElement textAccount;

    @FindBy(xpath = "//a[text()='Transaction']")
    public WebElement textTransaction;

    @FindBy(xpath = "//*[@class='primary_input_field primary-input form-control']")
    public WebElement searchSelectCriteria;

    @FindBy(xpath = "(//td[@data-title='r1c3'])[2]")
    public WebElement buttonStartDate;

    @FindBy(xpath = "(//td[@data-title='r3c4'])[2]")
    public WebElement buttonEndDate;

    @FindBy(xpath = "//*[@class='applyBtn btn btn-sm btn-primary']")
    public WebElement buttonApply;

    @FindBy(xpath = "(//i[@class='ti-search'])[1]")
    public WebElement buttonSearch;
    @FindBy(xpath = "//div[@class='col-lg-12 p-0']")
    public WebElement menuSearch;

    @FindBy(xpath = "//td[text()='27th Mar, 2024']")
    public WebElement dateTransaction;

    @FindBy(xpath = "(//td[text()='Main Income'])[1]")
    public WebElement chartOfAccountTransaction;

    @FindBy(xpath = "//td[text()='Wallet Recharge by customer']")
    public WebElement titleTransaction;

    @FindBy(xpath = "//td[text()='$ 1,000.00']")
    public WebElement creditTransaction;




    //======================================================





    //======US_035=========


    @FindBy(xpath = "//*[@class='fa fa-bell']")
    public WebElement iconNotificiaton;
    @FindBy(xpath = "//*[@class='notification_count']")
    public WebElement iconNotificiatonCount;
    @FindBy(xpath = "//*[text()='Setting']")
    public WebElement linkNotificiationSetting;
    @FindBy(xpath = "//*[@class='mb-0 mr-30 mb_xs_15px mb_sm_20px']")
    public WebElement labelNotificationSetText;
    @FindBy(xpath = "(//*[@id='status'])[1]")
    public WebElement togleAktivePassive;
    @FindBy(xpath = "//*[@href='https://qa.buysellcycle.com/profile/mark-as-read']")
    public WebElement notificiationReadAllButton;
    @FindBy(xpath = "//*[@href='https://qa.buysellcycle.com/profile/notifications']")
    public WebElement notificiationViewButton;
    @FindBy(xpath = "//*[@href='https://qa.buysellcycle.com/customer/active-customer-list']")
    public WebElement demoRegesterVievButton;
    @FindBy(xpath = "//*[text()='Notifications']")
    public WebElement notificationListText;
    @FindBy(xpath = "//*[@class='sorting_1']")
    public WebElement notificiationRelevantActionButton;
    @FindBy(xpath = "//*[@href='https://qa.buysellcycle.com/ordermanage/total-sales-list']")
    public WebElement notificiationRelevantViewButton;
    @FindBy(xpath = "//*[@class='btn btn-secondary dropdown-toggle']")
    public WebElement notificiationRelevantSelectButton;
    @FindBy(xpath = "//span[2]/div/button")
    public WebElement confirmedSelectButton;
    @FindBy(xpath = "(//tbody/tr[1]/td[1])[2]")
    public WebElement confirmedActionButton;
    @FindBy(xpath = "(//td[1])[1]")
    public WebElement pendingActionButton;
    @FindBy(xpath = "//span[2]//a")
    public WebElement confirmedDetailsSelectButton;
    @FindBy(xpath = "(//*[@class='primary_input_label'])[1]")
    public WebElement confirmedOrderConfirmText;
    @FindBy(xpath = "//*[@href='https://qa.buysellcycle.com/ordermanage/sales-details/142']")
    public WebElement notificiationRelevantDetailsButton;
    @FindBy(xpath = "//*[text()='Order Confirmation']")
    public WebElement notificiationRelevantDetailsText;
    @FindBy(xpath = "//span[text()='Order Manage']")
    public WebElement orderManageLink;
    @FindBy(xpath = "//*[@href='https://qa.buysellcycle.com/ordermanage/total-sales-list']")
    public WebElement totalOrderSubLink;
    @FindBy(xpath = "//*[@class='nav nav_list']")
    public WebElement totalOrderLists;
    @FindBy(xpath = "(//*[@class='nice-select primary_select mb-25'])[1]")
    public WebElement orderConfirmationSelect;
    @FindBy(xpath = "(//*[@class='nice-select primary_select mb-25'])[3]")
    public WebElement paymentStatusSelect;
    @FindBy(xpath = "(//*[@class='nice-select primary_select mb-25'])[4]")
    public WebElement complationStatusSelect;
    @FindBy(xpath = "//*[@data-value='1']")
    public WebElement updateRandomSelectSub;
    @FindBy(xpath = "//*[@class='primary_btn_2']")
    public WebElement confirmUpdateButton;
    @FindBy(xpath = "//*[@class='toast-message']")
    public WebElement updateSuccesfully;
    @FindBy(xpath = "//*[@class='sorting_1']")
    public WebElement pendingOrderAction;
    @FindBy(xpath = "(//*[text()='Confirm'])[2]")
    public WebElement confirmedOrderSelect;
    @FindBy(xpath = "(//*[@class='update_active_status'])[1]")
    public WebElement confirmedRegisterSelect;
    @FindBy(xpath = "//*[@placeholder='Quick Search']")
    public WebElement pendingQuickSearch;
    @FindBy(xpath = "//*[text()='nobady@nobady.com']")
    public WebElement quickSearchResultText;
    @FindBy(xpath = "//*[text()='Confirmed Orders']")
    public WebElement confirmedOrderButtonLink;
    @FindBy(xpath = "(//tr[1]/td[1])[3]")
    public WebElement completedActionButton;
    @FindBy(xpath = "//span[2]/div/button")
    public WebElement completedSelectButton;
    @FindBy(xpath = "//span[2]/div/div/a")
    public WebElement completedDetail;
    @FindBy(xpath = "//*[text()='Completed Orders']")
    public WebElement completedOrderButtonLink;
    @FindBy(xpath = "(//*[@placeholder='Quick Search'])[2]")
    public WebElement confirmedQuickSearch;
    @FindBy(xpath = "(//label/input)[4]")
    public WebElement paymentSerchBox;
    @FindBy(xpath = "//*[text()='Pending Payment Orders']")
    public WebElement paymentOrderButtonLink;





//US37 AdminDashboard Side Bar'daki ilgili locate'ler
    @FindBy(xpath = "(//*[@class='nav_title'])[4]")
    public WebElement labelCustomer;
    @FindBy(xpath = "//*[text()='All Customer']")
    public WebElement labelAllCutomer;
    @FindBy(xpath = "//*[@id='all_customer']")
    public WebElement columnAllCustomerList;
    @FindBy(xpath = "//*[@*='Quick Search']")
    public WebElement searchBoxQuickSearch;
    @FindBy(xpath = "(//*[@id='active_checkbox265'])[1]")
    public WebElement iconIsActive;
    @FindBy(xpath = "(//*[text()='Active Customer'])[1]")
    public WebElement activeCustomerButton;
    @FindBy(xpath = "//*[text()='Inactive customer']")
    public WebElement inActiveCustomerButton;
    @FindBy(xpath = "(//*[@id='dropdownMenu2'])[11]")
    public WebElement dropDownSelect;
    @FindBy(xpath = "(//*[@class='dropdown-item'])[1]")
    public WebElement dropDownSelectDetailButton;
    @FindBy(xpath = "(//*[@class='dropdown-item'])[2]")
    public WebElement dropDownSelectEditButton;
    @FindBy(xpath = "(//*[@class='dropdown-item'])[3]")
    public WebElement dropDownSelectDeleteButton;
    @FindBy(id = "status_inactive")
    public WebElement radioButtonInactiveStatus;
    @FindBy(id = "save_button_parent")
    public WebElement updateButton;
    @FindBy(xpath = "//*[@id='delete_link']")
    public WebElement  popUpDeleteButton;

    @FindBy(xpath = "(//tr[1]/td[1])[1]")
    public WebElement allCustomerActionButton;
    @FindBy(xpath = "(//tr[1]/td[1])[2]")
    public WebElement activeCustomerActionButton;
    @FindBy(xpath = "(//tr[1]/td[1])[3]")
    public WebElement InActiveCustomerActionButton;

    @FindBy(xpath = "(//button[contains(text(),'Select')])[14]")
    public WebElement activeCustomerSelectButton;
    @FindBy(xpath = "(//button[contains(text(),'Select')])[2]")
    public WebElement allCustomerSelectButton;
    @FindBy(xpath = "(//button[contains(text(),'Select')])[25]")
    public WebElement inActiveCustomerSelectButton;

    @FindBy(xpath = "(//a[text()='Details'])[12]")
    public WebElement activeCustomerDetailButton;
    @FindBy(xpath = "(//a[text()='Details'])[23]")
    public WebElement inActiveCustomerDetailButton;

    @FindBy(xpath = "(//a[text()='Edit'])[12]")
    public WebElement activeCustomerEditButton;
    @FindBy(xpath = "(//a[text()='Edit'])[23]")
    public WebElement inActiveCustomerEditButton;

    @FindBy(xpath = "(//a[text()='Delete'])[12]")
    public WebElement activeCustomerDeleteButton;
    @FindBy(xpath = "(//a[text()='Delete'])[23]")
    public WebElement inActiveCustomerDeleteButton;

    @FindBy(xpath = "//*[text()='orders']")
    public WebElement ordersIsDisplayedText;
    @FindBy(xpath = "//*[text()='wallet histories']")
    public WebElement walletHistoriesIsDisplayedText;
    @FindBy(xpath = "//*[text()='Addresses']")
    public WebElement addressesIsDisplayedText;


    @FindBy(xpath = "(//*[@*='checkmark'])[2]")
    public WebElement basicInfoActiveButton;
    @FindBy(xpath = "(//*[@*='checkmark'])[1]")
    public WebElement basicInfoInActiveButton;

    @FindBy(xpath = "(//*[@*='white_box_50px box_shadow_white'])[1]")
    public WebElement customerProfileDetailWindow;







}
