package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

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
    @FindBy(xpath = "//*[@href='https://qa.buysellcycle.com/customer/active-customer-list']")
    public WebElement demoRegesterVievButton;
    @FindBy(xpath = "//*[text()='Notifications']")
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
@FindBy(xpath = "(//*[@class=\"primary_input_field\"])[2]") public WebElement sku;
@FindBy(xpath = "(//*[@class=\"primary_input_field\"])[6]") public WebElement modelNumber;
@FindBy(xpath = "(//*[@class=\"primary_input_field\"])[7]") public WebElement minOrder;
@FindBy(xpath = "(//*[@class=\"primary_input_field\"])[8]") public WebElement maxOrder;
@FindBy(xpath = "//*[@id=\"select2-brand_id-container\"]") public WebElement brand;
@FindBy(xpath = "//*[@id=\"GenaralInfo\"]/div/div[1]/div/div[1]/div[12]/div/div") public WebElement barcodeType;
@FindBy(xpath = "//*[@class=\"select2-selection__rendered\"]") public WebElement categoryProduct;
@FindBy(xpath = "//*[@class=\"select2-results__option\"]") public WebElement electronic;
@FindBy(xpath = "//*[@class=\"nice-select primary_select mb-15 unit\"]") public WebElement unitProduct;
@FindBy(xpath = "//*[@id=\"unit_select_div\"]/div/div[2]/ul/li[6]") public WebElement pair;
@FindBy(xpath = "//*[@id=\"selling_price\"]") public WebElement sellinPrice;
@FindBy(xpath = "//*[@data-value=\"save_publish\"]") public WebElement savePublish;
@FindBy(xpath = "//*[@data-value=\"only_save\"]") public WebElement saveOnly;
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
@FindBy(xpath = "//*[@id=\"add_new_category\"]") public WebElement categoryAddNew;
@FindBy(xpath = "//*[@id=\"add_new_brand\"]") public WebElement brandAddNew;
@FindBy(xpath = "//*[@id=\"add_new_unit\"]") public WebElement unitAddNew;
@FindBy(xpath = "//*[@class=\"close \"]") public WebElement closePage;
@FindBy(xpath = "(//*[@class=\"close \"])[2]") public WebElement closePage2;
@FindBy(xpath = "(//*[@class=\"primary_input_field\"])[9]") public WebElement weight;
@FindBy(xpath = "(//*[@class=\"primary_input_field\"])[10]") public WebElement lenght;
@FindBy(xpath = "(//*[@class=\"primary_input_field\"])[11]") public WebElement breadth;
@FindBy(xpath = "(//*[@class=\"primary_input_field\"])[12]") public WebElement height;
@FindBy(xpath = "(//*[@class=\"primary_input_field\"])[13]") public WebElement asc;
@FindBy(xpath = "//*[@id=\"GenaralInfo\"]/div/div[2]/div/div[1]/div[2]/div/div[2]") public WebElement uploadedImage;





}
