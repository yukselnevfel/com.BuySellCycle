
Feature:US_017 As a registered user, I would like to have a dedicated dashboard page on the site to check my actions and settings on the site.

  Background:
    * Open browser and Go to "URL"
    * Close the pop-up message
  @nv
    Scenario: TC_01 Verify that the Dashboard link is visible and active on the home page
      * Click on the login link, Enter "nevfelCustomerEmail" and "password" and click sign in
      * Verify that the Dasboard link is visible and functional
      * Close the page

      Scenario: TC_02 View user profile information, balance information, recent transaction information on Dashboard page
      * Click on the login link, Enter "nevfelCustomerEmail" and "password" and click sign in
      * Click on the Dasboard link
      * Verify that user profile information is displayed on the Dashboard page
      * Verify that user balance information is displayed on the Dashboard page
      * Verify that user recent transaction information is displayed on the Dashboard page
      * Close the page

    Scenario: TC_03 Display summary information boards for the user on the Dashboard page and verify that it is active
      * Click on the login link, Enter "nevfelCustomerEmail" and "password" and click sign in
      * Click on the Dasboard link
      * Verify that user summary information boards are displayed on the Dashboard page
      * Verify that user summary information boards are active on the Dashboard page
      * Close the page
  @n
    Scenario: TC_04 Viewing the information of related transactions
    (Purchase History, My Wishlist, Recent Order, Product in Cart) in the body section of the Dashboard page
      * Click on the login link, Enter "nevfelCustomerEmail" and "password" and click sign in
      * Click on the Dasboard link
      * Verify that Purchase History information is displayed on the Dashboard page
      * Verify that My Wishlist is displayed on the Dashboard page
      * Verify that Recent Order is displayed on the Dashboard page
      * Confirm that Product in Cart is displayed on the Dashboard page
      * Close the page



























