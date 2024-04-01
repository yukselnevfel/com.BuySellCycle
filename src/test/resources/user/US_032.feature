
Feature:US_032 As a user, I would like to have a check page before I pay for the products
         I am considering to buy (put in the cart).

  Background:
    * Open browser and Go to "URL"
    * Close the pop-up message

    Scenario: TC_01 Providing access to the payment page for the products specified from the cart page
      * Click on the login link, Enter "nevfelCustomerEmail" and "password" and click sign in
      * Click on the Cart link on the top bar of the site and you will be redirected to the relevant page
      * Click on the Proceed to Checkout button
      * Close the page

    Scenario: TC_02 Display the number of products to be purchased, how many of each product
     to be purchased and product pricing on the checkout page
      * Click on the login link, Enter "nevfelCustomerEmail" and "password" and click sign in
      * Click on the Cart link on the top bar of the site and you will be redirected to the relevant page
      * Click on the Proceed to Checkout button
      * Displays the information of the product she wants to buy on the navigated page
      * Close the page
  @nnn
      Scenario: TC_03 The amount to be paid on the checkout page should be displayed on the page
        * Click on the login link, Enter "nevfelCustomerEmail" and "password" and click sign in
        * Click on the Cart link on the top bar of the site and you will be redirected to the relevant page
        * Click on the Proceed to Checkout button
        * Verify that it displays the total price

      Scenario: TC_04










