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
    @FindBy(xpath = "//table//tr/th")
    public List<WebElement> tablePurchaseHistory;
    @FindBy(xpath = "(//*[@class='amazy_status_btn purchase_show'])[2]")
    public WebElement iconBurgerPurchase;
    @FindBy(xpath = "(//*[@class='amazy_status_btn'])[1]")
    public WebElement iconDownload;

    @FindBy(xpath = "(//a[@class=\"position-relative d-flex align-items-center\"])[3]")
    public WebElement linkMyOrder;
    @FindBy(xpath = "(//a[@class=\"position-relative d-flex align-items-center\"])[2]")
    public WebElement linkMyWishlist;
    @FindBy(xpath = "(//div[@class=\"nice-select amaz_select4\"])[2]")
    public WebElement linkNewBar;
    @FindBy(xpath = "//li[@data-value=\"new\"]")
    public WebElement linkNew;
    @FindBy(xpath = "//li[@data-value=\"old\"]")
    public WebElement linkOld;
    @FindBy(xpath = "//li[@data-value=\"low_to_high\"]")
    public WebElement linkLowtoHigh;
    @FindBy(xpath = "//li[@data-value=\"high_to_low\"]")
    public WebElement linkHightoLow;
    @FindBy(xpath = "(//div[@class=\"nice-select amaz_select4\"])[1]")
    public WebElement linkShowItemBar;
    @FindBy(xpath = "//li[@data-value=\"8\"]")
    public WebElement link8Item;
    @FindBy(xpath = "//li[@data-value=\"12\"]")
    public WebElement link12Item;
    @FindBy(xpath = "//li[@data-value=\"16\"]")
    public WebElement link16Item;
    @FindBy(xpath = "//li[@data-value=\"24\"]")
    public WebElement link24Item;
    @FindBy(xpath = "//li[@data-value=\"32\"]")
    public WebElement link32Item;
    @FindBy(xpath = "(//i[@class=\"ti-control-shuffle\"])[1]")
    public WebElement iconCompareInWishlist;
    @FindBy(xpath = "(//i[@class=\"ti-eye\"])[1]")
    public WebElement iconQuickViewInWishlist;
    @FindBy(xpath = "(//a[@class=\"removeWishlist\"])[1]")
    public WebElement iconDeleteInWishlist;
    @FindBy(xpath = "//div[@class=\"text-center\"]")
    public WebElement textDelete;
    @FindBy(xpath = "//form[@id=\"wishlist_delete_form\"]")
    public WebElement linkDelete;
    @FindBy(xpath = "//strong")
    public List<WebElement> textPriceOfProduct;
    @FindBy(xpath = "(//div[@class=\"product_thumb_upper\"])[1]")
    public WebElement imageFirst;
    @FindBy(xpath = "(//div[@class=\"product_thumb_upper\"])[2]")
    public WebElement imageSecond;

    @FindBy(xpath = "(//a[@href=\"https://qa.buysellcycle.com/product/buysellcycle/yuzuk\"])[2]")
    public WebElement linkFirstProduct;
    //@FindBy (xpath="(//div[@class='product_widget5 mb_30 style5 w-100'])[1]")
    // public WebElement linkFirstProduct;
    @FindBy(xpath = "(//a[@href=\"https://qa.buysellcycle.com/product/buysellcycle/blue-dress-1\"])[2]")
    public WebElement linkSecondProduct;
    @FindBy(xpath = "(//a[@title=\"Add to Cart\"])[1]")
    public WebElement iconAddToCartInWishlist;
    @FindBy(xpath = "(//div[@class=\"product_widget5 mb_30 style5\"])[1]")
    public WebElement linkFirstProductinWishlist;
    // @FindBy(xpath = "(//a[@href=\"https://qa.buysellcycle.com/product/buysellcycle/glee-baby-stroller\"])[2]")
    // public WebElement linkFirstProductinWishlist;
    public String selectedSecondProduct;
    public String selectedFirstProduct;
    public String actualFirstProduct;
    @FindBy(xpath = "//a[@href=\"https://qa.buysellcycle.com/my-wishlist\"]")
    public WebElement linkWishlistHeader;
    @FindBy(xpath = "(//a[@href=\"https://qa.buysellcycle.com/category/best_deals?item=product\"])[1]")
    public WebElement linkNewProductDeals;
    @FindBy(xpath = "//h5[@class=\"font_14 f_w_400 flex-fill mb-0\"]")
    public WebElement textOfResult;
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
    @FindBy(xpath = "(//label[@class='primary_checkbox d-inline-flex style4 gap_10 w-100'])[2]")
    public WebElement stripePayment;
    @FindBy(xpath = "//*[contains(text(),'Pay now')]")
    public WebElement payNowButton;
    @FindBy(xpath = "(//*[@tabindex='1'])[1]")
    public WebElement emailStripePaymentBox;
    @FindBy(xpath = "(//*[@tabindex='1'])[2]")
    public WebElement stripeCardNoBox;
    @FindBy(xpath = "(//*[@tabindex='1'])[3]")
    public WebElement expDateStripePaymentBox;
    @FindBy(xpath = "(//*[@tabindex='1'])[4]")
    public WebElement cvcStripePaymentBox;
    @FindBy(id = "submitButton")
    public WebElement submitPayment;
    @FindBy(xpath = "//div[@class='layoutView contentView']")
    public WebElement stripePaymentIframe;
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
    //Cart page ve yönlendirilen sayfa
    @FindBy(xpath = "//*[text()='Proceed to checkout']")
    public WebElement proceedToCheckoutButton;
    @FindBy(xpath = "//*[@class='checout_shiped_products']")
    public WebElement productDetailContentInCart;
    @FindBy(xpath = "//*[@class='total_amount d-flex align-items-center flex-wrap']")
    public WebElement labelTotalPrice;
    @FindBy(xpath = "//*[text()='Contact Information']")
    public WebElement labelContactInformationTitle;
    @FindBy(xpath = "//*[@name='news_letter']")
    public WebElement radioButtonSubscriber;
    @FindBy(xpath = "//*[@id='note']")
    public WebElement textBoxNote;
    @FindBy(xpath = "(//*[@class='label_name f_w_400 '])[2]")
    public WebElement radioButtonAgreeWithTheTermsAndConditions;
    @FindBy(xpath = "//*[@id='error_term_check']")
    public WebElement labelWarningText;
    @FindBy(xpath = "//*[text()='Return To Cart']")
    public WebElement returnToCartButton;
    @FindBy(xpath = "//*[@title='ads bar']")
    public WebElement imageAdsBar;
    @FindBy(xpath = "/html/body/div[3]/div/div/div[1]/div/div[2]/div/ul/li[12]/a")
    public WebElement linkSupportTicket;
    @FindBy(xpath = "//*[text()='Status']")
    public WebElement labelStatus;
    @FindBy(xpath = "//*[text()='Priority']")
    public WebElement labelPriority;


    //---- SUPPORT TICKET AYCA--------//
    @FindBy(xpath = "(//*[text()='Category'])[2]")
    public WebElement labelCategory;
    @FindBy(xpath = "//*[@id=\"dataShow\"]/div[2]/div/table/tbody/tr/td[6]/a")
    public WebElement actionDetailSupportTicketButton;
    @FindBy(xpath = "(//*[@class='ticket_view_box_body'])[1]")
    public WebElement labelCustomerMessage;
    @FindBy(xpath = "(//*[@class='ticket_view_box_body'])[2]")
    public WebElement labelAdminMessage;
    @FindBy(id = "replay_box_toggler")
    public WebElement replyButton;
    @FindBy(xpath = "//*[@class='note-editable']")
    public WebElement replyMessageBox;
    @FindBy(xpath = "//*[text()='Reply now']")
    public WebElement replyNowButton;
    @FindBy(xpath = "/html/body/script[4]/text()")
    public WebElement successMessagePopup;
    @FindBy(xpath = "(//*[text()='All Ticket'])[2]")
    public WebElement filterDropDownMenu;
    @FindBy(xpath = "//*[@id=\"dataShow\"]/div[1]/div/div/ul/li[1]")
    public WebElement allTicketSubMenu;
    @FindBy(xpath = "//*[@id=\"dataShow\"]/div[1]/div/div/ul/li[2]")
    public WebElement pendingSubMenu;
    @FindBy(xpath = "//*[@id=\"dataShow\"]/div[1]/div/div/ul/li[3]")
    public WebElement onGoingSubMenu;
    @FindBy(xpath = "//*[@id=\"dataShow\"]/div[1]/div/div/ul/li[4]")
    public WebElement completedSubMenu;
    @FindBy(xpath = "//*[@id=\"dataShow\"]/div[1]/div/div/ul/li[5]")
    public WebElement closedSubMenu;
    @FindBy(xpath = "//*[text()='+ Add New']")
    public WebElement addNewSupportTicketButton;
    @FindBy(xpath = "//*[text()='Create new ticket ']")
    public WebElement textCreateNewTicket;
    @FindBy(id = "subject")
    public WebElement subjectButton;
    @FindBy(xpath = "(//*[@class='nice-select theme_select style2 wide'])[1]")
    public WebElement categorySubmenu;
    @FindBy(xpath = "(//*[text()='Others'])[2]")
    public WebElement othersCategorySubMenuButton;
    @FindBy(xpath = "(//*[@class='nice-select theme_select style2 wide'])[2]")
    public WebElement priorityDropDownMenuButton;
    @FindBy(xpath = "(//*[text()='Medium'])[2]")
    public WebElement priorityMediumSubmenuButton;
    @FindBy(xpath = "//*[@class='note-editable']")
    public WebElement descriptionBox;
    @FindBy(xpath = "//*[text()='+ Create Now']")
    public WebElement createNowSupportTicketButton;
    @FindBy(xpath = "(//*[@class='font_14 f_w_500 mute_text'])[2]")
    public WebElement ticketFirstRow;
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
    // ====================== Beytullah's Steps =====================
    @FindBy(xpath = "//*[@id='code']")
    public WebElement labelReferralCode;
    @FindBy(xpath = "(//*[@class='position-relative d-flex align-items-center'])[9]")
    public WebElement buttonReferral;
    @FindBy(xpath = "//body//table//tr")
    public WebElement tableHead;
    @FindBy(xpath = "//*[text()='Delete']")
    public WebElement buttonDelete;
    @FindBy(xpath = "//*[@data-name='Stripe']")
    public WebElement stripeCheckRadioButton;
    @FindBy(xpath = "//*[@id='payment_btn_trigger']")
    public WebElement payNow;
    @FindBy(xpath = "//*[@class='close right']")
    public WebElement stripeEscape;
    @FindBy(xpath = "//*[@id='card_number']")
    public WebElement stripeCardNumberTextBox;
    @FindBy(xpath ="//*[text()='Empty List.']")
    public WebElement labelEmptyText;
    @FindBy (xpath = "//a[text()='View Order']")
    public  WebElement viewOrderButton;

    @FindBy (xpath = "//p[starts-with(text(),'Your order number is')]")
    public WebElement orderNumber;

    @FindBy (xpath = "//h3[text()='Order Summary']")
    public WebElement orderSummary;

    @FindBy(xpath = "(//span[@class='label_name f_w_500 '])[4]")
    public WebElement useADifferentBillingAddress;
    // ====================== End Of Beytullah's Steps End =====================
    @FindBy(xpath = "//*[@id='note']")
    public WebElement notePad;
    @FindBy(xpath = "//*[@id='coupon_code']")
    public WebElement couponBoxPaymentPage;
    @FindBy(xpath = "//button[text()='Apply']")
    public WebElement applyButtonCouponCode;
    //U27
    @FindBy(xpath = "(//a [@class='position-relative d-flex align-items-center'])[10]")
    public WebElement followMenuItem;
    @FindBys({
            @FindBy(xpath = "//th[starts-with(@class,'font_14 f_w_700 ')])")
    })
    public List<WebElement> followListHeaders;
    @FindBy(xpath = "//div[@class='dashboard_white_box bg-white mb_25']")
    public WebElement followListDashboard;
    @FindBy(xpath = "//button[@type='btn']")
    public WebElement unFollowButton;
    @FindBy(xpath = "//p[text()='Empty List.']")
    public WebElement emptyText;
    @FindBy(xpath = "//table[@class='table amazy_table style4 mb-0']//tbody/tr/td[1]")
    public WebElement followSeller;

    public WebElement selectItemBar(int item) {
        return Driver.getDriver().findElement(By.xpath("//li[@data-value='" + item + "']"));
    }

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

    public void orderPayButton(String string) {
        WebElement element = Driver.getDriver().findElement(By.xpath("(//a[text()='+string+'])"));
        waitAndClick(element);
    }


}
