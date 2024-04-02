@us22
Feature: As a registered user, I would like to have a page on my dashboard
         where I can display my coupons / perform coupon transactions

  Scenario: The My Coupons menu title appears in the Dashboard sideBar and should be active
    * Log in to the page with valid "userSamet" and "password" information.
    * Verify that the My Couppons menu is visible
    * Click on My Couppons
    * Verify that page url is "https://qa.buysellcycle.com/profile/coupons"
    * Close the page

  Scenario: The Add Coupons window should be visible on the MY Coupons page and a new coupon should be added
    * Log in to the page with valid "userSamet" and "password" information.
    * Click on My Couppons
    * Verify that the Add Coupons is visible
    * Write "couponCode" in the code section
    * Click on the Add Coupon button
    * Verify that the "couponCode" has been added
    * Close the page

  Scenario: Coupons that the user has previously collected should be listed as Collected Coupons list,
            and the coupons in the list should be copied and deleted from the list.
    * Log in to the page with valid "userSamet" and "password" information.
    * Click on My Couppons
    * Verify that coupons are listed under the Collected Coupons heading
    * Click on the copy icon under the Action heading of the coupon
    * Confirms that copying has occurred
    * Click on the delete icon under the Action heading of the coupon
    * Verify that the deletion has occurred
    * Close the page
