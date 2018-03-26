Feature: Search Test

  Background: 
    Given I am on the Homepage
    And I click on My Account Link
    And I see a welcome message

  @Search
  Scenario Outline: As a user i want to search for an item in Quick Find field, so as to see some reference to that item in the result summary.
    And I type "<product>" in the search widget
    And I click the search icon
    Then I see product name displayed

    Examples: 
      | product |
      | samsung |
      | DVD     |
