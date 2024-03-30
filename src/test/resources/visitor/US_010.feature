@simge
Feature: As a user, I would like to have a contact page on the site so that I can communicate with the administrators of the site where I shop.
  Background:
  * Open browser and Go to "URL"
  * Close the pop-up message

  Scenario: The "Contact" heading must be visible and functional

  * Verify that the Contact link is visible
  * Click on the Contact link
  * Verify that navigated to the Contact page
  * Close the page

  Scenario: TThe company's contact information should be displayed on the left side of the contact page
    * Click on the Contact link
    * Verify that the "WhatsApp:" is visible
    * Verify that the company phone number is visible under the Call or WhatsApp: heading on contact page
    * Verify that the "touch:" is visible
    * Verify that the company mail is visible under the Get in touch: heading on contact page
    * Verify that the "Media:" is visible
    * Verify that the Facebook, Instagram, X, Linkedin icons are visible under the Social Media: heading on contact page
    * Verify that the "office" is visible
    * Verify that the company address is visible under the Head office: heading on contact page
    * Close the page