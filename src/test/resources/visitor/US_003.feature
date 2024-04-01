@nev
Feature:US_003  When shopping on a website, I want a section where I can view the status of my orders.

  Background:
    * Open browser and Go to "URL"
    * Close the pop-up message

    Scenario:TC_01 Display Order Tracking Number textbox on Track Order page and verify that it is active

      * Click on the Track your Order link
      * Verify that the Order Tracking Number text is visible
      * Verify that Order Tracking Number is clickable
      * Close the page


      Scenario:TC_02 Track Now button appears on the Track Order page and verify that it is active
        * Click on the Track your Order link
        * Verify that Track Now button is visible
        * Verify that Track Now button is clickable
        * Close the page


       Scenario:TC_03 Display warning message when an invalid order number is entered in the Order Tracking Number textBox
        * Click on the Track your Order link
        * Enter a unvalid "1234567890" password in the Order Tracking Number field
        * Enter a unvalid "1234567890" password in the Secret ID
        * Click on the Track Now
        * Show warning message on the page
        * Close the page


      Scenario:TC_04 Inquiring the current status of the order when the current order number is entered in the Order Tracking Number textbox
        * Click on the Track your Order link
        * Enter a valid "20240323000030" password in the Order Tracking Number field
        * Click on the Track Now
        * Displays current status of the order
        * Close the page
