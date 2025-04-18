@asli033
Feature: Checkout and Payment Process

  Background: : Directed to the Payment Page
    Given Open browser and Go to "URL"
    When Click on the login link, Enter "asliCostumerEmail" and "password" and click sign in
    And Click on the "Cart" link on the top
    Then Click on the Proceed to Checkout buttonlink
    When I submit on the Continue to shipping button
    Then I am on the "Payment" Page


  Scenario Outline: Modify Ship to and Contact Information on Payment Page
    Given I am on the "Payment" Page
    When I should see relevant "<information>" about the Payment Page
    Then Click on the Logout link
    Examples:
       | information          |
       | Contact              |
       | Ship to              |



  Scenario: Select Payment and Billing Address Types
    Given I am on the "Payment" Page
    Then I should be able to select different address types

  Scenario: Display Order Summary on Payment Page
    Given I am on the "Payment" Page
    Then I should see the Order Summary information displayed correctly

  Scenario: Redeem Coupons on Checkout Page
    Given I am on the "Checkout" Page
    Then I should be able to enter "couponCode" as coupon code on Code Box
    And  I apply coupon code.


  Scenario: Navigate from Payment Page to Order Completion
    Given I am on the "Payment" Page
    When Click on the Order Now buttonlink
    Then I am on the "Checkout Summary" Page
    Given I should see the message "Thank you for your purchase!"
    And the Order Number should be displayed
    When the Order summary (items purchased) should be displayed
    Then I should have access to the my-purchase-order-details page

