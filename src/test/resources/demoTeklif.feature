
@demo
Feature: New member register

  Scenario: The visitor registers to "Buysellcycle" by entering the necessary information
    * Open browser and Go to "URL"
    * 1 saniye bekler
    * the user clicks the Register button link on the home page
    * 2 saniye bekler
    * the user enters "Ali" "Can" "Az12345."
    * 2 saniye bekler
    * the user clicks SignUp button link
    * 2 saniye bekler
    * the user should be successfully registered and redirected to the sign-in page
    * 1 saniye bekler
    * Close the page

  Scenario: "Buysellcycle" admin approves the registration
    * Open browser and Go to admin "adminUrl"
    * 1 saniye bekler
    * Enter "fikretAdminEmail" and "password" and click sign in
    * 2 saniye bekler
    * Click the notification icon at the top of the page
    * 1 saniye bekler
    * Click View from the Notification menu
    * 2 saniye bekler
    * Click demo register View
    * 2 saniye bekler
    * Clicks and confirms the registration request
    * 1 saniye bekler
    * Close the page

  Scenario: The new member logs in by entering valid information.
    * Open browser and Go to "URL"
    * 2 saniye bekler
    * Click on the login link, Enter "demoEmail" and "demoPassword" and click sign in
    * 4 saniye bekler
    * Close the page

