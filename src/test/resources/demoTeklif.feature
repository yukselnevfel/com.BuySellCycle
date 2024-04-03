
@demo
Feature: Ali created a membership registration on "Buysellcycle". After his membership is activated,
  he adds a product to Cart to buy it later. He logs in to "Buysellcycle" with his membership information.
  He decides to buy the product in the Cart and accesses the payment page by following the necessary steps.
  He wants to pay with Stripe, when the Stripe window opens, he decides to pay with another payment method
  and wants to close the Stripe window.

  Scenario: The visitor registers to "Buysellcycle" by entering the necessary information
    * Open browser and Go to "URL"
    * 2 saniye bekler
    * the user clicks the Register button link on the home page
    * 2 saniye bekler
    * the user enters "Ali" "Can" "Az12345."
    * 2 saniye bekler
    * the user clicks SignUp button link
    * 2 saniye bekler
    * the user should be successfully registered and redirected to the sign-in page
    * 1 saniye bekler
    * Close the page

  Scenario: "Buysellcycle" admin approves the registration
    * Open browser and Go to admin "adminUrl"
    * 1 saniye bekler
    * Enter "fikretAdminEmail" and "password" and click sign in
    * 4 saniye bekler
    * Click the notification icon at the top of the page
    * 1 saniye bekler
    * Click View from the Notification menu
    * 2 saniye bekler
    * Click demo register View
    * 2 saniye bekler
    * Clicks and confirms the registration request
    * 1 saniye bekler
    * Close the page

  Scenario: Ali's first shopping experience
    * Open browser and Go to "URL"
    * 2 saniye bekler
    * Click on the login link, Enter "demoEmail" and "demoPassword" and click sign in
    * Click on the "Cart" link on the top
    * 2 saniye bekler
    * Click on the Proceed to Checkout buttonlink
    * 2 saniye bekler
    * I submit on the Continue to shipping button
    * 2 saniye bekler
    * Stripe select
    * 2 saniye bekler
    * Click paynow button
    * Close on stripe window


