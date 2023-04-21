@regression
Feature: Login feature

  Background: 
    Given User launches login page

	@regression
  Scenario Outline: Verify the login functionality
    When User enters "<username>" and "<password>"
    And User clicks on login button
    But User do not clicks on remember me checkbox
    Then User should see the homepage

    Examples: 
      | username       | password |
      | mithun@ta.com  | mithun   |
      | chandra@ta.com | chandra  |

	@smoke @regression
  Scenario: Verify the login functionality
    When User enters invalid username and password
    And User clicks on login button
    Then User should see the error message on the login screen

