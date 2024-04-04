Feature:Ali created a membership registration on "Buysellcycle". After his membership is activated,
  he adds a product to Cart to buy it later. He logs in to "Buysellcycle" with his membership information.
  He decides to buy the product in the Cart and accesses the payment page by following the necessary steps.
  He wants to pay with Stripe, when the Stripe window opens, he decides to pay with another payment method
  and wants to close the Stripe window.

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