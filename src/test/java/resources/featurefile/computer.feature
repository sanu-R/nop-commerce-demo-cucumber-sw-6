@regression
Feature: Computer Test
  As a user I want to see computer page on nop commerce website

  Background:   I am on homepage
    And      Click on Computer tab


  Scenario: I verify that I should navigate to desktop page successfully
    When   I verify computer text

  Scenario: I verify user should navigate to desktop page successfully
    When  I click on desktops link
    Then  I verify desktops link

  Scenario:  I verify that I can build your own compute and add to cart successfully
    When  I click  on computer tab
    And   I click on desktops link
    And   I click on product name Build your own computer
    And   I select processor "<processor>"
    And   I select RAM "<ram>"
    And   I select HDD "<hdd>"
    And   I select OS "<os>"
    And   I select Software "<software>"
    And   I click on add to cart Button
    And  I verify message The product has been added to your shopping cart

      | processor                                       | ram           | hdd               | os                      | software                   |
      | 2.2 GHz Intel Pentium Dual-Core E2200           | 2 GB          | 320 GB            | Vista Home [+$50.00]    | Microsoft Office [+$50.00] |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 4GB [+$20.00] | 400 GB [+$100.00] | Vista Premium [+$60.00] | Acrobat Reader [+$10.00]   |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 8GB [+$60.00] | 320 GB            | Vista Home [+$50.00]    | Total Commander [+$5.00]   |


