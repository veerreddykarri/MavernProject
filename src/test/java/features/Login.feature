Feature: Login functionality of Leaftaps CRM application
  Background:
    Given Open the chrome browser
    And Load the URL 'http://leaftaps.com/opentaps/'
  Scenario Outline: TC001_Login with positive data
    Given Enter the username as <username>
    And Enter the password as <password>
    When Clicked on Login button
    Then Home page should be displayed
Examples:
    |username|password|
    |'demosalesmanager'|'crmsfa'|
    |'democsr'|'crmsfa'|

  Scenario: TC002_Login with negative data
    Given Enter the username as 'demosalesmanager'
    And Enter the password as 'crmsfa123'
    When Clicked on Login button
    But Error message should be displayed