
@tag
Feature: Purchase the order from Ecommerce Website
  I want to use this template for my feature file

  Background:
  Given I landed on Ecommerce Page

  @tag2
  Scenario Outline: Positive Test of Submitting the Order
    Given Logged in with username <name> and password <password>
    When I add the product <productName> to Cart
    And Checkout <productName> and submit the order
    Then "THANKYOU FOR THE ORDER." message is displayed on ConfirmationPage

    Examples: 
      | name            |   password  | productName |
      | goofy@gmail.com |   Go0fy108  | ZARA COAT 3 |
