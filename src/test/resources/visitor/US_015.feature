@simge
Feature: As a user I want to be able to see the categories and products of the electronics menu on the home page.
  Background:
  * Open browser and Go to "URL"
  * Close the pop-up message

  Scenario: The "Electronics" category should be displayed in the body section of the homepage

  * Verify that the Electronics category  is visible on homepage
  * Verify that the Telephone link is visible in Electronics category on homepage
  * Click on the Telephone link in Electronics category on homepage
  * Verify that the phones are visible in the Electronics category on homepage
  * Verify that the TV&Picture&Sound link is visible in Electronics category on homepage
  * Click on the TV&Picture&Sound link in Electronics category on homepage
  * Verify that the TVs are visible in the Electronics category on homepage
  * Verify that the Photo&Camera link is visible in Electronics category on homepage
  * Verify that the Computer&Tablet link is visible in Electronics category on homepage
  * Verify that the Special for Players link is visible in Electronics category on homepage
  * Verify that the Electronic Accessories link is visible in Electronics category on homepage
  * Close the page

 Scenario: Products in the "Electronics" category on homepage should be added to the "Compare" list

  * Verify that the Electronics category  is visible on homepage
  * Click on the Telephone link in Electronics category on homepage
  * Verify that the compare icon is visible for the first product in Electronics category on homepage
  * Click on the compare icon for the first product in Electronics category on homepage
  * Verify that the product is added to the compare list
  * Close the page

 Scenario: Products in the "Electronics" category on homepage should be added to the "Wishlist" list

  * Verify that the Electronics category  is visible on homepage
  * Click on the Telephone link in Electronics category on homepage
  * Verify that the wishlist icon is visible for the first product in Electronics category on homepage
  * Click on the wishlist icon for the first product in Electronics category on homepage
  * Verify that the Please Login First warning is visible
  * Close the page

 Scenario: "Quick View" operation should be possible on products in the "Electronics" category on homepage

  * Verify that the Electronics category  is visible on homepage
  * Click on the Telephone link in Electronics category on homepage
  * Verify that the quick view icon is visible for the first product in Electronics category on homepage
  * Click on the quick view icon for the first product in Electronics category on homepage
  * Verify that the detail window for the relevant product has opened
  * Close the page