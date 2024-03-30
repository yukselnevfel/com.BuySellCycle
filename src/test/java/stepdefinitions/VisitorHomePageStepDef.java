package stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import pages.Base;
import utils.Driver;
import utils.ConfigReader;
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
    public void verify_that_the_is_visible() {assertTrue(visitorHomePage.linkHeaderBlog.isDisplayed());
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
        visitorHomePage.blogSearchBox.sendKeys("metaverse "+ Keys.ENTER);
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
}

