@us37
Feature:As an administrator, I would like to have a page on the site where I can see all active and
       inactive customers together.
  Background:
    * Open browser and go to "adminUrl", enter "nevfelAdminMail", "password" and click sign in
    * Click on the  Customer  in Dashboard side bar
    * Click on the All Customer

    Scenario:TC_01 Access to the All customer page on the Dashboard Side Bar, view the All Customer List and
       search the list by email from the Quick Search Text Box
      * Verify that All Costumer List
      * Quick Search Text Box searches "admin.nefelbuysellcycle.com" with a valid mail
      * Close the page

      Scenario: TC_02 Ability to change the active status of the customer in the All Customer List
      * Is Active icon changes the active-passive status of the customer
      * Close the page

      Scenario: TC_03 Accessing the Active customer list from the All Customer page and
       editing the Basic Info information of the Customer in the list.
      * Click on the Active Customer
      * Click on  the EDID from the select dropdown menu
      * Click on the Update button
      * Close the page

  Scenario: TC_04 Customer in the active customer list should be deleted.
        * Click on the Active Customer
        * Click on  the DELETE from the select dropdown menu
        * Clicks on  the Delete button in the resulting alert
        * Close the page

    Scenario: TC_05 Accessing the detail information of the Customer in the active customer list and
         viewing Customer Profile, Order Summary, Wallet Summary information
      * Click on the Active Customer
      * Click on  the DETAIL  from the select dropdown menu
      * Verify that Customer Profile, Order Summary, Wallet Summary information is displayed
      * Close the page

    Scenario: TC_06 Orders, Wallet Histories, Addresses lists should be displayed on Active Customer detail page
      * Click on the Active Customer
      * Click on  the DETAIL  from the select dropdown menu
      * Verify that the order list can be accessed
      * Verify that the list of Wallet Histories can be accessed
      * Verify that the Addresses list can be accessed
      * Close the page

    Scenario: TC_07 Accessing the Inactive customer list from the All Customer page and
      editing the Basic Info information of the Customer in the list.
      * Click on the Inactive Customer
      * Click on  the EDID from the select dropdown menu
      * Click on the Update button
      * Close the page

    Scenario: TC_08 Customer in the inactive customer list should be deleted.
    * Click on the Inactive Customer
    * Click on  the DELETE from the select dropdown menu
    * Clicks on  the Delete button in the resulting alert
    * Close the page

    Scenario: TC_09 Accessing the detail information of the Customer in the inactive customer list and
      * Click on the Inactive Customer
      * Click on  the DETAIL  from the select dropdown menu
      * Verify that Customer Profile, Order Summary, Wallet Summary information is displayed
      * Close the page

    Scenario: TC_10 Orders, Wallet Histories, Addresses lists should be displayed on Inactive Customer detail page
    * Click on the Inactive Customer
    * Click on  the DETAIL  from the select dropdown menu
    * Verify that the order list can be accessed
    * Verify that the list of Wallet Histories can be accessed
    * Verify that the Addresses list can be accessed
    * Close the page

      Scenario: TC_11 A new customer should be created by entering basic information on the Add New Customer page
        and display it in the list.(Positive test)
      * Click on the Create Customer
      * Enters a name in the FirstName textbox
      * Enters last name in LastName textbox
      * Password enters "123456789A." password suitable for the criteria in the textbox
      * Enters "123456789A." the same password in the Confirm Password textbox
      * Enters an email suitable for the criteria in the email or phone textbox.
      * Click on the Create button
      * Verify that the Create operation has occurred
      * Close the page

    Scenario: TC_12 Verifying that the mandatory basic information cannot be
       left blank on the Add New Customer page.(Negative test)
      * Click on the Create Customer
      * Leaves the FirstName textbox empty
      * Click on the Create button
      * Verify that login is not available
      * Close the page
  @xxx
    Scenario: TC_13 Verifying that login is not possible when the password and
       confirm password are not the same on the Add New Customer page (Negative test)
    * Click on the Create Customer
    * Enters a password suitable for the criteria in the Password textbox
    * Password enters a different password in the textbox.
    * Click on the Create button
    * Verify that the Passwords do not match.
    * Close the page

  @xxx
    Scenario: TC_14 Verifying that the password on the Add New Customer page cannot be
      entered if it does not meet the criteria (Min 8 characters) (Negative Test)
    * Click on the Create Customer
    * Enters a password "1234" that does not meet the criteria in the password textbox
    * Click on the Create button
    * Verify that you cannot log in
    * Close the page
  @xxx
    Scenario: TC_15 Verifying that only digit expressions can be entered in Phone textbox
        on Add New Customer page(Negative)
      * Click on the Create Customer
      * Enters a name in the FirstName textbox
      * Enters last name in LastName textbox
      * Password enters "123456789A." password suitable for the criteria in the textbox
      * Enters "123456789A." the same password in the Confirm Password textbox
      * Enters a special character  in the iPhone textbox.
      * Click on the Create button
      * Verify that the Create operation has occurred
      * Close the page
  @xxx
  Scenario: TC_16
    * Click on the Create Customer
    * Enters a name in the FirstName textbox
    * Enters last name in LastName textbox
    * Password enters "123456789A." password suitable for the criteria in the textbox
    * Enters "123456789A." the same password in the Confirm Password textbox
    * Email enters a mail that does not meet the criteria  in the textbox
    * Click on the Create button
    * Verify that the Create operation has occurred
    * Close the page






























