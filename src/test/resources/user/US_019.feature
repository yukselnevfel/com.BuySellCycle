 @us19
Feature:As a registered user, I would like to have a My Wishlist page on my Dashboard where I can view the products I like

  Scenario: The My Wishlist menu title appears in the Dashboard sideBar and should be active
    * Log in to the page with valid "userSamet" and "password" information.
    * Verify that the My Wishlist menu is visible
    * Click on My Wishlist
    * Verify that page url is "https://qa.buysellcycle.com/my-wishlist"
    * Close the page

    Scenario: The products you like should be displayed on the My Wishlist page
    * Log in to the page with valid "userSamet" and "password" information.
    * Click on My Wishlist
    * It is verified that the liked products are displayed on the entered page.
    * Close the page
  @failed
    Scenario: The favorite products on the My Wishlist page should be filtered and searched
    * Log in to the page with valid "userSamet" and "password" information.
    * Click on My Wishlist
    * It is verified that there are 8 products on the page
    * Click on the Show 8 Item’s
    * Click on the Show 12 Item’s
    * It is verified that there are 12 products on the page
    * Click on the Show 8 Item’s
    * Click on the Show 16 Item’s
    * It is verified that there are 16 products on the page
    * Select Price (Low to high)
    * Verify that products are sorted from low price to high price
    * Select Price (High to Low)
    * Verify that products are sorted from high price to low price
    * Close the page
  @samet
  Scenario:Operations (adding to cart, selecting products for comparison, viewing and deleting products) should be possible on the products on the My Wishlist page.
    * Log in to the page with valid "userSamet" and "password" information.
    * Click on My Wishlist
    * Add a product to the Compare list and verify that it has been added
    * Click the Quick View button and verify that the product information is displayed
    * Click the Add To Cart button and confirm that the product has been added to the cart
    * Click on the Delete button and confirm that the product has been deleted from Wishlist

