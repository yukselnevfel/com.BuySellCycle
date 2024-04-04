@us38
Feature: As an administrator I would like to have a page to add a new product to the site.

  Scenario: The Add New Product page should be accessible from the Dashboard Side Bar, and the (General Information,
             Related Product, Up Sale, Cross sale) sections should be displayed on this page
    * Open browser and go to "adminUrl", enter "adminSamet", "password" and click sign in
    * Click on the Products menu
    * Click on the "Add New Product"
    * Verify that page url is "https://qa.buysellcycle.com/products/create"
    * Verify that the "General Information" is visible
    * Verify that the "Related Product" is visible
    * Verify that the "Up Sale" is visible
    * Verify that the "Cross sale" is visible
    * Close the page

  Scenario: Type options must be displayed in the Product Information section and at least one must be selectable
    * Open browser and go to "adminUrl", enter "adminSamet", "password" and click sign in
    * Click on the Products menu
    * Click on the "Add New Product"
    * Verify that there is a Variant option
    * Verify that at least one of the options is selectable
    * Close the page
  @samet
  Scenario:A product should be added to the site by entering the requested information,
           the product should be associated with Related product, up sale and cross sale
    * Open browser and go to "adminUrl", enter "adminSamet", "password" and click sign in
    * Click on the Products menu
    * Click on the "Add New Product"
    * The product information to be added is entered
    * Add image for product
    * Select Related Product
    * Select Up Sale Product
    * Select Cross Sale Product
    * Click on General Information
    * Click Save and Publish
    * Open browser and Go to "bSCUrl"
    * Write the product "SmWatch" on the search button and search.
    * Click on the saved product
    * Verify that the product has been installed
    * Verify Cross Sale, Up Sale and Related Product
    * Close the page






