package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminDashboard extends Base{


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
