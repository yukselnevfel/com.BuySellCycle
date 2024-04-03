
Feature: As a registered user, I would like to have a page on my Dashboard where I can view my orders.

  Background:
    * Open browser and Go to "URL"
    * Close the pop-up message
    * Click on the login link, Enter "simgeCostumerEmail" and "password" and click sign in

  Scenario: "My Order" title must be displayed and active in the Dashboard side bar
    * Verify that My Order link is visible in the Dashboard side bar
    * Close the page

  Scenario: On the My Order page, user orders should be filtered as All, To Pay, To Ship, To Recieve and displayed on separate pages
    * Click on the My Order link in the Dashboard side bar
    * Verify that the All link is visible and clickable
    * Verify that the To Pay link is visible and clickable
    * Verify that the To Ship link is visible and clickable
    * Verify that the To Receive link is visible and clickable
    * Close the page

  Scenario: The number of products to be displayed on a page in My Order List should be selectable
    * Click on the My Order link in the Dashboard side bar
    * Verify that the number of products to be listed is visible and clickable
    * Close the page

  Scenario: The order can be canceled from the ordered product window
    * Click on the My Order link in the Dashboard side bar
    * Verify that the Cancel Order button is visible and clickable, If the order status is not confirmed
    * Close the page

  Scenario: Access to the product detail page should be possible from the ordered product window
    * Click on the My Order link in the Dashboard side bar
    * Verify that the Order Details button is visible and clickable
    * Close the page

  Scenario: Package, Sold By, Price, Shipping Info, Billing Info, Payment Info information for the product should be visible on the product detail page
    * Click on the My Order link in the Dashboard side bar
    * Click on the Order Details link
    * Verify that the Package title is visible
    * Verify that the Sold By title is visible
    * Verify that the Price title is visible
    * Verify that the Shipping Info title is visible
    * Verify that the Billing Info title is visible
    * Verify that the Payment Info title is visible
    * Close the page

  Scenario: The order can be canceled from the product detail page. (If the product has not been delivered or the transactions have not been completed)
    * Click on the My Order link in the Dashboard side bar
    * Click on the Order Details link
    * Verify that the Cancel Order button on detail page is visible and clickable, If the order status is not confirmed
    * Close the page

  Scenario: Each order should be displayed in a separate window (with Order ID, Order date, Status, Order amount, Paid By information)
    * Click on the My Order link in the Dashboard side bar
    * Verify that the Order ID title is visible
    * Verify that the Status title is visible
    * Verify that the Order Date title is visible
    * Verify that the Order Amount title is visible
    * Verify that the Paid By title is visible
    * Close the page
