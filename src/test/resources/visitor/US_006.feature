Feature: US_006 As a user, I want to be able to see all the categories on the site under the Categories heading.
  Background:
    * Open browser and Go to "URL"
    * Close the pop-up message
  Scenario:TC_01 Displaying All Categories dropdown
    * Displays All Categories dropdown
    * Close the page
  Scenario: TC_02 Displaying menu titles under All Categories dropdown
    * Click All Categories dropdown menu
    * Displays the subheadings of the dropdown menu that opens
    * Close the page

  Scenario: TC_03 Displaying sub-menus of menus under All Categories dropdown
    * Click All Categories dropdown menu
    * Click the Electronics link
    * Displays Electronics subcategories
    * Click the Fashion link
    * Displays Fashion subcategories
    * Click the Baby link
    * Displays Baby subcategories
    * Click the Home-Furniture link
    * Displays  Home-Furniture subcategories
    * Click the Sport-Outdoor link
    * Displays Sport-Outdoor subcategories
    * Click the Accessories link
    * Displays Accessories subcategories
    * Click the Beauty link
    * Displays Beauty subcategories
    * Click the Book-Stationery link
    * Displays Book-Stationery subcategories
    * Click the Hobi-Music link
    * Displays Hobi-Music subcategories
    * Click the Supermarket link
    * Displays Supermarket subcategories
    * Click the Auto-Garden-DiyStore link
    * Displays Auto-Garden-DiyStore subcategories
    * Close the page

  Scenario: TC_04 Click on sub-menus of menus under All Categories dropdown and redirect to related pages
    * Click All Categories dropdown menu













