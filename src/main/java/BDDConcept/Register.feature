Feature: Register Page

  @tag1
  Scenario: User registretion scenario
    Given Regsiter page url
    When user landed on register page
    And user enter the the details.
    Then user successfull register
