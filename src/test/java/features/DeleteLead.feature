Feature: Edit Lead functionality of Leaftaps CRM application
  Background:
    Given Open the chrome browser
    And Login to CRM Application
  Scenario: TC005_Delete Lead
    Given Click on Find Lead
    And Search Lead using phone number "98"
    And Store the Lead ID
    When Click on Delete Lead button
    Then Verify the lead has been deleted
