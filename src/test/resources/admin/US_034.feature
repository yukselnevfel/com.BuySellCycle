Feature:As an administrator, I want to have an admin panel to access site data, organize the site, respond to customer requests

  Background:
    * Open browser and go to "adminUrl", enter "bytAdminEmail", "password" and click sign in

  @34/3
  Scenario:
    * User searches "Follow Seller" on the admin Dashboard and verifies that the search result is true

  @34/4
  Scenario: The Dashboard Sidebar should narrow and expand when the menu icon is clicked on the Admin Dashboard home page.
    * Verify that the Hambuger menu is visible
    * Verify that the hamburger menu opened or closed when clicked

  @34/5
  Scenario: The Admin Dashboard home page should redirect to the user interface of the site.

    * Click on the Website and Verify that the Home Page is opened that on new tab


  @34/6
  Scenario: If you click on the Today, This Week, This Month and This Year buttons on the main page of the Admin Dashboard,
  you should see that the data in the Summary Board changes according to the selected value.

    * Verify that the "Today", "This Week", "This Month" ve "This Year" buttons is visible, click butons and verify that informations is changed

  @34/7
  Scenario: The links in the Summary section on the Admin Dashboard home page should redirect to the relevant pages.

    * The user clicks Total Customer.
    * Redirect to the Total Customer page.
    * The user clicks Active Customer.
    * Redirect to the Active Customer page.



