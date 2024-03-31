
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

  Scenario: Facebook icon should direct to relevant social media accounts in contact page
     * Click on the Contact link
     * Click on the Facebook icon on contact page
     * Verify that the company's Facebook page is opened
     * Close the page

  Scenario: X icon should direct to relevant social media accounts in contact page
     * Click on the Contact link
     * Click on the X icon on contact page
     * Verify that the company's X page is opened
     * Close the page

  Scenario: Linkedin icon should direct to relevant social media accounts in contact page
     * Click on the Contact link
     * Click on the Linkedin icon on contact page
     * Verify that the company's Linkedin page is opened
     * Close the page

  Scenario: Instagram icon should direct to relevant social media accounts in contact page
     * Click on the Contact link
     * Click on the Instagram icon on contact page
     * Verify that the company's Instagram page is opened
     * Close the page

  Scenario: The "Get in touch" form should be displayed on the right side of the contact page
     * Click on the Contact link
     * Verify that the Get in touch form title is visible on contact page
     * Verify that the Enter Name placeholder is visible on contact page
     * Verify that the Enter Email Address placeholder is visible on contact page
     * Verify that the Order placeholder is visible on contact page
     * Verify that the Write Messages placeholder is visible on contact page
     * Verify that the Send Message button is visible on contact page
     * Close the page

  Scenario: "Get in touch" form positive test
     * Click on the Contact link
     * Click on the Enter Name textbox on contact page
     * Random name is entered
     * Click on the Enter Email Address textbox on contact page
     * Random mail is entered
     * Order kutusu tıklanır ve payment seçilir
     * Click on the Order and Payment is selected on contact page
     * Click on the Write Messages textbox on contact page
     * Random message is entered
     * Click on the Send Message button on contact page and verify that Message Sent successfully! is visible
     * Close the page
