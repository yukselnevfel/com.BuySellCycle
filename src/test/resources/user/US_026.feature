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

  Scenario Outline:
  All Submitted Ticket List should be visible on the Support Ticket page. Tickets should be listed with
  Ticket ID, Subject, Priority, Last Update information in All Submitted Ticket List.

  * Scroll down to the bottom of the page.Click on the support ticket menu
  * Verify that the Tickets should be listed with "<title>" information in All Submitted Ticket List.

    Examples:
      | title       |
      | Ticket ID   |
      | Subject     |
      | Priority    |
      | Last Update |

  * Close the page

  Scenario: Access to the detailed information (Status, Priority, Category) of the related Ticket
  in the All Submitted Ticket List should be provided.
  * Scroll down to the bottom of the page.Click on the support ticket menu and verify that the navigate to Support Ticket Page.
  * Click on the ticket "view" button
  * Verify that Status, Priority, Category  text is displayed
  * Close the page


  Scenario: The message information returned by the authorized person to the ticket should be displayed.
  User be able to communicate with the authorized person in the ticket.









