Feature: Create Lead functionality of Leaftaps CRM application
  Background:
    Given Open the chrome browser
    And Load the URL 'http://leaftaps.com/opentaps/'
  Scenario Outline: TC003_Create Lead
    Given Enter the username as <username>
    And Enter the password as <password>
    And Clicked on Login button
    And Click on CRM SFA
    And Click on Leads
    And Click on Create Lead
    And Enter Mandatory Fields Data on Create Lead Form<companyname>,<forename>,<surname>
    When Clicked on Create Lead Button
    Then Lead created successfully
    Examples:
      |username|password|companyname|forename|surname|
      |'demosalesmanager'|'crmsfa'|'Jiya Technologies'|'Veer'|'Karri'|