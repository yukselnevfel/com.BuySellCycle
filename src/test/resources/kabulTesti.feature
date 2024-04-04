
@demo
Feature: New member register

  Scenario: The visitor registers to "Buysellcycle" by entering the necessary information
    * Open browser and Go to "URL"
    * the user clicks the Register button link on the home page
    * the user enters "Ali" "Can" "Az12345."
    * the user clicks SignUp button link
    * the user should be successfully registered and redirected to the sign-in page
    * 1 seconds pause
    * Close the page

  Scenario: "Buysellcycle" admin approves the registration
    * Open browser and Go to admin "adminUrl"
    * Enter "fikretAdminEmail" and "password" and click sign in
    * Click the notification icon at the top of the page
    * 1 seconds pause
    * Click View from the Notification menu
    * Click demo register View
    * Clicks and confirms the registration request
    * 1 seconds pause
    * Close the page

  Scenario: The new member logs in by entering valid information.
    * Open browser and Go to "URL"
    * 2 seconds pause
    * Click on the login link, Enter "demoEmail" and "demoPassword" and click sign in
    * 4 seconds pause
    * Close the page

