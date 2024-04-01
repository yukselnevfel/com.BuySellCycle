package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.Base;
import utils.ConfigReader;
import utils.Driver;

import static org.junit.Assert.assertEquals;

public class AdminDashboardStepDef extends Base {
    // -------------------------Beytullah---------------------------------
    @Given("Open browser and go to {string}, enter {string}, {string} and click sign in")
    public void open_browser_and_go_to_enter_and_click_sign_in(String adminUrl, String adminMail, String password) {
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
        visitorHomePage.textBoxUserEmail.click();

        visitorHomePage.textBoxUserEmail.sendKeys(ConfigReader.getProperty(adminMail));
        visitorHomePage.textBoxUserPassword.click();
        visitorHomePage.textBoxUserPassword.sendKeys(ConfigReader.getProperty(password));

        visitorHomePage.signInButton.click();
       
        String expectedMessage="Logged In Successfully!";
        String actualMessage=adminDashboard.popUpMessage.getText();
        Assert.assertEquals(expectedMessage,actualMessage);
        // String expectedUrl="https://qa.buysellcycle.com/admin-dashboard";
        // String actualUrl = Driver.getDriver().getCurrentUrl();
        // assertEquals(expectedUrl,actualUrl);
        wait(1);

    }
    @Given("User searches {string} on the admin Dashboard and verifies that the search result is true")
    public void user_searches_on_the_admin_dashboard_and_verifies_that_the_search_result_is_true(String searchText){
        adminDashboard.searchBoxAdminDashboard.sendKeys(searchText);
        String expText="Follow seller History";
        String actText=adminDashboard.searchBoxAdminDashboard.getText();
        Assert.assertEquals(expText,actText);
    }

    // -------------------------Beytullah---------------------------------
}
