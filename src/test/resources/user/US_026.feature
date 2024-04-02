
Feature: As a registered user, I would like to have a page where I can open support tickets to resolve the problems
  I encounter on the site and see the status of the tickets I act.

  Background:
    * Open browser and Go to "URL"
    * Close the pop-up message
    * Click on the login link, Enter "aycaCustomerEmail" and "password" and click sign in



  Scenario: The Support Ticket menu item should be visible and active in the Dashboard sidebar.

  * Scroll down to the bottom of the page.Click on the support ticket menu
  * Verify that the navigate to Support Ticket Page.
  * Close the page


  Scenario: Tickets should be listed with "Ticket ID, Subject, Priority, Last Update" information in All Submitted Ticket List.

  * Scroll down to the bottom of the page.Click on the support ticket menu
  * Verify that the Tickets should be listed with title information in All Submitted Ticket List.
  * Close the page



  Scenario: Access to the detailed information (Status, Priority, Category) of the related Ticket
  in the All Submitted Ticket List should be provided.

  * Scroll down to the bottom of the page.Click on the support ticket menu
  * Click on the ticket View button
  * Verify that Status, Priority, Category  text is displayed
  * Close the page


  Scenario: User be able to communicate with the authorized person in the ticket.
  * Scroll down to the bottom of the page.Click on the support ticket menu
  * Click on the ticket View button
  * User should be able to display admin return message
  * User should be able to respond to admin message
  * Close the page


  @supportTicket
  Scenario: All Submitted Ticket List should be listed by filtering according to All Ticket, Pending, On Going, Completed, Closed information.



  Scenario: It should be possible to create a new Ticket within the page (by entering Subject, Category, Priority and Description information).














