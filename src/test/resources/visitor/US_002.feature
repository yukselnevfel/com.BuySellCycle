

 Feature:US_002 As a user, I want easily accessible links on the homepage's top bar to perform site operations


  Background:
    * Open browser and Go to "URL"
    * Close the pop-up message

  Scenario: TC_01 Displaying easy links in the site top bar
    * Displays the Track Your Order link on the top bar of the site
    * Displays the Compare link on the top bar of the site
    * Displays the Wish List link on the top bar of the site
    * Displays the Cart link on the top bar of the site
    * Displays the New User Zone link on the top bar of the site
    * Displays the Daily Deals link on the top bar of the site
    * Close the page

  Scenario: TC_02 Easy links on the top bar of the site to direct you to related pages
    * Click on the Track your Order link on the top bar of the site and you will be redirected to the relevant page
    * Return to Home page
    * Click on the Compare link on the top bar of the site and you will be redirected to the relevant page
    * Return to Home page
    * Click on the WishList link on the top bar of the site and you will be redirected to the relevant page
    * Return to Home page
    * Click on the Cart link on the top bar of the site and you will be redirected to the relevant page
    * Return to Home page
    * Click on the New User Zone link on the top bar of the site and you will be redirected to the relevant page
    * Return to Home page
    * Click on the Daily Deals link on the top bar of the site and you will be redirected to the relevant page
    * Close the page


  Scenario: TC_03 Clicking on the site logo and accessing the home page
    * Clicks on the Site logo
    * Refreshes the home page
    * Close the page

  Scenario: TC_04 Viewing and searching the Search textbox
    * Click to the search box
    * User searches for products in the search box
    * Close the page

