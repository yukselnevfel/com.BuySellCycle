Feature: As a registered user, I would like to have a page where I can create a referral code and perform related actions.

  Background:
    * Open browser and Go to "URL"
    * Click on the login link, Enter "bytCostumerEmail" and "password" and click sign in

  @us25/1
  Scenario: Referral menu item should be visible and active in Dashboard sidebar.

    * Verify that the "Referral" is visible

  @us25/2
  Scenario: My referral code and User List windows should be visible on the referral page.
    * User clicks on the "Referral"
    * Close the page

  @us25/3
  Scenario: My referral code and User List windows should be visible on the referral page.
    * User clicks on the "Referral"
    * Verify that referral code is visible
    * Close the page

  @us25/4
  Scenario: The user specific referral code in the My referral code textBox should be copyable.
    * User clicks on the Referral
    * User verifies that the "Copy Code" is visible
    * Click on the "Copy Code"
    * Verify that the Copied Successfully pup up is visible
    * Close the page

  @us25/4
  Scenario: The user specific referral code in the My referral code textBox should be copyable.
    * User clicks on the Referral
    * //body//div//thead//th[1] tablo
    * Close the page