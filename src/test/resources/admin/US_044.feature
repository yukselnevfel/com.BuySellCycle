

Feature: US_044 Admin Order Management

  Background:
    * Open browser and Go to admin "adminUrl"
    * Enter "fikretAdminEmail" and "password" and click sign in
    * clicks on the Order Manage menu link
    * clicks on the Total Order submenu link
    #* navigates to the Total Order page

  Scenario: TC_01 - Accessing the Total Order page from the Dashboard Side Bar
    * verifies that the Total Order page is accessible
    * Close the page

  Scenario: TC_02 - Viewing lists on the Total Order page
    * verifies that lists for Pending Orders, Confirmed Orders, Completed Orders, Pending Payment Orders, Refused and Cancelled Orders, and Inhouse Orders are displayed
    * Close the page

  Scenario: TC_03 - Accessing detailed information of a pending order
    * clicks on the Details option to view detailed information
    * verifies that detailed information of the selected pending order is displayed
    * Close the page

  Scenario: TC_04 - Updating order confirmation, payment status, and completion status
    * clicks on the Details option to view detailed information
    * updates the order confirmation, payment status, and completion status randomly
    * clicks on the Update button to save the changes
    * verifies that the changes are saved successfully
    * Close the page

  Scenario: TC_05 - Approving a pending order
    * approves the order
    * verifies that the order status is updated to confirmed
    * Close the page

  Scenario: TC_06 - Searching in Pending Orders List
    * enters a search query in the Quick Search text box in the Pending Orders List
    * verifies that results matching the search query are displayed
    * Close the page

  Scenario: TC_07 - Searching in Confirmed Orders List
    * selects the Confirmed Orders option
    * enters a search query in the Quick Search text box in the Confirmed Orders List
    * verifies that results matching the search query are displayed
    * Close the page

  Scenario: TC_08 - Accessing detailed information of a confirmed order
    * selects a confirmed order from the list
    * clicks on the Details option to view detailed information
    * verifies that detailed information of the selected confirmed order is displayed
    * Close the page

  Scenario: TC_09 - Searching in Completed Orders List
    * selects the Completed Orders option
    * enters a search query in the Quick Search text box in the Completed Orders List
    * verifies that results matching the search query are displayed
    * Close the page

  Scenario: TC_10 - Accessing detailed information of a completed order
    * selects a completed order from the list
    * clicks on the Details option to view detailed information
    * verifies that detailed information of the selected completed order is displayed
    * Close the page

  Scenario: TC_11 - Searching in Pending Payment Orders List
    * selects the Pending Payment Orders option
    * enters a search query in the Quick Search text box in the Pending Payment Orders List
    * verifies that results matching the search query are displayed
    * Close the page

  Scenario: TC_12 - Accessing detailed information of a pending payment order
    * selects a pending payment order from the list
    * clicks on the Details option to view detailed information
    * verifies that detailed information of the selected pending payment order is displayed
    * Close the page

  Scenario: TC_13 - Searching in Refused/Cancelled Orders List
    * selects the Refused/Cancelled Orders option
    * enters a search query in the Quick Search text box in the Refused/Cancelled Orders List
    * verifies that results matching the search query are displayed
    * Close the page

  Scenario: TC_14 - Accessing detailed information of a refused/cancelled order
    * selects a refused/cancelled order from the list
    * clicks on the Details option to view detailed information
    * verifies that detailed information of the selected refused/cancelled order is displayed
    * Close the page
