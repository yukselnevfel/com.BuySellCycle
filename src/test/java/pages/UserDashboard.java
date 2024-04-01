package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

public class UserDashboard extends Base{

   //Dashboard>> Purchase History page
    @FindBy(xpath = "(//*[@class='position-relative d-flex align-items-center'])[1]")
    public WebElement linkPurchaseHistory;

    //Dashboard>> Purchase History link
    @FindBy(css = ".font_20.f_w_700.mb-0 ")
    public WebElement labelPurchaseHistory;

    //Dashboard>> Purchase History Table
    @FindBy (xpath = "//table//tr/th")
    public List<WebElement> tablePurchaseHistory;

    public void tableCellDisplayed(int number){
        for (int i = 0; i < number; i++) {
            tablePurchaseHistory.get(number).isDisplayed();
        }

    }
@FindBy(xpath = "//button[text()='Continue To Shipping']")
public WebElement continueToShippingButton;

    @FindBy(xpath = "(//*[text()='Cart ('])[1]")
    public WebElement cartLinkOnTheTop;

    @FindAll({
            @FindBy(xpath = "//div[@class='single_shipingV3_info d-flex align-items-start']")
    })
    public List<WebElement> informationList;


    public void verifyTheInformationsVisibility (String searchText) {

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

    @FindBys({
            @FindBy(xpath = "//*[@class='accordion-item']")
    })
    public List<WebElement> radioButtonListOnSelectPaymentPage;

    @FindBy (xpath = "//*[text()='Order Now']")
    public WebElement orderNowButton;

     //________________________ valid user Login____________________-
    @FindBy(xpath = "//*[@id='text']") public WebElement loginEmail;
    @FindBy(xpath = "//*[@id='password']") public WebElement loginPassword;
    @FindBy(xpath = "//*[@id='sign_in_btn']") public WebElement sigInButton;
    //________________________ WishList____________________-
    @FindBy(xpath = "/html/body/div[3]/div/div/div[1]/div/div[2]/div/ul/li[3]") public WebElement myWishListMenu;
    @FindBy(xpath = "//*[@id=\"productShow\"]/div/div[1]/h5") public WebElement resultsWishlist;
    @FindBy(xpath = "(//*[@class=\"current\"])[3]") public WebElement show8Items;
    @FindBy(xpath = "(//*[@class=\"option\"])[1]") public WebElement show12Items;
    @FindBy(xpath = "(//*[@class=\"option\"])[2]") public WebElement show16Items;
    @FindBy(xpath = "(//*[@class=\"current\"])[4]") public WebElement newDDM;
    @FindBy(xpath = "(//*[@class=\"option\"])[6]") public WebElement priceLowToHigh;
    @FindBy(xpath = "(//*[@class=\"option\"])[7]") public WebElement priceHighToLow;
    @FindBy(xpath = "//*[@id=\"productShow\"]/div/div[2]/div/div[1]/div/div[3]/div/p/strong") public WebElement pruduct1;
    @FindBy(xpath = "//*[@id=\"productShow\"]/div/div[2]/div/div[2]/div/div[3]/div/p/strong") public WebElement pruduct2;
    @FindBy(xpath = "//*[@id=\"productShow\"]/div/div[2]/div/div[3]/div/div[3]/div/p/strong") public WebElement pruduct3;
    @FindBy(xpath = "//i[@title=\"Compare\"]") public WebElement comparePruduct;
    @FindBy(id = "add_to_compare_btn") public WebElement addToCompare;
    @FindBy(xpath = "//*[@class=\"compare_count\"]") public WebElement compareCount;




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
    @FindBy (xpath = "//*[text()='/ Logout']")
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


   //---- SUPPORT TICKET AYCA--------//

   @FindBy (xpath = "(//*[@class='position-relative d-flex align-items-center '])[2]")
   public WebElement linkSupportTicket;

   @FindBy (xpath = "//tr/th")
    public WebElement labelTicketTitle;

   @FindBy(xpath = "selector-for-your-ticket-list")
    private List<WebElement> ticketListElements;





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










    }
