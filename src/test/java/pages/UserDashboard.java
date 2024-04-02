package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import utils.Driver;

import java.util.List;

public class UserDashboard extends Base {

    //Dashboard>> Purchase History page
    @FindBy(xpath = "(//*[@class='position-relative d-flex align-items-center'])[1]")
    public WebElement linkPurchaseHistory;
    @FindBy(css = ".font_20.f_w_700.mb-0 ")
    public WebElement labelPurchaseHistory;
    @FindBy(xpath = "//table//tr/th")
    public List<WebElement> tablePurchaseHistory;
    @FindBy(xpath = "(//*[@class='amazy_status_btn purchase_show'])[2]")
    public WebElement iconBurgerPurchase;
    @FindBy(xpath = "(//*[@class='amazy_status_btn'])[1]")
    public WebElement iconDownload;

    @FindBy(xpath = "(//a[@class=\"position-relative d-flex align-items-center\"])[3]")
    public WebElement linkMyOrder;
    @FindBy(xpath = "//button[@id=\"home-tab\"]")
    public WebElement linkAll;
    @FindBy(xpath = "//button[@id=\"Pay-tab\"]")
    public WebElement linkToPay;
    @FindBy(xpath = "//button[@id=\"Ship-tab\"]")
    public WebElement linkToShip;
    @FindBy(xpath = "//button[@id=\"Receive-tab\"]")
    public WebElement linkToReceive;
    @FindBy(xpath = "//div[@class=\"nice-select amaz_select5\"]")
    public WebElement linkProductNumber;
    @FindBy(xpath = "//a[@class=\"amaz_primary_btn gray_bg_btn min_200 radius_3px ml_10 order_cancel_by_id\"]")
    public WebElement linkCancelOrder;
    @FindBy(xpath = "//a[@class=\"amaz_primary_btn gray_bg_btn radius_3px order_cancel_by_id\"]")
    public WebElement linkCancelOrderDetailPage;
    @FindBy(xpath = "(//p[@class=\"font_14 f_w_400 m-0 lh-base\"])[3]")
    public WebElement textStatus;
    @FindBy(xpath = "(//a[@class=\"amaz_primary_btn style2 text-nowrap \"])[1]")
    public WebElement linkOrderDetail;
    @FindBy(xpath = "(//div[@class=\"white_box_header d-flex align-items-center gap_20 flex-wrap  amazy_bb3 justify-content-between \"])[1]")
    public WebElement textOrderPage;
    @FindBy(xpath = "//div[@class=\"order_prise d-flex justify-content-between gap-2 flex-wrap amazy_bb2 pb_11 mb_10\"]")
    public WebElement textPackage;

    @FindBy(xpath = "//button[text()='Continue To Shipping']")
    public WebElement continueToShippingButton;
    @FindBy(xpath = "(//*[text()='Cart ('])[1]")
    public WebElement cartLinkOnTheTop;
    @FindAll({
            @FindBy(xpath = "//div[@class='single_shipingV3_info d-flex align-items-start']")
    })
    public List<WebElement> informationList;
    @FindBy(xpath = "(//*[@class='nice-select-search-box'])[3]")
    public WebElement allHistoryFilter;
    @FindBy(xpath = "//*[@data-value='confirm']")
    public WebElement pendingPurchase;
    @FindBy(xpath = "//a[text()='Delivered']")
    public WebElement pendingText;
    @FindBy(xpath = "(//*[@class='font_16 f_w_700 m-0'])[1]")
    public WebElement historyOrderSumText;
    @FindBy(xpath = "//*[@class='summery_modal_body']")
    public WebElement invoicePageText;
    @FindBy(xpath = "//*[text()='No Gateway']")
    public WebElement paymentTypeText;
    @FindBys({
            @FindBy(xpath = "//*[@class='accordion-item']")
    })
    public List<WebElement> radioButtonListOnSelectPaymentPage;
    @FindBy(xpath = "//*[text()='Order Now']")
    public WebElement orderNowButton;
    @FindBy (xpath= "(//label[@class='primary_checkbox d-inline-flex style4 gap_10 w-100'])[2]")
    public WebElement stripePayment;

    @FindBy(xpath = "//*[text()='Order Now']")
    public WebElement payNowButton;

