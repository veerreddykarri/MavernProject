Feature: Merge Lead functionality of Leaftaps CRM application
  @functional
  Scenario: TC006_Merge Lead
    Given Login to CRM Application
    And Click on Merger Lead Option
    And Click on First Image icon
    And Select the First Lead in the table
    And Click on Second Image icon
    And Select the Second Lead in the table
    When Clicked on Merge Lead button
    And Click on Ok on the alert popup
    Then Verify the two lead has been merged