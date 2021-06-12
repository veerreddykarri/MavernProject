Feature: Create Lead functionality of Leaftaps CRM application
  Background:
    Given Open the chrome browser
    And Login to CRM Application
  Scenario Outline: TC003_Create Lead
    Given Click on Create Lead
    And Enter Mandatory Fields Data on Create Lead Form<companyname>,<forename>,<surname>
    When Clicked on Create Lead Button
    Then Lead created successfully
    Examples:
      |companyname|forename|surname|
      |'Jiya Technologies'|'Veer'|'Karri'|