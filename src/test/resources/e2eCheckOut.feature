Feature: Checkout Process

  Background: : Directed to the Payment Page
    Given Open browser and Go to "URL"
    When Click on the login link, Enter "asliCostumerEmail" and "password" and click sign in
    And Click on the "Cart" link on the top
    Then Click on the Proceed to Checkout buttonlink
    When I submit on the Continue to shipping button
    Then I am on the "Payment" Page

  Scenario: User adds items to the cart and proceeds to checkout

    Given I am on the "Payment" Page
    When Click on the Order Now buttonlink
    Then I am on the "Checkout Summary" Page
    Given I should see the message "Thank you for your purchase!"
    And the Order Number should be displayed