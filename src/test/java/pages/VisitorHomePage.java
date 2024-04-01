package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Locale;

public class VisitorHomePage extends Base{


    //Register User Login Locate Homepage>> LoginButton
    @FindBy(xpath = "(//*[text()='Login'])[1]")
    public WebElement loginButton;

    @FindBy (xpath = "//*[@class='img-fluid']")
    public WebElement imageLoginPage;

    @FindBy (xpath = "//*[text()='Turn your ideas into reality..']")
    public WebElement textTurnIdea;

    //Homepage>> LoginButton>>LoginForm
    @FindBy (xpath = "//*[@id='login_form']")
    public WebElement loginForm;

    @FindBy (xpath = "//*[@id='sign_in_btn']")
    public WebElement signInButton;

    @FindBy (xpath = "//*[text()='Remember me']")
    public WebElement checkBoxRememberMe;

    @FindBy (xpath = "//*[@id='text']")
    public WebElement textBoxUserEmail;

    @FindBy (xpath = "//*[@id='password']")
    public WebElement textBoxUserPassword;

    @FindBy (xpath = "//*[text()='Forgot Password? ']")
    public WebElement textBoxForgotPassword;

    @FindBy (xpath = "//*[text()='Click Here']")
    public WebElement linkLoginClickHere;

    @FindBy (xpath = "//*[text()='Don’t have an Account? ']")
    public WebElement textBoxHaveAnAccount;

    @FindBy (xpath = "//*[text()='Sign Up']")
    public WebElement linkLoginSignUp;


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





    @FindBy(xpath = "//a[text()='shopping']")
    public WebElement labelShoppingText;
    @FindBy(xpath = "//*[@class='font_14 f_w_500 m-0']")
    public WebElement labelTagShoppingText;
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

    //==US_002 HomePage'deki linkler ve buttonlar Esra===================
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

    //Site ust barinda kolay linkler
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
    public WebElement textBoxEmail;
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






}
