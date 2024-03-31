package pages;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
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

    public void tableCellDisplayed(int number){
        for (int i = 0; i < number; i++) {
            tablePurchaseHistory.get(number).isDisplayed();
        }
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

}
