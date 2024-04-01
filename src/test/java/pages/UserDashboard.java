package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
    @FindBy(xpath = "(//a[@class=\"position-relative d-flex align-items-center\"])[3]")
    public WebElement linkMyOrder;
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
    public WebElement textPackage  ;




 public void tableCellDisplayed(int number){
        for (int i = 0; i < number; i++) {
            tablePurchaseHistory.get(number).isDisplayed();
        }
    }

}
