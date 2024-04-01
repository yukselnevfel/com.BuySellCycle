@Kagan
  Feature:
    As a user, I want a page featuring exclusive discounts and campaigns tailored for new users to expand the site's user base.

    Background:

      * Open browser and Go to "URL"

      * Close the pop-up message

    Scenario: TC_01 New User Zone page on the home page should be viewable and it should be verified that
    the New User Zone page can be accessed

      * Click on the "New User Zone" button
      * New User Zone should be displayed on the home page navBar and the page should be accessed


    Scenario: TC_02 Verify that "For You", "Exclusive Price", "Coupon" are displayed and it should be possible to switch between tabs

      * Click on the "For You" button
      * Verify that the "Producs" text is visible
      * Verify that the Coupon photo is visible


    Scenario: TC_03 Products in the "For You" section should be displayed

      * Click on the "For You" button
      * Verify that Products in the For You section is visible


    Scenario: TC_04 Products in the "For You" section should be displayed

      * Click on the "Exlusive Price" button
      * Verify that Products in the Exclusive Price section is visible


    Scenario: TC_05
    The ticket should be accessible via the "Get Now" button in the "Coupon" Section, displaying products under the "New User Gift!" text.

      * Click on the "Coupon" button
      * Verify that Products in the is visible
      * Click on the "Get Now" button
      * Verify that Coupon has been successfully visible
