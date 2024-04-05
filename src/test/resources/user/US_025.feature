@11
Feature: As a registered user, I would like to have a page where I can create a referral code and perform related actions.

  Background:
    * Open browser and Go to "URL"
    * Click on the login link, Enter "bytCostumerEmail" and "password" and click sign in

  @25/1
  Scenario: Referral menu item should be visible and active in Dashboard sidebar.

    * Verify that the "Referral" is visible

  @25/2
  Scenario: My referral code and User List windows should be visible on the referral page.
    * User clicks on the Referral
    * Close the page

  @25/3
  Scenario: My referral code and User List windows should be visible on the referral page.
    * User clicks on the Referral
    * Verify that referral code is visible
    * Close the page

  @25/4
  Scenario: The user specific referral code in the My referral code textBox should be copyable.
    * User clicks on the Referral
    * User verifies that the "Copy Code" is visible
    * Click on the "Copy Code"
    * Verify that the Copied Successfully pup up is visible
    * Close the page

  @25/5
  Scenario: The user specific referral code in the My referral code textBox should be copyable.
    * User clicks on the Referral
    * Verify that SL,User,Date,Status,Discount Amount,Action informations in User List is visible
    * Close the page

  @25/6
  Scenario: Users in the user list should be deleted from the list

    * User clicks on the Referral
    * Users in the user list can be deleted from the list

  @25/7
  Scenario: If the User List is empty, Empty List text should be displayed.

    * User clicks on the Referral
    * If the User List is empty, Empty List text should be displayed.