Feature: As a logged in user, I want to be able to logout from the site.

  Background:
    * Open browser and Go to "URL"
    * Close the pop-up message

    Scenario: TC_01 Verify that the Logout link is visible and active on the home page
      * Click on the login link, Enter "nevfelCustomerEmail" and "password" and click sign in
      * Verify that the Logout link on the home page is visible
      * Click on the Logout link
  @nn
    Scenario: TC_02 Logout link is visible in Dashboard Side Bar and verify that it is active
      * Click on the login link, Enter "nevfelCustomerEmail" and "password" and click sign in
      * Click on the Dasboard link
      * Verify that Logout is visible and functional in the Dashboard sidebar
