    public void orderPayButton (String string){
        WebElement element = Driver.getDriver().findElement(By.xpath("(//a[text()='+string+'])"));
        waitAndClick(element);
    }

    //________________________ valid user Login____________________-
    @FindBy(xpath = "//*[@id='text']")
    public WebElement loginEmail;
    @FindBy(xpath = "//*[@id='password']")
    public WebElement loginPassword;
    @FindBy(xpath = "//*[@id='sign_in_btn']")
    public WebElement sigInButton;
    //________________________ WishList____________________-
    @FindBy(xpath = "/html/body/div[3]/div/div/div[1]/div/div[2]/div/ul/li[3]")
    public WebElement myWishListMenu;
    @FindBy(xpath = "/html/body/div[3]/div/div/div[1]/div/div[2]/div/ul/li[7]")
    public WebElement myCouponsListMenu;
    @FindBy(xpath = "//*[@id=\"productShow\"]/div/div[1]/h5")
    public WebElement resultsWishlist;
    @FindBy(xpath = "(//*[@class=\"current\"])[3]")
    public WebElement show8Items;
    @FindBy(xpath = "(//*[@class=\"option\"])[1]")
    public WebElement show12Items;
    @FindBy(xpath = "(//*[@class=\"option\"])[2]")
    public WebElement show16Items;
    @FindBy(xpath = "(//*[@class=\"current\"])[4]")
    public WebElement newDDM;
    @FindBy(xpath = "(//*[@class=\"option\"])[6]")
    public WebElement priceLowToHigh;
    @FindBy(xpath = "(//*[@class=\"option\"])[7]")
    public WebElement priceHighToLow;
    @FindBy(xpath = "//*[@id=\"productShow\"]/div/div[2]/div/div[1]/div/div[3]/div/p/strong")
    public WebElement pruduct1;
    @FindBy(xpath = "//*[@id=\"productShow\"]/div/div[2]/div/div[2]/div/div[3]/div/p/strong")
    public WebElement pruduct2;
    @FindBy(xpath = "//*[@id=\"productShow\"]/div/div[2]/div/div[3]/div/div[3]/div/p/strong")
    public WebElement pruduct3;
    @FindBy(xpath = "//i[@title=\"Compare\"]")
    public WebElement comparePruduct;
    @FindBy(xpath = "//i[@title=\"Quick View\"]")
    public WebElement quickViewButton;
    @FindBy(xpath = "//i[@title=\"Delete\"]")
    public WebElement deleteButton;
    @FindBy(id = "add_to_compare_btn")
    public WebElement addToCompare;
    @FindBy(xpath = "//*[@class=\"compare_count\"]")
    public WebElement compareCount;
    @FindBy(xpath = "//*[@class=\"product_details_img\"]")
    public WebElement puroductDetails;
    @FindBy(id = "add_to_cart_btn_modal")
    public WebElement addToCart;
    @FindBy(id = "dataDeleteBtn")
    public WebElement dataDeleteBtn;
    @FindBy(xpath = "//*[text()='Item added to your cart']")
    public WebElement itemAdded;
    @FindBy(xpath = "(//*[@class=\"close_modal_icon\"])[3]")
    public WebElement closePage;
    @FindBy(xpath = "(//*[@class=\"close_modal_icon\"])[2]")
    public WebElement closePage2;
    @FindBy(xpath = "//*[@class='fas fa-chevron-right']")
    public WebElement nextPage;
    //________________________ Add Couppons____________________-
    @FindBy(xpath = "//*[@placeholder=\"Code\"]")
    public WebElement codePlaceHolder;
    @FindBy(xpath = "//button[@class=\"amaz_primary_btn style2 text-nowrap \"]")
    public WebElement addCouppon;
    @FindBy(xpath = "//*[@id=\"couponDiv\"]/div/div/table/tbody/tr/td[3]")
    public WebElement coupponCode;
    @FindBy(xpath = "(//*[@width=\"15\"])[2]")
    public WebElement coppyCode;
    @FindBy(id = "Path_4222")
    public WebElement deleteCouppon;
    @FindBy(xpath = "(//*[@type=\"submit\"])[3]")
    public WebElement deleteSure;
    @FindBy(xpath = "//*[@id=\"couponDiv\"]/p")
    public WebElement emptyList;
    //Dashboard link and user detail informations
    @FindBy(xpath = "(//*[text()='Dashboard'])[1]")
    public WebElement linkHeaderDashboard;
    @FindBy(xpath = "//*[@class='customer-info-content d-flex align-items-center flex-wrap']")
    public WebElement labelUserProfileInformationText;
    @FindBy(xpath = "//*[@class='w-100 text-center']")
    public WebElement labelUserBalanceInformationText;
    @FindBy(xpath = "//*[text()='Last transaction']")
    public WebElement labelLastTransactionText;
    @FindBy(xpath = "//*[@class='dashBoard_cart_boxs mb_25 dynamic_svg']")
    public WebElement labelSummaryInformationBoards;
    @FindBy(xpath = "(//*[@class='single_cart_box d-flex align-items-center justify-content-center text-center flex-column'])[1]")
    public WebElement labelSummaryInformationBoard1;
    //Dashboard Body kısmındaki Purchase History, My Wishlist, Recent Order,Product in Cart) bilgileri
    @FindBy(xpath = "(//*[@class='col-lg-6 '])[1]")
    public WebElement columnPurchaseHistory;
    @FindBy(xpath = "(//*[@class='col-lg-6 '])[2]")
    public WebElement columnMyWishlist;
    @FindBy(xpath = "(//*[@class='col-lg-6 '])[3]")
    public WebElement columnRecentOrder;
    @FindBy(xpath = "(//*[@class='col-lg-6 '])[4]")
    public WebElement columnProductInCart;
    //Logout link
    @FindBy(xpath = "//*[text()='/ Logout']")
    public WebElement linkHeaderLogout;
    //Dashboard Side bar logout link
    @FindBy(xpath = "//*[@class='position-relative d-flex align-items-center log_out']")
    public WebElement linkDassboardSideBarLogout;
    //Cart page
    @FindBy(xpath = "//*[text()='Proceed to checkout']")
    public WebElement proceedToCheckoutButton;
    @FindBy(xpath = "//*[@class='checout_shiped_products']")
    public WebElement productDetailContentInCart;
    @FindBy(xpath = "//*[@class='total_amount d-flex align-items-center flex-wrap']")
    public WebElement labelTotalPrice;
    @FindBy(xpath = "(//*[@class='position-relative d-flex align-items-center '])[2]")
    public WebElement linkSupportTicket;
    @FindBy(xpath = "//tr/th")
    public WebElement labelTicketTitle;


