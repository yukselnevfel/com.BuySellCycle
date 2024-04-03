Feature:

  Background:
    * Open browser and Go to "URL"
    * Close the pop-up message


  Scenario: The New Product deals menu title should be visible and redirectable on the homepage navBar.

    * User verifies that the New Product Deals link is visible
    * User clicks on the New Product Deals link
    * User verifies that navigated to the BEST DEALS page
    * Close the page

  Scenario: Filters for filtering operations should be visible and functional on the left side of the Best Deals page.

    * User clicks on the New Product Deals link
    * User verifies that the filters is visible on the left side
    * User clicks filters and verifies that the filters fulfill their functions
    * Close the page


  Scenario: The Best Deals page should list the latest products.

    * User clicks on the New Product Deals link
    * User verifies that the Product number id visible
    * Close the page

  @123
  Scenario:

    * User clicks on the New Product Deals link
    * Verify that the Listing button, items DDM and sorting DDM is visible
    * User clicks on the Listing button and verifies that button works
    * User clicks on the items DDM and clicks on second item
    * User verifies that items DDM works
    * User clicks on the sorting DDM and clicks on fifth item
    * User verifies that sorting DDM works