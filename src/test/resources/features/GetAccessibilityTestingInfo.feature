Feature: Get accessibility testing information

  As a client,
  I want to easily find and explore accessibility testing information on the TestSolutions website
  So that I can understand the service they offer


  Scenario: Client explore accessibility testing information
    Given I am on the home page
    When I navigate to ACCESSIBILITY TESTING from service menu
    Then I should be on accessibility-testing page confirmed by this title "Accessibility Testing"

