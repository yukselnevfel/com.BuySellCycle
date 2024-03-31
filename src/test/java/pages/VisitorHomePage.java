package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import utils.Driver;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class VisitorHomePage extends Base {


    //Register User Login Locate Homepage>> LoginButton AYCA LOCATE
    @FindBy(xpath = "(//*[text()='Login'])[1]")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@class='img-fluid']")
    public WebElement imageLoginPage;

    @FindBy(xpath = "//*[text()='Turn your ideas into reality..']")
    public WebElement textTurnIdea;


    @FindBy(xpath = "//*[@id='login_form']")
    public WebElement loginForm;

    @FindBy(xpath = "//*[@id='sign_in_btn']")
    public WebElement signInButton;

    @FindBy(xpath = "//*[text()='Remember me']")
    public WebElement checkBoxRememberMe;

    @FindBy(xpath = "//*[@id='text']")
    public WebElement textBoxUserEmail;

    @FindBy (xpath="//*[@id='password']")
    public WebElement textBoxUserPassword;

    @FindBy(xpath = "//*[text()='Forgot Password? ']")
    public WebElement textBoxForgotPassword;

    @FindBy(xpath = "//*[text()='Click Here']")
    public WebElement linkLoginClickHere;

    @FindBy(xpath = "//*[text()='Don’t have an Account? ']")
    public WebElement textBoxHaveAnAccount;

    @FindBy(xpath = "//*[text()='Sign Up']")
    public WebElement linkLoginSignUp;

    @FindBy(xpath = "//*[text()='These credentials do not match our records.']")
    public WebElement textLoginErrorMessage;

    //---US-13 Slider Locate-----//
    @FindBy (xpath = "(//div[@class='owl-dot'])[1]")
    public WebElement imageSlider;

    @FindBy (xpath = "//div[@class='owl-dot active']")
    public WebElement secondSlideNavigatorButton;

    @FindBy (xpath = "(//div[@class='owl-dot'])[2]")
    public WebElement thirdSlideNavigatorButton;

    @FindBy (xpath = "(//div[@class='owl-dot'])[1]")
    public WebElement firstSlideNavigatorButton;

    @FindBy (xpath = "//*[@title='sport']")
    public WebElement imageSecondSlider;

    @FindBy (xpath = "//*[@title='Electronics']")
    public WebElement imageThirdSlider;

    @FindBy (xpath = "//*[@title='woman fashion']")
    public WebElement imageFirstSlider;

    @FindBy (xpath = "(//*[@title='BuySellCycle'])[1]")
    public WebElement homeHeaderButton;

    // -----US-16 Footer Locate AYCA------- //

    @FindBy (xpath = "//*[@class='home_three_footer']")
    public WebElement tableFooter;

    @FindBy (xpath = "(//a[text()='About Us'])[3]")
    public WebElement linkFooterAboutUs;

    @FindBy (xpath = "(//a[text()='Blog'])[3]")
    public WebElement linkFooterBlog;

    @FindBy (xpath = "//a[text()='Dashboard']")
    public WebElement linkFooterDashboard;

    @FindBy (xpath = "//a[text()='My Profile']")
    public WebElement linkFooterMyProfile;

    @FindBy (xpath = "//a[text()='My Order']")
    public WebElement linkFooterMyOrder;

    @FindBy (xpath = "//div[@class='copy_right_text d-flex align-items-center gap_20 flex-wrap justify-content-between']")
    public WebElement textFooterCopyRight;

    @FindBy (xpath = "//*[text()='Google Play']")
    public WebElement linkFooterGooglePlay;

    @FindBy (xpath = "//*[text()='Apple Store']")
    public WebElement linkFooterAppleStore;

    @FindBy (xpath = "//*[text()='GET A QUICK QUOTE']")
    public WebElement textFooterGetQuickQuite;

    @FindBy (xpath = "(//*[@class='form-control'])[1]")
    public WebElement textBoxFooterEmail;

    @FindBy (xpath = "//*[@id='subscribeBtn']")
    public WebElement subscribeButton;

    @FindBy (xpath = "//*[text()='Help & Contact']")
    public WebElement linkFooterHelpContact;

    @FindBy (xpath = "//*[text()='Track Order']")
    public WebElement linkFooterTrackOrder;

    @FindBy (xpath = "//*[text()='Return & Exchange']")
    public WebElement linkFooterReturnExchange;


    @FindBy (xpath = "//*[@class='fab fa-youtube']")
    public WebElement linkFooterYoutube;

    @FindBy (xpath = "//*[@class='fab fa-linkedin']")
    public WebElement linkFooterLinkedin;

    @FindBy (xpath = "//*[@class='fab fa-instagram']")
    public WebElement linkFooterInstagram;

    @FindBy (xpath = "//*[@class='fab fa-facebook-square']")
    public WebElement linkFooterFacebook;

    @FindBy (xpath = "//*[text()='You Are Already Subscribed.']")
    public WebElement textFooterAlreadySubscribed;

    @FindBy (xpath = "//*[text()='Subscribe successfully! Thanks For Subscribe.']")
    public WebElement textFooterSubscribeSuccessfully;

    @FindBy (xpath = "//*[@id='back-top']")
    public WebElement goTopButton;

    //------US_26 User Dashboar Support Ticket Locate AYCA--------//

    @FindBy (xpath = "(//*[@class='position-relative d-flex align-items-center '])[2]")
    public WebElement linkDashboardSupportTicket;






    //===============================AYCA=====================//


    @FindBy (xpath = "(//a[@href=\"https://qa.buysellcycle.com/contact-us\"])[1]")
    public WebElement linkContact;

    @FindBy (xpath = "(//h4[@class=\"contact_box_desc mb-0\"])[1]")
    public WebElement textWhatsapp;
    @FindBy (xpath = "(//h4[@class=\"contact_box_desc mb-0\"])[2]")
    public WebElement textMail;
    @FindBy (xpath = "(//h4[@class=\"contact_box_desc mb-0\"])[3]")
    public WebElement textAddress;
    @FindBy (xpath = "//a[@href=\"http://facebook.com\"]")
    public WebElement iconFacebook;
    @FindBy (xpath = "//a[@href=\"http://linkedin.com\"]")
    public WebElement iconLinkedin;
    @FindBy (xpath = "//a[@href=\"http://x.com\"]")
    public WebElement iconX;
    @FindBy (xpath = "//a[@href=\"http://instagram.com\"]")
    public WebElement iconInstagram;







    @FindBy(xpath = "//*[@href='https://qa.buysellcycle.com/blog']")
    public WebElement linkHeaderBlog;
    @FindBy(xpath = "//*[@class='close_modal']")
    public WebElement cookieAllert;
    @FindBy(xpath = "//*[text()='+ Read more']")
    public WebElement linkReadMore;
    @FindBy(xpath = "(//h4[@class='font_18 f_w_700 mb_10'])[1]")
    public WebElement labelCategoryText;
    @FindBy(xpath = "//*[@class='form-control search_input']")
    public WebElement blogSearchBox;
    @FindBy(xpath = "(//h4)[12]")
    public WebElement labelMetaverseText;
    @FindBy(xpath = "(//*[@class='label_name f_w_400'])[2]")
    public WebElement selectCategoryPost;
    @FindBy(xpath = "//*[text()='shopping']")
    public WebElement blogKeyword;
    @FindBy(xpath = "(//h4)[20]")
    public WebElement popularCategoryBlog;

    //========US_002 HomePage'deki linkler ve buttonlar Esra===================
    //US_002 TC01
    @FindBy(xpath = "//span[text()='Track Your Order']")
    public WebElement linkTextTrackYourOrder;

    @FindBy(xpath = "//span[text()='Compare(']")
    public WebElement linkTextCompare;

    @FindBy(xpath = "//span[text()='Wishlist (']")
    public WebElement linkTextWishList;

    @FindBy(xpath = "(//span[text()='Cart ('])[1]")
    public WebElement linkTextCart;

    @FindBy(xpath = "//span[text()='New User Zone']")
    public WebElement linkTextNewUserZone;

    @FindBy(xpath = "(//span[text()='Daily Deals'])[1]")
    public WebElement linkTextDailyDeals;

    //TC02 sayfa yonlendirme
    @FindBy(xpath = "//button[text()='Track Now']")
    public WebElement buttonTrackNow;

    @FindBy(xpath = "//h3[@class='fs-4 fw-bold mb_30']")
    public WebElement titleProductCompare;

    @FindBy(xpath = "//h3[text()='Sign In']")
    public WebElement titleSignIn;

    @FindBy(xpath = "//h3[text()='Order Summary']")
    public WebElement titleOrderSummary;

    @FindBy(xpath = "//h3[text()='Surprises for new users']")
    public WebElement titleSurpriseForNewUsers;

    @FindBy(xpath = "//h3[@class='m-0 flex-fill']")
    public WebElement titleDealEndsIn;

    //TC03anasayfa refresh
    @FindBy(xpath = "(//img[@title='BuySellCycle'])[1]")
    public WebElement logoSite;

    //TC04
    @FindBy(xpath = "//input[@class='form-control category_box_input lh-base']")
    public WebElement searchTextBox;


    //AllCategories ve alt menuleri linkleri
    @FindBy(xpath = "//a[@class='Categories_togler']")
    public WebElement linkAllCategories;

    @FindBy(xpath = "//*[@class='fas fa-mobile-alt']")
    public WebElement linkElectronics;

    @FindBy(xpath = "//i[@class='fas fa-tshirt']")
    public WebElement linkFashion;

    @FindBy(xpath = "//i[@class='far fa-grin-squint']")
    public WebElement linkBaby;

    @FindBy(xpath = "//i[@class='fas fa-couch']")
    public WebElement linkHomeFurniture;

    @FindBy(xpath = "//i[@class='fas fa-basketball-ball']")
    public WebElement linkSporOutdoor;

    @FindBy(xpath = "//i[@class='fas fa-gem']")
    public WebElement linkAccessories;

    @FindBy(xpath = "//i[@class='fas fa-tint']")
    public WebElement linkBeauty;

    @FindBy(xpath = "//i[@class='fas fa-book-reader']")
    public WebElement linkBookStationery;

    @FindBy(xpath = "//i[@class='fas fa-music']")
    public WebElement linkHobiMusic;

    @FindBy(xpath = "//i[@class='fas fa-shopping-basket']")
    public WebElement linkSupermarket;

    @FindBy(xpath = "//i[@class='fas fa-car']")
    public WebElement linkAutoGardenDiyStore;


    //Site ust barinda kolay linkler

    //TC02 Site ust barinda kolay linkler ve gidilen yerler

    @FindBy(id = "order_number")
    public WebElement textBoxOrderTrackingNumber;

    @FindBy(xpath = "//*[text()='Track Now']")
    public WebElement trackNowButton;

    @FindBy(xpath = "//*[text()='The selected order number is invalid.']")
    public WebElement labelOrderNumberUnvalidText;

    @FindBy(id = "guest_id")
    public WebElement textBoxSecretID;

    //  Homepage>> Headerlink>> AboutUs- Asli||

    @FindBys({
            @FindBy(xpath = "//div[@class='member_info']//child::h4")
    })
    public List<WebElement> teamMemberNameList;

    // -------------------------Beytullah's Locates----------------------------
    // New Product Deals >> Best Deals Page
    @FindBy(xpath = "//*[text()='New Product Deals']")
    public WebElement linkNewProductDeals;

    @FindBy(xpath = "(//*[text()=\"Women's Apparel\"])[2]")
    public WebElement checkBoxWoman;
    @FindBy(xpath = "(//*[text()=\"Telephone\"])[2]")
    public WebElement checkBoxTelephone;
    @FindBy(xpath = "(//*[@class=\"far fa-star\"])[5]")
    public WebElement buttonStar;
    @FindBy(xpath = "//*[@class='font_16 f_w_500 mr_10 mb-0']")
    public WebElement labelProductnumber;
    @FindBy(xpath = "//*[@title='List View']")
    public WebElement buttonlistWiew;
    @FindBy(xpath = "(//*[@class='product_widget5 mb_30 list_style_product'])[1]")
    public WebElement elementFirstProduct;
    @FindBy(xpath = "(//*[@class='current'])[3]")
    public WebElement ddmItems;
    @FindBy(xpath = "//*[@data-value='12']")
    public WebElement ddmSecondItem;
    @FindBy(xpath = "(//*[@class='current'])[4]")
    public WebElement ddmSorting;
    @FindBy(xpath = "//*[@data-value='low_to_high']")
    public WebElement ddmFifthSorting;
    @FindBy(xpath = "//*[@id=\"profile\"]//strong/text()")
    public List<WebElement> textProductprice;

    @FindBys({
            @FindBy(xpath = "//div[@class='member_info']//child::p")
    })
    public List<WebElement> teamMemberStatues;

    @FindBys({
            @FindBy(xpath = "//div[@class='single_member mb_21']//child::img")
    })
    public List<WebElement> teamMemberFotos;


    public void verifyTheTeamMembersInfo(String teamMember) {

        boolean isNamePresent = false;
        for (WebElement member : teamMemberNameList) {
            if (member.getText().equals(teamMember)) {
                isNamePresent = true;
                break;
            }
        }

        Assert.assertTrue(teamMember, isNamePresent);
        Assert.assertEquals(teamMemberStatues.size(),
                teamMemberNameList.size());

        Assert.assertEquals(teamMemberFotos.size(), teamMemberNameList.size());
    }

    @FindBy(xpath = "//button[text()='Continue To Shipping']")
    public WebElement ContinueToShippingButton;

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


    // -------------------------End of Beytullah's Locates----------------------------


    @FindAll({
            @FindBy(xpath = "//div[@class='member_info']//child::h4"),
            @FindBy(xpath = "//div[@class='member_info']//child::p")
    })
    public WebElement team;
}





