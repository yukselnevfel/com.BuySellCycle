Feature: Checkout and Payment Process

  Background: : Accessing the About page
    Given Open browser and Go to "URL"
    Then Click on the login link, Enter "asliCostumerEmail" and "password" and click sign in

@asliU33
  Scenario: Navigate from Checkout to Payment Page
    Given I am on the "Checkout" Page
    When Click on the "Continue To Shipping"
    Then I should be directed to the "Payment" page


  Scenario Outline: Modify Ship to and Contact Information on Payment Page
    Given I am on the "Payment" Page
    When I should see relevant "<information>" about the Payment Page
    Then I should be able to modify the displayed information
    Examples:
       | information          |
       | Contact              |
       | Ship to              |



  Scenario: Select Payment and Billing Address Types
    Given I am on the "Payment" Page
    When I navigate to the Payment and Billing address section
    Then I should be able to select different address types

  Scenario: Display Order Summary on Payment Page
    Given I am on the "Payment" Page
    Then I should see the Order Summary information displayed correctly

  Scenario: Redeem Coupons on Checkout Page
    Given I am on the "Checkout" Page
    When I apply coupons
    Then they should be redeemable

  Scenario: Navigate from Payment Page to Order Completion
    Given I am on the "Payment" Page
    When Click on the "Order Now"
    Then I should be redirected to the order completion page immediately

  Scenario: Verify Order Completion Page
    Given I have completed the order
    Then I should see the message "Thank you for your purchase!"
    And the Order Number should be displayed
    And the Order summary (items purchased) should be displayed
    And I should have access to the my-purchase-order-details page

  Scenario: Return to Home Page After Order Completion
    Given I have completed the order
    When I finish the transaction
    Then the site should return to the home page