@c
Feature: There should be an informative blog page on the site

  Background:
    * Open browser and Go to "URL"
    * Close the pop-up message

  Scenario: Verify visibility and activity of the Blog link
    * Verify that the Blog link is visible
    * Verify that the Blog link is active
    * Close the page

  Scenario: Verify access to the Blog page
    * Click on the Blog link
    * Verify that navigated to the Blog Page
    * Close the page

  Scenario: Accessing the Read More page
    * Click on the Blog link
    * Verify that navigated to the Read More Page
    * Close the page

  Scenario: Verify search functionality with a keyword
    * Click on the Blog link
    * Enter a keyword into the search texBox and press Enter
    * Verify that the search results are relevant to the entered keyword
    * Close the page