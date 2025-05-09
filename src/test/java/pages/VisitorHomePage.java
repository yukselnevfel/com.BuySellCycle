package pages;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.junit.Assert;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;


import java.util.Locale;

public class VisitorHomePage extends Base{


    //Register User Login Locate Homepage>> LoginButton AYCA LOCATE
    @FindBy(xpath = "(//*[text()='Login'])[1]")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@class='img-fluid']")
    public WebElement imageLoginPage;


    @FindBy(xpath = "//*[@id='login_form']")
    public WebElement loginForm;

    @FindBy(xpath = "//*[@id='sign_in_btn']")
    public WebElement signInButton;

    @FindBy(xpath = "//*[text()='Remember me']")
    public WebElement checkBoxRememberMe;

    @FindBy(xpath = "//*[@id='text']")
    public WebElement textBoxUserEmail;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement textBoxUserPassword;

    @FindBy(xpath = "//*[text()='These credentials do not match our records.']")
    public WebElement textLoginErrorMessage;

    //---US-13 Slider Locate-----//
    @FindBy(xpath = "//*[@title='woman fashion']")
    public WebElement imageSlider;

    @FindBy (xpath = "//div[@class='owl-dots']")
    public WebElement navigationButtons;

    @FindBy(xpath = "(//div[@class='owl-dot'])[1]")
    public WebElement secondSlideNavigatorButton;

    @FindBy(xpath = "(//div[@class='owl-dot'])[2]")
    public WebElement thirdSlideNavigatorButton;

    @FindBy(xpath = "(//div[@class='owl-dot active']")
    public WebElement firstSlideNavigatorButton;

    @FindBy(xpath = "(//*[@title='sport'])[2]")
    public WebElement imageSecondSlider;

    @FindBy(xpath = "(//*[@title='Electronics'])[2]")
    public WebElement imageThirdSlider;

    @FindBy(xpath = "(//*[@title='woman fashion'])[2]")
    public WebElement imageFirstSlider;

    @FindBy(xpath = "(//*[@title='BuySellCycle'])[1]")
    public WebElement homeHeaderButton;

    @FindBy(xpath = "(//div/a/img[@class=\"img-fluid\"])")
    public List<WebElement> slider7;

    // -----US-16 Footer Locate AYCA------- //

    @FindBy(xpath = "//*[@class='home_three_footer']")
    public WebElement tableFooter;

    @FindBy(xpath = "(//a[text()='About Us'])[3]")
    public WebElement linkFooterAboutUs;

    @FindBy(xpath = "(//a[text()='Blog'])[3]")
    public WebElement linkFooterBlog;

    @FindBy(xpath = "//a[text()='Dashboard']")
    public WebElement linkFooterDashboard;

    @FindBy(xpath = "//a[text()='My Profile']")
    public WebElement linkFooterMyProfile;

    @FindBy(xpath = "//a[text()='My Order']")
    public WebElement linkFooterMyOrder;

    @FindBy(xpath = "//div[@class='copy_right_text d-flex align-items-center gap_20 flex-wrap justify-content-between']")
    public WebElement textFooterCopyRight;

    @FindBy(xpath = "//*[text()='Google Play']")
    public WebElement linkFooterGooglePlay;

    @FindBy(xpath = "//*[text()='Apple Store']")
    public WebElement linkFooterAppleStore;

    @FindBy(xpath = "//*[text()='GET A QUICK QUOTE']")
    public WebElement textFooterGetQuickQuite;

    @FindBy(xpath = "(//*[@class='form-control'])[1]")
    public WebElement textBoxFooterEmail;

    @FindBy(xpath = "//*[@id='subscribeBtn']")
    public WebElement subscribeButton;

    @FindBy(xpath = "//*[text()='Help & Contact']")
    public WebElement linkFooterHelpContact;

    @FindBy(xpath = "//*[text()='Track Order']")
    public WebElement linkFooterTrackOrder;

    @FindBy(xpath = "//*[text()='Return & Exchange']")
    public WebElement linkFooterReturnExchange;


    @FindBy(xpath = "//*[@class='fab fa-youtube']")
    public WebElement linkFooterYoutube;

    @FindBy(xpath = "//*[@class='fab fa-linkedin']")
    public WebElement linkFooterLinkedin;

    @FindBy(xpath = "//*[@class='fab fa-instagram']")
    public WebElement linkFooterInstagram;

    @FindBy(xpath = "//*[@class='fab fa-facebook-square']")
    public WebElement linkFooterFacebook;

    @FindBy(xpath = "//*[text()='You Are Already Subscribed.']")
    public WebElement textFooterAlreadySubscribed;

    @FindBy(xpath = "//*[text()='Subscribe successfully! Thanks For Subscribe.']")
    public WebElement textFooterSubscribeSuccessfully;

    @FindBy(xpath = "//*[@id='back-top']")
    public WebElement goTopButton;




    @FindBy(xpath = "(//a[@href=\"https://qa.buysellcycle.com/contact-us\"])[1]")
    public WebElement linkContact;

    @FindBy(xpath = "(//h4[@class=\"contact_box_desc mb-0\"])[1]")
    public WebElement textWhatsapp;
    @FindBy(xpath = "(//h4[@class=\"contact_box_desc mb-0\"])[2]")
    public WebElement textMail;
    @FindBy(xpath = "(//h4[@class=\"contact_box_desc mb-0\"])[3]")
    public WebElement textAddress;
    @FindBy(xpath = "//a[@href=\"http://facebook.com\"]")
    public WebElement iconFacebook;
    @FindBy(xpath = "//a[@href=\"http://linkedin.com\"]")
    public WebElement iconLinkedin;
    @FindBy(xpath = "//a[@href=\"http://x.com\"]")
    public WebElement iconX;
    @FindBy(xpath = "//a[@href=\"http://instagram.com\"]")
    public WebElement iconInstagram;

    @FindBy(xpath = "//input[@id=\"name\"]")
    public WebElement textBoxName;
    @FindBy(xpath = "//input[@id=\"email\"]")
    public WebElement textBoxEmail;
    @FindBy(xpath = "//textarea[@id=\"message\"]")
    public WebElement textBoxMessage;
    @FindBy(xpath = " (//span[@class=\"current\"])[3]")
    public WebElement checkBoxOrder;
    @FindBy(xpath = "(//li[@data-value=\"2\"])[2]")
    public WebElement linkPayment;
    @FindBy(xpath = "//button[@id=\"contactBtn\"]")
    public WebElement linkSendMessage;
    @FindBy(xpath = "//div[@class=\"contact_info\"]")
    public WebElement textGetinTouch;
    @FindBy(xpath = "//*[@class='toast-message']")
    public WebElement successfullAllert;
    @FindBy(xpath = "(//h4[@id='filter_category_title'])[1]")
    public WebElement labelElectronics;

    @FindBy(xpath = "//button[text()=\"Telephone\"]")
    public WebElement labelTelephone;

    @FindBy(xpath = "//button[@id='tab_link_34']")
    public WebElement labelTVPictureSound;
    @FindBy(xpath = "//button[@id='tab_link_35']")
    public WebElement labelPhotoCamera;
    @FindBy(xpath = "//button[@id='tab_link_36']")
    public WebElement labelComputerTablet;
    @FindBy(xpath = "//button[@id='tab_link_37']")
    public WebElement labelSpecialforPlayers;
    @FindBy(xpath = "//button[@id='tab_link_38']")
    public WebElement labelElectronicAccessories;
    @FindBy(xpath = "//div[@class=\"product_details_wrapper\"]")
    public WebElement detailOfQuickView;
    @FindBy (xpath="//h3[@class=\"branding_text\"]")
    public WebElement labelElectronicsPage;
    @FindBy (xpath="(//div[@class=\"product_widget5 mb_30 style5 w-100\"])[1]")
    public WebElement imageElectronicsPage;
    @FindBy (xpath="(//i[@class=\"ti-control-shuffle\"])[1]")
    public WebElement iconCompareElectronicsPage;
    @FindBy (xpath="(//i[@class=\"far fa-heart\"])[1]")
    public WebElement iconWishlistElectronicsPage;
    @FindBy (xpath="(//i[@class=\"ti-eye\"])[1]")
    public WebElement iconQuickViewElectronicsPage;
    @FindBy (xpath="(//a[@title=\"Add to Cart\"])[1]")
    public WebElement iconAddToCartElectronicsPage;
    @FindBy (xpath="(//div[@class=\"col-md-6\"])[2]")
    public WebElement linkBuyNowElectronicsPage;
    @FindBy (xpath="(//a[@data-product-sku='1373'])[1]")
    public WebElement iconCompare ;


    @FindBy(xpath = "(//i[@class=\"far fa-heart\"])[1]")
    public WebElement iconWishlist;
    @FindBy(xpath = "(//i[@class=\"far fa-heart\"])[2]")
    public WebElement iconSecondWishlist;

    @FindBy(xpath = "(//a[@data-product_id='1373'])[2]")
    public WebElement iconQuickView;
    @FindBy(xpath = "//a[@href=\"https://qa.buysellcycle.com/my-wishlist\"]")
    public WebElement linkWishlist;
    @FindBy(xpath = "(//a[@data-product-id='1373'])[2]")
    public WebElement iconAddToCart;
    @FindBy(xpath = "(//*[text()=\"Buy now\"])[1]")
    public WebElement textBuyNow;
    @FindBy(xpath = "(//a[@id=\"add_to_cart_btn_modal\"])[1]")
    public WebElement buttonAddddtoCart;
    @FindBy (xpath="//div[@class=\"product_checked_box d-flex flex-column justify-content-center align-items-center\"]")
    public WebElement alertAddToCart;

    @FindBy(xpath = "(//span[text()='More Deals'])[1]")
    public WebElement linkMoreDeals;

    @FindBy(xpath = "(//a[@data-product-sku='1534'])[1]")
    public WebElement iconCompareElectronics;

    @FindBy(xpath = "(//a[@id='wishlistbtn_1534'])[1]")
    public WebElement iconWishlistElectronics;

    @FindBy(xpath = "//a[text()='shopping']")
    public WebElement labelShoppingText;
    @FindBy(xpath = "//*[@class='font_14 f_w_500 m-0']")
    public WebElement labelTagShoppingText;
    @FindBy(xpath = "(//a[@data-product_id='1534'])[2]")
    public WebElement iconQuickViewElectronics;

    @FindBy(xpath = "(//a[@data-product-sku='1534'])[2]")
    public WebElement iconAddToCartElectronics;
    @FindBy(xpath = "(//div[@class=\"product_widget5 style4 mb-0 style5\"])[1]")
    public WebElement imagePhone;
    @FindBy(xpath = "(//div[@class=\"product_widget5 style4 mb-0 style5\"])[9]")
    public WebElement imageTV;


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

    @FindBy(xpath = "//a[text()='Telephone']")
    public WebElement textTelephone;

    @FindBy(xpath = "(//a[@class='mega_metu_title'])[7]")
    public WebElement titleWomanApparel;

    @FindBy(xpath = "(//a[@class='mega_metu_title'])[13]")
    public WebElement titleBabyRoom;

    @FindBy(xpath = "(//a[@class='mega_metu_title'])[18]")
    public WebElement titleFurniture;

    @FindBy(xpath = "(//a[@class='mega_metu_title'])[24]")
    public WebElement titleSportwearShoes;

    @FindBy(xpath = "(//a[@class='mega_metu_title'])[30]")
    public WebElement titleBag;

    @FindBy(xpath = "(//a[@class='mega_metu_title'])[36]")
    public WebElement titleMakeup;

    @FindBy(xpath = "(//a[@class='mega_metu_title'])[41]")
    public WebElement titleBooks;

    @FindBy(xpath = "(//a[@class='mega_metu_title'])[43]")
    public WebElement titleToys;

    @FindBy(xpath = "(//a[@class='mega_metu_title'])[47]")
    public WebElement titleHouseCleaning;

    @FindBy(xpath = "(//a[@class='mega_metu_title'])[53]")
    public WebElement titleConstructionMarket;

    @FindBy(xpath = "//a[text()='Mobile Phone']")
    public WebElement textMobilePhone;

    @FindBy(xpath = "//a[text()='Woman Dress']")
    public WebElement textWomanDress;


    @FindBy(xpath = "//a[text()='Baby cradle']")
    public WebElement textBabyCradle;

    @FindBy(xpath = "//a[text()='Living Room']")
    public WebElement textLivingRoom;

    //===US_014 HOMEPAGE LINK BUTTONLARI=========================
    @FindBy(xpath = "(//span[text()='View All'])[1]")
    public WebElement buttonViewAll;

    @FindBy(xpath = "(//img[@class='lazyload'])[1]")
    public WebElement imageBag;

    @FindBy(xpath = "(//img[@class='lazyload'])[2]")
    public WebElement image;

    @FindBy(xpath = "(//img[@class='lazyload'])[3]")
    public WebElement imageChicco;

    @FindBy(xpath = "(//a[@title='Add to Cart'])[1]")
    public WebElement buttonAddToCart;

    @FindBy(xpath = "//*[@class='amaz_primary_btn addToCartFromThumnail']")
    public WebElement iconProduct;
    @FindBy(xpath = "//*[text()='Item added to your cart']")
    public WebElement  textSucces;

    @FindBy(xpath = "(//i[@class='ti-close'])[5]")
    public WebElement buttonClose;

    @FindBy(xpath = "(//i[@class='ti-control-shuffle'])[1]")
    public WebElement buttonCompare;

    @FindBy(xpath = "(//i[@title='Wishlist'])[1]")
    public WebElement buttonWishList;

    @FindBy(xpath = "(//span[text()='View All'])[2]")
    public WebElement textViewAll;

    @FindBy(xpath = "(//a[@class='amaz_primary_btn addToCartFromThumnail'])[1]")
    public WebElement buttonAddtocart;

    @FindBy(xpath = "//*[@id='add_to_cart_btn_modal']")
    public WebElement buttonADDTOCART;

    @FindBy(id = "top_rating_title")
    public WebElement titleTopRating;

    @FindBy(xpath = "(//img[@title='Black Pleated Long Skirt'])[2]")
    public WebElement imageEtek;

    @FindBy(xpath = "//*[@id=\"home\"]/div/div[1]/div/div[21]/div/div[3]/div/a")
    public WebElement buttonAddTocart;

    @FindBy(xpath = "(//i[@class='ti-close'])[5]")
    public WebElement buttonCLOSE;
    
    @FindBy(xpath = "(//i[@class='ti-control-shuffle'])[105]")
    public WebElement buttonCompareEtek;

    @FindBy(xpath = "//a[@id='add_to_compare_btn']")
    public WebElement buttonADDTOCOMPARE;

    @FindBy(xpath = "(//i[@title='Wishlist'])[105]")
    public WebElement iconWishlistEtek;

    @FindBy(xpath = "//span[@id='people_choice_title']")
    public WebElement titlePeopleChoice;

    @FindBy(xpath = "(//img[@title='zara Leg Trousers'])[3]")
    public WebElement imgZaraLeg;

    @FindBy(xpath = "(//a[@title='Add to Cart'])[149]")
    public WebElement addToCartZaraLeg;

    @FindBy(xpath = "(//img[@title='SmrWatch'])[13]")
    public WebElement imageSmrWatch;

    @FindBy(xpath = "(//a[@title='Add to Cart'])[152]")
    public WebElement addToCartSmrWatch;

    @FindBy(xpath = "(//button[@class='close_modal_icon'])[1]")
    public WebElement buttonCloseSmrWatch;

    @FindBy(xpath = "(//*[@title='Compare'])[152]")
    public WebElement compareSmrWatch;

    @FindBy(xpath = "(//*[@title='Wishlist'])[152]")
    public WebElement wishListSmrWatch;

    @FindBy(xpath = "//img[@title='Stradivarius']")
    public WebElement linkStradivarius;

    @FindBy(xpath = "//img[@title='GAP']")
    public WebElement linkGap;

    @FindBy(xpath = "//img[@title='MANGO']")
    public WebElement linkMango;

    @FindBy(xpath = "//img[@title='Pull & Bear']")
    public WebElement linkPullBear;

    @FindBy(xpath = "(//a[@title='Add to Cart'])[1]")
    public WebElement iconSepet;

    @FindBy(xpath = "(//a[@id='add_to_cart_btn_modal'])[1]")
    public WebElement ADDTOCARTStradivarious;

    @FindBy(xpath = "(//button[@class='close_modal_icon'])[2]")
    public WebElement closeStradivarious;

    @FindBy(xpath = "(//i[@class='ti-control-shuffle'])[1]")
    public WebElement compareIcon;

    @FindBy(xpath = "(//a[@id='add_to_compare_btn'])[1]")
    public WebElement textAddToCart;

    @FindBy(xpath = "(//img[@title='Belted smart trousers'])[3]")
    public WebElement imgBeltedTrouser;

    @FindBy(xpath = "(//i[@class='far fa-heart'])[1]")
    public WebElement wishIcon;

    @FindBy(xpath = "//div[@class='section__title d-flex align-items-center gap-3 mb_20']")
    public WebElement titleAbout;

    @FindBy(xpath = "//span[@style='font-size: 16px; background-color: rgb(244, 247, 249);']")
    public WebElement textAbout;

    @FindBy(xpath = "//span[@id='top_picks_title']")
    public WebElement titleTopPicks;

    @FindBy(xpath = "(//img[@title='Red Front Zipper Long Dress'])[3]")
    public WebElement imgRedDress;



    //Site ust barinda kolay linkler
    //TC02 Site ust barinda kolay linkler ve gidilen yerler

    @FindBy(id = "order_number")
    public WebElement textBoxOrderTrackingNumber;

    //===================US_004==================

    @FindBy(xpath = "//*[text()='/ Register']")
    public WebElement linkRegister;
    @FindBy(xpath = "//*[@src='https://qa.buysellcycle.com/public/frontend/amazy/img/banner/login_img.png']")
    public WebElement logoBuySell;
    @FindBy(xpath = "//*[@class='img-fluid']")
    public WebElement picturePNG;
    @FindBy(xpath = "//*[text() = 'Turn your ideas into reality.']")
    public WebElement labelPictureText;
    @FindBy(xpath = "//*[@class='amazy_login_form']")
    public WebElement tableRegisterForm;
    @FindBy(id = "first_name")
    public WebElement textBoxFirstName;
    @FindBy(id = "last_name")
    public WebElement textBoxLastName;
    @FindBy(id = "email")
    public WebElement textRegisterBoxEmail;
    @FindBy(id = "password-confirm")
    public WebElement textBoxPasswordConfirm;
    @FindBy(id = "sign_in_btn")
    public WebElement signUpButton;
    @FindBy(xpath = "//*[@href='https://qa.buysellcycle.com/login']")
    public WebElement linkSignIn;
    @FindBy(xpath = "//*[text()='Registration successfull, Please wait for active your account']")
    public WebElement labelRegistrationAlert;
    @FindBy(xpath = "(//*[@class='text-danger'])[1]")
    public WebElement labelNameError;
    @FindBy(xpath = "(//*[@class='text-danger'])[3]")
    public WebElement labelEmailandPhoneError;
    @FindBy(xpath = "(//*[@class='text-danger'])[5]")
    public WebElement labelPasswordError;
    @FindBy(xpath = "//*[text()='Sign Up']")
    public WebElement labelSignUpText;
    @FindBy(xpath = "//*[@class='label_name f_w_400']")
    public WebElement signUpRadyoButton;
    @FindBy(xpath = "//*[@class='m-0']")
    public WebElement labelSignInText;
    @FindBy(xpath = "//*[@aria-live='assertive']")
    public WebElement rBERROR;
    @FindBy(xpath = "//*[text()='Error']")
    public WebElement radyoButtonError;
    public String generateRandomPhoneNumber() {
        faker = new Faker(new Locale("tr-TR"));
        String phone =  faker.phoneNumber().phoneNumber();
        return phone;
    }
    public String generateRandomEmail() {
        String email = faker.internet().emailAddress();
        return email;
    }


    @FindBy(xpath = "//*[text()='Track Now']")
    public WebElement trackNowButton;

    @FindBy(xpath = "//*[text()='The selected order number is invalid.']")
    public WebElement labelOrderNumberUnvalidText;

    @FindBy(id = "guest_id")
    public WebElement textBoxSecretID;

    @FindBy(xpath = "(//*[@class='d-flex align-items-center flex-wrap gap_5'])[3]")
    public WebElement labelOrderStatusText;


    //  Homepage>> Headerlink>> AboutUs- Asli||

    @FindBys({
            @FindBy(xpath = "//div[@class='member_info']//child::h4")
    })
    public List<WebElement> teamMemberNameList;

    @FindBys({
            @FindBy(xpath = "//div[@class='member_info']//child::p")
    })
    public List<WebElement> teamMemberStatues;

    @FindBys({
            @FindBy(xpath = "//div[@class='single_member mb_21']//child::img")
    })
    public List<WebElement> teamMemberFotos;

    @FindAll({
            @FindBy(xpath = "//div[@class='single_shipingV3_info d-flex align-items-start']")
    })
    public List<WebElement> informationList;


