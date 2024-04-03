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
    @FindBy(xpath = "//*[@class='toast-close-button']")
    public WebElement popUpCloseMessage;
    @FindBy(xpath = "//*[@id='profile_pic']")
    public WebElement iconAdminProfile;
    @FindBy(xpath = "//h5")
    public WebElement textName;

    @FindBy(xpath = "//*[text()='My Profile']")
    public WebElement linkMyProfile;
    @FindBy(xpath = "//*[text()='Log out']")
    public WebElement linkLogOut;

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
    @FindBy(xpath = "//*[text()='Notifications']")
    public WebElement notificationListText;
    @FindBy(xpath = "//*[@class='sorting_1']")
    public WebElement notificiationRelevantActionButton;
    @FindBy(xpath = "//*[@href='https://qa.buysellcycle.com/ordermanage/total-sales-list']")
    public WebElement notificiationRelevantViewButton;
    @FindBy(xpath = "//*[@class='btn btn-secondary dropdown-toggle']")
    public WebElement notificiationRelevantSelectButton;
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






}
