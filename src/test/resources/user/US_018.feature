
@US_018
Feature: US_018 Viewing Purchase History on User Dashboard

  Background:
    Given Open browser and Go to "URL"
    And Close the pop-up message
    And Click on the login link, Enter "fikretCustomerEmail" and "password" and click sign in

  Scenario: TC_01 The Purchase History menu title appears on the Dashboard sideBar and it is tested to be active
    Then the user should see the Purchase History menu in the Dashboard sidebar
    And the user verifies that the Purchase History link is active
    Then Close the page

  Scenario: TC_02 Viewing the shopping history test on the Purchase History page
    And the user clicks on the Purchase History link in the Dashboard sidebar
    Then the user verifies the presence of details such as Details, Amount, Delivery Status, Payment Status, and Action
    Then Close the page

  Scenario: TC_03 Testing filtering by Payment Status in the Purchase History list
    And the user clicks on the Purchase History link in the Dashboard sidebar
    And the user filters the purchase history by Payment Status
    Then the user verifies that the filtering is applied correctly
    Then Close the page

  Scenario: TC_04 Invoice download test under the Action heading in the Purchase History list
    And the user clicks on the Purchase History link in the Dashboard sidebar
    And the user clicks on the invoice download link under Action
    And 5 saniye bekler
    Then the user verifies that the invoice is downloaded successfully
    Then Close the page

  Scenario: TC_05 Test to display Order code, Package code, Delivery Process, Order Details, Order Summary, Payment Type information among the invoice display information
    And the user clicks on the Purchase History link in the Dashboard sidebar
    And the user clicks on the invoice view link under Action
    Then the user verifies the displayed invoice details such as Order code, Package code, Delivery Process, Order Details, Order Summary, and Payment Type
    Then Close the page