@FindBy(xpath = "//div[@class='container mt_30 mb_30 min-vh-50']")
public WebElement teamOnAboutPage;


public void verifyTheTeamMembersInfo(String teamMember) {

    boolean isNamePresent = false;
    for (WebElement member : teamMemberNameList) {
        if (member.getText().equals(teamMember)) {
            isNamePresent = true;
            break;
        }
    }

    Assert.assertTrue(isNamePresent);
  Assert.assertEquals(teamMemberStatues.size(),
            teamMemberNameList.size());

    Assert.assertEquals(teamMemberFotos.size(), teamMemberNameList.size());

}


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
    @FindBy(xpath = "//*[@id='profile']//strong")
    public List<WebElement> textProductprice;
    @FindBy(xpath = "(//*[@id='profile']//strong)[1]")
    public WebElement textProductprice01;
    @FindBy(xpath = "(//*[@id='profile']//strong)[2]")
    public WebElement textProductprice02;
    @FindBy(xpath = "(//*[@id='profile']//strong)[3]")
    public WebElement textProductprice03;
    @FindBy(xpath = "//*[@id='count_down']")
    public WebElement labelcounter;
    @FindBy(xpath = "(//*[@class='lazyload'])[1]")
    public WebElement linkFirstProduct;
    @FindBy(xpath = "(//*[@class='lazyload'])[1]")
    public WebElement buttonWiew;
    @FindBy(xpath = "//*[@id='wishlist_btn']")
    public WebElement buttonAddingWishList;
    @FindBy(xpath = "//*[@id='add_to_compare_btn']")
    public WebElement buttonAddingCompare;
    @FindBy(xpath = "//*[@id='add_to_cart_btn_modal']")
    public WebElement buttonAddingToCart;
    @FindBy(xpath = "(//*[@class='checkmark mr_10'])[1]")
    public WebElement checkBoxWomansApperal;
    @FindBy(xpath = "(//*[@class='label_name'])[27]")
    public WebElement checkBoxPullAndBear;
    @FindBy(xpath = "//*[@class='branding_text']")
    public WebElement textPageTitle;
    @FindBy(xpath = "//*[@id='refresh_btn']")
    public WebElement buttonRefresh;

    @FindBy(xpath = "//*[@class='toast-message']")
    public WebElement labelPopUpMessage;


    // -------------------------End of Beytullah's Locates----------------------------

    // -------------------------SAMET----------------------------

