Feature: Create Lead functionality of Leaftaps CRM application
  @functional
  Scenario Outline: TC003_Create Lead
    Given Login to CRM Application
    And Click on Create Lead
    And Enter Mandatory Fields Data on Create Lead Form<companyname>,<forename>,<surname>,<phonenumber>
    When Clicked on Create Lead Button
    Then Lead created successfully
    Examples:
      |companyname|forename|surname|phonenumber|
      |'Jiya Technologies'|'Veer'|'Karri'|'98'|