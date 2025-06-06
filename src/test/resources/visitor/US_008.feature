@u8
Feature: As a user, I would like the site to have an About Us page so that I can learn more about the site I shop on.

  Background: : Accessing the About page
    Given Open browser and Go to "URL"
    When I should click on the "About Us" on the header
    Then  I should be directed to the "About" page

  Scenario Outline: Viewing information on the About Us page
    Given I am on the "About" Page
    When I should see relevant "<sections>" about the site
    Then I should see each section contains a numeric value representing the relevant metric

    Examples:
      | sections           |
      | Clients Worldwide  |
      | Successful Project |
      | Work Employed      |
      | Planning Services  |

  @asli
  Scenario Outline: Viewing Specific Team Members on the About Us Page
    Given I am on the "About" Page
    Then I should see the character, status, and picture of "<team_member>"
    Examples:
      | team_member    |
      | Avery Collins  |
      | Emily Pattinson|
      | Jason Statham  |
      | Jaxon Westwood |