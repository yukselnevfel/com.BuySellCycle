package stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.Base;
import utils.Driver;
import utils.ConfigReader;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class VisitorHomePageStepDef extends Base {

    //-------------Login Steps AYCA-----------------//


    //-------------Login Steps FIKRET-----------------/

    @Given("Open browser and Go to {string}")
    public void open_browser_and_go_to(String bSCUrl) {
        Driver.getDriver().get(ConfigReader.getProperty("bSCUrl"));
    }

    @Given("Close the pop-up message")
    public void close_the_pop_up_message() {
        if (visitorHomePage.cookieAllert.isDisplayed() && visitorHomePage.cookieAllert.isEnabled()) {
            visitorHomePage.cookieAllert.click();
        }
    }

    @Given("Verify that the Blog link is visible")
    public void verify_that_the_is_visible() {
        assertTrue(visitorHomePage.linkHeaderBlog.isDisplayed());
    }

    @Given("Verify that the Blog link is active")
    public void verify_that_the_is_active() {
        assertTrue(visitorHomePage.linkHeaderBlog.isEnabled());
    }

    @Given("Click on the Blog link")
    public void click_on_the() {
        visitorHomePage.linkHeaderBlog.click();
    }

    @Given("Verify that navigated to the Blog Page")
    public void verify_that_navigated_to_the_page() {
        assertEquals("https://qa.buysellcycle.com/blog", Driver.getDriver().getCurrentUrl());
    }

    @Given("Verify that navigated to the Read More Page")
    public void verify_that_navigated_to_the_read_more_page() {
        clickWithJS(visitorHomePage.linkReadMore);
        assertTrue(visitorHomePage.labelCategoryText.isDisplayed());
    }

    @Given("Enter a keyword into the search texBox and press Enter")
    public void enter_a_keyword_into_the_tex_box_and_press() {
        visitorHomePage.blogSearchBox.sendKeys("metaverse " + Keys.ENTER);
    }

    @Given("Verify that the search results are relevant to the entered keyword")
    public void verify_that_the_search_results_are_relevant_to_the_entered_keyword() {
        assertTrue(visitorHomePage.labelMetaverseText.getText().contains("Metaverse"));
    }

    @When("Select a category from the Category section")
    public void select_a_category_from_the_category_section() {
        clickWithJS(visitorHomePage.selectCategoryPost);
    }

    @Then("Verify that blogs related to the selected category are listed")
    public void verify_that_blogs_related_to_the_selected_category_are_listed() {
        assertEquals("https://qa.buysellcycle.com/blog/category/posts/e-commerce-7", Driver.getDriver().getCurrentUrl());
    }

    @When("Select a keyword from the Keyword section")
    public void select_a_keyword_from_the_keyword_section() {
        visitorHomePage.blogKeyword.sendKeys("shopping");
    }

    @Then("Verify that relevant blogs are listed based on the selected keyword")
    public void verify_that_relevant_blogs_are_listed_based_on_the_selected_keyword() {
        String actualTagName = visitorHomePage.blogKeyword.getTagName();
        String expectedTagName = "shopping";
        assert actualTagName.equals(expectedTagName) : "Something went wrong";
    }

    @When("Select a category from the Popular Posts section")
    public void select_a_category_from_the_popular_posts_section() {
        clickWithJS(visitorHomePage.popularCategoryBlog);
    }

    @Then("Verify that the page with the selected blog post has been accessed")
    public void verify_that_the_page_with_the_selected_blog_post_has_been_accessed() {
        assertTrue(Driver.getDriver().getCurrentUrl().startsWith("https://qa.buysellcycle.com/blog/post/"));

    }


    @Given("Close the page")
    public void close_the_page() {
        Driver.quitDriver();
    }


//====================STEPS ESRA BASLANGIC=============================================

    @Given("Displays the Track Your Order link on the top bar of the site")
    public void displays_the_track_your_order_link_on_the_top_bar_of_the_site() {
        assertTrue(visitorHomePage.linkTextTrackYourOrder.isDisplayed());
    }

    @Given("Displays the Compare link on the top bar of the site")
    public void displays_the_compare_link_on_the_top_bar_of_the_site() {
        assertTrue(visitorHomePage.linkTextCompare.isDisplayed());
    }

    @Given("Displays the Wish List link on the top bar of the site")
    public void displays_the_wish_list_link_on_the_top_bar_of_the_site() {
        assertTrue(visitorHomePage.linkTextWishList.isDisplayed());
    }

    @Given("Displays the Cart link on the top bar of the site")
    public void displays_the_cart_link_on_the_top_bar_of_the_site() {
        assertTrue(visitorHomePage.linkTextCart.isDisplayed());
    }

    @Given("Displays the New User Zone link on the top bar of the site")
    public void displays_the_new_user_zone_link_on_the_top_bar_of_the_site() {
        assertTrue(visitorHomePage.linkTextNewUserZone.isDisplayed());
    }

    @Given("Displays the Daily Deals link on the top bar of the site")
    public void displays_the_daily_deals_link_on_the_top_bar_of_the_site() {
        assertTrue(visitorHomePage.linkTextDailyDeals.isDisplayed());
    }

    @Given("Click on the Track your Order link on the top bar of the site and you will be redirected to the relevant page")
    public void click_on_the_track_your_order_link_on_the_top_bar_of_the_site_and_you_will_be_redirected_to_the_relevant_page() {
        clickWithJS(visitorHomePage.linkTextTrackYourOrder);
        assertTrue(visitorHomePage.buttonTrackNow.isDisplayed());
    }

    @Given("Click on the Compare link on the top bar of the site and you will be redirected to the relevant page")
    public void click_on_the_compare_link_on_the_top_bar_of_the_site_and_you_will_be_redirected_to_the_relevant_page() {
        clickWithJS(visitorHomePage.linkTextCompare);
        assertTrue(visitorHomePage.titleProductCompare.isDisplayed());
    }

    @Given("Click on the WishList link on the top bar of the site and you will be redirected to the relevant page")
    public void click_on_the_wish_list_link_on_the_top_bar_of_the_site_and_you_will_be_redirected_to_the_relevant_page() {
        clickWithJS(visitorHomePage.linkTextWishList);
        assertTrue(visitorHomePage.titleSignIn.isDisplayed());
    }

    @Given("Click on the Cart link on the top bar of the site and you will be redirected to the relevant page")
    public void click_on_the_cart_link_on_the_top_bar_of_the_site_and_you_will_be_redirected_to_the_relevant_page() {
        clickWithJS(visitorHomePage.linkTextCart);
        assertTrue(visitorHomePage.titleOrderSummary.isDisplayed());
    }

    @Given("Click on the New User Zone link on the top bar of the site and you will be redirected to the relevant page")
    public void click_on_the_new_user_zone_link_on_the_top_bar_of_the_site_and_you_will_be_redirected_to_the_relevant_page() {
        clickWithJS(visitorHomePage.linkTextNewUserZone);
        assertTrue(visitorHomePage.titleSurpriseForNewUsers.isDisplayed());
    }

    @Given("Click on the Daily Deals link on the top bar of the site and you will be redirected to the relevant page")
    public void click_on_the_daily_deals_link_on_the_top_bar_of_the_site_and_you_will_be_redirected_to_the_relevant_page() {
        clickWithJS(visitorHomePage.linkTextDailyDeals);
        assertTrue(visitorHomePage.titleDealEndsIn.isDisplayed());
    }

    @When("Return to Home page")
    public void returnToHomePage() {
        Driver.getDriver().navigate().back();
    }

    @Given("Clicks on the Site logo")
    public void clicks_on_the_site_logo() {
        clickWithJS(visitorHomePage.logoSite);
    }

    @Given("Refreshes the home page")
    public void refreshes_the_home_page() {

        String expectedTitle = "BuySellCycle | Multivendor Marketplace";
        String actualTitle = Driver.getDriver().getTitle();
        assertEquals(expectedTitle, actualTitle);
    }

    @When("Click to the search box")
    public void clickToTheSearchBox() {
        clickWithJS(visitorHomePage.searchTextBox);
    }

    @When("User searches for products in the search box")
    public void userSearchesForProductsInTheSearchBox() {
        waitAndSendText(visitorHomePage.searchTextBox,"Belt");
        wait(2);

    }

    @When("Displays All Categories dropdown")
    public void displaysAllCategoriesDropdown() {
        assertTrue(visitorHomePage.linkAllCategories.isDisplayed());
    }

    @When("Click All Categories dropdown menu")
    public void clickAllCategoriesDropdownMenu() {
       clickWithJS(visitorHomePage.linkAllCategories);
    }

    @When("Displays the subheadings of the dropdown menu that opens")
    public void displaysTheSubheadingsOfTheDropdownMenuThatOpens() {
        //AllCategories alt basliklarini goruntuler
        wait(2);
        assertTrue(visitorHomePage.linkElectronics.isDisplayed());
        assertTrue(visitorHomePage.linkFashion.isDisplayed());
        assertTrue(visitorHomePage.linkBaby.isDisplayed());
        assertTrue(visitorHomePage.linkHomeFurniture.isDisplayed());
        assertTrue(visitorHomePage.linkSporOutdoor.isDisplayed());
        assertTrue(visitorHomePage.linkAccessories.isDisplayed());
        assertTrue(visitorHomePage.linkBeauty.isDisplayed());
        assertTrue(visitorHomePage.linkBookStationery.isDisplayed());
        assertTrue(visitorHomePage.linkHobiMusic.isDisplayed());
        assertTrue(visitorHomePage.linkSupermarket.isDisplayed());
        assertTrue(visitorHomePage.linkAutoGardenDiyStore.isDisplayed());
    }

    @Given("Click the Electronics link")
    public void click_the_electronics_link() {

    }
    @Given("Displays Electronics subcategories")
    public void displays_electronics_subcategories() {

    }
    @Given("Click the Fashion link")
    public void click_the_fashion_link() {

    }
    @Given("Displays Fashion subcategories")
    public void displays_fashion_subcategories() {

    }
    @Given("Click the Baby link")
    public void click_the_baby_link() {

    }
    @Given("Displays Baby subcategories")
    public void displays_baby_subcategories
    }
    @Given("Click the Home-Furniture link")
    public void click_the_home_furniture_link() {

    }
    @Given("Displays  Home-Furniture subcategories")
    public void displays_home_furniture_subcategories() {

    }
    @Given("Click the Sport-Outdoor link")
    public void click_the_sport_outdoor_link() {

    }
    @Given("Displays Sport-Outdoor subcategories")
    public void displays_sport_outdoor_subcategories() {

    }
    @Given("Click the Accessories link")
    public void click_the_accessories_link() {

    }
    @Given("Displays Accessories subcategories")
    public void displays_accessories_subcategories() {

    }
    @Given("Click the Beauty link")
    public void click_the_beauty_link() {

    }
    @Given("Displays Beauty subcategories")
    public void displays_beauty_subcategories() {

    }
    @Given("Click the Book-Stationery link")
    public void click_the_book_stationery_link() {

    }
    @Given("Displays Book-Stationery subcategories")
    public void displays_book_stationery_subcategories() {

    }
    @Given("Click the Hobi-Music link")
    public void click_the_hobi_music_link() {

    }
    @Given("Displays Hobi-Music subcategories")
    public void displays_hobi_music_subcategories() {

    }
    @Given("Click the Supermarket link")
    public void click_the_supermarket_link() {

    }
    @Given("Displays Supermarket subcategories")
    public void displays_supermarket_subcategories() {

    }
    @Given("Click the Auto-Garden-DiyStore link")
    public void click_the_auto_garden_diy_store_link() {

    }
    @Given("Displays Auto-Garden-DiyStore subcategories")
    public void displays_auto_garden_diy_store_subcategories() {

    }





    //=============STEPS ESRA SONU=================================


}
