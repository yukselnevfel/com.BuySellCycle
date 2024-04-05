
@US_035
Feature: US_035 Notifications Section on the Admin Page

  Background:
    Given Open browser and Go to admin "adminUrl"
    And Enter "fikretAdminEmail" and "password" and click sign in

  Scenario: TC_01 Displaying the Notification Icon and Testing Unread Notifications
    * Verify that the notification icon is visible at the top of the page
    * Print the number of unread notifications above the notification icon
    * Close the page

  Scenario: TC_02 Accessing Personal Notification Setting Page from Notification Window
    * Click the notification icon at the top of the page
    * Click on the Personal Notification Setting option from the menu
    * Verify access to the Personal Notification page
    * Close the page

  Scenario: TC_03 Testing Changing Type Tab of Notification Values on Personal Notification Setting Page
    * Click the notification icon at the top of the page
    * Click on the Personal Notification Setting option from the menu
    * Click togle status
    * Verify that the Type tab can toggle active and passive
    * Close the page

  Scenario: TC_05 Testing Access to Notifications List from Notification Window
    * Click the notification icon at the top of the page
    * Click View from the Notification menu
    * Verify that you can access the Notification List page
    * Close the page

  Scenario: TC_06 Testing Accessing Page of Relevant Information Message via Notifications List
    * Click the notification icon at the top of the page
    * Click View from the Relevant menu
    * Click View under Action
    * Click Select buttonLink under Action
    * Access the information page by clicking Details from the dropdown menu
    * Verify the details
    * Close the page

  Scenario: TC_04 Testing Marking Unread Information Messages as Read
    * Click the notification icon at the top of the page
    * Click Read All from the Information menu
    #* Verify that all messages have been read
    * Close the page


