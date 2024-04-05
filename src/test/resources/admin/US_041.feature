 Feature: As a manager, I would like to have a page where I can add a new employee to the company and manage the employees.
  Background:
   * Open browser and go to "adminUrl", enter "simgeAdminEmail", "password" and click sign in

   Scenario: The Staff page must be accessible from the Dashboard Side Bar
    * Verify that the Human Resource link is visible
    * Click on the Human Resource link in the Dashboard side bar
    * Verify that the Staff link is visible
    * Click on the Staff link
    * Verify that the Staff page is opened
    * Close the page

   Scenario: Staff List (with titles SL, Name, Email, Phone, Role, Status, Department, Registered Date, Action) should be displayed on the Staff page
    * Click on the Human Resource link in the Dashboard side bar
    * Click on the Staff link
    * Verify that the Staff List(SL, Name, Email, Phone, Role, Status, Department, Registered Date, Action) is visible
    * Close the page

   Scenario: The status of the desired employee in the Staff List should be changed
    * Click on the Human Resource link in the Dashboard side bar
    * Click on the Staff link
    * Verify that the the status of the first employee is active
    * Close the page

   Scenario: It should be possible to access the detailed information of the desired employee from the Staff List
    * Click on the Human Resource link in the Dashboard side bar
    * Click on the Staff link
    * Verify that the Select button is visible
    * Click on the Select button
    * Verify that the View link is visible
    * Click on the View link
    * Verify that the Staff Info page is opened
    * Close the page

   Scenario: Access to the desired employee's information editing page should be possible from the Staff List
    * Click on the Human Resource link in the Dashboard side bar
    * Click on the Staff link
    * Click on the Select button
    * Click on the View link
    * Verify that the Edit link is visible
    * Click on the Edit link
    * Verify that the employee's edit staff info page is opened
    * Close the page

   Scenario: Any employee can be deleted from the Staff List
    * Click on the Human Resource link in the Dashboard side bar
    * Click on the Staff link
    * Click on the Select button
    * Verify that the Delete button is visible
    * Click on the Delete button in Staff Page
    * Verify that the Are you sure to delete?  query screen is visible
    * Click on the Delete button in query
    * Verify that the relevant employee has been deleted
    * Close the page

   Scenario: It should be possible to search within the Staff List with the Quick Search TextBox
    * Click on the Human Resource link in the Dashboard side bar
    * Click on the Staff link
    * Verify that the Quick Search TextBox is visible
    * Verify that the Quick Search TextBox is active
    * Close the page

   Scenario: It should be redirected to the page of adding a new employee from the staff page
    * Click on the Human Resource link in the Dashboard side bar
    * Click on the Staff link
    * Verify that the ADD NEW STAFF button is visible
    * Click on the ADD NEW STAFF button
    * Verify that the Add New Staff page is opened
    * Close the page

   Scenario: A new staff record should be created by filling in the information on the Add New Staff page and the staff should be displayed in the list
    * Click on the Human Resource link in the Dashboard side bar
    * Click on the Staff link
    * Click on the ADD NEW STAFF button
    * Verify that the Role bar is visible
    * Click on the Role bar
    * Click on the Staff
    * Verify that the Department bar is visible
    * Click on the Department bar
    * Click on the Marketing
    * Verify that the Email textbox is visible
    * Click on the Email textbox
    * Random email is entered
    * Verify that the First Name textbox is visible
    * Click on the First Name textbox
    * Random First Name is entered
    * Verify that the Last Name textbox is visible
    * Click on the Last Name textbox
    * Random Last Name is entered
    * Verify that the Phone textbox is visivle
    * Click on the Phone textbox
    * Random Phone is entered
    * Verify that the Password textbox is visible
    * Click on the Password textbox
    * Random Password is entered (8 character)
    * Verify that the Date of Birth textbox is visible
    * Click on the Date of Birth textbox
    * Clean on the Date of Birth textbox
    * Random Date is entered (mm/dd/yyyy)
    * Verify that the Address textbox is visible
    * Click on the Address textbox
    * Random Address is entered
    * Verify that the Date of Joining textbox is visible
    * Click on the Date of Joining textbox
    * Random Date of Joining is entered
    * Verify that the APPLICABLE FOR LEAVE textbox is visible
    * Click on the APPLICABLE FOR LEAVE textbox
    * Random APPLICABLE FOR LEAVE is entered
    * Verify that the Bank Name textbox is visible
    * Click on the Bank Name textbox
    * Random Bank Name is entered
    * Verify that the Branch Name textbox is visible
    * Click on the Branch Name textbox
    * Random Branch Name is entered
    * Verify that the Account Name textbox is visible
    * Click on the Account Name textbox
    * Random Account Name is entered
    * Verify that the Account Number textbox is visible
    * Click on the Account Number textbox
    * Random Account Number is entered
    * Verify that the Save button is visible
    * Click on the Save button
    * Verify that the newly added staff is successfull
    * Close the page