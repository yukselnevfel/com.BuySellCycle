package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class UserDashboard extends Base{

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
    public void tableCellDisplayed(int number){
        for (int i = 0; i < number; i++) {
            tablePurchaseHistory.get(number).isDisplayed();
        }
    }
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

}
