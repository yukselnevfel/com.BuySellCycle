Feature:As a registered user, I would like to be able to view the sellers I follow on one page.

  Background:
    * Open browser and Go to "URL"
    * Close the pop-up message
    * Click on the login link, Enter "asliCustomerEmail" and "password" and click sign in
    * Navigate to Dashboard
    * Verify that the "Follow" menu is visible and enabled in the sidebar
    * Click on the "Follow"

  Scenario:
    * Verify that the "Follow seller History List" displayed
    * Click on the "Unfollow"
    * Verify that the selected seller is removed from the Follow Seller History List
    * Verify that the Empty List text ist displayed.