Feature: Login functionality

  As a customer
  I want to login into my account
  So that I can be able to purchase

  Scenario Outline: Customer login with valid credentials
    Given I am on home page
    When I click on sign in button
    And I login with valid <email> and <password>
    Then I should be redirected to Account page confirmed with this Title "My account"

    Examples:

      | email             | password     |
      | tester9@gmail.com | Headphone12@ |


