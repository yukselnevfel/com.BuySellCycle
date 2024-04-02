
  Feature:US_028 As a user, I would like to organize notifications from the site and have a page where I can see incoming notifications.

    Background:
      * Open browser and Go to "URL"
      * Close the pop-up message

    Scenario: TC_01 Notification menu operations in Dashboard sidebar
      * Click on the login link, Enter "esraCustomerEmail" and "password" and click sign in
      * Scroll down to the bottom of the dashboard page
      * Clicks on the Notification link and goes to the relevant page
      * Displays Title and Date information of incoming notifications
      * Clicks on the View button and goes to the relevant page
      * Return to notifications page
      * Click on the Setting button and reach the relevant page
      * Updates the Types of Events in the Setting list
      * Close the page

