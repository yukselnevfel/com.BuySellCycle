Feature: As a registered user, I would like to have a page where I can create a referral code and perform related actions.

  Background:
    * Open browser and Go to "URL"
    * Click on the login link, Enter "bytCustomerEmail" and "password" and click sign in

  @us25/1
  Scenario: Referral menu item should be visible and active in Dashboard sidebar.

    * Verify that the "Referral" is visible

  @us25/2
  Scenario: My referral code and User List windows should be visible on the referral page.
    * Click on the "Referral"

  @us25/3
  Scenario: My referral code and User List windows should be visible on the referral page.
    * Click on the "Referral"
    * Verify that referral code is visible