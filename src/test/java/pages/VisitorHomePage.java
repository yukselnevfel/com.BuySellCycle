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

    @FindBy (xpath = "//input[@id=\"name\"]")
    public WebElement textBoxName;
    @FindBy (xpath = "//input[@id=\"email\"]")
    public WebElement textBoxEmail;
    @FindBy (xpath = "//textarea[@id=\"message\"]")
    public WebElement textBoxMessage;
    @FindBy (xpath = " (//span[@class=\"current\"])[3]")
    public WebElement checkBoxOrder;
    @FindBy (xpath = "(//li[@data-value=\"2\"])[2]")
    public WebElement linkPayment;
    @FindBy (xpath = "//button[@id=\"contactBtn\"]")
    public WebElement linkSendMessage;
    @FindBy (xpath = "//div[@class=\"contact_info\"]")
    public WebElement textGetinTouch;
    @FindBy(xpath = "//*[@class='toast-message']")
    public WebElement successfullAllert;
    @FindBy (xpath="(//h4[@id='filter_category_title'])[1]")
    public WebElement labelElectronics;

    @FindBy (xpath="//button[text()=\"Telephone\"]")
    public WebElement labelTelephone;

    @FindBy (xpath="//button[@id='tab_link_34']")
    public WebElement labelTVPictureSound;
    @FindBy (xpath="//button[@id='tab_link_35']")
    public WebElement labelPhotoCamera;
    @FindBy (xpath="//button[@id='tab_link_36']")
    public WebElement labelComputerTablet;
    @FindBy (xpath="//button[@id='tab_link_37']")
    public WebElement labelSpecialforPlayers;
    @FindBy (xpath="//button[@id='tab_link_38']")
    public WebElement labelElectronicAccessories;
    @FindBy (xpath="//div[@class=\"product_details_wrapper\"]")
    public WebElement detailOfQuickView;



    @FindBy (xpath="(//a[@data-product-sku='1373'])[1]")
    public WebElement iconCompare ;

    @FindBy (xpath="(//a[@id='wishlistbtn_1373'])[1]")
    public WebElement iconWishlist;

    @FindBy (xpath="(//a[@data-product_id='1373'])[2]")
    public WebElement iconQuickView ;

    @FindBy (xpath="(//a[@data-product-id='1373'])[2]")
    public WebElement iconAddToCart;

    @FindBy (xpath="(//span[text()='More Deals'])[1]")
    public WebElement linkMoreDeals;

    @FindBy (xpath="(//a[@data-product-sku='1534'])[1]")
    public WebElement iconCompareElectronics;

    @FindBy (xpath="(//a[@id='wishlistbtn_1534'])[1]")
    public WebElement iconWishlistElectronics;

    @FindBy (xpath="(//a[@data-product_id='1534'])[2]")
    public WebElement iconQuickViewElectronics;

    @FindBy (xpath="(//a[@data-product-sku='1534'])[2]")
    public WebElement iconAddToCartElectronics;
    @FindBy (xpath="(//div[@class=\"product_widget5 style4 mb-0 style5\"])[1]")
    public WebElement imagePhone;
    @FindBy (xpath="(//div[@class=\"product_widget5 style4 mb-0 style5\"])[9]")
    public WebElement imageTV;



















            @FindBy(xpath = "//*[@href='https://qa.buysellcycle.com/blog']")
    public WebElement linkHeaderBlog;

    @FindBy(xpath = "//*[@class='close_modal']")
    public WebElement cookieAllert;



}
