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

  Scenario: Name, Product SKU, Model Number, Category, Brand, Unit, Barcode Type, Minimum Order QTY, Max Order QTY,
  Tags(Comma Separated) Text Boxes should be visible in the Product Information Section
    * Open browser and go to "adminUrl", enter "adminSamet", "password" and click sign in
    * Click on the Products menu
    * Click on the "Add New Product"
    * Verify that the Name Text Box is visible
    * Verify that the Product SKU Text Box is visible
    * Verify that the Model Number Text Box is visible
    * Verify that the Category Text Box is visible
    * Verify that the Brand Text Box is visible
    * Verify that the Unit Text Box is visible
    * Verify that the Barcode Type Text Box is visible
    * Verify that the Minimum Order QTY Text Box is visible
    * Verify that the Max Order QTY Text Box is visible
    * Verify that the Tags(Comma Separated) Text Box is visible
    * Close the page

  Scenario: Category, Brand and Unit adding pages should be accessible from the Product Information Section
    * Open browser and go to "adminUrl", enter "adminSamet", "password" and click sign in
    * Click on the Products menu
    * Click on the "Add New Product"
    * Click on the CTEGORY (ADD NEW) link.
    * Verify that the "Create Category" is visible
    * Click on the BRAND (ADD NEW) link.
    * Verify that the "Create Brand" is visible
    * Click on the UNIT (ADD NEW) link.
    * Verify that the "Create Unit" is visible
    * Close the page

    Scenario:There should be a section where Price Info And Stock information can be entered,
    and if the product to be added is a physical product, the physical information of the product should be entered
    * Open browser and go to "adminUrl", enter "adminSamet", "password" and click sign in
    * Click on the Products menu
    * Click on the "Add New Product"
    * Verify that the "Selling Price" is visible
    * Verify that the " Discount" is visible
    * Verify that the "Discount Type" is visible
    * Verify that the "TAX" is visible
    * Verify that "11" can be entered in the WEIGHT [GM], LENGTH [CM], BREADTH [CM], HEIGHT [CM] and ADDITIONAL SHIPPING CHARGE boxes
    * Close the page

    Scenario: An image must be uploaded to the site for the product to be added.
    * Open browser and go to "adminUrl", enter "adminSamet", "password" and click sign in
    * Click on the Products menu
    * Click on the "Add New Product"
    * Add image for product
    * Verify that image is uploaded
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

Scenario: On the Add New Product page, the Save and Publish and Save buttons appear and must be active
    * Open browser and go to "adminUrl", enter "adminSamet", "password" and click sign in
    * Click on the Products menu
    * Click on the "Add New Product"
    * Verify that Save Button is displayed and click
    * Verify that the "Please Input Product Name" is visible
    * Verify that Save and Publish Button is displayed and click
    * Verify that the "Please Input Product Name" is visible
    * Close the page
  @new
  Scenario: The warning message "Save After Fillup All General Information & Related Product, Up Sale, Cross Sale"
            should be displayed on the Add New Product page
    * Open browser and go to "adminUrl", enter "adminSamet", "password" and click sign in
    * Click on the Products menu
    * Click on the "Add New Product"
    * Verify that the "Save After Fillup All General Information & Related Product, Up Sale, Cross Sale" is visible
    * Close the page























