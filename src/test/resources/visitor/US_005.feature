
Feature: As a user, I would like to be able to log in with the email and password I registered with the site.
  Background:
  * Open browser and Go to "URL"
  * Close the pop-up message
  Scenario: Click the login link and navigated to the login page and Sign In page verification

  * Verify that the "Login" is visible
  * Click on the "Login"
  * Verify that navigated to the login page
  * Verify that the relevant image
  * Verify that the "Turn your ideas into reality." is visible
  * Verify that the Sign-in form is visible
  * Verify that the Sign In button is visible
  * Verify that the Sign In button is clickable
  * Verify that the Remember me checkbox is selectable
  * Close the page

  Scenario:User should be possible to navigate from the login page to the Forgot Password page
  * Click on the "Login"
  * Verify that the "Click Here" is visible
  * Click on the "Click Here"
  * Verify that navigated to the password reset page
  * Close the page

  Scenario: User should be possible to navigate from the login page to the Register page

  * Click on the "Login"
  * Verify that the "Don’t have an Account?" is visible
  * Verify that the "Sign Up" is visible
  * Click on the "Sign Up"
  * Verify that navigated to the Register page
  * Close the page

  @ayca
  Scenario: LOGIN Valid email and valid password are entered and the Sign In button is clicked, the system should log in

  * Click on the login link, Enter "aycaCustomerEmail" and "password" and click sign in
  * Close the page




