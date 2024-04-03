@aa
Feature:As an administrator, I want to have an admin panel to access site data, organize the site, respond to customer requests

  Background:
    * Open browser and go to "adminUrl", enter "bytAdminEmail", "password" and click sign in
    * Close the succesfull pop-up message

  @36/1
  Scenario:
    * Verify that profile icon is visible

  @36/2
  Scenario:
    * Hover mouse cursor over profile icon
    * Verify that the "My Profile" is visible
    * Verify that the "Log out" is visible

  @36/3
  Scenario:
