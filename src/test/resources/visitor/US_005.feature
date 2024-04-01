
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
  @login
  Scenario: LOGIN Valid email and valid password are entered and the Sign In button is clicked, the system should log in

  * Click on the login link, Enter "aycaCustomerEmail" and "password" and click sign in
  * Close the page

  Scenario: Valid PHONE NUMBER and password are entered and the Sign In button is clicked, the system should log in

    * Click on the login link, Enter "aycaCustomerPhone" and "password" and click sign in
    * Close the page

  Scenario: valid mail, invalid password are entered into the login form and error messages should be displayed

    * Click on the login link, Enter "aycaCustomerEmail" and "invalidPassword" and click sign in
    * Close the page

  Scenario: invalid mail, valid password are entered into the login form and error messages should be displayed

    * Click on the login link, Enter "invalidCustomerEmail" and "password" and click sign in
    * Close the page

  Scenario: valid phone number and invalid password are entered and the Sign In button is clicked, the system should log in

    * Click on the login link, Enter "aycaCustomerPhone" and "invalidPassword" and click sign in
    * Close the page

  Scenario: invalid phone number and valid password are entered and the Sign In button is clicked, the system should log in

    * Click on the login link, Enter "invalidPhoneNumber" and "password" and click sign in
    * Close the page