@FindBy(xpath = "(//*[@title=\"Add to Cart\"])[28]") public WebElement addToCartPrdct;
@FindBy(xpath = "//*[@id=\"cart_add_modal\"]/div/div/div/div/div[3]/a") public WebElement viewCart;
@FindBy(xpath = "(//*[@class=\"font_14 f_w_700 m-0 text-nowrap priamry_text text-uppercase\"])[1]") public WebElement prd;
@FindBy(xpath = "(//*[@class=\"font_14 f_w_700 m-0 text-nowrap priamry_text text-uppercase\"])[2]") public WebElement prs;
@FindBy(xpath = "(//*[@class=\"font_14 f_w_700 m-0 text-nowrap priamry_text text-uppercase\"])[3]") public WebElement qnt;
@FindBy(xpath = "(//*[@class=\"font_14 f_w_700 m-0 text-nowrap priamry_text text-uppercase\"])[4]") public WebElement sbttl;
@FindBy(xpath = "//*[@class=\"summery_pro_content\"]") public WebElement pruductDetail;
@FindBy(xpath = "/html/body/div/div[1]/div/p") public WebElement  sorry;
@FindBy(xpath = "(//*[@type=\"button\"])[2]") public WebElement  plusButton;
@FindBy(xpath = "//*[@width=\"12.249\"]") public WebElement  deleteProductButton;
@FindBy(xpath = "//*[@id=\"cart_form\"]/div/div/div[1]/div[2]/ul/li/div/div[4]/h4") public WebElement  productPrice;
@FindBy(xpath = "//*[@id=\"cart_details_div\"]/div/div/div/div/div[3]/div[2]/span") public WebElement  discount;
@FindBy(id = "qty_743") public WebElement  productAdet;
@FindBy(className = "product_not_found") public WebElement product_not_found;




}










