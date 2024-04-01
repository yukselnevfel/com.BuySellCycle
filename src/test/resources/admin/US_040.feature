
 Feature:US_040 As an administrator I would like to have a Transaction page to control and manage my financial transactions.
  Background:
   * Open browser and go to "adminUrl", enter "esraAdminEmail", "password" and click sign in

   Scenario: TC_01 Access to the Transaction page so that as an administrator you can control and manage your finances
    * Scroll down to the bottom of the Admin dashboard page
    * Admin clicks Account link from Dashboard side bar
    * Click on the Transaction link from the submenus and go to the relevant page
    * Click the search button in the Select Criteria window
    * Select the start and end dates and click the Apply button
    * Displays Date,Chart of Accounts,Bank Accounts,Title,Credit,Debit information according to the date range selected in the Transaction sub-window
    * Clicks the Search text box on the Transaction page and performs a page search
    * Close the page