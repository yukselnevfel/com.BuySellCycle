package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VisitorHomePage extends Base{

    @FindBy(xpath = "//*[@href='https://qa.buysellcycle.com/blog']")
    public WebElement linkHeaderBlog;

    @FindBy(xpath = "//*[@class='close_modal']")
    public WebElement cookieAllert;


}
