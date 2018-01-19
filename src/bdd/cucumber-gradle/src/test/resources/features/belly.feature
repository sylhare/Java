Feature: Belly

  Scenario: 001 - A few cakes in an hour
    Given I have 42 cakes in my belly
    When I wait 1 hour
    Then my belly should growl

  Scenario: 002 - A few cakes in half an hour
    Given I have 42 cakes in my belly
    When I wait 1 hour
    Then my belly should not growl
