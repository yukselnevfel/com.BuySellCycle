@nev
Feature: When shopping on a website, I want a section where I can view the status of my orders.

  Background:
    * Open browser and Go to "URL"
    * Close the pop-up message

    Scenario:Display Order Tracking Number textbox on Track Order page and verify that it is active

      * Click on the Track your Order link
      * Verify that the Order Tracking Number text is visible
      * Verify that Order Tracking Number is clickable
      * Close the page


      Scenario:
