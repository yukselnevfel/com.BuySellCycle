
@US_036
Feature: US_36

  Background:
    * Open browser and go to "adminUrl", enter "bytAdminEmail", "password" and click sign in


  Scenario:TC_01
    * Verify that the profile icon is visible on the Dashboard page
    * Close the page

  Scenario:TC_02
    * Verify that subheadings are visible when hovering over the profile icon
    * Close the page

  Scenario:TC_03
    * Hover over your profile icon click on the My profile link.
    * Confirm that the My profile page has been opened
    * Close the page

  Scenario:TC_04
    * Hover over your profile icon click on the My profile link.
    * Verify that First Name, Last Name, E-mail Address, Phone Number, Date of Bird information is visible in the Basic Info section.
    * Close the page

  Scenario:TC_05
    * Hover over your profile icon click on the My profile link.
    * Verify that the update and avatar buttons are visible and functional
    * Verify that the information can be updated
    * Close the page

  Scenario:TC_06
    * Hover over your profile icon click on the My profile link.
    * Click on the Change password button and verify that you are directed to the relevant page.
    * Verify that the CURRENT PASSWORD, NEW PASSWORD, RE ENTER NEW PASSWORD textboxes are visible
    * Verify that the password can be updated
    * Close the page

  Scenario:TC_07
    * Hover over your profile icon click on the My profile link.
    * Click on the Address button
    * Verify that the Address page opens
    * Verify that the Add new address button is visible and active
    * Verify that address information is visible
    * Click the Add new address button
    * Verify that save button is visible
    * Fill in the starred fields and click the save button.
    * Verify that the address has been added
    * Close the page
@36/8
  Scenario:TC_08
    * Hover over your profile icon click on the My profile link.
    * Click on the Address button
    * Click the Add new address button
    * Select the select from options option from Country dropdown
    * Clicks on the save button
    * Close the page
