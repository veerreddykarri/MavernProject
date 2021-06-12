Feature: Login functionality of Leaftaps CRM application
  @smoke
  Scenario Outline: TC001_Login with positive data
    Given Enter the username as <username>
    And Enter the password as <password>
    When Clicked on Login button
    Then Home page should be displayed
Examples:
    |username|password|
    |'demosalesmanager'|'crmsfa'|
    |'democsr'|'crmsfa'|
@regression
  Scenario: TC002_Login with negative data
    Given Enter the username as 'demosalesmanager'
    And Enter the password as 'crmsfa123'
    When Clicked on Login button
    But Error message should be displayed