    //---- SUPPORT TICKET AYCA--------//
    //=========Notifications links ve buttons=======================
    @FindBy(xpath = "(//a[@class='position-relative d-flex align-items-center'])[11]")
    public WebElement buttonNotification;
    @FindBy(xpath = "(//span[@class='font_14 f_w_500 mute_text'])[2]")
    public WebElement textNotification;
    @FindBy(xpath = "(//span[@class='font_14 f_w_500 mute_text'])[3]")
    public WebElement dateNotification;
    @FindBy(xpath = "(//a[@class='amaz_badge_btn4 text-nowrap text-capitalize text-center'])[1]")
    public WebElement buttonView;
    @FindBy(xpath = "(//h4[@class='font_14 f_w_500 m-0 lh-base'])[1]")
    public WebElement textOrderId;
    @FindBy(xpath = "//*[@class='amaz_primary_btn style7 text-nowrap radius_3px']")
    public WebElement buttonSetting;
    @FindBy(xpath = "(//span[@class='checkmark mr_15'])[1]")
    public WebElement buttonEventType;
    @FindBy(xpath = "selector-for-your-ticket-list")
    private List<WebElement> ticketListElements;

    public void tableCellDisplayed(int number) {
        for (int i = 0; i < number; i++) {
            tablePurchaseHistory.get(number).isDisplayed();
        }

    }

    public void verifyTheInformationsVisibility(String searchText) {

        boolean found = false;

        for (WebElement element : informationList) {
            String text = element.getText();

            if (text.contains(searchText)) {
                found = true;
                break;
            }
        }

        Assert.assertTrue(found);
    }


}
