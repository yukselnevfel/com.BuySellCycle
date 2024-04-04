@u27
Feature:As a registered user, I would like to be able to view the sellers I follow on one page.

  Background:
    * Open browser and Go to "bSCUrl"
    * Click on the login link, Enter "asliCostumerEmail" and "password" and click sign in
    * Navigate to Dashboard
    * Verify that the Follow menu is visible and enabled in the sidebar
    * Click on Follow Menu Item


  Scenario:
    * Verify that the Follow seller History List displayed
    * Click on the Unfollow button on the Follow page
    * Verify that the selected seller is removed from the Follow Seller History List
    * Verify that the Empty List text ist displayed.