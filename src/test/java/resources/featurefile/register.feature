@regression
Feature: Register Test
  As a user I want to register on nop commerce website

  Background:  I am on homepage
    And          I click on Register link

  @smoke
  Scenario: User should navigate to register page successfully
    When   I verify "Register" text

  @sanity
  Scenario: Verify that First name and Last name Email Password and confirm password fields are mandatory
    When    Click on "REGISTER" button
    And     Verify the error message "First name is required."
    And    Verify the error message "Last name is required."
    And    Verify the error message "Email is required."
    And  Verify the error message "Password is required."
    Then  Verify the error message "Password is required."

  @regression
  Scenario:  Verify that user should create account successfully
    When   I select gender "Female"
    And   I enter firstname "Rima"
    And   I enter lastname "Smith"
    And   I select day of birth "<5,August,1999>"
    And  I enter email "rao123@gmail.com"
    And  I enter password "really123"
    And  I enter Confirm Password "really123"
    And  I click on "REGISTER" button
    Then I verify message "Your registration completed"
