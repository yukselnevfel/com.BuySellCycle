
Feature: As a registered user, I would like to have a page on my Dashboard where I can view my orders.

  Background:
    * Open browser and Go to "URL"
    * Close the pop-up message
    * Click on the login link, Enter "simgeCostumerEmail" and "password" and click sign in
@simge
  Scenario: Access to My Wishlist page must be provided
    * Verify that My Wishlist link is visible in the Dashboard side bar
    * Close the page

  Scenario: The products that the user likes/chooses should be listed on the My Wishlist page
    * Click on the My Wishlist link in the Dashboard side bar
    * Verify that the products added to the Wishlist are listed
    * Close the page

  Scenario: In Wishlist, products should be filtered according to New
    * Click on the New Product Deals
    * Add to wishlist first product
    * Click on the Wishlist link in the header
    * Verify that the New bar is visible
    * Click on the New bar
    * Click on the New button
    * Verify that the products are sorted from newest to oldest
    * Close the page

  Scenario: In Wishlist, products should be filtered according to Old
    * Click on the New Product Deals
    * Add to wishlist second product
    * Click on the Wishlist link in the header
    * Click on the New bar
    * Click on the Old button
    * Verify that the products are sorted from oldest to newest
    * Close the page

  Scenario: In Wishlist, products should be filtered according to Price (Low to high)
    * Click on the My Wishlist link in the Dashboard side bar
    * Click on the New bar
    * Click on the Price (Low to high) button
    * Verify that products are sorted from low to high prices
    * Close the page

 Scenario: In Wishlist, products should be filtered according to Price (High to low)
    * Click on the My Wishlist link in the Dashboard side bar
    * Click on the New bar
    * Click on the Price (High to low) button
    * Verify that products are sorted from high to low prices
    * Close the page

 Scenario: 8 items to be displayed on the Wishlist page
    * Click on the My Wishlist link in the Dashboard side bar
    * Verify that the Show Item's bar is visible
    * Click on the Show 8 Item's  button
    * Verify that 8 products are displayed on the page
    * Close the page

 Scenario: 12 items to be displayed on the Wishlist page
    * Click on the My Wishlist link in the Dashboard side bar
    * Verify that the Show Item's bar is visible
    * Click on the Show 12 Item's  button
    * Verify that 12 products are displayed on the page
    * Close the page

 Scenario: 16 items to be displayed on the Wishlist page
    * Click on the My Wishlist link in the Dashboard side bar
    * Verify that the Show Item's bar is visible
    * Click on the Show 16 Item's  button
    * Verify that 16 products are displayed on the page
    * Close the page

 Scenario: 24 items to be displayed on the Wishlist page
    * Click on the My Wishlist link in the Dashboard side bar
    * Verify that the Show Item's bar is visible
    * Click on the Show 24 Item's  button
    * Verify that 24 products are displayed on the page
    * Close the page

 Scenario: 32 items to be displayed on the Wishlist page
    * Click on the My Wishlist link in the Dashboard side bar
    * Verify that the Show Item's bar is visible
    * Click on the Show 32 Item's  button
    * Verify that 32 products are displayed on the page
    * Close the page

 Scenario: The Compare icon should be displayed and the products should be added to the compare page in the Wishlist
    * Click on the My Wishlist link in the Dashboard side bar
    * Verify that the compare icon is visible for the first product on My Wishlist page
    * Click on the compare icon for the first product on My Wishlist page
    * Verify that the product is added to the compare list
    * Close the page

 Scenario: Access to the details of the products on Wishlist must be provided
    * Click on the My Wishlist link in the Dashboard side bar
    * Verify that the quick view icon is visible for the first product in  My Wishlist page
    * Click on the quick view icon for the first product in My Wishlist page
    * Verify that the detail window for the relevant product has opened
    * Close the page

 Scenario: The desired product on Wishlist should be able to be deleted from Wishlist
    * Click on the My Wishlist link in the Dashboard side bar
    * Verify that the delete icon is visible for the first product in  My Wishlist page
    * Click on the delete icon for the first product in My Wishlist page
    * Verify that the Are you sure to delete?  query screen is visible
    * Click on the Delete button
    * Verify that the relevant product has been deleted"
    * Close the page

  Scenario: The selected product in Wishlist must be able to be added to the shopping cart
     * Click on the My Wishlist link in the Dashboard side bar
     * Verify that the add to cart icon is visible for the first product in  My Wishlist page
     * Click on the add to cart icon for the first product in My Wishlist page
     * Verify that the Item added to your cart warning is visible
     * Close the page