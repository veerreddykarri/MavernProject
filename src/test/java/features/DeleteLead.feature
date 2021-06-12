Feature: Delete Lead functionality of Leaftaps CRM application
  @functional
  Scenario: TC005_Delete Lead
    Given Login to CRM Application
    And Click on Find Lead
    And Search Lead using phone number "98"
    And Store the Lead ID
    When Click on Delete Lead button
    Then Verify the lead has been deleted
