Feature: Belly

  Background:
    Given Belly is empty
    And There are 0 "cucumbers"

  Scenario: 001 - A few cakes in an hour
    Given I have 42 cakes in my belly
    When I wait 1 hour
    Then My belly should growl

  Scenario: 002 - Many cakes in an hour
    Given I have 100 cakes in my belly
    When I wait 0 hour
    Then My belly should not growl

  Scenario Outline: 003 - Eating cucumbers
    Given There are <start> "cucumbers"
    When I eat <eat> "cucumbers"
    Then I should have <left> "cucumbers"

    Examples:
      | start | eat | left |
      |  12   |  5  |  7   |
      |  20   |  5  |  15  |

  Scenario: 004
    Given I eat 6 "cucumbers"
    When I wait 1 hour
    But I have 50 cakes in my belly
    Then My belly should not growl