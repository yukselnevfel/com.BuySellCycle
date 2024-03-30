Feature: As a user, I would like the site to have an About Us page so that I can learn more about the site I shop on.

  Background: : Accessing the About page
    Given Open browser and Go to "URL"
    When click on the "About Us" on the header
    Then  I should be directed to the "About Us" page

  Scenario Outline: Viewing information on the About Us page
    Given I should see relevant section about the site, such as its mission, "<Clients Worldwide>" , "<Successful Project>" , "<Successful Project>" , "<Work Employed>" and "<Planning Services>"
    And I should see each section contains a numeric value representing the relevant metric
    Then I should see that the numeric values are clearly visible and legible
    Examples:
      | Clients Worldwide | Successful Project | Work Employed | Planning Services |


  Scenario Outline: Viewing Specific Team Members on the About Us Page
    Then I should see the character, status, and picture of "<team_member>"
    Examples:
      | team_member    |
      | Avery Collins  |
      | Emily Pattinson|
      | Jason Statham  |
      | Jaxon Westwood |