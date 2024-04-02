@US_004
Feature: US_004 User Registration on the Site

  Background:
    * Open browser and Go to "URL"


  Scenario: TC_01 - Verify Register Button on Home Page
    * the user verifies that the Register button link is visible on the home page
    * the user verifies that the Register button link is active on the home page
    * Close the page

  Scenario: TC_02 - Testing Elements Visibility and Activation on SignUp Page
    * the user clicks the Register button link on the home page
    * the user verifies the image and text in the right section
    * the user validates the signUp form in the left section
    * the user verifies that the SignUp button is visible and active
    * Close the page

  Scenario: TC_03 - Testing Free Space in TextBoxes on SignUp Page
    * the user clicks the Register button link on the home page
    * the user leaves all fields blank in the SignUp form and clicks the SignUp button
    * the user confirmed that registration failed
    * Close the page

  Scenario: TC_04 - Terms of Use and Privacy Policy Approval Test
    * the user clicks the Register button link on the home page
    * the user Terms of Service and Privacy Policy checkbox radioBotton click
    * the user clicks SignUp button link
    * the user confirmed that registration failed checkButton
    * Close the page


  Scenario: TC_05 - Phone Number Verification Test
    * the user clicks the Register button link on the home page
    * the user enters a number in a valid telephone format
    * the user clicks SignUp button link
    * It is confirmed that registration valid phone format
    * Close the page

  Scenario: TC_06 - Email Verification Test
    * the user clicks the Register button link on the home page
    * the user enters a valid email address
    * the user clicks SignUp button link
    * It is confirmed that registration valid email format
    * Close the page

  Scenario: TC_07 - Password Verification Test
    * the user clicks the Register button link on the home page
    * the user enters a valid password "Az12345." that meets criteria
    * the user clicks SignUp button link
    * the user confirms that it does not receive error message
    * Close the page

  Scenario: TC_08 - Transition Test from SignUp Page to SignIn Page
    * the user clicks the Register button link on the home page
    * the user clicks the SignIn buttonLink
    * 3 saniye bekler
    * the user verifies that it is possible to navigate to the SignIn page
    * Close the page

  Scenario: TC_09 - Invalid Email Verification Test-BUG
    * the user clicks the Register button link on the home page
    * the user enters an invalid "abc@abc" email
    * the user clicks SignUp button link
    * It is confirmed that registration failed due to invalid email format
    * Close the page

  Scenario: TC_10 - Invalid Password Verification Test
    * the user clicks the Register button link on the home page
    * the user enters a password "Adcfr34" that does not meet criteria
    * the user clicks SignUp button link
    * It is confirmed that registration failed due to weak password
    * Close the page

  Scenario: TC_11 - Invalid Phone Format Verification Test-BUG
    * the user clicks the Register button link on the home page
    * the user enters a number in an invalid phone format "123456789"
    * the user clicks SignUp button link
    * It is confirmed that registration failed due to invalid phone format
    * Close the page

  Scenario: TC_12 - Registration and verification test with valid data
    * the user clicks the Register button link on the home page
    * the user enters "Ali" "Can" "Az12345."
    * the user clicks SignUp button link
    * the user should be successfully registered and redirected to the sign-in page
    * Close the page

