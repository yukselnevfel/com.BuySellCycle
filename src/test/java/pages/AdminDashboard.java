package pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class AdminDashboard extends Base{

    // -------------------------Beytullah's Locates----------------------------
    @FindBy(xpath = "(//input[@type='text'])[1]")
    public WebElement searchBoxAdminDashboard;
    //*[@class='toast-message']
    @FindBy(xpath = "//*[@class='toast-message']")
    public WebElement popUpMessage;
    @FindBy(xpath = "//*[@class='toast-close-button']")
    public WebElement popUpCloseMessage;
    @FindBy(xpath = "//div[@class='user_avatar_div']")
    public WebElement iconAdminProfile;
    @FindBy(xpath = "//h3[normalize-space()='Basic Info']")
    public WebElement basicInfoText;
    @FindBy(className = "user_avatar_div")
    public WebElement imageProfile;
    @FindBy(className = "profile_info_iner")
    public WebElement subMenuProfile;
    @FindBy(xpath = "//*[text()='My Profile']")
    public WebElement linkMyProfile;
    @FindBy(xpath = "//*[@class='toast-close-button']")
    public WebElement iconCloseSuccessMessage;
    @FindBy(xpath = "//*[text()='Basic Info']")
    public WebElement labelBasicInfo;
    @FindBy(xpath = "(//*[@class='primary_input_label'])[1]")
    public WebElement labelFirstNameText;
    @FindBy(xpath = "(//*[@class='primary_input_label'])[2]")
    public WebElement labelLastNameText;
    @FindBy(xpath = "(//*[@class='primary_input_label'])[3]")
    public WebElement labelEmailText;
    @FindBy(xpath = "(//*[@class='primary_input_label'])[4]")
    public WebElement labelPhoneNumberText;
    @FindBy(xpath = "(//*[@class='primary_input_label'])[5]")
    public WebElement labelDateOfBirthText;
    @FindBy(xpath = "//*[@class='primary-btn small fix-gr-bg']")
    public WebElement buttonAvatar;
    @FindBy(xpath = "//*[@id='update_info']")
    public WebElement buttonUpdate;
    public void verifyVisible(WebElement element){
        element.isDisplayed();
    }
    public void verifyEnable(WebElement element){
        element.isDisplayed();
        element.isEnabled();
    }
    @FindBy(xpath = "//*[@class='primary_input_field first_name']")
    public WebElement textBoxfirstName;
    @FindBy(xpath = "//*[@class='primary_input_field phone']")
    public WebElement textBoxPhoneNumber;
    @FindBy(xpath = "//*[@class='toast-message']")
    public WebElement labelSuccessMessage;
    @FindBy(xpath = "(//*[@class='nav-link'])[1]")
    public WebElement buttonChangePassword;
    @FindBy(xpath = "(//*[@class='nav-link'])[2]")
    public WebElement buttonAddress;
    @FindBy(xpath = "(//*[@class='mb-0 mr-30 mb_xs_15px mb_sm_20px'])[2]")
    public WebElement labelChangePassword;
    public void clickVerification(WebElement element1,WebElement element2){
        element1.click();
        wait(3);
        assertTrue(element2.isDisplayed());
    }
    @FindBy(xpath = "//*[@id='currentPassword']")
    public WebElement textBoxCurrentPassword;
    @FindBy(xpath = "//*[@id='newPass']")
    public WebElement textBoxNewPassword;
    @FindBy(xpath = "//*[@id='rePass']")
    public WebElement textBoxRePassword;
    @FindBy(xpath = "//*[@class='primary-btn semi_large2 fix-gr-bg change_password']")
    public WebElement buttonUpdateChangePassword;
    @FindBy(xpath = "//*[@class='primary-btn radius_30px mr-10 fix-gr-bg add_new_address']")
    public WebElement buttonAddNewAddress;
    @FindBy(xpath = "(//*[@id='address_table'])[1]")
    public WebElement tableAddressInformation;
    @FindBy(xpath = "(//*[@class='primary-btn semi_large2 fix-gr-bg float-none'])[1]")
    public WebElement buttonSaveAddress;
    @FindBy(xpath = "//*[@id='address_name']")
    public WebElement textBoxNameAddress;
    @FindBy(xpath = "//*[@id='Email_Address1']")
    public WebElement textBoxEmailAddress;
    @FindBy(xpath ="//*[@id='customer_phn']")
    public WebElement textBoxPhoneAddress;
    @FindBy(xpath = "//*[@id='Address']")
    public WebElement textBoxAddress;
    @FindBy(xpath = "(//*[@class='nice-select form-control primary_select'])[1]")
    public WebElement dropDownCountry;
    @FindBy(xpath = "(//*[@class='nice-select form-control primary_select'])[2]")
    public WebElement dropDownState;
    @FindBy(xpath = "(//*[@class='nice-select form-control primary_select'])[3]")
    public WebElement dropDownCity;
    @FindBy(xpath ="//*[@id='postal_code']")
    public WebElement textBoxPostalCode;
    public void addInfo(){
        textBoxNameAddress.sendKeys("Home");
        textBoxEmailAddress.sendKeys("nobody@nobody.com");
        textBoxPhoneAddress.sendKeys("123456789");
        textBoxAddress.sendKeys("Everywhere");
        dropDownState.sendKeys("Newyork");
        dropDownCity.sendKeys("NewyorkCity");
        textBoxPostalCode.sendKeys("45454545");
        buttonSaveAddress.click();
    }
    @FindBy(xpath = "//*[text()='Something Went Wrong!']")
    public WebElement labelErrorMessage;
    @FindBy(xpath = "//*[@id='address_form']//button")
    public WebElement buttonSave;
    @FindBy(xpath = "//li[normalize-space()='Albania']")
    public WebElement subMenuSelectFromOptions;

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
    @FindBy(xpath = "(//*[@id='main-content']//a/span[1])[1]")
    public WebElement iconNotificiatonCount;
    @FindBy(xpath = "//*[text()='Setting']")
    public WebElement linkNotificiationSetting;
    @FindBy(xpath = "//*[@class='mb-0 mr-30 mb_xs_15px mb_sm_20px']")
    public WebElement labelNotificationSetText;
    @FindBy(xpath = "(//*[@id='status'])[1]")
    public WebElement togleAktivePassive;
    @FindBy(xpath = "//*[@href='https://qa.buysellcycle.com/profile/mark-as-read']")
    public WebElement notificiationReadAllButton;
    @FindBy(xpath = "(//*[@id='main-content']//a[3])[1]")
    public WebElement notificiationViewButton;
    @FindBy(xpath = "//*[@class='notify_content']")
    public WebElement noNotificiationtext;
    @FindBy(xpath = "//*[@href='https://qa.buysellcycle.com/customer/active-customer-list']")
    public WebElement demoRegesterVievButton;
    @FindBy(xpath = "(//*[text()='Notifications'])[2]")
    public WebElement notificationListText;
    @FindBy(xpath = "//*[@href='https://qa.buysellcycle.com/ordermanage/total-sales-list']")
    public WebElement notificiationRelevantViewButton;
    @FindBy(xpath = "//*[@class='btn btn-secondary dropdown-toggle']")
    public WebElement notificiationRelevantSelectButton;
    @FindBy(xpath = "(//*[@id='dropdownMenu2'])[13]")
    public WebElement confirmedSelectButton;
    @FindBy(xpath = "(//tr[1]/td[1])[2]")
    public WebElement confirmedActionButton;
    @FindBy(xpath = "(//td[1])[1]")
    public WebElement pendingActionButton;
    @FindBy(xpath = "//span//div/a[1]")
    public WebElement pendingDetails;
    @FindBy(xpath = "//span[2]/div/button")
    public WebElement pendingSelectButton;
    @FindBy(xpath = "(//*[text()='Details'])[13]")
    public WebElement confirmedDetailsSelect;
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
    @FindBy(xpath = "//*[@data-value='1']")
    public WebElement updateRandomSelectSub;
    @FindBy(xpath = "//*[@id='add_product']//button")
    public WebElement confirmUpdateButton;
    @FindBy(xpath = "//*[@id='toast-container']/div/div[2]")
    public WebElement updateSuccesfully;
    @FindBy(xpath = "(//*[@class='dropdown-item'])[4]")
    public WebElement pendingconfirmedOrder;
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
    @FindBy(xpath = "//span[2]/div/div/a")
    public WebElement completedDetail;
    @FindBy(xpath = "(//*[@placeholder='Quick Search'])[3]")
    public WebElement completedQuickSearch;
    @FindBy(xpath = "//*[text()='Completed Orders']")
    public WebElement completedOrderButtonLink;
    @FindBy(xpath = "(//*[@placeholder='Quick Search'])[2]")
    public WebElement confirmedQuickSearch;
    @FindBy(xpath = "(//label/input)[4]")
    public WebElement paymentSerchBox;
    @FindBy(xpath = "//*[text()='Pending Payment Orders']")
    public WebElement paymentOrderButtonLink;
    @FindBy(xpath = "(//tr[1]/td[1])[4]")
    public WebElement paymentActionButton;
    @FindBy(xpath = "(//button[contains(text(),'Select')])[32]")
    public WebElement paymentSelectButton;
    @FindBy(xpath = "(//a[text()='Details'])[32]")
    public WebElement paymentDetailsLink;
    @FindBy(xpath = "//*[@id='5']")
    public WebElement refusedCancelledButtonLink;
    @FindBy(xpath = "(//tr[1]/td[1])[5]")
    public WebElement refusedCancelledActionButton;
    @FindBy(xpath = "(//button[contains(text(),'Select')])[46]")
    public WebElement refusedCancelledSelectButton;
    @FindBy(xpath = "(//a[text()='Details'])[46]")
    public WebElement refusedCancelledDetailsLink;
    @FindBy(xpath = "(//*[@class='primary_input_label red'])[2]")
    public WebElement orderCancelledText;
    @FindBy(xpath = "//*[@id='canceledTable']/tbody/tr/td[4]")
    public List<WebElement> refusedSearchResult;
    @FindBy(xpath = "(//*[@*='Quick Search'])[5]")
    public WebElement refusedQuickSerchBox;
    @FindBy(xpath = "//*[@id='pendingPaymentTable']/tbody/tr/td[4]")
    public List<WebElement> paymentSearchResult;
    @FindBy(xpath = "//*[@id='completedTable']/tbody//td[4]")
    public List<WebElement> completedSearchResult;
    @FindBy(xpath = "//*[@id='confirmedTable']/tbody//td[4]")
    public List<WebElement> confirmedSearchResult;






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




    //   ================================  SAMET ===========================
    //--------------------------- Ad New Product --------------------------
@FindBy(xpath = "(//*[@class=\"nav_title\"])[8]") public WebElement puroductsMenu;
@FindBy(xpath = "//*[@class=\"checkmark\"]") public WebElement checkMark;
@FindBy(xpath = "(//*[@class=\"checkmark\"])[2]") public WebElement checkMark2;
@FindBy(xpath = "(//*[@class=\"primary_input_field\"])[1]") public WebElement nameProduct;
@FindBy(xpath = "//*[@class=\"select2-selection__rendered\"]") public WebElement categoryProduct;
@FindBy(xpath = "//*[@class=\"select2-results__option\"]") public WebElement electronic;
@FindBy(xpath = "//*[@class=\"nice-select primary_select mb-15 unit\"]") public WebElement unitProduct;
@FindBy(xpath = "//*[@id=\"unit_select_div\"]/div/div[2]/ul/li[6]") public WebElement pair;
@FindBy(xpath = "//*[@id=\"selling_price\"]") public WebElement sellinPrice;
@FindBy(xpath = "//*[@data-value=\"save_publish\"]") public WebElement savePublish;
@FindBy(xpath = "//*[@placeholder=\"Choose Images\"]") public WebElement chooseImages;
@FindBy(xpath = "(//*[@class=\"img-box\"])[3]") public WebElement secilecekResim;
@FindBy(xpath = "//*[@id=\"media_modal\"]/div/div/div[3]/div/div[2]/button[3]") public WebElement addFilesButton;
@FindBy(xpath = "//*[@id=\"2\"]") public WebElement related;
@FindBy(xpath = "//*[@id=\"1\"]") public WebElement generalInformation;
@FindBy(xpath = "//*[@id=\"3\"]") public WebElement upSale;
@FindBy(xpath = "//*[@id=\"4\"]") public WebElement crossSale;
@FindBy(id = "rsearch_products") public WebElement searchB;
@FindBy(xpath = "(//*[@class=\"primary_checkbox d-flex\"") public WebElement relatedProduct;
@FindBy(xpath = "//*[@id=\"up_sale_17\"]") public WebElement upSaleProduct;
@FindBy(xpath = "//*[@id=\"cross_sale_18\"]") public WebElement crossSaleProduct;
@FindBy(xpath = "//*[@id=\"GenaralInfo\"]/div/div[1]/div/div[1]/div[15]/div[2]/div/input") public WebElement tags;
@FindBy(xpath = "(//*[@class=\"product_thumb_upper\"])[1]") public WebElement myProduct;
@FindBy(xpath = "/html/body/div[3]/div/div/div[1]/div/div[2]/div[1]/h3") public WebElement updatedProduct;
@FindBy(xpath = "/html/body/div[3]/div/div/div[1]/div/div[2]/div[2]/h4") public WebElement upSellUrun;
@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div/h3") public WebElement relatedUrun;
@FindBy(xpath = "/html/body/div[3]/div/div/div[1]/div/div[4]/div[1]/div/div/h3") public WebElement crossUrun;




}
