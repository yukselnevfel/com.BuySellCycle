Feature:

  Background:
    * Open browser and Go to "URL"
    * Close the pop-up message
    * Verify that the "Daily Deals" is visible
    * Click on the "Daily Deals"

  @12/1
  Scenario: The Daily Deals menu item on the homepage navbar should be visible and functional.

    * Verify that the "Deal ends in" is visible

  @12/2
  Scenario: A counter should be visible on the Daily Deals page.

    * User verifies that the Counter is visible

  @12/3
  Scenario: Special promotional products should be visible on the Daily Deals page.

    * User verifies that First product is visible

  @12/4
  Scenario: On the Daily Deals page, you should be able to perform actions on products
  (add to cart, select products for comparison, add to Wish list, and view).
    * Verify that the compare, wishlist, quickwiew, addtocart button is visible
    * Click on the quickwiew button
    * Click on the compare button and verify that successfully pop up is visible
    * Click on the wishlist button and verify that please login first pop up is visible
    * Click on the wishlist button and verify that Item added to your cart text is visible