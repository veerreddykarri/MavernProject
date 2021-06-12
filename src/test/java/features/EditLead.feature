Feature: Edit Lead functionality of Leaftaps CRM application
  Background:
    Given Open the chrome browser
    And Login to CRM Application
  Scenario Outline: TC004_Edit Lead
    Given Click on Find Lead
    And Search Lead using phone number "98"
    And Click on Edit Lead button
    And Enter Mandatory Fields Data on Edit Lead Form<companyname>
    When Clicked on Update Button
    Then Lead Updated successfully
    Examples:
      |companyname|
      |'HomeOffice'|