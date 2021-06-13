Feature: Duplicate Lead functionality of Leaftaps CRM application
  @functional
  Scenario: TC006_Duplicate Lead
    Given Login to CRM Application
    And Click on Find Lead
    And Search Lead using phone number "98"
    When Clicked on Duplicate Lead button
    And Click on Submit Button
    Then Verify the duplicate lead has been created