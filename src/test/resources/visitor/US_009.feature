@US_009
Feature: US_009 There should be an informative blog page on the site

  Background:
    * Open browser and Go to "URL"
    * Close the pop-up message

  Scenario: TC_01 The Blog menuLink appears on the home
    * Verify that the Blog link is visible
    * Verify that the Blog link is active
    * Close the page

  Scenario: TC_02 Testing to access the blog page
    * Click on the Blog link
    * Verify that navigated to the Blog Page
    * Close the page

  Scenario: TC_03 Read More link redirection test
    * Click on the Blog link
    * Verify that navigated to the Read More Page
    * Close the page

  Scenario: TC_04 Test of searching blogs from Search Post Box
    * Click on the Blog link
    * Enter a keyword into the search texBox and press Enter
    * Verify that the search results are relevant to the entered keyword
    * Close the page

  Scenario: TC_05 Test of displaying relevant blogs according to the titles in the Category section
    When Click on the Blog link
    And Select a category from the Category section
    Then Verify that blogs related to the selected category are listed
    Then Close the page
@1
  Scenario:TC_06 Test of displaying relevant blogs according to the titles in the keyword section
    When Click on the Blog link
    And Select a keyword from the Keyword section
    * 3 saniye bekler
    Then Verify that relevant blogs are listed based on the selected keyword
    Then Close the page

  Scenario: TC_07 Test of viewing relevant blogs in the Popular Posts section
    When Click on the Blog link
    And Select a category from the Popular Posts section
    Then Verify that the page with the selected blog post has been accessed
    Then Close the page
