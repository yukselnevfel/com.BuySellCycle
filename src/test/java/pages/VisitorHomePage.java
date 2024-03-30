package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VisitorHomePage extends Base{


    //Register User Login Locate Homepage>> LoginButton
    @FindBy(xpath = "//*[text()='Login']")
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



}
