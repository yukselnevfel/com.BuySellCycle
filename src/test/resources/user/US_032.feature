
Feature:US_032 As a user, I would like to have a check page before I pay for the products
         I am considering to buy (put in the cart).

  Background:
    * Open browser and Go to "URL"
    * Close the pop-up message
  @nnn
    Scenario: TC_01 Providing access to the payment page for the products specified from the cart page
      * Click on the login link, Enter "nevfelCustomerEmail" and "password" and click sign in
      * Click on the Cart link on the top bar of the site and you will be redirected to the relevant page
      * Click on the Proceed to Checkout button
      * Close the page
  @nnn
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

      Scenario: TC_04 Contact Information information should be displayed on the checkout page,
               subscriber registration should be possible and a note should be entered in the Note field
        * Click on the login link, Enter "nevfelCustomerEmail" and "password" and click sign in
        * Click on the Cart link on the top bar of the site and you will be redirected to the relevant page
        * Click on the Proceed to Checkout button
        * Scrolls the page until you see the Contact Information heading
        * Verify that contact details are displayed
        * Click on the subscriber button
        * Click on the Note textbox
        * Enters message "Hello:)" in Note section

      Scenario: TC_05 I agree to the terms and conditions on the checkout page.
              there should be an obligation to check the checkBox
        * Click on the login link, Enter "nevfelCustomerEmail" and "password" and click sign in
        * Click on the Cart link on the top bar of the site and you will be redirected to the relevant page
        * Click on the Proceed to Checkout button
        * Scrolls the page until you see the Continue To Shipping Button
        * Verify that the Return To Cart button is active
        * Click on the Continue To Shipping
        * Verify that there is an obligation to check the checkBox "Please Agree With Terms"












