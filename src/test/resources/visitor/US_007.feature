@a
Feature:

  Background:
    * Open browser and Go to "URL"
    * Close the pop-up message
    * User verifies that the New Product Deals link is visible
    * User clicks on the New Product Deals link

  @7/1
  Scenario: The New Product deals menu title should be visible and redirectable on the homepage navBar.

    * User verifies that navigated to the BEST DEALS page
    * Close the page

  @7/2
  Scenario: Filters for filtering operations should be visible and functional on the left side of the Best Deals page.

    * User verifies that the filters is visible on the left side
    * User clicks filters and verifies that the filters fulfill their functions
    * Close the page

  @7/3
  Scenario: The Best Deals page should list the latest products.

    * User verifies that the Product number id visible
    * Close the page

  @7/4
  Scenario: Listing and display settings for the products appearing on the Best Deals page can be changed.

    * Verify that the Listing button, items DDM and sorting DDM is visible
    * User clicks on the Listing button and verifies that button works
    * User clicks on the items DDM and clicks on second item
    * User verifies that items DDM works
    * User clicks on the sorting DDM and clicks on fifth item
    * User verifies that sorting DDM works

  @7/5
  Scenario: After filtering the products appearing on the Best Deals page, listing and display settings should be able to be changed.
    * Click on the Woman's Apperal checkbox
    * User clicks on the Listing button and verifies that button works
    * User clicks on the items DDM and clicks on second item
    * User verifies that items DDM works
    * User clicks on the sorting DDM and clicks on fifth item
    * User verifies that sorting DDM works

  @7/6
  Scenario: After clicking on the filter on the Best Deals page, you should be directed to the top of the page
    * Click on the Pull And Bear checkbox
    * Verify that the page is redirected to the top

  @7/7
  Scenario: The refresh button on the Best Deals page should be visible and functional.

    * Verify that the Refresh button is visible
    * Click on the Refresh button
    * Verify that the page is refreshed