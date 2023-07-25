@regression
Feature: Login Test
  As a user I want to login on nop commerce website
@smoke
  Scenario: User should navigate to login page successfully
    Given  I am on homepage
    When  I click on login link
    Then  I verify that "Welcome, Please Sign In!" message display
@sanity
  Scenario Outline: Verify the Error message with invalid credentials
    Given I am on homepage
    When   I click on login link
    And  I enter email "<email>"
    And I enter password "<password>"
    And I click on login button
    Then I verify the error message
    Examples:
      | email             | password |
      | abcd123@gmail.com | xyz123   |
@regression
  Scenario: Verify that user should login in successfully with valid credentials
    Given  I am on homepage
    When   I click on login link
    And  I enter email "primefivetest@yahoo.com"
    And I enter password "abc123"
    Then click on login button
