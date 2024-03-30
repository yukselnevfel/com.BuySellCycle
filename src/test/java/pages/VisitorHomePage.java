package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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

    @FindBy (id = "//*[@id='text']")
    public WebElement textBoxUserEmail;

    @FindBy (id="//*[@id='password']")
    public WebElement textBoxUserPassword;

    @FindBy (xpath = "//*[text()='Forgot Password? ']")
    public WebElement textBoxForgotPassword;

    @FindBy (xpath = "//*[text()='Click Here']")
    public WebElement linkLoginClickHere;

    @FindBy (xpath = "//*[text()='Don’t have an Account? ']")
    public WebElement textBoxHaveAnAccount;

    @FindBy (xpath = "//*[text()='Sign Up']")
    public WebElement linkLoginSignUp;

    @FindBy(xpath = "//*[@href='https://qa.buysellcycle.com/blog']")
    public WebElement linkHeaderBlog;

    @FindBy(xpath = "//*[@class='close_modal']")
    public WebElement cookieAllert;

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


    //====================================================================================

}
