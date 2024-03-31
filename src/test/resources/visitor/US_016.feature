

Feature: As a user, I would like to have a footer section to view useful links and site access.

  Background:
    * Open browser and Go to "URL"
    * Close the pop-up message

  Scenario: The footer section should be displayed on the home page.Useful links
  (About Us, Blog, Dashboard, My Profile, My Order, Help&Contact, Track Order, Return&Exchange)
  should be visible and active in the footer section.

    * Scroll down to the bottom of the home page.Verify that the About Us, Blog, Dashboard, My Profile, My Order, Help&Contact, Track Order, Return&Exchange,Track Order, Return&Exchange link are visible on footer table.
    * Click on the About Us link and verify the navigate to About Us Page.
    * Scroll down to the bottom of the home page.Click on the Blog link and verify the navigate to Blog Page.
    * Scroll down to the bottom of the home page.Click on the Dashboard link and verify the navigate to Sign In Page.Click on the website logo.
    * Scroll down to the bottom of the home page.Click on the My Profile link and verify the navigate to Sign In Page.Click on the website logo.
    * Scroll down to the bottom of the home page.Click on the My Order link and verify the navigate to Sign In Page.Click on the website logo.
    * Scroll down to the bottom of the home page.Click on the Help&Contact link and verify the navigate to Contact Us Page.
    * Scroll down to the bottom of the home page.Click on the Track Order link and verify the navigate to Track Order Page.
    * Scroll down to the bottom of the home page.Click on the Return&Exchange link and verify the navigate to Return&Exchange Page.
    * Close the page

  Scenario: You should be able to subscribe to bulletins from the subscriber section in the footer.

    * Scroll down to the bottom of the home page. Enter an email on address field on subscribe and click the subscribe button.
    * Close the page


  Scenario: A warning message is given when you enter the previously entered e-mail to subscribe to newsletters from the subscriber section in the footer.
   * Scroll down to the bottom of the home page. Enter a registered email on address field on subscribe and click the subscribe button.
   * Close the page


  Scenario: To get the site app, the relevant app market links must be visible and active.
   * Scroll down to the bottom of the home page. Click on the Google Play link and verify that the navigate to Google Store Page
   * Return to the website
   * Scroll down to the bottom of the home page. Click on the The Apple Store link and verify that the navigate to The Apple Store Page
   * Return to the website
   * Close the page


  @ayca
  Scenario: "Copyright © 2024. All rights reserved." text should be visible in the footer section.
   * Scroll down to the bottom of the home page. Verify that the enf of the footer text is visible
   * Close the page


 Scenario: There should be quick access to the top of the main page from the footer section.
   * Scroll down to the bottom of the home page. Click on the go to top button and verify that reached the top of the page
   * Close the page









