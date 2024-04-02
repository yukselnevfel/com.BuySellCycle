@us31
Feature: As a user, I would like to have a cart page where I can throw the products
         I intend to buy while shopping and then I can do my shopping transactions

  Scenario: The Cart page must be accessed from the home page
    * Open browser and Go to "bSCUrl"
    * Close the pop-up message
    * Click on the "Cart"
    * Verify that page url is "https://qa.buysellcycle.com/cart"
    * Close the page
  @bug
    Scenario: Products placed in the cart should be listed (with PRODUCTS, PRICE, QUANTITY, SUBTOTAL information)
              and access to detail windows should be provided.
    * Open browser and Go to "bSCUrl"
    * Close the pop-up message
    * Add an item to the cart
    * Verify that PRODUCTS, PRICE, QUANTITY, SUBTOTAL information appears
    * Click on the product
    * Verify that you have navigated to the product detail page
    * Close the page

  Scenario: The quantity information of the products in the cart should be updated, the total price along with the quantity information
            should be updated and the product can be deleted from the list.
    * Open browser and Go to "bSCUrl"
    * Close the pop-up message
    * Add an item to the cart
    * Click on the + button to the right of the product and verify that the product quantity increased by one
    * Verify that the product price has doubled
    * Click on the delete button to the right of the product
    * Verify that the product has been deleted
    * Close the page

  Scenario: Relevant pages (Continue Shopping, Proceed To Checkout) should be easily accessed from the cart page
    * Open browser and Go to "bSCUrl"
    * Close the pop-up message
    * Add an item to the cart
    * Click on the "Proceed to checkout"
    * Verify that the "Contact Information" is visible
    * Click on the "Return To Cart"
    * Click on the "Continue Shopping"
    * Verify that page url is "https://qa.buysellcycle.com/"
    * Close the page
  @samet
  Scenario: Order Summary information should be visible on the cart page, and discount amounts of the products should be displayed
    * Open browser and Go to "bSCUrl"
    * Close the pop-up message
    * Add an item to the cart
    * Verify that the "Order Summary" is visible
    * Verify that the "Discount" is visible
    * Close the page