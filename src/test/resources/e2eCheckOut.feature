Feature: Checkout Process

  Background: : Directed to the Payment Page
    Given Open browser and Go to "URL"
    When Click on the login link, Enter "asliCostumerEmail" and "password" and click sign in


  @e2e
  Scenario: User adds items to the cart and proceeds to checkout

    When I should click on the "Home" on the header
    And   Click on the Telephone link in Electronics category on homepage
    Then  Click on the add to cart icon for the first product in Electronics category on homepage
    And   Click on the "Cart" link on the top
    Then  Click on the Proceed to Checkout buttonlink
    And  I should be able to write a note "Hi, there! TEAM 3 :)"
    When I submit on the Continue to shipping button
    Then I am on the "Payment" Page
    Given I should be able to select the Snipe Payment Method
    Then I should be able to enter "couponCode" as coupon code on Code Box
    And  I apply coupon code.
    When Click on the Pay Now buttonlink
    Then I should be able to click on email box on Stripe Payment
    And I should be able to enter "asliCostumerEmail" on the email box
    When  I should be able to enter "cardNo" on the card number box
    When  I should be able to enter "expDate" on the exp box
    Then  I should be able to enter "cvc" on the cvc box
    And I should be able to submit the payment
    Given I should see the message "Thank you for your purchase!"
    And the Order Number should be displayed
    Then Click on the Logout link


